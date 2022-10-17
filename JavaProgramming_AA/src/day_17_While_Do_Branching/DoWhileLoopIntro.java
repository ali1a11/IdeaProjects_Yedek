package day_17_While_Do_Branching;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a; i++) { //not executes while condition false
            System.out.println("Hello World !!!- for loop");
        }


        while(a){ //not executes while condition false
            System.out.println("Hello World !!! while loop");
        }


        do{
            System.out.println("Hello World !!! do while loop"); // executes do before while condition one time if while true executes again
        } while(a); // if condition is true repeats again

    }
}
