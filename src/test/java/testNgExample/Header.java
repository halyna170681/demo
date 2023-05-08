package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class Header extends TestNgRunner {
    @Story("Story 1")
    @Epic("Epic 1")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 1: Main page: all required elements are displayed
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Check Ford Pro CVC logo
     */
    public void testFordProLogoExists() {
        // create HomePage object
        MainPage mainPage = new MainPage();

        // navigate to website
         //mainPage.waitForLoad();

        // check if Ford Pro CVC logo exists
        assertTrue(mainPage.isLogoDisplayed());
    }
}


