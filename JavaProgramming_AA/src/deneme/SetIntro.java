package deneme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {
        Set<Integer> newSet = new HashSet<>();

        newSet.add(1);
        newSet.add(2);
        newSet.add(1);

        // Bir eleman sadece bir kez yeraliyor

        System.out.println("newSet = " + newSet); // newSet = [1, 2]

        Integer[] intArray = { 1, 2, 3, 1, 2, 4, 5  };

        Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(intArray));

        System.out.println("numbers = " + numbers); // numbers = [1, 2, 3, 4, 5]

    }
}
