package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // navigate to a practice web page that opens new tab
        // this practice url will open and wait 3 seconds and open new tab
        driver.get("https://practice.cydeo.com/open_new_tab");

        // wait 5 seconds
        Thread.sleep(5000);
        // closing any current tab
        driver.close();

        // close all browser windows opened by driver
        driver.quit();

    }


}
