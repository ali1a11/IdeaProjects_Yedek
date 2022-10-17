package from_Short_Videos.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {


        // merges two array to List
        BiFunction<int[], int[], List<Integer>> merge = (arr1, arr2) -> {
            List<Integer> list = new ArrayList<>();

            for (int each : arr1) {
                list.add(each);
            }

            for (int each : arr2) {
                list.add(each);
            }
            return list;
        };

        int[] arrA = {1, 2, 3, 4};
        int[] arrB = {7, 8, 9};

        List<Integer> newList = merge.apply(arrA, arrB);

        System.out.println("newList = " + newList); // newList = [1, 2, 3, 4, 7, 8, 9]

    }
}
