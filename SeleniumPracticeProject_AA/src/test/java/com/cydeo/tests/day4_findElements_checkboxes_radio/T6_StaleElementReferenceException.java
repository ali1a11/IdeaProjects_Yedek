package com.cydeo.tests.day4_findElements_checkboxes_radio;
//TC #6: StaleElementReferenceException Task
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/abtest
//3- Locate “CYDEO” link, verify it is displayed.
//4- Refresh the page.
//5- Verify it is displayed, again.
//This is a simple StaleElementReferenceException to understand what is
//this exception and how to handle it.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        // //a[text()='CYDEO']
        // //a[.='CYDEO']
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.

        // We are refreshing the web element reference by re-assignning (re-locating) the web element
        // for (preventing) Stale Element Reference Exception
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']")); // for Stale Element Reference Exception
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}
