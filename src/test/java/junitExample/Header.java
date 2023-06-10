package junitExample;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class Header extends JUnit5Runner {
    @Story("All required elements are displayed")
    @Epic("Epic 1")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 1:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Check Ford Pro CVC logo
     */
    public void testFordProLogoExists() {
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.isLogoDisplayed());
    }


    @Story("Find a Dealer section exists")
    @Epic("Epic 1")
    @Feature("Feature 2")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 2:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on "Find a Dealer" menu link
    3. Scroll to Find a Dealer section
     */
    public void testFindDealerSectionExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickFindDealerLink();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(mainPage.isFindDealerSectionDisplayed());
    }


    @Story("Why Commercial Vehicle Center section exists")
    @Epic("Epic 1")
    @Feature("Feature 3")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 3:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on "Why Commercial Vehicle Center" menu link
    3. Scroll to Why Commercial Vehicle Center section
     */
    public void testCommercialVehicleCenter() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.isFindCommercialVehicleCenterLink();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(mainPage.isFindCommercialVehicleCenterSection());
    }
}


