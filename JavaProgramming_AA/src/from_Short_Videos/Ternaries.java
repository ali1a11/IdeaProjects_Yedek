package from_Short_Videos;

public class Ternaries {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int max;

        if(a>b){
            max = a;
        } else {
            max = b;
        }

        // possible outcome types are same (int)

        int max2 = (a > b) ? a : b;

        System.out.println("max2 = " + max2);

        System.out.println("-------------------------");

        int score = 75;

        char grade; // A, B, C, D, F

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("grade = " + grade);

        // possible outcome types are same (char)

        grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println("grade = " + grade);

    }

}
