package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import utils.Waiters;

import java.util.List;

import static pages.PageHelpers.extractNumber;
import static utils.Constants.BASE_URL;


public class MainPage extends BasePage {
    @FindBy(css = "header nav img[alt=\"Logo\"]")
    private WebElement logo;

    @FindBy(css = "a[href=\"/#find-a-dealer\"]")
    private WebElement findDealerLink;

    @FindBy(css = "#find-a-dealer")
    private WebElement findDealerSection;

    @FindBy(id = "find-a-dealer")
    private WebElement findDealerSectionId;

    @FindBy(css = "a[href=\"/#why-commercial-center\"]")
    private WebElement findCommercialVehicleCenterLink;

    @FindBy(css = "#why-commercial-center")
    private WebElement findCommercialVehicleCenterSection;

    @FindBy(css = "a[href=\"tel:18882764088\"]")
    private WebElement headquartersPhoneNumber;

    @FindBy(css = "a[href=\"mailto:CVCHQ@FordProgramHQ.com\"]")
    private WebElement headquartersEmail;

    @FindBy(css = "a[href=\"//fordpro.com/en-us/updates\"]")
    private WebElement stayInTheKnowLink;

    @FindBy(css = "a[href=\"//fordupfits.com/commercial\"]")
    private WebElement fordUpfitsLink;

    @FindBy(css = "a[href=\"//ford.com/finance/commercial-financing/\"]")
    private WebElement fordProFinSimpleLink;

    @FindBy(css = "a[href=\"//www.fleetcare.ford.com/\"]")
    private WebElement fordFlitLink;

    @FindBy(css = "a[href=\"//commercialsolutions.ford.com/\"]")
    private WebElement fordCommercialSolutionLink;

    @FindBy(css = "footer img[alt=\"Logo\"]")
    private WebElement logoFooter;

    @FindBy(css = "a[href=\"//ford.com/help/privacy/ccpa/?ccpatype=donotsellmypi&referringApplicationId=23821\"]")
    private WebElement doNotSellMyPersonalInformationLink;

    @FindBy(css = "a[href=\"/terms.pdf\"]")
    private WebElement termsLink;

    @FindBy(css = "a[href=\"//ford.com/help/contact/#accessibility\"]")
    private WebElement accessibilityLink;

    @FindBy(css = "a[href=\"//ford.com/help/privacy/\"]")
    private WebElement privacyLink;

    @FindBy(xpath = "//a[contains(@class, 'fmc-text-button')]/span[text()='Privacy']")
    private WebElement privacyLinkXpath;

    @FindBy(css = ".fmc-text-button.optanon-toggle-display")
    private WebElement cookieSettingsLink;

    @FindBy(css = "[role=dialog] #ot-pc-title")
    private WebElement cookieSettingElement;

    @FindBy(id = "ot-pc-title")
    private WebElement cookieSettingElementId;

    @FindBy(css = "a[href=\"//ford.com/help/privacy/#caPrivacy\"]")
    private WebElement caPrivacyLink;

    @FindBy(css = "a[href=\"//www.ford.com\"]")
    private WebElement motorTradeMarkAndYearLink;

    @FindBy(css = "a[href=\"/dealers/states\"]")
    private WebElement listCommercialVehicleLink;

    @FindBy(css = "#CVCConsumerSiteSearchByDealerName")
    private WebElement searchInput;

    @FindBy(css = "[style=\"max-height: 80vh; overflow-y: scroll;\"]")
    private WebElement resultList;

    @FindBy(css = "#CVCConsumerSiteSearchByDealerZipCode")
    private WebElement inputZipCode;

    public MainPage() {
        super();
        WebDriver driver = DriverProvider.INSTANCE.getDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }


    @Step("check Ford Pro CVC logo")
    public boolean isLogoDisplayed() {
        Waiters.waitUntilElementIsVisible(logo);
        return logo.isDisplayed();
    }

    @Step("Click on \"Find a Dealer\" menu link")
    public void clickFindDealerLink() {
        Waiters.waitUntilElementIsVisible(findDealerLink);
        findDealerLink.click();
    }

    @Step("Scroll to Find a Dealer section")
    public boolean isFindDealerSectionDisplayed() {
        //return isElementVisibleOnScreen(findDealerSectionXpath); return False
        return findDealerSectionId.isDisplayed();
    }

    @Step("Click on \"Find Commercial Vehicle Center\" menu link")
    public void isFindCommercialVehicleCenterLink() {
        findCommercialVehicleCenterLink.click();
    }

    @Step("Scroll to Find Commercial Vehicle Center")
    public boolean isFindCommercialVehicleCenterSection() {
        return findCommercialVehicleCenterSection.isDisplayed();
    }


    @Step("Check Headquarters phone number")
    public boolean isPhoneNumberExists() {
        return isElementTextEquals(headquartersPhoneNumber, "1-888-276-4088");
    }

    @Step("Check Headquarters email")
    public boolean isEmailsExists() {
        return isElementTextEquals(headquartersEmail, "CVCHQ@FordProgramHQ.com");
    }

