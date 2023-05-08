package junitExample;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static junitExample.TestHelpers.getUrlInNewTab;
import static org.testng.AssertJUnit.assertEquals;

public class Filters extends JUnit5Runner{
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
    4. Expand Filters for Vechicles
    5. Choose "F-150 Pickup" checkbox
    6. Click "Apply Filters" button
     */
    public void testCommercialVehicleCentersList() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.listCommercialVehicleLink();
        String url = getUrlInNewTab();
        assertEquals( "https://fordcommercialvehiclecenter.com/dealers/states", url);
    }
}
