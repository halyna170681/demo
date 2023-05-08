package junitExample;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SearchByDealerName extends JUnit5Runner{
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
    public void testSearchListOfDilers() throws InterruptedException {
        MainPage mainPage = new MainPage();
        String query = "ford";
        mainPage.searchInput(query);
        TimeUnit.SECONDS.sleep(15);
        assertTrue(mainPage.isCheckSearch(query));
    }
}
