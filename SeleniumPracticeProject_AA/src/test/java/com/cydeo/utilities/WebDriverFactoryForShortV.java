
package com.cydeo.utilities;

// TASK: NEW METHOD  CREATION
// Method name: getDriver
// Static method
// Accepts String arg: browserType
//  - This arg will determine what type of browser is opened
//  - if "chrome" passed --> it will open chrome browser
//  - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactoryForShortV {
/*
    public static WebDriver getDriver(String browserType) {

        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }
*/
    // Using switch
    public static WebDriver getDriver(String browserName){
        WebDriver driver;

        switch (browserName.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Unknown browser type: " + browserName);
                driver = null;
        }
        driver.manage().window().maximize();
        return driver;
    }
}





