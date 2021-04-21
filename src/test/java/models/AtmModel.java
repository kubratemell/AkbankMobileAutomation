package models;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AtmModel extends Driver {

    public  AtmModel() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/map_atm_selected_wrapper")
    public WebElement btnAtm;

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/akbank_header_right_btn_icon")
    public WebElement btnMenuBar;

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/maplistrow_image")
    public WebElement btnThirdAtm;

    @FindBy(id="com.akbank.android.apps.akbank_direkt:id/map_detail_fragment_btnYolTarifi")
    public WebElement btnDirections;

    @FindBy(id="com.google.android.apps.maps:id/directions_endpoint_textbox")
    public WebElement chkGoogleMaps;


    public void clickAtmButton() {
        btnAtm.click();
    }

    public void clickMenuBar() {
        btnMenuBar.click();
    }

    public void clickThirdAtm() {
        btnThirdAtm.click();
    }

    public void clickDirections() {
        btnDirections.click();
    }

    public boolean checkGoogleMaps() {
        return chkGoogleMaps.isDisplayed();
    }
}
