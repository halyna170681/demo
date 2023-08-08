package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import static testNgExample.TestHelpers.getUrlInNewTab;



public class Filters extends TestNgRunner {
    /*
    Case 22:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Zip section
    3. Put zip code "90210" in search and hit "enter"
    4. Expand Filters for Vehicles
    5. Choose "F-150 Pickup" checkbox
    6. Click "Apply Filters" button
     */

    @Test(description = "testCommercialVehicleCentersList", priority = 21)
    public void testCommercialVehicleCentersList() throws InterruptedException {

        MainPage mainPage = new MainPage();
        mainPage.listCommercialVehicleLink();
        String url = null;
        url = getUrlInNewTab();
        Assert.assertEquals("https://fordcommercialvehiclecenter.com/dealers/states", url);
    }
}

