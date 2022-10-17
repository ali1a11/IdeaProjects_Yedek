package day_21_Arrays_Utility_for_Each_Loop;

import java.util.Arrays;

public class MergeCharArrays {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int i = 0;
        for (char c : ch1) {
            chars[i] = c;
            i++;
        }

        for (char c : ch2) {
            chars[i] = c;
            i++;
        }
        System.out.println(Arrays.toString(chars));
    }
}
