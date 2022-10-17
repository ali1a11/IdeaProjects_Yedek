package com.cydeo.tests.day5_dynamic_webElements_testing_Intro;

//TC #3: Utility method task for (continuation of Task2)
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/radio_buttons
//3. Click to “Hockey” radio button
//4. Verify “Hockey” radio button is selected after clicking.
//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//Create a utility method to handle above logic.
//Method name: clickAndVerifyRadioButton
//Return type: void or boolean
//Method args:
//1. WebDriver
//2. Name attribute as String (for providing which group of radio buttons)
//3. Id attribute as String (for providing which radio button to be clicked)
//Method should loop through the given group of radio buttons. When it finds the
//matching option, it should click and verify option is Selected.
//Print out verification: true

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_Cont {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver, "color", "red");
    }

    // Method for button
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        // Locate name = nameAttribute radio buttons and store them in a list of Web Element
        List<WebElement> RadioButtons = driver.findElements(By.name(nameAttribute));

        // Loop through the List of WebElement and select matching result idValue
        for (WebElement each : RadioButtons) {

            String eachID = each.getAttribute("id");

            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(eachID + " is selected: " + each.isSelected());
                break;
            }
        }
    }


}
