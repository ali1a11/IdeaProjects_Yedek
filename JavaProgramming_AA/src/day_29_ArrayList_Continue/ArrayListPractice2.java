package day_29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("David", "Jack", "Hans", "Daniel", "Aaron", "Ahmed", "Jimmy", "David", "Karen"));

        employees.retainAll(Arrays.asList("David", "Ahmed"));

        System.out.println(employees); // [David, Ahmed, David] other names are removed

        //------
        // remove names starting with M

        String[] names = {"Mary", "Monica", "Hans", "James", "David", "Mike"};

        // first we convert array to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.charAt(0) == 'M'); // there are other ways

        System.out.println("Array list: " + list);// [Hans, James, David]

        // converting array list to array

        names = list.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(names));





    }
}
