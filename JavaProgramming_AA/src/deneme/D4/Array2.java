package deneme.D4;

import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        //
        int shortest = str[0].length();
        String shortestWord = "";

        for (String each: str){
            int shortestEach = each.length();

            //System.out.println(shortestEach);

            //System.out.println(each);

            //System.out.println(shortestWord);

            if (shortestEach<shortest) {
                shortest = shortestEach;
                shortestWord = each;
            }
            //System.out.println(shortestWord);
        }

        System.out.println(shortestWord);

    }
}
