package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import java.net.MalformedURLException;
import static testNgExample.TestHelpers.getUrlInNewTab;


public class StayInTheKnow extends TestNgRunner {

    /*
    Case 6:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Stay Connected for Generous Incentives and So Much More section
    3. Click on Stay in the Know link - Open in new tab https://www.fordpro.com/en-us/updates
     */
    @Test(description = "tesCheckHeadquartersPhoneNumber", priority = 5)
    public void testCheckOpenNewTabFordPro() throws InterruptedException, MalformedURLException {
        MainPage mainPage = new MainPage();
        mainPage.clickStayInTheKnowLink();
        String url = getUrlInNewTab();
        Assert.assertEquals( "https://www.fordpro.com/en-us/updates", url);
    }
}
