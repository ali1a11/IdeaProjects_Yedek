package from_Short_Videos.collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        List<Integer> vector = new Vector<>();

        List<Integer> stack = new Stack<>();

        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        // arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        //linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5));
        //vector.addAll(Arrays.asList(1, 2, 3, 4, 5));
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
        //stack.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList = " + linkedList);
        System.out.println("vector = " + vector);
        System.out.println("stack = " + stack);


        System.out.println("---------------");
        System.out.println("------arrayList---------");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(" i: " + i + " arrayList.get(i) = " + arrayList.get(i));
        }

        System.out.println("---------------");
        System.out.println("------linkedList---------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(" i: " + i + " linkedList.get(i) = " + linkedList.get(i));
        }

        System.out.println("---------------");
        System.out.println("------vector---------");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(" i: " + i + " vector.get(i) = " + vector.get(i));
        }

        System.out.println("---------------");
        System.out.println("------stack---------");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(" i: " + i + " stack.get(i) = " + stack.get(i));
        }

        System.out.println("---------------");

        System.out.println("stack = " + stack);
        ((Stack<Integer>) stack).pop();
        System.out.println("stack = " + stack);

    }
}
