package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.ConfigurationReaderForShortV;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMLogin extends TestBase {
    @Test
    public void crmLogin(){

        /* HARD CODING
        driver.get("https://login1.nextbasecrm.com/");

        // Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("h1@cydeo.com");

        // Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        // Click Log in button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
         */

        // USING Config.properties
        driver.get(ConfigurationReaderForShortV.getProperty("env"));

        // Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigurationReaderForShortV.getProperty("username"));

        // Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReaderForShortV.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }
}
