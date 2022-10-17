package from_Short_Videos.exceptions;

public class Test {

    public static void wait4seconds() throws InterruptedException { // whoever calls this method in another method gets exception
        Thread.sleep(4000);
    }
}
