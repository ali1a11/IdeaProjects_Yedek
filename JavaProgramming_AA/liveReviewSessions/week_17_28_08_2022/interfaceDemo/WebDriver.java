package week_17_28_08_2022.interfaceDemo;

public interface WebDriver {
    void get(String url);
    void findElement(String locator);
    void quit();
    String getTitle();
}
