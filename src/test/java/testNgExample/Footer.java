package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static junitExample.TestHelpers.getUrlInNewTab;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Footer extends TestNgRunner {
    @Story("Check Ford Pro CVC logo in Footer")
    @Epic("Epic 5")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 11:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll  to the bottom of the page
    3. Check Ford Pro CVC logo
     */
    public void testLogoFooterDisplayed() throws InterruptedException {
        MainPage mainPage = new MainPage();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(mainPage.isLogoFooterDisplayed());
    }
    @Story("Your privacy Choice exists")
    @Epic("Epic 5")
    @Feature("Feature 2")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 12:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Do Not Sell My Personal Information ink
    3. Check Your privacy choice is exists
     */
    public void testYourPrivacyChoicesExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickDoNotSellMyPersonalInformationLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.ford.com/help/privacy/ccpa/?ccpatype=donotsellmypi&referringApplicationId=23821", url);
    }
    @Story("Privacy Statement Categories and Questions page exists")
    @Epic("Epic 5")
    @Feature("Feature 3")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 13:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Privacy Statement link
    3. Check Privacy Statement Categories and Questions page exists
     */
    public void testPrivacyStatementCategoriesExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickStatementCategoriesLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://fordcommercialvehiclecenter.com/terms.pdf", url);
    }

    @Story("About Accessibility page exists")
    @Epic("Epic 5")
    @Feature("Feature 4")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 14:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Accessibility link
    3. Check About Accessibility page exists
     */
    public void testAboutAccessibilityExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccessibilityLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.ford.com/help/contact/#accessibility", url);
    }

    @Story("Privacy page exists")
    @Epic("Epic 5")
    @Feature("Feature 5")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 15:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Privacy link
    3. Check Your privacy choice is exists
     */
    public void testPrivacyPageExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickPrivacyLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.ford.com/help/privacy/", url);
    }

    @Story("CA Privacy Rights page is exists")
    @Epic("Epic 5")
    @Feature("Feature 6")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 16:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Your CA Privacy Rights link
    3. Check CA Privacy Rights page is exists
     */
    public void testCaPrivacyExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickCAPrivacyLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://www.ford.com/help/privacy/#caPrivacy", url);
    }

    @Story("Cookie Settings Modal")
    @Epic("Epic 5")
    @Feature("Feature 7")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 17:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Cookies Settings link
    3. Check Cookie Settings Modal exists
     */
    public void testCookieSettingsModalExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickCookieSettingsLink();
        assertTrue(mainPage.isCookieModalOpened());
    }

    @Story("Check Ford motor trademark and year")
    @Epic("Epic 5")
    @Feature("Feature 8")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 18:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Check Ford motor trademark and year
     */
    public void testCheckFordMotorTrademarkExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(mainPage.isMotorTradeMarkAndYearExists());
    }
}
