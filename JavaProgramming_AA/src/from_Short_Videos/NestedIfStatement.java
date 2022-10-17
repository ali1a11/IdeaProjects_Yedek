package from_Short_Videos;

public class NestedIfStatement {
    public static void main(String[] args) {

        int score = 125;

        if (score >= 0 && score <= 100) { // if score is valid
            if (score >= 60) {

                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score !!!");
        }

    }
}
