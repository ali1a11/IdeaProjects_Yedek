package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://www.google.com/
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Cydeo" + Keys.ENTER);

        // verify Cydeo LinkText is appeared in the result

        WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));
        String actualCydeoText = cydeoText.getText();
        String expectedCydeoText = "Cydeo";

        System.out.println("actualCydeoText = " + actualCydeoText);

        if (actualCydeoText.equals(expectedCydeoText)){
            System.out.println("Cydeo LinkText verification PASSED");
        } else {
            System.out.println("Cydeo LinkText verification FAILED");
        }


    }
}
