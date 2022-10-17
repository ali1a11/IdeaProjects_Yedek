package from_Short_Videos.functionalInterface;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {

        Function<int[], List<Integer>> arrayToList = (array) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : array) {
                list.add(each);
            }
            return list;
        };

        int[] intArray = {1, 2, 3, 5, 7, 8 ,9};

        List<Integer> newList = arrayToList.apply(intArray);

        System.out.println("newList = " + newList);

    }
}
