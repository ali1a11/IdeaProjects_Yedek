package com.cydeo.tests.day3_cssSelector_xpath;
//TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Verify “remember me” label text is as expected:
//Expected: Remember me on this computer
//4- Verify “forgot password” link text is as expected:
//Expected: Forgot your password?
//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes
//PS: Inspect and decide which locator you should be using to locate web
//elements.


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeLabel = rememberMeLabel.getText();
        String expectedRememberMeLabel = "Remember me on this computer";

        System.out.println("actualRememberMeLabel = " + actualRememberMeLabel);

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Remember me label test PASSED");
        } else {
            System.out.println("Remember me label test FAILED");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();
        String expectedForgotPasswordLinkText = "Forgot your password?";

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)) {
            System.out.println("Forgot password link text verification test PASSED");
        } else {
            System.out.println("Forgot password link text verification test FAILED");
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String actualhrefAttributeValue = forgotPasswordLink.getAttribute("href");
        String expectedhrefAttributeValue = "forgot_password=yes";

        if (actualhrefAttributeValue.contains(expectedhrefAttributeValue)){
            System.out.println("href attribute’s value verification PASSED");
        } else {
            System.out.println("href attribute’s value verification FAILED");
            System.out.println("actualhrefAttributeValue = " + actualhrefAttributeValue);
            System.out.println("expectedhrefAttributeValue = " + expectedhrefAttributeValue);
        }


               // driver.close();

    }
}
