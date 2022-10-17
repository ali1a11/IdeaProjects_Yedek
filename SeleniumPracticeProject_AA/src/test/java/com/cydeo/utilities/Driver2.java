package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver2 {

    /*
Creating a private constructor, so we are closing
access to the object of this class from outside the class
  */
    private Driver2(){}
    /*
We make WebDriver private, because we want to close access from outside the class
We make it static because we will use it in a static method
 */
    private static WebDriver driver; // value is null by default


}
