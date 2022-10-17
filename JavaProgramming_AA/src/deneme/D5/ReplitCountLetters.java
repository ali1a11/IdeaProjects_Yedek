package deneme.D5;

import java.util.Scanner;

public class ReplitCountLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        //
        char[] chars = str.toCharArray();
        String result = "";

        for (char each1 : chars) {

            int count = 0;

            for (char each2 : chars) {
                if (Character.isLetter(each1) && (each1 == each2)) {
                    count++;
                }
            }
            if (!result.contains("" + each1)) {
                result += count;
                result += each1;
            }

        }

        return result;
        //
    }

}