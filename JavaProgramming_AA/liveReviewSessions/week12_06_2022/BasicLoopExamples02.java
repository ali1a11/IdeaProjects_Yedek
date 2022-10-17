package week12_06_2022;
/*
            Write a program that displays
            the number of even numbers between 5 and 50 (included)
                I am asking How Many
 */

public class BasicLoopExamples02 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 5; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
