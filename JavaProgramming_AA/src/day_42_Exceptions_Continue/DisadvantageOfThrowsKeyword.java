package day_42_Exceptions_Continue;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {

        // sleep(10); gives error because method used throws keyword

        MorningWorkOut.sleep(10); // not gives error // this method used try catch

    }



    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));

    }
}

