package day_11_Switch_Scanner;

// A B C D -> passed  and F-> Failed otherwise failed ( or logic aşağıdaki gibi implement edilebilir
// bu durumda kullanılabileeck pratik bir yol var

public class Grade2 {
    public static void main(String[] args) {
        char grade = 'C';
        String result = "";
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "passed";
                // System.out.println("passed");
                break;
            case 'F':
                result = "failed";
                // System.out.println("failed");
            default:
                result = "invalid";
                // System.out.println("invalid");
            /*
            case 'A':
                System.out.println("passed");
                break;
            case 'B':
                System.out.println("passed");
                break;
            case 'C':
                System.out.println("passed");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
            default:
                System.out.println("invalid");
             */
        }
        System.out.println("result = " + result);

    }
}
