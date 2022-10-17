package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks;

//TC #2: Zero Bank header verification
//1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//3. Verify header text
//Expected: “Log in to ZeroBank”

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_ZeroBank {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String expectedHederText = "Log in to ZeroBank";
        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();

        System.out.println("actualHeaderText = " + actualHeaderText);
        if(actualHeaderText.equals(expectedHederText)){
            System.out.println("Header text test PASSED");
        } else {
            System.out.println("Header text test FAILED");
        }

        driver.close();
    }
}
