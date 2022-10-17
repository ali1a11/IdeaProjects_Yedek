package com.cydeo.tests.day2_locators_getText_getAttribute;
//TC #4: Library verifications
// 1. Open Chrome browser
// 2. Go to https://library1.cydeo.com/login.html
// 3. Enter username: “incorrect@email.com”
// 4. Enter password: “incorrect password”
// 5. Click sign in button
// 6. Verify: visually “Sorry, Wrong Email or Password”
// displayed

// PS: Locate username input box using “className” locator
// Locate password input box using “id” locator
// Locate Sign in button using “tagName” locator

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://library1.cydeo.com/login.html
        driver.get("https://library1.cydeo.com/login.html");

        // 3. Enter username: “incorrect@email.com”
        // we use class locator for username
        // Both username and password use same class name but username is first
        // be careful class name is not unique
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        // 4. Enter password: “incorrect password”
        // we use id locator for this web element
        WebElement passwordInput = driver.findElement((By.id("inputPassword")));
        passwordInput.sendKeys("incorrect password");

        // 5. Click sign in button
        // tag name is used as locator for this web element
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

    }
}
