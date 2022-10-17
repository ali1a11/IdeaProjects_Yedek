import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));

        String[] strngArray = {"aa", "cc", "dd", "bb"};
        sort(strngArray);
        System.out.println(Arrays.toString(strngArray));
        
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(0, -1, 3, 4, 9, 7));
        Collections.sort(intList);

        System.out.println("intList = " + intList);
        
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ff", "aa", "yy", "tt"));
        Collections.sort(strList);

        System.out.println("strList = " + strList);

    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