    @Step("Stay In The Know Link exists")
    public void clickStayInTheKnowLink() {
        Waiters.waitUntilElementIsVisible(stayInTheKnowLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", stayInTheKnowLink);

        stayInTheKnowLink.click();
    }

    @Step("Ford Upfits link exists")
    public void clickFordUpfitsLink() {
        Waiters.waitUntilElementIsVisible(fordUpfitsLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", fordUpfitsLink);

        fordUpfitsLink.click();
    }

    @Step("Ford Pro Fin Simple link exists")
    public void clickFordProFinSimpleLink() {
        Waiters.waitUntilElementIsVisible(fordProFinSimpleLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", fordProFinSimpleLink);

        fordProFinSimpleLink.click();
    }

    @Step("Ford Flit link exists")
    public void clickFordFlitLink() {
        Waiters.waitUntilElementIsVisible(fordFlitLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", fordFlitLink);

        fordFlitLink.click();
    }

    @Step("Ford Commercial Solution link exists")
    public void clickFordCommercialSolutionLink() {
        Waiters.waitUntilElementIsVisible(fordCommercialSolutionLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", fordCommercialSolutionLink);
        fordCommercialSolutionLink.click();
    }

    @Step("check Cookie Modal Opened")
    public boolean isCookieModalOpened() {
        Waiters.waitUntilElementIsVisible(cookieSettingElement);
        return cookieSettingElement.isDisplayed() && cookieSettingElement.getText().equals("Cookie Settings");
    }

    @Step("Your Privacy Choices exists")
    public void clickDoNotSellMyPersonalInformationLink() {
        Waiters.waitUntilElementIsVisible(doNotSellMyPersonalInformationLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", doNotSellMyPersonalInformationLink);
        doNotSellMyPersonalInformationLink.click();
    }

    @Step("Statement link")
    public void clickStatementCategoriesLink() {
        Waiters.waitUntilElementIsVisible(termsLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", termsLink);
        termsLink.click();
    }

    @Step("Accessibility link")
    public void clickAccessibilityLink() {
        Waiters.waitUntilElementIsVisible(accessibilityLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", accessibilityLink);
        accessibilityLink.click();
    }

    @Step("Privacy link")
    public void clickPrivacyLink() {
        //Waiters.waitUntilElementIsVisible(privacyLink);
        Waiters.waitUntilElementIsVisible(privacyLinkXpath);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", privacyLinkXpath);
        //privacyLink.click();
        privacyLinkXpath.click();
    }

    @Step("Cookie Settings link")
    public void clickCookieSettingsLink() {
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", cookieSettingsLink);
        cookieSettingsLink.click();
    }

    @Step("check Ford Pro CVC Footer logo")
    public boolean isLogoFooterDisplayed() {
        Waiters.waitUntilElementIsVisible(logoFooter);
        return logoFooter.isDisplayed();
    }

    @Step("Cookie Settings link")
    public void clickCAPrivacyLink() {
        Waiters.waitUntilElementIsVisible(caPrivacyLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", caPrivacyLink);
        caPrivacyLink.click();
    }

    @Step("Cookie Settings link")
    public boolean isMotorTradeMarkAndYearExists() {
        Waiters.waitUntilElementIsVisible(motorTradeMarkAndYearLink);
        return motorTradeMarkAndYearLink.isDisplayed();
    }

    @Step("Ford Upfits link exists")
    public void listCommercialVehicleLink() {
        Waiters.waitUntilElementIsVisible(listCommercialVehicleLink);
        ((JavascriptExecutor) DriverProvider.INSTANCE.getDriver()).executeScript("arguments[0].scrollIntoView();", listCommercialVehicleLink);

        listCommercialVehicleLink.click();
    }

    @Step("Put keywork \"Ford\" in search and hit \"enter\"")
    public void searchInput(String query){
        Waiters.waitUntilElementIsVisible(searchInput);
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.ENTER);
    }


    @Step("Check search")
    public boolean isCheckSearch(String query) {
        Waiters.waitUntilElementIsVisible(resultList);
        List<WebElement> list = resultList.findElements(By.cssSelector(".fds-dealer-card>div:nth-child(1) p"));

        for (WebElement element : list) {
            String actualText = element.getText().toLowerCase();

            if (!actualText.contains(query)) {
                return false;
            }
        }
        return true;
    }

    @Step("Put zip code \"18018\" in search and hit \"enter\"")
    public void inputZipCode(String query){
        Waiters.waitUntilElementIsVisible(inputZipCode);
        inputZipCode.sendKeys(query);
        inputZipCode.sendKeys(Keys.ENTER);
    }


    @Step("Check search")
    public boolean checkNearestDilers() {
        Waiters.waitUntilElementIsVisible(resultList);
        List<WebElement> list = resultList.findElements(By.cssSelector(".fds-dealer-card>div:nth-child(2) p"));
        int oldNumber = -100;
        for (WebElement element : list) {
            int actualNumber = extractNumber(element.getText().toLowerCase());

            if (oldNumber > actualNumber) {
                return false;
            }
            oldNumber = actualNumber;
        }
        return true;
    }


    public static boolean isElementVisibleOnScreen(WebElement element) {
        WebDriver driver = DriverProvider.INSTANCE.getDriver();

        int windowHeight = Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return window.innerHeight;").toString());
        int scrollY = Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return window.scrollY;").toString());
        int windowWidth = Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return window.innerWidth;").toString());
        int scrollX = Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return window.scrollX;").toString());
        int elementPosY = element.getLocation().getY();
        int elementPosX = element.getLocation().getX();
        return elementPosY >= 0 && elementPosX >= 0 && elementPosY - scrollY < windowHeight && elementPosX - scrollX < windowWidth;
    }

    public static boolean isElementTextEquals(WebElement webElement, String str) {
        return webElement.isDisplayed() && webElement.getText().equals(str);
    }

}



