package com.cydeo.tests.from_ShortVideos;
// cssSelector os one of 8 locators of Selenium
// with sccSelector we are able to create CUSTOM locators
// Using cssSelector you will be able to locate web elements with ANY OF THE ATTRIBUTES PROVIDED inside of the tag
// We are not just limited to name, id, class or link attributes anymore
// we can use ANY attribute inside of the tag

// There are two different types of syntaxes for cssSelector
// #1. syntax: tagname[attribute ='value']

// #2. syntax: Second syntax is limited to use with "class" and  "id" only

// tagName.classValue
// tagName#idValue

//From grandparent > parent> child
//
//div[id='content']>div>h2
//
//#content>div>h2
//
//From parent > child
//
//div[class='example']>h2
//
//.example>h2
//
//Why do we need to move from parent to child?
//
//Sometimes the web element we are trying to locate does not have a unique attribute/value. In this scenario, we can locate one of the parents that has a unique attribute value, and move down to child web element we are trying to locate
//
//We CANNOT og from CHILD TO PARENT using cssSelector

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']"));
        inputBox.sendKeys("test@test.com");

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        retrievePasswordButton.click();
        Thread.sleep(1000); // to see what is happenning

        driver.navigate().back();
        //driver.get("https://practice.cydeo.com/forgot_password");

        // from parent to child using cssSelector
        // We use ">" sign to move from parent to child
        // Syntax: tagName[attribute='value'] > childTagName

        WebElement forgotPasswordHeadTitle = driver.findElement(By.cssSelector("div[class='example']>h2"));
        String forgotPasswordHeadTitleText = forgotPasswordHeadTitle.getText();

        System.out.println("forgotPasswordHeadTitleText = " + forgotPasswordHeadTitleText);

        driver.close();

    }
}
