package day_28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String pasword = "aYrouf9!fG";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChars = 0;

        for (int i = 0; i < pasword.length(); i++) {
            char each = pasword.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialChars++;
            }
        }

        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChars = " + countSpecialChars);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialChars > 0;

        boolean strongPassword = pasword.length() >= 8 && !pasword.contains(" ") && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("strongPassword = " + strongPassword);

    }
}
