package com.cydeo.tests.day6_Alerts_Iframes_Windows;
//TC #1: Information alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Alert” button
//4. Click to OK button from the alert
//5. Verify “You successfully clicked an alert” text is displayed.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

//TC #1: Information alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Alert” button
//4. Click to OK button from the alert
//5. Verify “You successfully clicked an alert” text is displayed.

    @Test
    public void alert_Test1() {
        //3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertButton.click();

        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed"); // message is optional

        String actualResultText = resultText.getText();
        String expectedResultText = "You successfully clicked an alert";

        Assert.assertEquals(actualResultText, expectedResultText, "Actual result text is not as expected");


    }

    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.

    @Test
    public void alert_Test2(){
        //3. Click to “Click for JS Confirm” button
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsConfirmButton.click();

        Alert alert = driver.switchTo().alert();
        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String actualResultText = resultText.getText();
        String expectedResultText = "You clicked: Ok";

        Assert.assertEquals(actualResultText,expectedResultText,"Actual result text is not as expected");

    }

    //TC #3: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    //4. Send “hello” text to alert
    //5. Click to OK button from the alert
    //6. Verify “You entered: hello” text is displayed.


    @Test
    public void alert_Test3(){
        //3. Click to “Click for JS Prompt” button
        WebElement jsPromtButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPromtButton.click();

        Alert alert = driver.switchTo().alert();

        //4. Send “hello” text to alert
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered: hello” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultText = resultText.getText();
        String expectedResultText = "You entered: hello";

        Assert.assertEquals(actualResultText,expectedResultText,"Actual text is not as expected");

    }
    @AfterMethod
    public void afterM(){
        driver.close();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
