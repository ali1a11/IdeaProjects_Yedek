package day_11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
        switch (grade) {
            case 'A':
                result = "excellent";
                //System.out.println("excellent");
                break;
            case 'B':
                result = "great job";
                //System.out.println("great job");
                break;
            case 'C':
                result = "good";
                //System.out.println("good");
                break;
            case 'D':
                result = "passed";
                //System.out.println("passed");
                break;
            case 'F':
                result = "failed";
                //System.out.println("failed");
                break;
            default:
                result = "invalid";
                //System.out.println("invalid");
                break;
        }
        System.out.println("result = " + result);
    }
}
