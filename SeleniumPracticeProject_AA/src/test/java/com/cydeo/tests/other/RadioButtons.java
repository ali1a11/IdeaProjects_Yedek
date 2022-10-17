package com.cydeo.tests.other;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement redRadioButton = driver.findElement(By.id("red"));
        redRadioButton.click();

        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());

        selectAndVerifyRadioButton(driver, "color", "yellow");

    }

    public static void selectAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {

            String eachIDValue = each.getAttribute("id");

            if(eachIDValue.equals(idValue)){
                each.click();
                System.out.println(eachIDValue + " is selected: " + each.isSelected());
                break;
            }
        }
    }
}
