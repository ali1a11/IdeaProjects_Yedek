package week07_08_26_06_2022;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        //create  a loop that will generate 8 char password randomly
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_!@#$%^&*";

        Random random = new Random();

        int randomIndex = random.nextInt(source.length()); // can be bounded

        System.out.println("randomIndex = " + randomIndex);

        String password = "";

        int randomIndex2 = 0;

        for (int i = 0; i < 8; i++) {

            randomIndex2 = random.nextInt(source.length());

            password += "" + source.charAt(randomIndex2);

        }
        System.out.println(password);
    }
}
