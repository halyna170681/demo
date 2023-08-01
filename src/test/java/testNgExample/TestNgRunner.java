package testNgExample;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.DriverProvider;

import java.io.File;
import java.io.IOException;
import java.util.Base64;


public class TestNgRunner extends ExtentITestListenerClassAdapter {
    @Override
    public synchronized void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        ExtentTest test = ExtentTestManager.getTest(result);
        try {
            File file = getScreenShot(result);
            test.addScreenCaptureFromBase64String(
                    Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file)), "Failed test image");
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        super.onTestSkipped(result);
        ExtentTest test = ExtentTestManager.getTest(result);
        try {
            File file = getScreenShot(result);
            test.addScreenCaptureFromBase64String(Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file)), "Failed test image");
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getScreenShot(ITestResult iTestResult) {
        File fileForCopy = new File(iTestResult.getName() + ".jpg");
        File screenshotFile = ((TakesScreenshot) DriverProvider.getDriver()).getScreenshotAs(
                OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, fileForCopy);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileForCopy;
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
