package day_01_JavaIntro;

import day_24_CustomMethod_Return.RemoveDublicates;
import day_24_CustomMethod_Return.ReturnMethodIntro;
import day_24_CustomMethod_Return.ReturnMethodPractice;

public class Test {
    public static void main(String[] args) {


        String str = "aaaafdsfsdgsddddddgolkfjo";

        String str2 = RemoveDublicates.removeDublicates(str);

        System.out.println(str2);

        String name = "Java Programming";
        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

    }
}
