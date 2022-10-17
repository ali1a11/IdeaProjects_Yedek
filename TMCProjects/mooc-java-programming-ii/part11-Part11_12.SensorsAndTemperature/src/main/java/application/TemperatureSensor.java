package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean sensor;

    public TemperatureSensor() {
        this.sensor = sensor;
    }


    @Override
    public boolean isOn() {
        return this.sensor;
    }

    @Override
    public void setOn() {
        this.sensor = true;

    }

    @Override
    public void setOff() {
        this.sensor = false;
    }

    @Override
    public int read() {

        if(isOn() == true){
            return new Random().nextInt(61) - 30;
        }
            throw new IllegalStateException();

    }
}

/* from mooc
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {


    private boolean on;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }

        Random rnd = new Random();
        return rnd.nextInt(61) - 30;
    }
}

 */
