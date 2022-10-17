
// Setup webdriver manually without WebDriverManager
// without abugarcia

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manual {
    public static void main(String[] args) {
        // 1. Setting up the web driver manager
        // WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eyela\\OneDrive\\Belgeler\\11-CYDEO\\CYDEO_TEST_AUTOMATION\\Chrome_Driver\\chromedriver.exe");

        // 2: Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com/");
    }

}
