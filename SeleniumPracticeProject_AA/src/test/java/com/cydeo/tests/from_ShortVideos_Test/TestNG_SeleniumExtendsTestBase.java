package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_SeleniumExtendsTestBase extends TestBase {

    @Test
    public void googleTitle(){
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("button[id='W0wltc']")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Google title is not matching"); // message is optional
    }
}
