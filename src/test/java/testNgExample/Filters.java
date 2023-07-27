package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.net.MalformedURLException;

import static junitExample.TestHelpers.getUrlInNewTab;
import static org.testng.AssertJUnit.assertEquals;

public class Filters extends TestNgRunner {
    @Story("Search result should display list of dealers Sorted by Distance")
    @Epic("Epic 9")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 22:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Zip section
    3. Put zip code "90210" in search and hit "enter"
    4. Expand Filters for Vehicles
    5. Choose "F-150 Pickup" checkbox
    6. Click "Apply Filters" button
     */
    public void testCommercialVehicleCentersList() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.listCommercialVehicleLink();
        String url = null;
        try {
            url = getUrlInNewTab();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        assertEquals( "https://fordcommercialvehiclecenter.com/dealers/states", url);
    }
}
