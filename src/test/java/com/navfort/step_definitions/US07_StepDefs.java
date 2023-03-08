package com.navfort.step_definitions;

import com.navfort.pages.FleetVehiclesPage;
import com.navfort.pages.LoginPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US07_StepDefs {
    FleetVehiclesPage fleetVehiclesPage = new FleetVehiclesPage();
    LoginPage loginPage= new LoginPage();
    @And("user see all checkboxes are unchecked")
    public void userSeeAllCheckboxesAreUnchecked() {
        BrowserUtils.sleep(2);
        for (WebElement rowCheckbox : fleetVehiclesPage.row_checkboxes) {
            Assert.assertTrue(!rowCheckbox.isSelected());
        }

    }

    @And("user check the first checkbox")
    public void userCheckTheFirstCheckbox() {
        BrowserUtils.sleep(3);
        fleetVehiclesPage.firstCheckbox.click();

    }

    @And("user see all checkboxes are checked")
    public void userSeeAllCheckboxesAreChecked() {
        BrowserUtils.sleep(2);
        for (WebElement rowCheckbox : fleetVehiclesPage.row_checkboxes) {
            Assert.assertTrue(rowCheckbox.isSelected());
        }

    }


}
