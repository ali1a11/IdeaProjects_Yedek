package com.cydeo.tests.day12_pom_design_explicit_wait;

//TC #1: Required field error message test
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com
//3- Do not enter any information
//4- Click to “Sign in” button
//5- Verify expected error is displayed:
//Expected: This field is required.
//NOTE: FOLLOW POM DESIGN PATTERN

//TC #2: Invalid email format error message test
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com
//3- Enter invalid email format
//4- Verify expected error is displayed:
//Expected: Please enter a valid email address.
//NOTE: FOLLOW POM DESIGN PATTERN

//TC #3: Library negative login
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com
//3- Enter incorrect username or incorrect password
//4- Verify title expected error is displayed:
//Expected: Sorry, Wrong Email or Password
//NOTE: FOLLOW POM DESIGN PATTERN

import com.cydeo.pages.LibraryLoginPage_AA;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices_AA {
    LibraryLoginPage_AA libraryLoginPage_aa; // class level !!!

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage_aa = new LibraryLoginPage_AA(); // !!!

    }


    @Test
    public void required_field_error_message_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        // Driver.getDriver().get("https://library1.cydeo.com"); // ->@BeforeMethod
        // LibraryLoginPage_AA libraryLoginPage_aa = new LibraryLoginPage_AA(); // ->@BeforeMethod

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage_aa.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage_aa.this_field_is_required_Error_Message.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com"); // ->@BeforeMethod
        //LibraryLoginPage_AA libraryLoginPage_aa = new LibraryLoginPage_AA(); // ->@BeforeMethod

        //3- Enter invalid email format
        libraryLoginPage_aa.inputEmail.sendKeys("Invalid Email");
        libraryLoginPage_aa.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        String actualErrorMessage = libraryLoginPage_aa.please_enter_a_valid_email_address_error_message.getText();
        String expectedErrorMessage = "Please enter a valid email address.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        Driver.closeDriver();
    }

    @Test
    public void library_negative_login_test(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com"); // ->@BeforeMethod
        //LibraryLoginPage_AA libraryLoginPage_aa = new LibraryLoginPage_AA(); // ->@BeforeMethod

        //3- Enter incorrect username or incorrect password
        libraryLoginPage_aa.inputEmail.sendKeys("Invalid@Email");
        libraryLoginPage_aa.inputPassword.sendKeys("Invalid password");
        libraryLoginPage_aa.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        String actualErrorMessage = libraryLoginPage_aa.wrong_Email_or_Password_Error_Message.getText();
        String expectedErrorMessage = "Sorry, Wrong Email or Password";

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        Driver.closeDriver();
    }

}
