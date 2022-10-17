package com.cydeo.tests.day9;
//TC #3: Login scenario
//1. Create new test and make set ups
//2. Go to : https://login1.nextbasecrm.com/
//3. Enter valid username
//4. Enter valid password
//5. Click to `Log In` button
//6. Verify title is as expected:
//Expected: Portal

//helpdesk1@cybertekschool.com UserUser
//Helpdesk2@cybertekschool.com UserUser

import com.cydeo.base.TestBase2;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase2 {

    public WebDriver driver;
/*
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
 */

    @Test
    public void crm_login_test(){
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_2(){
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        //4. Enter valid password
        //5. Click to `Log In` button
        CRM_Utilities.crm_login(driver); // Using utility crm_login() method

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_3(){
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3. Enter valid username //Helpdesk2@cybertekschool.com UserUser
        //4. Enter valid password
        //5. Click to `Log In` button
        CRM_Utilities.crm_login(driver, "Helpdesk2@cybertekschool.com", "UserUser"); // Using utility crm_login() method

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");

    }
}
