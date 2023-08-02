package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DealerStates;
import pages.MainPage;

import java.net.MalformedURLException;


public class CommercialVehicleCenterByStates extends TestNgRunner {
    /*
    Case 19:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to "See a list of all Commercial Vehicle Centers by state" link
    3. Click on "See a list of all Commercial Vehicle Centers by state" link
     */
    @Test(description = "testCommercialVehicleCentersList", priority = 18)
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
        Assert.assertTrue(dealerStates.isLStateListContains(expectedData));
    }
}
