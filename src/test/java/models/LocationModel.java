package models;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationModel extends Driver {

    WebDriverWait wait;

    public  LocationModel() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath="//android.view.View[@content-desc='Google haritası']/android.view.View[18]")
    public WebElement chkLocation;

    public boolean checkLocation() {
        return chkLocation.isDisplayed();
    }
}
