package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage_AA {
    public LibraryLoginPage_AA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail") // css = "//input[id='inputEmail']"  // input#inputEmail // #inputEmail
    public WebElement inputEmail;

    @FindBy(id = "inputPassword") // css = "input[id='inputPassword']" // input#inputPassword // #inputPassword
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']")
    public WebElement this_field_is_required_Error_Message;

    @FindBy(id = "inputEmail-error")
    public WebElement please_enter_a_valid_email_address_error_message;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrong_Email_or_Password_Error_Message;


}
