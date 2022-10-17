package week_17_28_08_2022.interfaceDemo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver navigating to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver locating element by " + locator);

    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver quitting the driver");
    }

    @Override
    public String getTitle() {
        return "EU9 Test automation";
    }

    public void someuniqueMethodForFirefox(){
        System.out.println("Unique firefox method");
    }
}
