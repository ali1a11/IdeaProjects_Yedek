package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_XPath;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T04_ClassLocator_XPath {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // RELATIVE XPATH
        // //tagName[@attribute='value']
        // //a[@class='nav-link']
        // //a[@href='/']


        //3- Click to “Home” link
        WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));
        home.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title text verification PASSED");
        } else {
            System.out.println("Title text verification FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }

        driver.close();

    }
}
