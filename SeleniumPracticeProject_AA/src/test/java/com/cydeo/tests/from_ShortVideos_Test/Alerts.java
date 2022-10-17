package com.cydeo.tests.from_ShortVideos_Test;

// if Alert uses html, we can use locators
// But if Alert uses Javascript, we have to use syntax Alert, after locating button

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Alerts extends TestBase {

    @Test
    public void alertTest() {
        // WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsButton.click();


        Alert alert = driver.switchTo().alert(); // !!!
        alert.accept();

        // Verification of Result, after clicking // You successfully clicked an alert

        WebElement resultText = driver.findElement(By.id("result"));

        assertTrue(resultText.isDisplayed());

        driver.quit();
    }
}
