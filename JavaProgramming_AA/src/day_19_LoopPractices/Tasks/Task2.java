package day_19_LoopPractices.Tasks;
//Write a program that can return the index number of the first duplicated character from a string

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        String str = "1a2ba3b4d5bye**ryauP";
        String dublicates = "";
        int firstDublicatedCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch==ch2){
                    count++;
                }
            }
            if (count>1 && !dublicates.contains(""+ch)) {
                dublicates += ch;
            }
        }

        System.out.println("Dublicated characters: " + dublicates);
        System.out.println("First dublicated " + dublicates.charAt(0));
        System.out.println("Index number of " + dublicates.charAt(0) + " is " + str.indexOf(dublicates.charAt(0)));

        for (int i = 0; i < str.length(); i++) {
            char ch = dublicates.charAt(0);
            char ch2 = str.charAt(i);
            if (ch==ch2){
                firstDublicatedCount++;
            }
        }

        System.out.println("There are " + firstDublicatedCount + " " + dublicates.charAt(0) + " in the string");

    }
}

