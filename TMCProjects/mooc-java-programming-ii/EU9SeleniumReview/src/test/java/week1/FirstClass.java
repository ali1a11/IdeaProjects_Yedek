package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {

        // open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();

        driver.navigate().to("https://www.ebay.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        String currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);

        driver.close();


    }
}
