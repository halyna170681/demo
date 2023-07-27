package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DriverFactory {

    public static WebDriver createInstance(BrowserType browserType) throws MalformedURLException {
        WebDriver driver;
        switch (browserType) {
            case CHROME:
                //System.setProperty(SYSTEM_PROPERTY_CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
                //WebDriverManager.chromedriver().setup();
                //ChromeOptions options = new ChromeOptions();
                //options.addArguments("--remote-allow-origins=*");
                //driver = new ChromeDriver(options);
                /*DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "Chrome");
                capabilities.setCapability("browserVersion", "107.0");
                capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
                    *//* How to add test badge *//*
                    put("name", "Test badge...");

                    *//* How to set session timeout *//*
                    put("sessionTimeout", "15m");

                    *//* How to set timezone *//*
                    put("env", new ArrayList<String>() {{
                        add("TZ=UTC");
                    }});

                    *//* How to add "trash" button *//*
                    put("labels", new HashMap<String, Object>() {{
                        put("manual", "true");
                    }});

                    *//* How to enable video recording *//*
                    put("enableVideo", false);
                }});
                driver = new RemoteWebDriver(new URL("http://172.16.107.128:4444/wd/hub"), capabilities);*/

                ChromeOptions options = new ChromeOptions();
                //options.setCapability("browserName", "chrome");
                options.setCapability("browserVersion", "113");
                options.setCapability("selenoid:options", new HashMap<String, Object>() {{
                    /* How to add test badge */
                    put("name", "Test badge...");

                    /* How to set session timeout */
                    put("sessionTimeout", "15m");

                    /* How to set timezone */
                    put("env", new ArrayList<String>() {{
                        add("TZ=UTC");
                    }});

                    /* How to add "trash" button */
                    put("labels", new HashMap<String, Object>() {{
                        put("manual", "true");
                    }});

                    /* How to enable video recording */
                    put("enableVideo", false);
                    put("eenableTracing", false);
                }});
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
                options.addArguments("--headless=new");
                driver = new RemoteWebDriver(new URL("http://34.29.214.131:4444/wd/hub"), options);
                /*if("remote".equalsIgnoreCase(browser)) {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("browserName", "chrome");
                    driver = new RemoteWebDriver(URI.create("http://localhost:3100/").toURL(), capabilities);
                }else{
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    Map<String, Object> prefs = new HashMap<>();
                    prefs.put("download.default.directory", new File("target/download").getAbsolutePath());
                    options.setExperimentalOption("prefs", prefs);
                    driver = new ChromeDriver(options);
               }*/
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
