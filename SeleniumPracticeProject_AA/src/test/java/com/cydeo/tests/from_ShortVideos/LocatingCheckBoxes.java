package com.cydeo.tests.from_ShortVideos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

        // checkBox1
        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("Before click checkBox1.isSelected() = " + checkBox1.isSelected());

        checkBox1.click();
        System.out.println("After click checkBox1.isSelected() = " + checkBox1.isSelected());

        // checkBox2
        WebElement checkBox2 = driver.findElement(By.id("box1"));
        System.out.println("Before click checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));

        checkBox2.click();
        System.out.println("After click checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));

        if (checkBox1.isSelected()) {
            System.out.println("checkBox1 is selected");
        } else {
            System.out.println("checkBox1 is not selected");
        }

        driver.quit();

    }
}
