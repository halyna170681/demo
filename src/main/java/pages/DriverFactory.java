package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import static utils.Constants.PATH_TO_CHROME_DRIVER;
import static utils.Constants.SYSTEM_PROPERTY_CHROME_DRIVER;

public class DriverFactory {

    public static WebDriver createInstance(BrowserType browserType) {
        WebDriver driver;
        switch (browserType) {
            case CHROME:
                System.setProperty(SYSTEM_PROPERTY_CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("Configuration for "+browserType+"is NOT exist");
        }
        return driver;
    }
}
