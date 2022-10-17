package com.cydeo.tests.day3_cssSelector_xpath;
//TC #1: NextBaseCRM, locators and getText() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Enter incorrect username: “incorrect”
//4- Enter incorrect password: “incorrect”
//5- Click to login button.
//6- Verify error message text is as expected:
//Expected: Incorrect login or password
//PS: Inspect and decide which locator you should be using to locate web
//elements.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //1- Open a chrome browser
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        // driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        // To auto generate local variable in IntelliJ
        // Windows alt + enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        // String actualErrortext = driver.findElement(By.className("errortext")).getText();
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";
        System.out.println("errortext = " + actualErrorMessage);

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message test PASSED");
        } else {
            System.out.println("Error message test FAILED");
        }


    }
}
