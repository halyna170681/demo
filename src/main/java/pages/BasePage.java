package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    BasePage(){
        PageFactory.initElements(DriverProvider.INSTANCE.getDriver(), this);
    }

    //abstract  void waitForLoad();

}
