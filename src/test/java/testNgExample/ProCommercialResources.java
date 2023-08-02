package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import static testNgExample.TestHelpers.getUrlInNewTab;


public class ProCommercialResources extends TestNgRunner {

    /*
    Case 7:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Ford Pro Commercial Resources section
    3. Click on Ford Upfits link
    4. Open https://www.fordupfits.com/commercial in new tab
    */
    @Test(description = "testOpenFordUpfits", priority = 6)
    public void testOpenFordUpfits() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordUpfitsLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.fordupfits.com/commercial", url);
    }

    /*
    Case 8:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Pro FinSimple link
    3. Open https://www.ford.com/finance/commercial-financing/ in new tab
     */
    @Test(description = "testFordProFinSimple", priority = 7)
    public void testFordProFinSimple() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordProFinSimpleLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.ford.com/finance/commercial-financing/", url);
    }

    /*
    Case 9:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Fleet link
    3. Open https://www.fleetcare.ford.com/  in new tab
     */
    @Test(description = "testFordFleetLink", priority = 8)
    public void testFordFleetLink() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordFlitLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.fleetcare.ford.com/", url);
    }

    /*
    Case 10:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Commercial Solutions link
    3. Open https://www.commercialsolutions.ford.com/  in new tab
     */
    @Test(description = "testFordCommercialSolutionLink", priority = 9)
    public void testFordCommercialSolutionLink() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordCommercialSolutionLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.commercialsolutions.ford.com/", url);
    }
}
