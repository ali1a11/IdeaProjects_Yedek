package com.cydeo.tests.day6_Alerts_Iframes_Windows;

//TC #4: Iframe practice
//1. Create a new class called: T4_IframePractice
//2. Create new test and make set ups
//3. Go to: https://practice.cydeo.com/iframe
//4. Assert: “Your content goes here.” Text is displayed.
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }

    // @Ignore  // to skip the Test
    @Test
    public void iframe_Test(){
        // We need to switch driver's focus to iframe
        // switching to iframe using id attribute value

        // option 1 switcing to iframe using id attribute value
        // driver.switchTo().frame("mce_0_ifr");

        // option 2 passing index number of iframe
        // driver.switchTo().frame(0);

        // option 3 locating web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        // Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //To be able to verify the header, we must switch back to "main html"

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // Assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }
}
