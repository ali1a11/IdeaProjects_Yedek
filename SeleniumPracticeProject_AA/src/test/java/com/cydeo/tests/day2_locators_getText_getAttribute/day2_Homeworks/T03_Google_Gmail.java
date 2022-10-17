package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks;

//TC #3: Back and forth navigation
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Click to Gmail from top right.
//4- Verify title contains:
//Expected: Gmail
//5- Go back to Google by using the .back();
//6- Verify title equals:
//Expected: Google

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_Google_Gmail {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        // privacy authorization
        driver.findElement(By.id("W0wltc")).click();

        //3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectedGmailTitle = "Gmail";
        String actualGmailTitle = driver.getTitle();

        System.out.println("actualGmailTitle = " + actualGmailTitle);

        if(actualGmailTitle.equals(expectedGmailTitle)){
            System.out.println("Gmail title text test PASSED");
        } else {
            System.out.println("Gmail title text test FAILED");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        System.out.println("actualGoogleTitle = " + actualGoogleTitle);

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title text test PASSED");
        } else {
            System.out.println("Google title text test FAILED");
        }

        driver.close();
    }
}
