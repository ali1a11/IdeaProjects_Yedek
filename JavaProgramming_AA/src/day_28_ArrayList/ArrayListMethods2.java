package day_28_ArrayList;


import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

        System.out.println(list);

        System.out.println("-----------------------------");

        // remove()
        ArrayList<String> employees = new ArrayList<>();

        employees.add("John");
        employees.add("Jack");
        employees.add("Tom");
        employees.add("Henry");
        employees.add("George");

        System.out.println(employees); // [John, Jack, Tom, Henry, George]

        employees.remove(0);
        System.out.println(employees); // [Jack, Tom, Henry, George]

        employees.remove(0);
        System.out.println(employees); // [Tom, Henry, George]

        employees.remove(employees.size()-1);
        System.out.println(employees); // [Tom, Henry]

        boolean r1 = employees.remove("Tom");
        System.out.println(employees); // [Henry]

        System.out.println("r1 = " + r1);

    }
}
