package com.cydeo.tests.guru99Examples;

// https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
// How to Select Value from DropDown using Selenium Webdriver

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MercuryTours_DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.xpath("//button[@aria-label='Do not consent']")).click();

        // User Name= tutorial
        WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
        userName.sendKeys("tutorial");

        // Password= tutorial
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("tutorial");

        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();

        // Click Flights
        WebElement flights = driver.findElement(By.xpath("//a[.='Flights']"));
        flights.click();

        // select (Radio Button) Type: One Way
        WebElement TypeRadioButtonOneWay = driver.findElement(By.xpath("//input[@value='oneway']"));
        TypeRadioButtonOneWay.click();

        Thread.sleep(500);

        // select[name='passCount']>option[value = '2']
        WebElement passengers = driver.findElement(By.cssSelector("select[name='passCount']>option[value = '2']"));
        passengers.click();

        Thread.sleep(500);

        // select[name='passCount']>option[value = '1']
        passengers = driver.findElement(By.cssSelector("select[name='passCount']>option[value = '1']"));
        passengers.click();

        Thread.sleep(500);

        // Using Select class
        Select dropDownPass = new Select(driver.findElement(By.cssSelector("select[name='passCount']")));
        dropDownPass.selectByValue("3");

        Thread.sleep(500);

        dropDownPass.selectByValue("2");

        Thread.sleep(500);

        dropDownPass.selectByValue("3");

        Thread.sleep(50);

        Select departingFrom = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        departingFrom.selectByValue("London");

        Thread.sleep(50);

        Select OnMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        OnMonth.selectByValue("9");

        Thread.sleep(50);

        OnMonth.selectByValue("12");

        Thread.sleep(50);

        OnMonth.selectByValue("9");

        Thread.sleep(50);

        Select OnDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        OnDay.selectByValue("23");

        Thread.sleep(50);

        OnDay.selectByValue("31");

        Thread.sleep(50);

        OnDay.selectByValue("18");

        Thread.sleep(50);

        OnDay.selectByValue("23");

        Thread.sleep(50);

        Select arrivingIn = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        arrivingIn.selectByValue("Seattle");

        Thread.sleep(50);

        arrivingIn.selectByValue("Paris");

        Thread.sleep(50);

        arrivingIn.selectByValue("Seattle");

        Thread.sleep(50);

        Select returningMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        returningMonth.selectByValue("10");

        Thread.sleep(50);

        Select returningDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        returningDay.selectByValue("30");

        Thread.sleep(50);

        WebElement radioButtonBusiness = driver.findElement(By.xpath("//input[@value='Business']"));
        radioButtonBusiness.click();

        Thread.sleep(50);

        Select airline = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        airline.selectByVisibleText("Blue Skies Airlines");

        Thread.sleep(50);


        // Elements from element
        WebElement fromPort = driver.findElement(By.cssSelector("select[name='fromPort']"));
        List<WebElement> fromPortList = fromPort.findElements(By.tagName("option"));

        System.out.println("fromPortList.size() = " + fromPortList.size());

        for (WebElement each : fromPortList) {
            System.out.println("each.getAttribute(\"value\") = " + each.getAttribute("value"));
        }

/*      // parent to child select[name='fromPort']>option
        List<WebElement> fromPortList = driver.findElements(By.cssSelector("select[name='fromPort']>option"));

        System.out.println("fromPortList.size() = " + fromPortList.size());

        for (WebElement each : fromPortList) {
            System.out.println("each.getAttribute(\"value\") = " + each.getAttribute("value"));
        }
*/

        WebElement continueButton = driver.findElement(By.xpath("//input[@type='image']"));
        continueButton.click();

        driver.close();

    }
}
