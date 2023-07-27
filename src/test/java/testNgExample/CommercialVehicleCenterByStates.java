package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.DealerStates;
import pages.MainPage;

import java.net.MalformedURLException;

import static org.testng.AssertJUnit.assertTrue;

public class CommercialVehicleCenterByStates extends TestNgRunner {
    @Story("Open \"Ford Pro Commercial Vehicle Centers by state\" list")
    @Epic("Epic 6")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 19:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to "See a list of all Commercial Vehicle Centers by state" link
    3. Click on "See a list of all Commercial Vehicle Centers by state" link
     */
    public void testCommercialVehicleCentersList() {
        MainPage mainPage = new MainPage();
        mainPage.listCommercialVehicleLink();
        DealerStates dealerStates = null;
        try {
            dealerStates = new DealerStates();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        String[] expectedData = {"Alabama", "Alaska", "American Samoa", "Arizona",
                "Arkansas", "California", "Colorado", "Connecticut", "Delaware",
                "District Of Columbia", "Federated States Of Micronesia", "Florida",
                "Georgia", "Guam", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
                "Kansas", "Kentucky", "Louisiana", "Maine", "Marshall Islands", "Maryland",
                "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
                "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Northern Mariana Islands", "Ohio", "Oklahoma",
                "Oregon", "Palau", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina",
                "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virgin Islands", "Virginia",
                "Washington", "West Virginia", "Wisconsin", "Wyoming"};
        assertTrue(dealerStates.isLStateListContains(expectedData));
    }
}
