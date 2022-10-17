package com.cydeo.tests.day11_actions_jsexecutor_practice;

//TC #: Drag and drop
//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
//2. Drag and drop the small circle to bigger circle.
//3. Assert:
//-Text in big circle changed to: “You did great!”

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        BrowserUtils.sleep(3);

        //Locate "Accept Cookies" button and click
       WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[.='Accept and Close']"));
       acceptCookiesButton.click();

        // Locate small circle
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        // Locate big circle
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        // actions.dragAndDrop(smallCircle, bigCircle).perform();

        // another way
        //actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release()
                .perform();

        //3. Assert:
        //-Text in big circle changed to: "You did great!"

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);


    }

}
