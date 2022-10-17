package deneme;

import java.util.Arrays;

public class ArrrayDeneme {
    public static void main(String[] args) {
        int[]arr1= {1, 2, 3};
        int[]arr2= new int[3];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2 = arr1;
        System.out.println(Arrays.toString(arr2));
    }
}
