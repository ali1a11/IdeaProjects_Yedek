package com.cydeo.tests.from_ShortVideos_Test;

import com.cydeo.pages.LibraryLoginPage_AA_2;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest_POM {

    LibraryLoginPage_AA_2 libraryLoginPage_aa_2; // class level !!!

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library1.url"));
        libraryLoginPage_aa_2 = new LibraryLoginPage_AA_2();
    }

    @Test(priority = 1)
    public void positiveLoginTest() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("library1.url")); // ->@BeforeMethod
//        LibraryLoginPage_AA_2 libraryLoginPage_aa_2 = new LibraryLoginPage_AA_2(); // ->@BeforeMethod

//        libraryLoginPage_aa_2.inputEmail.sendKeys(ConfigurationReader.getProperty("library1.student.validEmail"));
//        libraryLoginPage_aa_2.inputPassword.sendKeys(ConfigurationReader.getProperty("library1.student.validPassword"));
//        libraryLoginPage_aa_2.signinButton.click();

        // we can use method for login
        String validUserName = ConfigurationReader.getProperty("library1.student.validEmail");
        String validPassword = ConfigurationReader.getProperty("library1.student.validPassword");

        libraryLoginPage_aa_2.login(validUserName, validPassword);
        Driver.closeDriver();
    }

    @Test(priority = 2)
    public void logOutTest() {
        String validUserName = ConfigurationReader.getProperty("library1.student.validEmail");
        String validPassword = ConfigurationReader.getProperty("library1.student.validPassword");

        libraryLoginPage_aa_2.login(validUserName, validPassword);

        libraryLoginPage_aa_2.dropdownMenu.click();

        libraryLoginPage_aa_2.logOutButton.click();

        Driver.closeDriver();
    }


    @Test(priority = 3)
    public void negativeLoginTest() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("library1.url")); // ->@BeforeMethod
//        LibraryLoginPage_AA_2 libraryLoginPage_aa_2 = new LibraryLoginPage_AA_2(); // ->@BeforeMethod

//        libraryLoginPage_aa_2.inputEmail.sendKeys("Invalid@Username");
//        libraryLoginPage_aa_2.inputPassword.sendKeys("Invalid Password");
//        libraryLoginPage_aa_2.signinButton.click();

        // we can use method for login
        String invalidUserName = "Invalid@Username";
        String invalidPassword = "Invalid Password";

        libraryLoginPage_aa_2.login(invalidUserName, invalidPassword);

        String actualErrorMessage = libraryLoginPage_aa_2.wrongEmailOrPasswordMessage.getText();
        String expectedErrorMessage = "Sorry, Wrong Email or Password";

        Assert.assertTrue(libraryLoginPage_aa_2.wrongEmailOrPasswordMessage.isDisplayed());
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Driver.closeDriver();
    }
}
