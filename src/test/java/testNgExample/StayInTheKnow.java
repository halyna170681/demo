package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.net.MalformedURLException;

import static junitExample.TestHelpers.getUrlInNewTab;
import static org.testng.AssertJUnit.assertEquals;

public class StayInTheKnow extends TestNgRunner {
    @Story("Check open new tab the Ford Pro")
    @Epic("Epic 3")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("testCheckOpenNewTabFordPro")
    @Test
    /*
    Case 6:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Stay Connected for Generous Incentives and So Much More section
    3. Click on Stay in the Know link - Open in new tab https://www.fordpro.com/en-us/updates
     */
    public void testCheckOpenNewTabFordPro() throws InterruptedException, MalformedURLException {
        MainPage mainPage = new MainPage();
        mainPage.clickStayInTheKnowLink();
        String url = getUrlInNewTab();
        assertEquals( "https://www.fordpro.com/en-us/updates", url);
    }
}
