package com.navfort.step_definitions;

import com.navfort.pages.CampaignPage;
import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class campaigns_stepdefs {
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    LoginPage loginPage= new LoginPage();
    CampaignPage campaignPage = new CampaignPage();

    @Then("user click {string} in the  main menu")
    public void user_click_in_the_main_menu(String mainMenu) {
        BrowserUtils.sleep(2);
    quickLaunchpadPage.clickMainMenu(mainMenu);
    }
    @Then("user click {string} in the sub menu")
    public void user_click_in_the_sub_menu(String subMenu) {
        BrowserUtils.sleep(1);
        quickLaunchpadPage.clickSubMenu(subMenu);
    }
    @Then("user click Filters button on campaigns page")
    public void user_click_filters_button_on_campaigns_page() {
        BrowserUtils.clickElement(campaignPage.btn_filter);
       // BrowserUtils.sleep(2);
    }
    @Then("user click Manage Filters on campaigns page")
    public void user_click_manage_filters_on_campaigns_page() {
        BrowserUtils.clickElement(campaignPage.manage_filters);
       // BrowserUtils.sleep(2);

    }
    @Then("user see options are checked by default")
    public void user_see_are_checked_by_default() {
        for (WebElement each : campaignPage.filters) {
            Assert.assertTrue(each.isSelected());
        }
    }


}
