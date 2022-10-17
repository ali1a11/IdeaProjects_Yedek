package day_21_Arrays_Utility_for_Each_Loop;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {

        String[] group1 = {"A2", "B1", "C5"};
        String[] group2 = {"S1", "G8", "y9", "T4"};
        String[] group3 = {"X5", "Y0"};

        String[] totalGroup = new String[group1.length+ group2.length+ group3.length];

        int i = 0;

        for (String s : group1) {
            totalGroup[i++] = s;
        }

        for (String s : group2) {
            totalGroup[i++] = s;
        }

        for (String s : group3) {
            totalGroup[i++] = s;
        }

        System.out.println(Arrays.toString(totalGroup));

    }
}
