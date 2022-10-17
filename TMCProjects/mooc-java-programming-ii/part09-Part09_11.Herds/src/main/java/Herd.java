import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable each : this.herd) {
            each.move(dx, dy);
        }

    }



    public String toString() {
        String str = "";
        for (Movable each : this.herd) {
            str += each + "\n";
        }
        return str;
    }

    public void addToHerd(Movable movable) {
        if (!this.herd.contains(movable)) {
            herd.add(movable);
        }
    }
}
