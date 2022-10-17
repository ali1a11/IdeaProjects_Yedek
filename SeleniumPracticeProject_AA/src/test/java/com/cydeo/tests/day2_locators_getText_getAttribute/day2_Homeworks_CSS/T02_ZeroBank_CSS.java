package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_CSS;

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

public class T02_ZeroBank_CSS {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement loginHeader = driver.findElement(By.tagName("h3"));
        String actualloginHeaderText = loginHeader.getText();
        String expectedloginHeaderText = "Log in to ZeroBank";

        System.out.println("actualloginHeaderText = " + actualloginHeaderText);

        if(actualloginHeaderText.equals(expectedloginHeaderText)){
            System.out.println("Login header text verification PASSED");
        } else {
            System.out.println("Login header text verification FAILED");
            System.out.println("actualloginHeaderText = " + actualloginHeaderText);
            System.out.println("expectedloginHeaderText = " + expectedloginHeaderText);
        }

        driver.close();


    }
}
