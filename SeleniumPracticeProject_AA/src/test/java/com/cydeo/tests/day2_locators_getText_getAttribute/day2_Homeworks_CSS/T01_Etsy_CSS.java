package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_CSS;
//TC #1: Etsy Title Verification
//1. Open Chrome browser
//2. Go to https://www.etsy.com
//3. Search for “wooden spoon”
//4. Verify title:
//Expected: “Wooden spoon | Etsy”

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_Etsy_CSS {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”

        // css Locator
        // tagName[attribute='value']
        // input[name='search_query']
        // WebElement searchBox = driver.findElement(By.cssSelector("input[name='search_query']"));

        // tagName[attribute='value']
        // input[data-id='search-query']
        WebElement searchBox = driver.findElement(By.cssSelector("input[data-id='search-query']"));

        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }
        driver.close();
    }
}
