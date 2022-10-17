package week_19_11_09_2022;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
    public static void main(String[] args) {

        List<Integer> linkList = new LinkedList<>();

        linkList.add(10);
        linkList.addAll(Arrays.asList(3, 67, 34, 23, 78));

        //There are some methods in LinkedList class not on Link interface
        // addFirst()
        // addLast()
        // poll()
        // to use this methods wee need to downcasing (polymorphism)
        ((LinkedList<Integer>) linkList).addFirst(1);
        ((LinkedList<Integer>) linkList).addLast(100);

        int eachNumber = 0;
        System.out.println("linkList = " + linkList);

        System.out.println("eachNumber = " + eachNumber);

        for (int i = 0; i < linkList.size(); i++) {
            eachNumber = ((LinkedList<Integer>) linkList).poll();
            System.out.println("eachNumber = " + eachNumber);
        }
    }
}
