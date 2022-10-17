package day_21_Arrays_Utility_for_Each_Loop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Veli", "Selami"};
        String[] group2 = {"Mary", "Jo", "John", "Mike", "Jake"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));
    }
}
