package com.cydeo.tests.day10_upload_actions_jsexecutor;
//TC #6: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll
//3- Use below JavaScript method and scroll
//a. 750 pixels down 10 times.
//b. 750 pixels up 10 times
//JavaScript method to use : window.scrollBy(0,0)

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //3- Use below JavaScript method and scroll
        //a. 750 pixels down 10 times.

        // JavaScript method to use : window.scrollBy(0,0)
        //((JavascriptExecutor)Driver.getDriver()).executeScript("window.scrollBy(0,750)");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // BrowserUtils.sleep(1); // to see
        // js.executeScript("window.scrollBy(0,750)");

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1); // to see
            js.executeScript("window.scrollBy(0,750)");
        }

        //b. 750 pixels up 10 times

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1); // to see
            js.executeScript("window.scrollBy(0,-750)");
        }



    }
}
