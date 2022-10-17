package day_51_Map_Intro_Enum;
// Write a program that can return the frequency of characters
// Not: MUST use map
// Ex: str= "bbcccaaaaa"
// output: {b=2, c=3, a=5}


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>(); // to keep b c a order LinkedHashMap is used

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency);
        }

        System.out.println(result);

    }
}
