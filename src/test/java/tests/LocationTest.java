package tests;

import com.thoughtworks.gauge.Step;
import models.LocationModel;
import org.junit.Assert;

public class LocationTest {

    LocationModel model;
    public LocationTest(){
        model = new LocationModel();
    }

    @Step("Check that your location is shown correctly")
    public void checkLocation() {
        Assert.assertTrue(model.checkLocation());
    }
}
