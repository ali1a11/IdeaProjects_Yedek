package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_CSS;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_Google_Gmail_CSS {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        // authorization pass
        driver.findElement(By.cssSelector("div[class='QS5gu sy4vM']")).click();

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));
        gmail.click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualGmailTitle = driver.getTitle();
        String expectedGmailTitle = "Gmail";

        System.out.println("actualGmailTitle = " + actualGmailTitle);

        if(actualGmailTitle.equals(expectedGmailTitle)){
            System.out.println("Gmail title verification PASSED");
        } else {
            System.out.println("Gmail title verification FAILED");
            System.out.println("actualGmailTitle = " + actualGmailTitle);
            System.out.println("expectedGmailTitle = " + expectedGmailTitle);
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";

        System.out.println("actualGoogleTitle = " + actualGoogleTitle);

        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED");
        } else {
            System.out.println("Google title verification FAILED");
            System.out.println("actualGoogleTitle = " + actualGoogleTitle);
            System.out.println("expectedGoogleTitle = " + expectedGoogleTitle);
        }

        driver.close();

    }
}
