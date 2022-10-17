package com.cydeo.tests.day10_upload_actions_jsexecutor;
//TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
//2. Find some small file from your computer, and get the path of it.
//3. Upload the file.
//4. Assert:
//-File uploaded text is displayed on the page

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void uploadTest() {
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\eyela\\OneDrive\\Belgeler\\11-CYDEO\\CYDEO_TEST_AUTOMATION\\Day_02_HTML_Cont\\redApple.jpeg";

        //3. Upload the file. // webElement pointing choose file button
        WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();

        //4. Assert:
        // -File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }
}
