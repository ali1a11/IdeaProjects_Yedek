package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorList) {
            if(!sensor.isOn()){
                return false;
            }

        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensorList) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensorList) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn() ||sensorList.isEmpty()){
            throw new IllegalStateException();
        }

        double average= sensorList.stream().mapToInt(p-> p.read()).average().getAsDouble();
        readings.add((int)average);
        return (int)average;
    }

    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    public List<Integer> readings(){

        return readings;
    }
}

/* from mooc
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensori : sensors) {
            if (sensori.isOn()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensori : sensors) {
            sensori.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensori : sensors) {
            sensori.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }

        int sum = 0;
        for (Sensor sensori : sensors) {
            sum += sensori.read();
        }
        int reading = sum / sensors.size();

        readings.add(reading);

        return reading;
    }
}

 */
