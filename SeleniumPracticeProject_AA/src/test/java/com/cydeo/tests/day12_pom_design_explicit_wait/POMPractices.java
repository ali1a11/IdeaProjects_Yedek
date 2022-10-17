package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        // All the tests occur at the same page
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        // Driver.getDriver().get("https://library1.cydeo.com"); // -> BeforeMethod
        //3- Do not enter any information
        //4- Click to “Sign in” button

        // libraryLoginPage = new LibraryLoginPage(); // -> BeforeMethod
        // We are reaching to webElement through our object of libraryLoginPage class
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        //NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.fieldrequiredErrorMessage.isDisplayed());

        Driver.closeDriver();

    }
    @Test
    public void invalid_Email_Format_Error_Message_Test(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        // Driver.getDriver().get("https://library1.cydeo.com"); // -> BeforeMethod

        // libraryLoginPage = new LibraryLoginPage(); // DO NOT FORGET THIS CODE // -> BeforeMethod

        //3- Enter invalid email format
        libraryLoginPage.inputUsername.sendKeys("InvalidEmail");
        //4- Verify expected error is displayed:
        libraryLoginPage.signInButton.click();
        //Expected: Please enter a valid email address.
        //NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        /* Or we can use code below to assert
        String actualErrorMessage = libraryLoginPage.enterValidEmailErrorMessage.getText();
        String expectedErrorMessage = "Please enter a valid email address.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
         */
        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        // Driver.getDriver().get("https://library1.cydeo.com"); // -> BeforeMethod

        // libraryLoginPage = new LibraryLoginPage(); // -> BeforeMethod

        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("Invalid@UserName");
        libraryLoginPage.inputPassword.sendKeys("Invalid Password");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        //NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        // Driver.closeDriver();

    }
}
