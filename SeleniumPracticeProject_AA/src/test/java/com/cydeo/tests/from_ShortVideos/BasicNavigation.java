package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driver.navigate().to("url");
        driver.navigate().to("https://cydeo.com/");

        // driver.get("url")
        driver.get("https://cydeo.com/");

        driver.get("https://www.google.com/");

        // driver.navigate().back();
        driver.navigate().back();

        // driver.navigate().forward();
        driver.navigate().forward();

        // driver.navigate().refresh();
        driver.navigate().refresh();

    }
}
