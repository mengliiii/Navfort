package com.navfort.step_definitions;

import com.navfort.pages.VehicleCostsPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US13_StepDefs {
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    @And("user see columns in the table")
    public void userSeeColumnsInTheTable(List<String> expectedColumns) {

        List<String> actualColumns = BrowserUtils.convertListOfWebElementToListOfString(vehicleCostsPage.Columns);
       // System.out.println(expectedColumns);
        //System.out.println(actualColumns);
        Assert.assertEquals(expectedColumns,actualColumns);

    }

    @And("user click the first checkbox")
    public void userClickTheFirstCheckbox() {
        BrowserUtils.sleep(2);
        vehicleCostsPage.firstCheckbox.click();

    }

    @And("user see all vehicle costs are checked")
    public void userSeeAllVehicleCostsAreChecked() {
        BrowserUtils.sleep(2);
        for (WebElement rowCheckbox : vehicleCostsPage.row_checkboxes) {
            Assert.assertTrue(rowCheckbox.isSelected());
            //System.out.println("checked");
        }

    }
}
