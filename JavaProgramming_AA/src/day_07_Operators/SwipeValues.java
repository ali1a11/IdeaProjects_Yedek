package day_07_Operators;

public class SwipeValues {
    public static void main(String[] args) {

        int x = 15;
        int y = 25;
        int temp;
        System.out.println("Before x: " + x + " y: " + y);

        temp = x; //temp =15
        x = y;    // x = 25
        y = temp; // y = 15
        System.out.println("After x: " + x + " y: " + y);



    }



}
