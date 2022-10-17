package from_Short_Videos.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable_Intro {
    public static void main(String[] args) {

        // Iterator is used when we want to remove elements whilst we iterate over a collection
        //iterator()
        //hasNext()
        //next()
        //remove()

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 1, 2, 3, 3, 4, 4, 5, 7, 5, 6, 6));

        System.out.println("list = " + list); // list = [1, 2, 2, 3, 4, 5, 6, 1, 2, 3, 3, 4, 4, 5, 7, 5, 6, 6]

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer element = it.next();

            if (element < 4) {
                it.remove();
            }
        }

        System.out.println("list = " + list); // list = [4, 5, 6, 4, 4, 5, 7, 5, 6, 6]

        System.out.println("----------------------------");

        // Another way to remove elements in a collection is removeIf() method

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 1, 2, 3, 3, 4, 4, 5, 7, 5, 6, 6));

        list2.removeIf(p -> p < 4);

        System.out.println("list2 = " + list2); // list2 = [4, 5, 6, 4, 4, 5, 7, 5, 6, 6]

    }
}
