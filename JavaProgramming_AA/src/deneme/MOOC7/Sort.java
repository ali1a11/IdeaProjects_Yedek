package deneme.MOOC7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        int [] array = {1, 0, -3, 5, 7, -2, 4};

        System.out.println(Arrays.toString(array));
            Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.addAll(Arrays.asList(1, -2, 0, 9, -2, 8, 7));
        System.out.println(numberList);

        Collections.sort(numberList);
        System.out.println(numberList);
        


    }

}
