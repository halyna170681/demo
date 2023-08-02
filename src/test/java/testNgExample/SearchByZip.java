package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import java.util.concurrent.TimeUnit;

public class SearchByZip extends TestNgRunner {

    /*
    Case 21:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Zip section
    3. Put zip code "18018" in search and hit "enter"
     */
    @Test(description = "testSearchListOfDealerZipCode", priority = 20)
    public void testSearchListOfDealerZipCode() throws InterruptedException {
        MainPage mainPage = new MainPage();
        String query = "18018";
        mainPage.inputZipCode(query);
        TimeUnit.SECONDS.sleep(5);
        Assert.assertTrue(mainPage.checkNearestDilers());
    }
}
