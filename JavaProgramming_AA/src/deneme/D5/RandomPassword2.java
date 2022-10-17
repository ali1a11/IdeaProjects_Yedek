package deneme.D5;

import java.util.Random;

public class RandomPassword2 {
    public static void main(String[] args) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "|§!¤%&/()=?\\+-*/";

        int controlLetters = 0;
        int controlCapitalLetters = 0;
        int controlNumbers = 0;
        int controlSpecialChars = 0;

        String password1 = "";

        Random random = new Random();

        int passLength = 0;

        while (true) {

            int randomNumber = random.nextInt(5);

            if (randomNumber == 1 && controlLetters == 0) {
                int randomIndex = random.nextInt(letters.length());
                password1 += letters.charAt(randomIndex);
                controlLetters++;
                passLength++;
            } else if (randomNumber == 2 && controlCapitalLetters == 0) {
                int randomIndex = random.nextInt(capitalLetters.length());
                password1 += capitalLetters.charAt(randomIndex);
                controlCapitalLetters++;
                passLength++;
            } else if (randomNumber == 3 && controlNumbers == 0) {
                int randomIndex = random.nextInt(numbers.length());
                password1 += numbers.charAt(randomIndex);
                controlNumbers++;
                passLength++;
            } else if (randomNumber == 4 && controlSpecialChars == 0) {
                int randomIndex = random.nextInt(specialChars.length());
                password1 += specialChars.charAt(randomIndex);
                controlSpecialChars++;
                passLength++;
            }

            if (passLength == 4) {

                break;
            }
        }

        int controlLetters2 = 0;
        int controlCapitalLetters2 = 0;
        int controlNumbers2 = 0;
        int controlSpecialChars2 = 0;
        int passLength2 = 0;

        String password2 = "";
        while (true) {

            int randomNumber = random.nextInt(5);

            if (randomNumber == 1 && controlLetters2 == 0) {
                int randomIndex = random.nextInt(letters.length());
                password2 += letters.charAt(randomIndex);
                controlLetters2++;
                passLength2++;
            } else if (randomNumber == 2 && controlCapitalLetters2 == 0) {
                int randomIndex = random.nextInt(capitalLetters.length());
                password2 += capitalLetters.charAt(randomIndex);
                controlCapitalLetters2++;
                passLength2++;
            } else if (randomNumber == 3 && controlNumbers2 == 0) {
                int randomIndex = random.nextInt(numbers.length());
                password2 += numbers.charAt(randomIndex);
                controlNumbers2++;
                passLength2++;
            } else if (randomNumber == 4 && controlSpecialChars2 == 0) {
                int randomIndex = random.nextInt(specialChars.length());
                password2 += specialChars.charAt(randomIndex);
                controlSpecialChars2++;
                passLength2++;
            }

            if (passLength2 == 4) {

                break;
            }
        }
        System.out.println(password1 + password2);
    }
}
