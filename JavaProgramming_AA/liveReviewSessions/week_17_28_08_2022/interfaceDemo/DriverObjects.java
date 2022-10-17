package week_17_28_08_2022.interfaceDemo;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();

        FirefoxDriver driver2 = new FirefoxDriver();

        // Polymorphism

        // WebDriver driverSuper = new ChromeDriver();
        WebDriver driverSuper = new FirefoxDriver();

        driver1.get("www.acbn.com");
        driver1.someuniqueMethodForChrome();

        driver2.get("www.acbn.com");
        driver2.someuniqueMethodForFirefox();

        driverSuper.get("www.abcn.com");
        ((FirefoxDriver)driverSuper).someuniqueMethodForFirefox();

        driverSuper = new ChromeDriver();
        driverSuper.get("www.abcn.com");

        ((ChromeDriver) driverSuper).someuniqueMethodForChrome();

    }
}
