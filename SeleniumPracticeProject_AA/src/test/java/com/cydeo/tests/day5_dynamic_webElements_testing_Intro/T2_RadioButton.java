package com.cydeo.tests.day5_dynamic_webElements_testing_Intro;

//XPATH PRACTICES
//DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//TC #2: Radiobutton handling
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/radio_buttons
//3. Click to “Hockey” radio button
//4. Verify “Hockey” radio button is selected after clicking.
//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyRadioButton.isSelected()){
            System.out.println("Hockey button is selected. Verification PASSED");
        } else {
            System.out.println("Hockey button is not selected. Verification FAILED");
        }


    }
}
