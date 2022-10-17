package day_50_Collections_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println("list = " + list); // list = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        // remove all the elments that are less than 4

        /*
        Not proper way to remove elements
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
         */
        System.out.println("list = " + list);

        /*
        System.out.println("-------------------------------------");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        // remove all the elments that are less than 4
        // iterator() from iterable can be used to remove elements

        Iterator<Integer> iterator = list2.iterator();

        boolean b1 = iterator.hasNext();

        System.out.println("b1 = " + b1);

        System.out.println("iterator.next() = " + iterator.next()); // iterator.next() = 1

        b1 = iterator.hasNext();

        System.out.println("b1 = " + b1);

        System.out.println("iterator.next() = " + iterator.next()); // iterator.next() = 2

        // as long as hasNext() is true we can get element using next()

*/

        System.out.println("-------------------------------------");
        // we can use while loop
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        // remove all the elments that are less than 4
        Iterator<Integer> iterator = list2.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < 4) {
                iterator.remove();
            }
        }

        System.out.println("list2 = " + list2); // list2 = [4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------");
        // for loop using Iterator
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        // remove all the elments that are less than 4

        // for loop using Iterator
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
            if (i.next() < 4) {
                i.remove();
            }
        }

        System.out.println("list3 = " + list3); // list3 = [4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------");
        // using Lambda expression
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        // remove all the elments that are less than 4

        list4.removeIf(each->each<4);

        System.out.println("list4 = " + list4); // list4 = [4, 5, 4, 5, 4, 5]

    }
}
