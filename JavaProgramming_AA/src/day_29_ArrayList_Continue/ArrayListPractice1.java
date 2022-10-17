package day_29_ArrayList_Continue;

/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan", "United States", "Turkey", "United Kingdom", "Canada", "Norway"};

        // converting array to array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p->p.length()>=10);

        // converting arraylist to array
        // toArray()
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

        //Other method to convert Array list to array is using loop






    }

}
