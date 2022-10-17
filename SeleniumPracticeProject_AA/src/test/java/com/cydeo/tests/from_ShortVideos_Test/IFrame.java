package com.cydeo.tests.from_ShortVideos_Test;

// 1. byIndex: driver.switchTo().frame(indexNumber) // driver.switchTo().frame(0); // index number
// 2. byID or byName: driver.switchTo().frame("id_or_Name_Attribute_Value"); // driver.switchTo().frame("iframe-id");
// 3. Locate as WebElement:
// WebElement iframe = driver.findElement(By.locator);
// driver.switchTo().frame(iframe);

// To Switch back there are 2 ways:
// 1. driver.switchTo().parentFrame(); // switches back to direct parent html
// 2. driver.switchTo().defaultContent(); // switches back to default html

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class IFrame {
    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // get https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //locate iframe
        driver.switchTo().frame(0); // indexNumber

        // driver.switchTo().frame("mce_0_ifr");

        // WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        // driver.switchTo().frame(iframe);

        // Verification

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        // Switch to parent
        driver.switchTo().parentFrame();

        driver.quit();

    }
}
