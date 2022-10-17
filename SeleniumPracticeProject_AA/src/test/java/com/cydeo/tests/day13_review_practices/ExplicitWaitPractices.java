package com.cydeo.tests.day13_review_practices;
//TC #2: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
//3- Click to “Remove” button
//4- Wait until “loading bar disappears”
//5- Verify:
//a. Checkbox is not displayed
//b. “It’s gone!” message is displayed.
//NOTE: FOLLOW POM

//TC #3: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
//3- Click to “Enable” button
//4- Wait until “loading bar disappears”
//5- Verify:
//a. Input box is enabled.
//b. “It’s enabled!” message is displayed.
//NOTE: FOLLOW POM

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage; // class level !!!

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test() {
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        // Below lines -> BrowserUtils.waitForInvisibilityOf()
//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //to solve implicitlywait explicitlywait problem !!!
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        // instead of using three lines above, we can use BrowserUtils.waitForInvisibilityOf() method
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //5- Verify:
        //a. Checkbox is not displayed
        // After clicking Remove button checkbox dissappear from htm page
        // Therefore we use try catch
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            //second way
            //assertFalse method will pass the test if the boolean value returned as false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        System.out.println("dynamicControlsPage.message.getText() = " + dynamicControlsPage.message.getText());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));

    }

    @Test
    public void enable_button_test() {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        // @BeforeMethod

        //3- Click to “Enable” button
        System.out.println("dynamicControlsPage.inputbox.isEnabled() = " + dynamicControlsPage.inputbox.isEnabled());
        dynamicControlsPage.enableButton.click();
        System.out.println("dynamicControlsPage.inputbox.isEnabled() = " + dynamicControlsPage.inputbox.isEnabled());

        //4- Wait until “loading bar disappears”
        // Calling our ExplicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);
        System.out.println("dynamicControlsPage.inputbox.isEnabled() = " + dynamicControlsPage.inputbox.isEnabled());

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputbox.isEnabled());
        //b. “It's enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        // System.out.println("dynamicControlsPage.message.getText() = " + dynamicControlsPage.message.getText());
        //Check the String value is matching as expected
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!")); // !!!
    }
}
