package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks;

//TC #4: Practice Cydeo – Class locator practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/inputs
//3- Click to “Home” link
//4- Verify title is as expected:
//Expected: Practice
//PS: Locate “Home” link using “className” locator

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T04_ClassLocator {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title text test PASSED");
        } else {
            System.out.println("Title text test FAILED");
        }
        driver.close();
    }
}
