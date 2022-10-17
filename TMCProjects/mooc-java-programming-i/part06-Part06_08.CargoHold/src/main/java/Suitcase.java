import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int currentTotalWeight = 0;

        for (Item each : items) {
            currentTotalWeight += each.getWeight();
        }

        if (item.getWeight() + currentTotalWeight <= maxWeight) {
            this.items.add(item);
        }
    }

    /*
        public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(item);
    }
     */

    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){

        if (items.isEmpty()){
            return null;
        }

        Item heaviest = this.items.get(0);

        for (Item item : items) {

            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }

        return heaviest;
    }


    public String toString() { // "x items (y kg)"
        String size = (this.items.size()==0)? "no items": (this.items.size()==1)? "1 item": "" + this.items.size() + " items";


        return size + " (" + totalWeight() + " kg)";
    }


}
