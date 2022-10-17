package week12_06_2022;
/*
Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000
 */

public class BasicLoopExamples {
    public static void main(String[] args) {
        /*
        for (int i = 0; i <=1000; i++) {
            if (i%10==0){
                System.out.println(i);
            }
            */
        for (int i = 0; i <= 1000; i += 10) {

            if (i < 1000) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

            int x = 0;
            for (; x <= 1000; ) {

                if (x % 10 == 0) {
                    System.out.print(x + ", ");
                }
                x++;
            }




    }
}
