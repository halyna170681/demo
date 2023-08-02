package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import java.util.concurrent.TimeUnit;
import static testNgExample.TestHelpers.getUrlInNewTab;


public class Footer extends TestNgRunner {

    /*
    Case 11:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll  to the bottom of the page
    3. Check Ford Pro CVC logo
     */
    @Test(description = "testLogoFooterDisplayed", priority = 10)
    public void testLogoFooterDisplayed() throws InterruptedException {
        MainPage mainPage = new MainPage();
        TimeUnit.SECONDS.sleep(1);
        Assert.assertTrue(mainPage.isLogoFooterDisplayed());
    }

    /*
    Case 12:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Do Not Sell My Personal Information ink
    3. Check Your privacy choice is exists
     */
    @Test(description = "testYourPrivacyChoicesExists", priority = 11)
    public void testYourPrivacyChoicesExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickDoNotSellMyPersonalInformationLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.ford.com/help/privacy/ccpa/?ccpatype=donotsellmypi&referringApplicationId=23821", url);
    }

    /*
    Case 13:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Privacy Statement link
    3. Check Privacy Statement Categories and Questions page exists
     */
    @Test(description = "testPrivacyStatementCategoriesExists", priority = 12)
    public void testPrivacyStatementCategoriesExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickStatementCategoriesLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://fordcommercialvehiclecenter.com/terms.pdf", url);
    }

    /*
    Case 14:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Accessibility link
    3. Check About Accessibility page exists
     */
    @Test(description = "testAboutAccessibilityExists", priority = 13)
    public void testAboutAccessibilityExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccessibilityLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.ford.com/help/contact/#accessibility", url);
    }

    /*
    Case 15:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Privacy link
    3. Check Your privacy choice is exists
     */
    @Test(description = "testPrivacyPageExists", priority = 14)
    public void testPrivacyPageExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickPrivacyLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.ford.com/help/privacy/", url);
    }

    /*
    Case 16:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Your CA Privacy Rights link
    3. Check CA Privacy Rights page is exists
     */
    @Test(description = "testCaPrivacyExists", priority = 15)
    public void testCaPrivacyExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickCAPrivacyLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals( "https://www.ford.com/help/privacy/#caPrivacy", url);
    }

    /*
    Case 17:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on Cookies Settings link
    3. Check Cookie Settings Modal exists
     */
    @Test(description = "testCookieSettingsModalExists", priority = 16)
    public void testCookieSettingsModalExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickCookieSettingsLink();
        Assert.assertTrue(mainPage.isCookieModalOpened());
    }

    /*
    Case 18:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Check Ford motor trademark and year
     */
    @Test(description = "testCheckFordMotorTrademarkExists", priority = 17)
    public void testCheckFordMotorTrademarkExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        TimeUnit.SECONDS.sleep(1);
        Assert.assertTrue(mainPage.isMotorTradeMarkAndYearExists());
    }
}
