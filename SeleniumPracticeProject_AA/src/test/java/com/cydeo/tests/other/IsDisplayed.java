package com.cydeo.tests.other;

// https://www.browserstack.com/guide/isdisplayed-method-in-selenium

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //To open gmail
        driver.get("http://www.gmail.com");

        //isDisplayed() method returns boolean value either True or False
        Boolean Display = driver.findElement(By.xpath("//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).isDisplayed();

        //To print the value
        System.out.println("Element displayed is :" + Display);

        //isEnabled() method returns boolean value either True or False
        Boolean Enable = driver.findElement(By.xpath("//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).isEnabled();
        System.out.println("Element enabled is :" + Enable);

        //Passing value as "softwaretestingmaterial" in the email field
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("<put_an_email_id>");

        //to click on next button
        driver.findElement(By.xpath("//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();

        //isSelected() method returns boolean value either True or False
        // Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();
        // System.out.println("Element selected is :"+Select);


    }
}
