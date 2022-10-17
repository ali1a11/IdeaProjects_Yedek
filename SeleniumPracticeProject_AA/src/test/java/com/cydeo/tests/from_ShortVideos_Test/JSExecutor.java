package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor extends TestBase {
    @Test
    public void scrollingTest(){
        driver.get("https://practice.cydeo.com/");

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        BrowserUtils.sleep(2); // to see

        // js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink); // index number[0] fro after comma (WebElement)

        // we can add another argument after that
        js.executeScript("arguments[0].scrollIntoView(true);" +"arguments[0].click()", cydeoLink);

        BrowserUtils.sleep(2); // to see

    }
}
