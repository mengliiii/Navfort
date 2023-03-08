package com.navfort.step_definitions;

import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.pages.VehicleOdometersPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class US11_StepDefs {

    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    VehicleOdometersPage vehicleOdometersPage= new VehicleOdometersPage();
    @And("user see alert message {string}")
    public void userSeeAlertMessage(String msg) {
        BrowserUtils.sleep(2);
        Assert.assertTrue(quickLaunchpadPage.alertMsg.isDisplayed());
        Assert.assertEquals(msg, quickLaunchpadPage.alertMsg.getText());
    }

    @And("user see the default page is {string}")
    public void userSeeTheDefaultPageIs(String defaultPage) {
        Assert.assertEquals(defaultPage, vehicleOdometersPage.page_input.getAttribute("value"));
    }

    @And("user see the View Per Page is {string} by default.")
    public void userSeeTheViewPerPageIsByDefault(String defaultPage) {
        Assert.assertEquals(defaultPage,vehicleOdometersPage.viewPerPage_btn.getText().trim());
    }
}