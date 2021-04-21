package models;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeModel extends Driver {

    public  HomeModel() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/title")
    public WebElement chkTitle;

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/item3")
    public WebElement btnNearestAkbank;


    public String checkTitle()  {
        return chkTitle.getText().replace("\n", " ");
    }

    public void clickNearestAkbank() {
        btnNearestAkbank.click();
    }
}
