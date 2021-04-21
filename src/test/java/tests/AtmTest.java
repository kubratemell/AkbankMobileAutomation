package tests;

import com.thoughtworks.gauge.Step;
import models.AtmModel;
import org.junit.Assert;

public class AtmTest {

    AtmModel model;
    public AtmTest(){
        model = new AtmModel();
    }

    @Step("Click 'ATM' at the bottom of screen")
    public void clickAtmButton() {
        model.clickAtmButton();
    }

    @Step("Click menu bar on upper right corner")
    public void clickMenuBar() {
        model.clickMenuBar();
    }

    @Step("Click on the third ATM option")
    public void clickThirdAtm() {
        model.clickThirdAtm();
    }

    @Step("Click 'Yol Tarifi'")
    public void clickDirections() {
        model.clickDirections();
    }

    @Step("Check Google Maps is opened for directions")
    public void checkGoogleMaps() {
        Assert.assertTrue(model.checkGoogleMaps());
    }
}
