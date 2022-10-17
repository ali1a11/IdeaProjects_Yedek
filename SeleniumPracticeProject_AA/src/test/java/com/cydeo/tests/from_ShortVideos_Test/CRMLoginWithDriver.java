package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.utilities.ConfigurationReaderForShortV;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMLoginWithDriver {
    @Test
    public void crmLogin() {
        // USING Config.properties
        Driver.getDriver().get(ConfigurationReaderForShortV.getProperty("env"));

        // Enter valid username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigurationReaderForShortV.getProperty("username"));

        // Enter valid password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReaderForShortV.getProperty("password"));

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }
}

