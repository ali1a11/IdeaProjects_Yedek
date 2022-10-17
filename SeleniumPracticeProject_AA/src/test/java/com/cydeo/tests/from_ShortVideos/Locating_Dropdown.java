package com.cydeo.tests.from_ShortVideos;
// Select class methods
// getOptions()
// getFirstSelectedOption()
// getAllSelectedOptions()


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locating_Dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // get https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        // WebElement simpleDropDown = driver.findElement(By.cssSelector("select[id='dropdown']>option[value='2']"));
        // simpleDropDown.click();

        // locate dropdown web element
        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        // wrap this element inside Select object
        Select selectObj = new Select(simpleDropDown);

        // or Select selectObj = new Select(driver.findElement(By.id("dropdown")));

        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        // verified Option 2 is selected
        String expectedOpt = "Option 2";
        String actualOpt = selectObj.getFirstSelectedOption().getText();

        if(actualOpt.equals(expectedOpt)){
            System.out.println("Option 2 selection verification PASSED");
        } else {
            System.out.println("Option 2 selection verification FAILED");
        }






    }
}
