package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // get https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");

        // enter username provided: "abcd"
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd" + Keys.ENTER);

        // enter password provided: "abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd" + Keys.ENTER);

        // click login button
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        // verify the message "Invalid user name or password."

        // we can use parent if tag does not have any attribute
        // class="alert alert-error"
        // if class name value contains several texts and space between them, you can use one of them

        // WebElement message = driver.findElement(By.className("alert"));
        // or
        WebElement message = driver.findElement(By.className("alert-error"));

        System.out.println("message.getText() = " + message.getText());
        String actualMessageText = message.getText();
        String expectedMessageText = "Invalid user name or password.";

        if(actualMessageText.equals(expectedMessageText)){
            System.out.println("Message verification PASSED");
        } else {
            System.out.println("Message  verification FAILED");
        }

        // verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL \"vytrack\" verification PASSED");
        } else {
            System.out.println("URL \"vytrack\" verification FAILED");
        }


        // click "Forgot your password?" link
        WebElement forgotYourPassword = driver.findElement(By.partialLinkText("Forgot"));
        forgotYourPassword.click();

        // verify title is "Forgot Password"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Forgot Password";

        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title text verification PASSED");
        } else {
            System.out.println("Title text verification FAILED");
        }

        driver.quit();

    }
}
