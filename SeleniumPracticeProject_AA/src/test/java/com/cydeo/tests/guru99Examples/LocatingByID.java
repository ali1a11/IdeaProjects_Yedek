package com.cydeo.tests.guru99Examples;

// Step 1. Use this demo page http://demo.guru99.com/test/facebook.html for testing.
// Inspect the “Email or Phone” text box using Firebug and take note of its ID. In this case, the ID is “email.”

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get http://demo.guru99.com/test/facebook.html
        driver.get("http://demo.guru99.com/test/facebook.html");

        // passing Guru99 asks for your consent for: page
        driver.findElement(By.className("fc-button-label")).click();

        WebElement EmailOrPhoneInputBox = driver.findElement(By.id("email"));
        EmailOrPhoneInputBox.sendKeys("Bla bla bla"); // + Keys.ENTER





    }
}
