package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage_AA_2 {

    public LibraryLoginPage_AA_2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement inputEmail;

    @FindBy(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.=\"Sign in\"]")
    public WebElement signinButton;

    @FindBy(xpath = "//div[.=\"Sorry, Wrong Email or Password\"]")
    public WebElement wrongEmailOrPasswordMessage;

    @FindBy(xpath = "//span[.='Test Student 8']") // //div[contains(@class,'dropdown-menu')]
    public WebElement dropdownMenu;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logOutButton;


    // we can use method for login
    public void login(String userName, String password){
        inputEmail.sendKeys(userName);
        inputPassword.sendKeys(password);
        signinButton.click();
    }
}
