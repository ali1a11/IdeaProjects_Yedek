package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1. Initialize the driver instance and object of the class

    public LibraryLoginPage() {
        // initElements method will create connection in between the current driver session(instance)
        // and the object of the current class

        PageFactory.initElements(Driver.getDriver(), this); // this -> object of the current class
    }

    // to create object of this class to use in the test class
    // LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    // #2. use @FindBy annotation to locate web elemen

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    // WebElement inputUsername = Driver.getDriver().findElement(By.xpath("")); // we used this way before

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldrequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;

}
