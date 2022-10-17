package week17_07_2022;

import java.util.ArrayList;

public class WrapperClassExamples {
    public static void main(String[] args) {


        int i1 = 100; // primitive

        Integer i2; // object

        i2 = i1; // automatically convert primitive to object // autoboxing

        System.out.println("i2 = " + i2);
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(i1);
        arrayList.add(i1);

        System.out.println("arrayList = " + arrayList);

        Integer n1 = 300;
        int n2 = n1; // unboxing

        n2 = arrayList.get(1);

        System.out.println("arrayList = " + arrayList);



    }
}
