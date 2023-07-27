package testNgExample;

import io.qameta.allure.*;
import junitExample.JUnit5Runner;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class ContactTheFordPro extends TestNgRunner {

    @Story("Check Headquarters phone number")
    @Epic("Epic 2")
    @Feature("Feature 1")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 4:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Contact the Ford Pro section
    3. Check Headquarters phone number
     */
    public void tesCheckHeadquartersPhoneNumber() throws InterruptedException{
        MainPage mainPage = new MainPage();
        assertTrue(mainPage.isPhoneNumberExists());
    }

    @Story("Check Headquarters email")
    @Epic("Epic 2")
    @Feature("Feature 2")
    @Link("Link")
    @Issue("link on issue")
    @Description("Description")
    @Test
    /*
    Case 5:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Contact the Ford Pro section
    3. Check Headquarters email
     */
    public void tesCheckHeadquartersEmail() throws InterruptedException {

        MainPage mainPage = new MainPage();
        assertTrue(mainPage.isEmailsExists());
    }
}
