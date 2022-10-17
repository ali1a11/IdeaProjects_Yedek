package week_15_14_08_2022;

public class ErrorExample {
    public static void main(String[] args) {

        try {
            deathlyMethod();
        } catch (StackOverflowError e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }

        System.out.println("Codes after error");


    }
    static int counter = 0;
    public static void deathlyMethod(){

        // infinite loop
        System.out.println(counter++);
        deathlyMethod();
    }
}
