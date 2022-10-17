package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Synchronization_ExplicitWait extends TestBase {
    @Test
    public void test_WaitForExpectedTitle(){

        driver.get("https://practice.cydeo.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        WebElement doneMsj = driver.findElement(By.id("alert"));

        Assert.assertTrue(doneMsj.isDisplayed());
    }
}
