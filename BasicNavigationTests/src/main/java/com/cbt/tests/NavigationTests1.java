package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationTests1 {
    public static void main(String[] args) {
        testMethodForChrome();
        testMethodForFirefox();
        testMethodForEdge();
    }

    public static void testMethodForChrome() {
        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("chrome");

        //2. Go to website https://google.com
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();

        //3. Save the title in a string variable
        String googleTitle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title in a string variable
        String etsyTitle = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle, googleTitle2);

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String etsyTitle2 = driver.getTitle();
        StringUtility.verifyEquals(etsyTitle, etsyTitle2);

        driver.quit();
    }

    public static void testMethodForFirefox() {
        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("firefox");

        //2. Go to website https://google.com
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();

        //3. Save the title in a string variable
        String googleTitle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title in a string variable
        String etsyTitle = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle, googleTitle2);

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String etsyTitle2 = driver.getTitle();
        StringUtility.verifyEquals(etsyTitle, etsyTitle2);

        driver.quit();
    }

    public static void testMethodForEdge() {
        //1. Open browser
        WebDriver driver = BrowserFactory.getDriver("Edge");

        //2. Go to website https://google.com
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();

        //3. Save the title in a string variable
        String googleTitle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title in a string variable
        String etsyTitle = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2 = driver.getTitle();

        StringUtility.verifyEquals(googleTitle, googleTitle2);

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        String etsyTitle2 = driver.getTitle();
        StringUtility.verifyEquals(etsyTitle, etsyTitle2);

        driver.quit();
    }

}
