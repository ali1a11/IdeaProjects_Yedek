package day_17_While_Do_Branching;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {


            if (i == 'C') {
                continue;
            }
            System.out.print(i + " "); //A B D E

        }

        //

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " "); //1 3 5 7 9
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " "); //2 4 6 8 10
        }


    }
}
