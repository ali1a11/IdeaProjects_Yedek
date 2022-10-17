package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {
    @Test
    public void testFileUpload(){
        driver.get("https://practice.cydeo.com/upload");

        String filePath = "C:\\Users\\eyela\\OneDrive\\Desktop\\maven_options.jpg"; // file path

        driver.findElement(By.id("file-upload")).sendKeys(filePath); // choose file button

        driver.findElement(By.id("file-submit")).click(); // upload button

        BrowserUtils.sleep(2); // to see

    }

}
