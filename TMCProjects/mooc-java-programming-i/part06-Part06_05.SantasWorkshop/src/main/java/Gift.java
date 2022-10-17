public class Gift {
    private String nameOfGift;
    private int weightOfGift;

    public Gift(String nameOfGift, int weightOfGift) {
        this.nameOfGift = nameOfGift;
        this.weightOfGift = weightOfGift;
    }

    public String getName(){
        return this.nameOfGift;
    }

    public int getWeight(){
        return this.weightOfGift;
    }

    public String toString() {
        return getName() + " (" + getWeight() + " kg)";
    }
}
