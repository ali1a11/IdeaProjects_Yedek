package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // add(Data):
        numbers.add(10); //int to Integer implicitly primitive to Wrapper class outoboxing
        // size automatically will be increased
        numbers.add(20); // index 1
        numbers.add(30); // index 2
        numbers.add(40); // index 3
        numbers.add(50); // index 4

        System.out.println(numbers); // [10, 20, 30, 40, 50]

        //add(index, Data):
        numbers.add(2, 25);
        System.out.println(numbers); // [10, 20, 25, 30, 40, 50]

        numbers.add(6, 100); //[10, 20, 25, 30, 40, 50, 100]
        System.out.println(numbers);

        // size();

        System.out.println(numbers.size()); //7

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        // get();
        int num = numbers.get(3); // or // Integer num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("-----------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------");

        // set()
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("C#");

        list.set(2, "Java script");

        System.out.println(list); // [Java, Python, Java script, C#]

        list.set(3, "C++");
        System.out.println(list); // [Java, Python, Java script, C++]

    }
}
