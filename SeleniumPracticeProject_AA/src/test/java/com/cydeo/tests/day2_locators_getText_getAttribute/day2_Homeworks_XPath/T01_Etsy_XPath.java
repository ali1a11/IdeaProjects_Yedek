package com.cydeo.tests.day2_locators_getText_getAttribute.day2_Homeworks_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC #1: Etsy Title Verification
//1. Open Chrome browser
//2. Go to https://www.etsy.com
//3. Search for “wooden spoon”
//4. Verify title:
//Expected: “Wooden spoon | Etsy”
public class T01_Etsy_XPath {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”

        // RELATIVE XPATH
        // //tagName[@attribute='value']
        // //input[@id='global-enhancements-search-query']
        // //input[@name='search_query']
        // //input[@placeholder='Search for anything']
        // //input[@autocapitalize='off']
        WebElement searhBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        searhBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";

        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }

        driver.close();
    }
}
