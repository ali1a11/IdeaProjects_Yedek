package day_28_ArrayList;
/*
Warmup tasks:
	1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Hello195@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) { // for checking each char
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else { // special char
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);

    }


    // checks the given string if it is a strong password and returns boolean
    public static boolean isStrongPassword(String str) {
        boolean r1 = str.length() >= 8 && !str.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = str.toCharArray();

        for (char each : chars) { // for checking each char
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else { // special char
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }

}
