package com.cydeo.tests.from_ShortVideos;

// https://learn.cybertekschool.com/courses/787

// 1. id
// 2. name
// 3. class  name
// 4. tag name
// 5. link text
// 6. partial link text
// 7. css
// 8. xpath

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //By.id
        driver.get("https://www.google.com/");
        WebElement button = driver.findElement(By.id("W0wltc"));
        button.click();

        //By.name
        WebElement luckyText = driver.findElement(By.name("btnI"));
        String actualText = luckyText.getAttribute("value");
        String expectedText = "Jeg prøver lykken";

        if(actualText.equals(expectedText)){
            System.out.println("Text verification PASSED");
        } else {
            System.out.println("Text verification FAILED");
        }

        //By.name
        //search boxelement
        WebElement inputBox = driver.findElement(By.name("q"));

        // enter text "selenium" and search for it
        inputBox.sendKeys("selenium" + Keys.ENTER);

        System.out.println("--------------By class name-----------------");

        driver.navigate().back();
        // By.className
        //locating Google search button
        WebElement googleSearchButton = driver.findElement(By.className("gNO89b"));
        String actualGoogleSearchButtonText = googleSearchButton.getAttribute("value");
        String expectedGoogleSearchButtonText = "Google-søk";

        if(actualGoogleSearchButtonText.equals(expectedGoogleSearchButtonText)){
            System.out.println("Google Search Button Text verification PASSED");
        } else {
            System.out.println("Google Search Button Text verification FAILED");
        }

        System.out.println("--------------By tag name-----------------");

        // get https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        // locate "Test Automation Practice" element
        WebElement testAutomationPractice = driver.findElement(By.tagName("h1"));

        // print out the text
        String actualTestAutomationPracticeText = testAutomationPractice.getText();

        System.out.println("actualTestAutomationPracticeText = " + actualTestAutomationPracticeText);

        System.out.println("--------------By link text-----------------");

        // get "https://www.google.com/"
        driver.get("https://www.google.com/");

        // identify Gmail link element
        WebElement gMail = driver.findElement(By.linkText("Gmail"));

        // click on the link
        gMail.click();

        // print title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("--------------By partial link text-----------------");
        // get https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        // locate "JavaScript onload event error" web element
        WebElement javaScriptOnload = driver.findElement(By.partialLinkText("onload event"));

        // print the text
        System.out.println("javaScriptOnload.getText() = " + javaScriptOnload.getText());


    }
}
