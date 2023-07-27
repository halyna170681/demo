package junitExample;

//import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.WebDriver;
import pages.DriverProvider;

import java.net.MalformedURLException;


public class TestHelpers {
    public static String getUrlInNewTab () throws MalformedURLException {
        WebDriver driver = DriverProvider.INSTANCE.getDriver();
        String winHandleBefore = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String url = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        return url;
    }

}
