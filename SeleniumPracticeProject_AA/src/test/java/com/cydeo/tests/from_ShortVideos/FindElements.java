package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        // store color button web elements in a list
        List<WebElement> colorButtons = driver.findElements(By.name("color"));
        System.out.println("colorButtons.size() = " + colorButtons.size());

        for (WebElement eachColorButton : colorButtons) {
            System.out.println(eachColorButton.getAttribute("id") + " is selected: " + eachColorButton.isSelected());

        }


    }
}
