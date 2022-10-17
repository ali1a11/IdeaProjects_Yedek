package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("--------------iterator------------");

        Iterator<Integer> iterator = numberList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--------------list iterator------------");

        ListIterator<Integer> iterator1 = numberList.listIterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        System.out.println("--------------hasPrevious------------");
        while(iterator1.hasPrevious()){
            System.out.println(iterator1.previous());
        }


        System.out.println("------------------------------------");
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7};

        Iterator<Integer> iterator2 = Arrays.stream(numberArray).iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }



    }
}
