import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = Double.MIN_VALUE;
        if (history.isEmpty()) {
            max = 0;
        } else {
            for (Double each : this.history) {
                if (each > max) {
                    max = each;
                }
            }
        }

        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        if (history.isEmpty()) {
            min = 0;
        } else {
            for (Double each : this.history) {
                if (each < min) {
                    min = each;
                }
            }
        }
        return min;
    }

    public double average(){
        double sum = 0;
        double average =0;

        if(this.history.isEmpty()){
            average = 0;
        } else {
            for (Double each : this.history) {
                sum +=each;
            }
            average = sum/this.history.size();
        }
        return average;
    }


    public String toString() {
        return history.toString();
    }
}
