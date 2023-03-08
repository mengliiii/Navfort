package com.navfort.step_definitions;

import com.navfort.pages.FleetVehiclesPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US06_StepDefs {
    FleetVehiclesPage fleetVehiclesPage = new FleetVehiclesPage();
    @And("use see view edit delete icons are displayed")
    public void useSeeViewEditDeleteIconsAreDisplayed(List<String> func) {
        BrowserUtils.sleep(1);
        List<String> actualFunc= new ArrayList<>();
        for (WebElement each : fleetVehiclesPage.threeDots_funcs) {
           actualFunc.add(each.getAttribute("title").trim());
        }
        System.out.println(actualFunc);
        BrowserUtils.sleep(1);
        for (WebElement each : fleetVehiclesPage.threeDots_funcs) {
            Assert.assertTrue(each.isDisplayed());
        }

    }

    @And("user hover over first line three dots")
    public void userHoverOverDots() {
        BrowserUtils.sleep(2);
        BrowserUtils.hover(fleetVehiclesPage.threeDots_firstLine);
    }
}
