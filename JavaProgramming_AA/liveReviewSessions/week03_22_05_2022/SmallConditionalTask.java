package week03_22_05_2022;
//write if st. that assign 5 to x when y is equal to 20


public class SmallConditionalTask {
    public static void main(String[] args) {

        int y = 20;
        int x = 0;

        if (y == 20) {
            x = 5;
        }
        System.out.println("x = " + x);

        boolean b = y == 20;

        if (b) { // if the condition does not met what the compiler do?
            // either initialize it or use else
            x = 5;
        } else {
            x = 0;
        }

        char ch1 ='A';
        char ch2 ='Z';

        if (ch1>ch2){
            System.out.println(ch1 + " is bigger ");
        } else {
            System.out.println(ch2 + " is bigger ");
        }


    }


}
