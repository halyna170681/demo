package testNgExample;

import org.openqa.selenium.WebDriver;
import pages.DriverProvider;


public class TestHelpers {
    public static String getUrlInNewTab () throws InterruptedException {
        WebDriver driver = DriverProvider.INSTANCE.getDriver();
        String winHandleBefore = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String url = driver.getCurrentUrl();
        driver.close();
        Thread.sleep(9000);
        driver.switchTo().window(winHandleBefore);
        return url;
    }

}
