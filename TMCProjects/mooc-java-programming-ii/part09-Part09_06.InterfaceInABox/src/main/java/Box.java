import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> packables;

    public Box(double maxCapacity) {
        this.maximumCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() <= maximumCapacity) {
            this.packables.add(packable);
        }

    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable packable : this.packables) {
            weight += packable.weight();
        }
        return weight;
    }




    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }
}
