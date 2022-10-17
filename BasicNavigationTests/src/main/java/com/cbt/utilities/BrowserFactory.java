package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName) {

        WebDriver driver;

        switch (browserName.toLowerCase()) {
            case "safary":
                if (System.getProperty("os.system").toLowerCase().contains("mac")) {
                    throw new WebDriverException("Safary is not supported!!!");
                }
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                if (!System.getProperty("os.name").contains("Windows")) {
                    throw new WebDriverException("Edge is not supported !!!");
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                System.out.println("Unknown browser type " + browserName);
                driver = null;
        }

        return driver;
    }
}

//      driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        String os = System.getProperty("os.name"); // Operation system Ex. Windows 11
//        if (os.contains("Windows")){
//        }
