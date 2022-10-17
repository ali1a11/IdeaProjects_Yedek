package day_25_CustomMethods_Method_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "Heart";
        String str2 = "earth";
        
        boolean isAnagram = StringUtility.anagram(str1, str2);

        System.out.println("isAnagram = " + isAnagram);
        
        String str3 = "aaaaabbbbbccccc";
        
        String nonDublicate = StringUtility.removeDublicates(str3);

        System.out.println("nonDublicate = " + nonDublicate);

        System.out.println("-----------");

        int[] numbers = {1, 3, 9, 75};
        ArraysUtility.printEachElement(numbers);

        String[] names = {"Jack", "John", "Helen", "Carla"};
        ArraysUtility.printEachElement(names);

        double [] doubles = {2.5, 5.6, 9.1, 3.8};
        ArraysUtility.printEachElement(doubles);

        char[] arr = {'a', 'b', 'c', 'd'};
        ArraysUtility.printEachElement(arr);
        
    }
}
