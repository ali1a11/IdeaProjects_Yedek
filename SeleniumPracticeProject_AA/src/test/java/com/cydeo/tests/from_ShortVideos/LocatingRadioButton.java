package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRadioButton {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("Before click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        blueRadioButton.click();
        System.out.println("After click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        // click red button

        WebElement redRadioButton = driver.findElement(By.id("red"));
        System.out.println("Before click  redRadioButton.isSelected() = " + redRadioButton.isSelected());

        redRadioButton.click();
        System.out.println("After click  redRadioButton.isSelected() = " + redRadioButton.isSelected());
        System.out.println("After clicking red button blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        //locate green radio button
        WebElement greenRadioButton = driver.findElement(By.id("green"));
        greenRadioButton.click();

        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());

    }

}
