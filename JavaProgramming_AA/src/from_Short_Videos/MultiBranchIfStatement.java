package from_Short_Videos;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        // if there are more than two possible outcomes
        int number = -6;

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        System.out.println("--------------------------");

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

    }
}
