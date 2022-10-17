package week_13_31_07_2022;

public class Db {
    private String data;
    private int yInt;

    public Db(String data, int yInt) {
        setData(data); // call setter
        setyInt(yInt); // call setter
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setyInt(int yInt) {
        this.yInt = yInt;
    }

    public static void main(String[] args) {
        Db info = new Db("EU", 2022);

    }
}
