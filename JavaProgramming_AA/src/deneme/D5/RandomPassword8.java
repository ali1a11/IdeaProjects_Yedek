package deneme.D5;

import java.util.Random;

public class RandomPassword8 {
    public static void main(String[] args) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "|§!¤%&/()=?\\+-*/";

        int controlLetters = 0;
        int controlCapitalLetters = 0;
        int controlNumbers = 0;
        int controlSpecialChars = 0;

        String password = "";

        Random random = new Random();

        int passLength = 0;

        while (true) {

            int randomNumber = random.nextInt(5);

            if (randomNumber == 1) {
                int randomIndex = random.nextInt(letters.length());
                password += letters.charAt(randomIndex);
                controlLetters++;
                passLength++;
            } else if (randomNumber == 2) {
                int randomIndex = random.nextInt(capitalLetters.length());
                password += capitalLetters.charAt(randomIndex);
                controlCapitalLetters++;
                passLength++;
            } else if (randomNumber == 3) {
                int randomIndex = random.nextInt(numbers.length());
                password += numbers.charAt(randomIndex);
                controlNumbers++;
                passLength++;
            } else if (randomNumber == 4) {
                int randomIndex = random.nextInt(specialChars.length());
                password += specialChars.charAt(randomIndex);
                controlSpecialChars++;
                passLength++;
            }

            if (passLength == 8 && (controlLetters >= 1) && (controlCapitalLetters >= 1) && (controlNumbers >= 1) && (controlSpecialChars >= 1)) {

                break;
            }
        }

        System.out.println(password);
    }
}

