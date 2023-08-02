package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import java.util.concurrent.TimeUnit;


public class SearchByDealerName extends TestNgRunner {
    /*
    Case 20:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Dealer Name section
    3. Put keywork "Ford" in search and hit "enter"
     */
    @Test(description = "testSearchListOfDealers", priority = 19)
    public void testSearchListOfDealers() throws InterruptedException {

        MainPage mainPage = new MainPage();
        String query = "ford";
        mainPage.searchInput(query);
        TimeUnit.SECONDS.sleep(5);
        Assert.assertTrue(mainPage.isCheckSearch(query));
    }
}
