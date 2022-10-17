package week_17_28_08_2022.interfaceDemo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChoromeDriver navigating to" + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver locating element by " + locator);

    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver quitting the driver");
    }

    @Override
    public String getTitle() {
        return "EU9 Test automation";
    }

    public void someuniqueMethodForChrome(){
        System.out.println("Unique chrome method");
    }
}
