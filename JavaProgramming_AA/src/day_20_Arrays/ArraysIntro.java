package day_20_Arrays;

// create a variable that is capable enough to contain 5 names

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String myGroup[] = new String[5]; //String [] myGroup= new String[5];

        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int myIntArray[] = new int[5];

        System.out.println(myGroup); //[Ljava.lang.String;@7c30a502

        // in order to print one dimensional array

        System.out.println(Arrays.toString(myGroup)); //[null, null, null, null, null] // default values
        System.out.println(Arrays.toString(myIntArray)); //[0, 0, 0, 0, 0] // default values
        System.out.println(Arrays.toString(days));
    }
}
