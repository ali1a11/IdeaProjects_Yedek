package day_19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if (i ==3){
                // break; // terminates the loop
                //continue; // terminates the the current iteration of the loop
                System.exit(0); //terminates the entire program
            }
            System.out.println(i);

        }
        System.out.println("Hello World");
    }
}
