package com.cydeo.tests.day11_actions_jsexecutor_practice;
//TC #7: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/large
//3- Scroll down to “Cydeo” link
//4- Scroll up to “Home” link
//5- Use below provided JS method only
//JavaScript method to use : arguments[0].scrollIntoView(true)
//Note: You need to locate the links as web elements and pass them as
//arguments into executeScript() method

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");


        WebElement cydeoLinkBottom = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        // Down-casting our driver type to JavascriptExecutor so we are able to use the methods
        // coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “Cydeo” link
        BrowserUtils.sleep(2); // to see what's happening
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLinkBottom);  // 0 index -> cydeoLinkBottom

        BrowserUtils.sleep(2); // to see what's happening
        // js.executeScript("arguments[1].scrollIntoView(true)", cydeoLinkBottom, homeLink); // 1 index -> homeLink
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink); // 1 index -> homeLink

        //4- Scroll up to “Home” link

        //5- Use below provided JS method only

        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
