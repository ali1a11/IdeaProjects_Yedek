package com.cydeo.tests.day3_cssSelector_xpath;
//TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Verify “Log in” button text is as expected:
//Expected: Log In
//PS: Inspect and decide which locator you should be using to locate web
//elements.
//PS2: Pay attention to where to get the text of this button from

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //PS: Inspect and decide which locator you should be using to locate web elements.
        //PS2: Pay attention to where to get the text of this button from

        // web element
        // <input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">

        // Locating the same web element using different attribute values

        // locating web element by class name attribute
        // WebElement logInButton = driver.findElement(By.className("login-btn"));

        // locating web element by css locator
        // tagName[attribute='value']
        // input[class='login-btn']
        // WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        // locating web element by type attribute
        // input[type='submit']
        // WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // input[onclick='BX.addClass(this, 'wait');'] DOES NOT WORK
        // WebElement logInButton = driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');']"));

        // input[value='Log In']
        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        // tagName.classValue
        // input.login-btn
        // WebElement logInButton = driver.findElement(By.cssSelector("input.login-btn"));


        String actualLoginButtonText = logInButton.getAttribute("value");
        String expectedLoginButtonText = "Log In";
        System.out.println("actualLoginButtonText = " + actualLoginButtonText);

        if (actualLoginButtonText.equals(expectedLoginButtonText)) {
            System.out.println("Log In button text verification PASSED");
        } else {
            System.out.println("Log In button text verification FAILED");
            System.out.println("actualLoginButtonText = " + actualLoginButtonText);
            System.out.println("expectedLoginButtonText = " + expectedLoginButtonText);
        }

        driver.close();

    }
}
