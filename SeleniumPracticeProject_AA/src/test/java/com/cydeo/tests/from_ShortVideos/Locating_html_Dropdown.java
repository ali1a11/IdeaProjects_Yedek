package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_html_Dropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropDownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropDownLink.click();

        WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
        itemYahoo.click();


    }
}
