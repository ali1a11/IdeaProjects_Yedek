package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen_Maximize {
    public static void main(String[] args) throws InterruptedException {

        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // get("https://www.cydeo.com");
        driver.get("https://www.cydeo.com");

        driver.manage().window().maximize();

        Thread.sleep(500);

        driver.manage().window().fullscreen();

    }
}
