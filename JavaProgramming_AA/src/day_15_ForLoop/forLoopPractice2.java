package day_15_ForLoop;

public class forLoopPractice2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 55; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
