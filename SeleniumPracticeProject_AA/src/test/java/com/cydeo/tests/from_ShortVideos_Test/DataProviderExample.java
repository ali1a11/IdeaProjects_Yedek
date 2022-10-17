package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DataProviderExample {
    WebDriver driver;

    @Test(dataProvider = "searchData") // !!!
    public void Test1(String keyword, String expectedTitle) {
        driver = WebDriverFactory.getDriver("chrome");

        // get https://www.google.com/
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("button[id='W0wltc']")).click();

        // locate searchbox
        WebElement searchBox = driver.findElement(By.name("q"));

        // search "selenium"
        // searchBox.sendKeys("selenium" + Keys.ENTER);
        searchBox.sendKeys(keyword + Keys.ENTER);

        String actualTitle = driver.getTitle();
        // String expectedTitle = "selenium - Google Search";

        assertEquals(actualTitle, expectedTitle);

        driver.quit();
    }

    @DataProvider(name = "searchData") // !!!
    public Object[][] testData() {

        return new Object[][]{
                {"selenium", "selenium - Google-søk"},
                {"java", "java - Google-søk"},
                {"job", "job - Google-søk"},
                {"cydeo", "cydeo - Google-søk"}
        };
    }
}

