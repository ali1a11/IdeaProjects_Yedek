package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locating_Dropdown_MultipleSelection {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //locate the dopdown with multiple select option
        // WebElement multiItemDrop = driver.findElement(By.name("Languages"));
        // Select multiItemDropSelect = new Select(multiItemDrop);

        Select multiItemDropSelect = new Select(driver.findElement(By.name("Languages")));

        System.out.println("multiItemDropSelect.isMultiple() = " + multiItemDropSelect.isMultiple()); // multiItemDropSelect.isMultiple() = true

        // select items
        multiItemDropSelect.selectByIndex(2);
        multiItemDropSelect.selectByValue("js");
        //multiItemDropSelect.selectByVisibleText("Python");
        multiItemDropSelect.selectByVisibleText("Ruby");

        // deselect items
        multiItemDropSelect.deselectByIndex(2);
        multiItemDropSelect.deselectByValue("js");
        multiItemDropSelect.deselectByVisibleText("Ruby");
        multiItemDropSelect.deselectAll();

        //driver.quit();

    }
}
