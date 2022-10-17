package from_Short_Videos.exceptions;

// for checked exceptions

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        Thread.sleep(1000);
        /*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
         */

// we can handle with try catch. But if it happens several times in a class, it can cause trouble
// therefore we can use throws

        System.out.println("World");

        Thread.sleep(2000);
        /*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
         */

        Test.wait4seconds(); // we used throws InterruptedException

        System.out.println("Another Hello");


    }

    public static void wait3seconds() throws InterruptedException { // whoever calls this method gets exception
        Thread.sleep(3000);
    }

    public static void wait2seconds() {// whoever calls this method does not get exception
        // wait3seconds(); // exception
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
