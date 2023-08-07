package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;


public class Header extends TestNgRunner {

    /*
    Case 1:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Check Ford Pro CVC logo
     */

    @Test(description = "testFordProLogoExists", priority = 0)
    public void testFordProLogoExists() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isLogoDisplayed());
    }


    /*
    Case 2:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on "Find a Dealer" menu link
    3. Scroll to Find a Dealer section
     */
    @Test(description = "testFindDealerSectionExists", priority = 1)
    public void testFindDealerSectionExists() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickFindDealerLink();
        Assert.assertTrue(mainPage.isFindDealerSectionDisplayed());
    }



    @Test(description = "testCommercialVehicleCenter", priority = 2)
    /*
    Case 3:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Click on "Why Commercial Vehicle Center" menu link
    3. Scroll to Why Commercial Vehicle Center section
     */
    public void testCommercialVehicleCenter() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.isFindCommercialVehicleCenterLink();
        Assert.assertTrue(mainPage.isFindCommercialVehicleCenterSection());
    }
}


