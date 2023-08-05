package testNgExample;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.qameta.allure.Attachment;
import listeners.CustomExtentReportListener;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.DriverProvider;


@Listeners(CustomExtentReportListener.class)
public class TestNgRunner {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/ExtentHtml.html");
    }

    @BeforeMethod
    public  void before(){
    }

    @AfterMethod(alwaysRun = true)
    public void after(ITestResult result){
        if (!result.isSuccess()) {
            makeScreenshot();
        }
        DriverProvider.INSTANCE.removeDriver();
    }

   @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] makeScreenshot() {
        return ((TakesScreenshot) DriverProvider.INSTANCE.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
