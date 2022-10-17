package com.cydeo.tests.day3_cssSelector_xpath;

//TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
//3- Enter incorrect username into login box:
//4- Click to `Reset password` button
//5- Verify “error” label is as expected
//Expected: Login or E-mail not found
//PS: Inspect and decide which locator you should be using to locate web elements.
//PS2: Pay attention to where to get the text of this button from

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5 {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // //tagName[@attribute='value']
        // //input[@name='USER_LOGIN']

        //3- Enter incorrect username into login box:
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("incorrect");

        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@value='Reset password']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement resetPasswordErrorText = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualResetPasswordErrorText = resetPasswordErrorText.getText();
        String expectedResetPasswordErrorText = "Login or E-mail not found";

        System.out.println("actualResetPasswordErrorText = " + actualResetPasswordErrorText);

        if (actualResetPasswordErrorText.equals(expectedResetPasswordErrorText)) {
            System.out.println("Error label verification PASSED");
        } else {
            System.out.println("Error label verification FAILED");
            System.out.println("actualResetPasswordErrorText = " + actualResetPasswordErrorText);
            System.out.println("expectedResetPasswordErrorText = " + expectedResetPasswordErrorText);
        }

        driver.close();

    }
}
