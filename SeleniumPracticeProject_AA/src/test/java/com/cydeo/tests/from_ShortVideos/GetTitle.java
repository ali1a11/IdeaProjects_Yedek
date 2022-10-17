package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // get("https://www.cydeo.com");
        driver.get("https://www.cydeo.com");

        String title = driver.getTitle();

        System.out.println("Title of the page: " + title);


        if (title.equals("Cydeo")){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }


    }
}
