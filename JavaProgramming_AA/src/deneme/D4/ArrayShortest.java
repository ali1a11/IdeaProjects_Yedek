package deneme.D4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //
        String[] words = str.split(", ");

        String shortestWord = words[0];

        int shortestLength = words[0].length();
        int shortestCount = 0;

        for (String each: words){
            int eachLength = each.length();
            if (eachLength < shortestLength){
                shortestWord = each;
            }
        }

        //System.out.println(shortestWord.length());
        //System.out.println(shortestWord);

        for (String each: words){
            if (each.length() == shortestWord.length()){
                shortestCount++;
            }
        }

        String[] shortestWords = new String [shortestCount];

        int i = 0;
        for (String each: words){
            if (each.length() == shortestWord.length()){
                shortestWords[i++] = each;
            }
        }

        Arrays.sort(shortestWords);

        System.out.println(Arrays.toString(shortestWords));

    }
}