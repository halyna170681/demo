package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

import static utils.Constants.DEALER_URL;

public class DealerStates extends BasePage {
    @FindBy(css = ".fmc-cards")
    private WebElement stateList;


    public DealerStates() {
        super();
        WebDriver driver = DriverProvider.INSTANCE.getDriver();
        driver.get(DEALER_URL);

    }
    public boolean isLStateListContains(String[] expectedData) {
        List<WebElement> list = stateList.findElements(By.cssSelector("button"));

        if (list.size() != expectedData.length) {
            return false;
        }

        for (WebElement element : list) {
            String actualText = element.getText();
            if (!Arrays.asList(expectedData).contains(actualText)) {
                return false;
            }
        }
        return true;
    }
}
