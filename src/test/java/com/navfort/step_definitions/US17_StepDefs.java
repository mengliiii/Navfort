package com.navfort.step_definitions;

import com.navfort.pages.FleetVehiclesPage;
import com.navfort.pages.QuickLaunchpadPage;

import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static com.navfort.utilities.BrowserUtils.clickMainMenu;

public class US17_StepDefs {
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    FleetVehiclesPage fleetVehiclesPage = new FleetVehiclesPage();

    @Then("user click {string} in the menu")
    public void userClickInTheMenu(String fleet) {
        clickMainMenu(fleet);
    }


    @And("user click {string} in the Fleet dropdown")
    public void userClickInTheFleetDropdown(String Vehicles) {
        BrowserUtils.clickSubMenu(Vehicles);
    }

    @And("user click filter button")
    public void userClickFilterButton() {
        BrowserUtils.clickElement(fleetVehiclesPage.btn_filter);
    }

    @And("user click Manage Filters")
    public void userClickManageFilters() {
        BrowserUtils.clickElement(fleetVehiclesPage.manage_filters);
    }

    @Then("user select Location checkbox")
    public void userSelectLocationCheckbox() {
        BrowserUtils.clickElement(fleetVehiclesPage.checkbox_location);

    }


    @And("user click Location:All button")
    public void userClickLocationAllButton() {
        BrowserUtils.clickElement(fleetVehiclesPage.btn_locationAll);
    }

    @And("user click Contains button")
    public void userContainsClickButton() {
        BrowserUtils.clickElement(fleetVehiclesPage.btn_contains);
    }

    @Then("user should see methods below")
    public void userShouldSeeMethodsBelow(List<String> methods) {
        List<String> actualMethods = BrowserUtils.convertListOfWebElementToListOfString(fleetVehiclesPage.dropdown_contains);
        Assert.assertEquals(methods, actualMethods);

    }


    @And("user input {string} and click update")
    public void userInputAndClickUpdate(String searchValue) {

        fleetVehiclesPage.inputBar.sendKeys(searchValue);
        fleetVehiclesPage.btn_update.click();
    }

    @And("user see {string} under LOCATION")
    public void userSeeUnderLOCATION(String arg0) {

    }
}
