package com.cydeo.tests.day2_locators_getText_getAttribute;
//TC#3: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with “apple” word

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");


        //3- Write “apple” in search box
        //4- press Enter using Keys.ENTER
        // inspect web element first after that decide which locator will you use
        // we find google search box's name by using inspect
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        Thread.sleep(1000);
        // Privacy Authorization popup
        // WebElement privacyLogin = driver.findElement(By.id("W0wltc"));
        // privacyLogin.click();

        driver.findElement(By.id("W0wltc")).click();

        //driver.findElement(By.id("L2AGLb")).click();

        Thread.sleep(1000);
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }




    }
}
