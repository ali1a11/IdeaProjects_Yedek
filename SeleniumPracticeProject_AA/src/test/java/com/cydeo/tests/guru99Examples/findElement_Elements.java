package com.cydeo.tests.guru99Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElement_Elements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/ajax.html");
        driver.findElement(By.xpath("//button[@aria-label='Do not consent']")).click();

        WebElement radiobutton = driver.findElement(By.xpath("//input[@id='yes']"));
        System.out.println("radiobutton.isSelected() = " + radiobutton.isSelected());

        radiobutton.click();
        System.out.println("radiobutton.isSelected() = " + radiobutton.isSelected());

        WebElement buttonCheck = driver.findElement(By.xpath("//input[@id='buttoncheck']"));
        buttonCheck.click();

        WebElement buttonCheckText = driver.findElement(By.xpath("//p[@class='radiobutton']"));
        String actualbuttonCheckText = buttonCheckText.getText();

        System.out.println("actualbuttonCheckText = " + actualbuttonCheckText);

        // Find elements
        List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("radioButtonList.size() = " + radioButtonList.size());

        for (WebElement each : radioButtonList) {
            System.out.println("each.getAttribute(\"value\") = " + each.getAttribute("value"));
        }

        driver.close();

    }
}
