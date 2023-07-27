package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class SearchByDealerName extends TestNgRunner {
    @Story("Search result should contain list of dealers with dealername contains \"ford\"")
    @Epic("Epic 7")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 20:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Dealer Name section
    3. Put keywork "Ford" in search and hit "enter"
     */
    public void testSearchListOfDealers() throws InterruptedException {
        MainPage mainPage = new MainPage();
        String query = "ford";
        mainPage.searchInput(query);
        TimeUnit.SECONDS.sleep(5);
        assertTrue(mainPage.isCheckSearch(query));
    }
}
