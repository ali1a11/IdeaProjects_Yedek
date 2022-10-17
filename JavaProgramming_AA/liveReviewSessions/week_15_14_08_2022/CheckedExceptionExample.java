package week_15_14_08_2022;

public class CheckedExceptionExample {
    public static void main(String[] args) {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }







    }
}
