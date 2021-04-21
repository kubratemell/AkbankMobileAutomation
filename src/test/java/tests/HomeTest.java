package tests;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import models.HomeModel;
import org.junit.Assert;

public class HomeTest extends Driver {

    HomeModel model;
    public HomeTest(){
        model = new HomeModel();
    }

    @Step("Check that <key> is seen")
    public void checkTitle(String key) {
        Assert.assertEquals(key,model.checkTitle());
    }

    @Step("Then click 'En yakın Akbank'")
    public void clickNearestAkbank() {
        model.clickNearestAkbank();
    }
}
