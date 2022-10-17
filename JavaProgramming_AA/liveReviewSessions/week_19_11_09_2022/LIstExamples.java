package week_19_11_09_2022;

// null cannot be sorted

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LIstExamples {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(); // polimorphic way
        ArrayList<String> arrayList = new ArrayList<>(); // regular object

        stringList = new Stack<>(); // I can do this, we can change the object type

        stringList.add("Yasar");
        stringList.addAll(Arrays.asList("Yasar", "Yasar","omer", "Maya", "John", "Kamuran", "Nermin", "Jamal", null, null));

        System.out.println("stringList = " + stringList);

        System.out.println("stringList.get(2) = " + stringList.get(2));

        //in order to call Stack method we need downcasting
        System.out.println("((Stack) stringList).peek() = " + ((Stack) stringList).peek());

        System.out.println("((Stack) stringList).pop() = " + ((Stack) stringList).pop());

        System.out.println("stringList = " + stringList);

        ((Stack) stringList).push("Oscar");

        System.out.println("stringList = " + stringList);

        System.out.println("((Stack) stringList).pop() = " + ((Stack) stringList).pop());

        System.out.println("stringList = " + stringList);




    }

}
