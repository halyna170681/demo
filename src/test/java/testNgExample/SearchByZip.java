package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class SearchByZip extends TestNgRunner {
    @Story("Search result should display list of dealers Sorted by Distance")
    @Epic("Epic 8")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 21:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Search by Zip section
    3. Put zip code "18018" in search and hit "enter"
     */
    public void testSearchListOfDealerZipCode() throws InterruptedException {
        MainPage mainPage = new MainPage();
        String query = "18018";
        mainPage.inputZipCode(query);
        TimeUnit.SECONDS.sleep(5);
        assertTrue(mainPage.checkNearestDilers());
    }
}
