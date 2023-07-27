package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.net.MalformedURLException;

import static junitExample.TestHelpers.getUrlInNewTab;
import static org.testng.AssertJUnit.assertEquals;


public class ProCommercialResources extends TestNgRunner {
    @Story("Check to open https://www.fordupfits.com/commercial in new tab")
    @Epic("Epic 4")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 7:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Ford Pro Commercial Resources section
    3. Click on Ford Upfits link
    4. Open https://www.fordupfits.com/commercial in new tab
    */
   public void testOpenFordUpfits() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickFordUpfitsLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.fordupfits.com/commercial", url);
    }

    @Story("Check to open https://www.ford.com/finance/commercial-financing/ in new tab")
    @Epic("Epic 4")
    @Feature("Feature 2")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 8:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Pro FinSimple link
    3. Open https://www.ford.com/finance/commercial-financing/ in new tab
     */
    public void testFordProFinSimple() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordProFinSimpleLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.ford.com/finance/commercial-financing/", url);
    }
    @Story("Check to open https://www.fleetcare.ford.com/  in new tab")
    @Epic("Epic 4")
    @Feature("Feature 3")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 9:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Fleet link
    3. Open https://www.fleetcare.ford.com/  in new tab
     */
    public void testFordFleetLink() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordFlitLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.fleetcare.ford.com/", url);
    }
    @Story("Check to open https://www.commercialsolutions.ford.com/  in new tab")
    @Epic("Epic 2")
    @Feature("Feature 4")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 10:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Ford Commercial Solutions link
    3. Open https://www.commercialsolutions.ford.com/  in new tab
     */
    public void testFordCommercialSolutionLink() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.clickFordCommercialSolutionLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.commercialsolutions.ford.com/", url);
    }
}
