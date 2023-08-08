package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;


public class DriverFactory {

    public static WebDriver createInstance(BrowserType browserType) throws MalformedURLException {
        WebDriver driver;
        Boolean isRemote = true;
        switch (browserType) {
            case CHROME:
               if (isRemote == false) {
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                }else {
                   System.setProperty("webdriver.http.factory", "jdk-http-client");
                    ChromeOptions options = new ChromeOptions();
                    options.setCapability("browserName", "chrome");
                    //options.setCapability("browserVersion", "113.0");
                    options.setCapability("selenoid:options", new HashMap<String, Object>() {
                        {
                            put("enableVNC", true);
                            put("name", "Test badge...");
                            put("sessionTimeout", "1h");
                            put("env", new ArrayList<String>() {{
                                add("TZ=UTC");
                            }});
                            put("labels", new HashMap<String, Object>() {{
                                put("manual", "true");
                            }});
                            put("enableVideo", false);
                            put("eenableTracing", true);
                        }
                    });
                    driver = new RemoteWebDriver(new URL("http://34.170.56.149:4444/wd/hub"), options);
                }
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Configuration for "+browserType+"is NOT exist");
        }
        return driver;
    }
}
