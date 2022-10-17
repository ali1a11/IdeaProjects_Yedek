package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.utilities.WebDriverFactoryForShortV;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactoryForShortV.getDriver("chrome");

        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void googleTitle(){
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("button[id='W0wltc']")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Google title is not matching"); // message is optional
    }
}
