package junitExample;

import org.openqa.selenium.WebDriver;
import pages.DriverProvider;


public class TestHelpers {
    public static String getUrlInNewTab () {
        WebDriver driver = DriverProvider.INSTANCE.getDriver();

        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String url = driver.getCurrentUrl();
        driver.close();
        return url;
    }

}
