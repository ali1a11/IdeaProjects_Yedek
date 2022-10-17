import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){

        int currentTotalWeightHold = 0;

        for (Suitcase each : suitcases) {
            currentTotalWeightHold += each.totalWeight();
        }

        if (suitcase.totalWeight() + currentTotalWeightHold <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    /*
        public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maximumWeight) {
            return;
        }

        this.suitcases.add(suitcase);
    }

        public int totalWeight() {
        int sum = 0;
        int index = 0;
        while (index < this.suitcases.size()) {
            sum += this.suitcases.get(index).totalWeight();
            index++;
        }
        return sum;
    }
     */

    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }

    }


    public String toString(){ // "x suitcases (y kg)"
        int totalWeightHold =0;
        for (Suitcase suitcase : suitcases) {
            totalWeightHold += suitcase.totalWeight();
        }

        return "" + suitcases.size() + " suitcases (" + totalWeightHold + " kg)";
    }
}
