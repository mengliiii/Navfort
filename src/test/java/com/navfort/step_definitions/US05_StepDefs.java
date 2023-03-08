package com.navfort.step_definitions;

import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.pages.VehiclesModelPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class US05_StepDefs {
    VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();

    @And("user see columns below")
    public void userSeeColumnsBelow(List<String> expectedColumns) {
        BrowserUtils.sleep(2);
        List<String> actualColumns = BrowserUtils.convertListOfWebElementToListOfString(vehiclesModelPage.filterOptions);
        actualColumns.removeIf(p -> p.equals(""));
        actualColumns.remove(actualColumns.size() - 1);
        Assert.assertEquals(expectedColumns, actualColumns);
    }

    @Then("user should see error message displayed")
    public void userShouldSeeErrorMessageDisplayed() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(quickLaunchpadPage.permission_alertMsg.isDisplayed());

    }
}
