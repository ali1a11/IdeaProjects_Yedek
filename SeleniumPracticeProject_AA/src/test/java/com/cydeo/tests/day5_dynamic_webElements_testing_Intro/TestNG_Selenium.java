package com.cydeo.tests.day5_dynamic_webElements_testing_Intro;

// browser driver setup
// open browser
// maximize the page
// iplicit wait
// get "https://www.google.com/"
// Assert: title is "Google"

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // do browser driver setup
        // open browser
        driver = WebDriverFactory.getDriver("chrome");

        // browser driver setup
        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // maximize the page
        driver.manage().window().maximize();

        // iplicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void selenium_test() {

        // get "https://www.google.com/"
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();

        // Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here."); // message is optional

    }
}
