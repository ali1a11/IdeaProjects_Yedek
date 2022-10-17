package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the Selenim WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // maximize the browser size
        driver.manage().window().maximize(); // after that browser size is maximize

        // driver.manage().window().fullscreen(); // ot makes one time maximize after that return the normal size (Window/Mac difference)

        // 3. Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // Stop code excution for 2 second
        Thread.sleep(1000);

        // use selenium to navigate back
        driver.navigate().back();

        // Stop code excution for 2 second
        Thread.sleep(1000);

        driver.navigate().forward();

        // Stop code excution for 2 second
        Thread.sleep(1000);
        driver.navigate().refresh();

        // get the current title of the webpage
        // driver.getTitle();
        Thread.sleep(1000);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();

        //get the current URL
        //driver.getCurrentUrl()
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // driver.navigate().to();
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();
        System.out.println("currentTitle= " + driver.getTitle());

        //get the current URL
        //driver.getCurrentUrl()
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // close the currently opened browser
        driver.close();

        // kills the current session
        // and closes all the opened browsers
        driver.quit();

        driver.getCurrentUrl();
        // NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?




    }
}
