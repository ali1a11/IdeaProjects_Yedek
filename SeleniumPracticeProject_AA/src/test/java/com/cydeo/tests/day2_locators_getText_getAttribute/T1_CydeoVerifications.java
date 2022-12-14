package com.cydeo.tests.day2_locators_getText_getAttribute;
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        // 1. Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        // 3. Verify URL contains
        // Expected: cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification is PASSED");
        } else {
            System.out.println("URL verification is NOT PASSED");
        }

        // 4. Verify title:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is NOT PASSED");
        }

        driver.close();


    }

}
