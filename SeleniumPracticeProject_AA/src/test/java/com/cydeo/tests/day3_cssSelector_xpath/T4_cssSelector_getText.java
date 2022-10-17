package com.cydeo.tests.day3_cssSelector_xpath;

//TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
//3- Verify “Reset password” button text is as expected:
//Expected: Reset password
//PS: Inspect and decide which locator you should be using to locate web elements.
//PS2: Pay attention to where to get the text of this button from

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        // Expected: Reset password

        // tagName[attribute='value']
        // button[value='Reset password']
        // WebElement resetButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        // tagName[attribute='value']
        // button[onclick='BX.addClass(this, 'wait');'] DID NOT WORK

        // tagName[attribute='value']
        // button[class='login-btn']
        WebElement resetButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        // tagName.classValue
        // button.login-btn
        //WebElement resetButton = driver.findElement(By.cssSelector("button.login-btn"));

        String actualResetPasswordButtonText = resetButton.getText();
        String expectedResetPasswordButtonText = "Reset password";
        System.out.println("actualResetPasswordButtonText = " + actualResetPasswordButtonText);

        if(actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Reset password button text verification PASSED" );
        } else {
            System.out.println("Reset password button text verification FAILED" );
            System.out.println("actualResetPasswordButtonText = " + actualResetPasswordButtonText);
            System.out.println("expectedResetPasswordButtonText = " + expectedResetPasswordButtonText);
        }
        driver.close();


    }
}
