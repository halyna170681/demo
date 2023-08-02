package testNgExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class ContactTheFordPro extends TestNgRunner {
    /*
    Case 4:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Contact the Ford Pro section
    3. Check Headquarters phone number
     */
    @Test(description = "testCheckHeadquartersPhoneNumber", priority = 3)
    public void testCheckHeadquartersPhoneNumber() throws InterruptedException{
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isPhoneNumberExists());
    }

    /*
    Case 5:
    1. Navigate to https://fordcommercialvehiclecenter.com/
    2. Scroll to Contact the Ford Pro section
    3. Check Headquarters email
     */
    @Test(description = "testCheckHeadquartersEmail", priority = 4)
    public void testCheckHeadquartersEmail() throws InterruptedException {

        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isEmailsExists());
    }
}
