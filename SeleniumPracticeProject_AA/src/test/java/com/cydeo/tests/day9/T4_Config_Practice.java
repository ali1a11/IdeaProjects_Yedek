package com.cydeo.tests.day9;

//TC #4: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Verify title:
//Expected: "apple - Google-søk"
//Use `configuration.properties` for the following:
//1. The browser type
//2. The URL
//3. The search keyword
//4. Make title verification dynamic. If search value changes, title
//assertion should not fail.

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
/*
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browserType = ConfigurationReader.getProperty("browser");
        //driver = WebDriverFactory.getDriver("chrome");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();
    }

 */

    @Test
    public void google_search_test() {

        //Driver.getDriver() --> driver
        //driver.get("https://google.com");
        Driver.getDriver().get("https://google.com");

        Driver.getDriver().findElement(By.xpath("//button[@id='W0wltc']")).click();

        //3- Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER); // is changed from "apple" to ConfigurationReader.getProperty("searchValue")

        //4- Verify title:
        //Expected: "apple - Google-søk"
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google-søk"; // is changed from "apple - Google-søk";

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
