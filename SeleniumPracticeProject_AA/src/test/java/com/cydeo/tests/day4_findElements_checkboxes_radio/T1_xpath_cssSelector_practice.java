package com.cydeo.tests.day4_findElements_checkboxes_radio;
//TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or CSS
//locator only (total of 6)
//a. “Home” link
//b. “Forgot password” header
//c. “E-mail” text
//d. E-mail input box
//e. “Retrieve password” button
//f. “Powered by Cydeo text
//4. Verify all web elements are displayed.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        // locate homeLink using cssSelector syntax #1, class value
        // a[class='nav-link']
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // locate homeLink using cssSelector syntax #2
        // a.nav-link
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        // locate homeLink using cssSelector, href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        // Locate header using cssSelector: locate parent element and move down to h2
        // div.example > h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        // Locate header using xpath, and using web elements text "Forgot Password"
        // //h2[text()="Forgot Password"]
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.=\"Forgot Password\"]"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()=\"Forgot Password\"]"));

        //String headerText = header_ex1.getText();
        //System.out.println("headerText = " + headerText);

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        // //input[@name='email']
        // //input[@type= 'text']
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        // Locate inputBox using xpath contains method
        // tagName[contains(@attribute, 'value')]
        // //input[contains(@pattern, 'a-z')]
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        // //button[@id='form_submit']
        // //button[@class='radius']
        // //button[@type='submit']
        WebElement retrivePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        // //div[@style='text-align: center;']
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("poweredByCydeoText.getText() = " + poweredByCydeoText.getText());

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrivePasswordButton.isDisplayed() = " + retrivePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }
}
