package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_XPath;

//TC #2: Zero Bank header verification
//1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//3. Verify header text
//Expected: “Log in to ZeroBank”

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_ZeroBank_XPath {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement header = driver.findElement(By.tagName("h3"));
        String actualHeaderText = header.getText();
        String expectedHeaderText = "Log in to ZeroBank";

        System.out.println("actualHeaderText = " + actualHeaderText);

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verfication PASSED");
        } else {
            System.out.println("Header text verfication FAILED");
            System.out.println("actualHeaderText = " + actualHeaderText);
            System.out.println("expectedHeaderText = " + expectedHeaderText);
        }
        driver.close();

    }
}
