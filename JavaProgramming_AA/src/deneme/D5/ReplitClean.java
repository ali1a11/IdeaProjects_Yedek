package deneme.D5;

import java.util.Scanner;

public class ReplitClean {
    public static String clean(String text, String badWord) {
        text = text.replace(badWord, "").trim();
        text = text.replace("  ", " ");

        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.nextLine();
        String b = in.nextLine();
        System.out.println(clean(a, b));
    }

}