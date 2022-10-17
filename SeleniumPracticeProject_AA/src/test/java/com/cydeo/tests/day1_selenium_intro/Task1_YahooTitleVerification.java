package com.cydeo.tests.day1_selenium_intro;

//TC #1: Yahoo Title Verification
//1. Open Chrome browser
//2. Go to https://www.yahoo.com
//3. Verify title:
//Expected: Yahoo

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // make the browser fullsize
        driver.manage().window().maximize();

        // Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // Verify the title
        // Yahoo
        String expectedTitle = "Yahoo";

        // get the actual title
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        // compare expected and current title

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification is PASSED!");
        } else {
            System.out.println("Title is NOT as expected. Verification is NOT PASSED!");
        }



    }
}
