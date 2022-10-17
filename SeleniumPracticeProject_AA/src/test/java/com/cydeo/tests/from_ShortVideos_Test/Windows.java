package com.cydeo.tests.from_ShortVideos_Test;
// How to handle multiple windows
/*
        driver.getWindowHandle(); // Returns 1 window handle as a String
        driver.getWindowHandles(); // Returns ALL window handles as a Set of String

        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
        }
 */


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows {
    @Test
    public void test() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Multiple windows practice
        // get https://practice.cydeo.com/windows

        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();

        System.out.println("currentHandle = " + currentHandle); // currentHandle = CDwindow-C9F5A8AF6D97D2D10A228E225A8A6F26

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles); // allHandles = [CDwindow-89D65D6C9471DCD821A3086BCB0A78BA]

        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();

        System.out.println("After clicking button driver.getWindowHandle() = " + driver.getWindowHandle()); // After clicking button driver.getWindowHandle() = CDwindow-16CAFC3EAC4683083421E560CE3255B3
        System.out.println("After clicking button driver.getWindowHandles() = " + driver.getWindowHandles()); // After clicking button driver.getWindowHandles() = [CDwindow-16CAFC3EAC4683083421E560CE3255B3, CDwindow-B43F637BC103C3527928B479A0DFE7B3]

        allHandles = driver.getWindowHandles();
        for (String eachHandle : allHandles) {
            System.out.println("eachHandle = " + eachHandle);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

    }
}
