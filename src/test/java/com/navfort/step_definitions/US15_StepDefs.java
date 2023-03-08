package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US15_StepDefs {
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    LoginPage loginPage = new LoginPage();

    @When("user click on profile")
    public void userClickOnProfile() {
        quickLaunchpadPage.txt_username_profile.click();
    }

    @And("user select Logout button in profile menu")
    public void userSelectLogoutButtonInProfileMenu() {
        quickLaunchpadPage.Logout.click();
    }

    @Then("user ends up on login page and verify url contains {string}")
    public void userEndsUpOnLoginPageAndVerifyUrlContains(String expected) {
        BrowserUtils.verifyTitleContains(expected);
    }

    @Then("user ends up on login page and verify page header is {string}")
    public void userEndsUpOnLoginPageAndVerifyPageHeaderIs(String expected) {

        Assert.assertTrue(loginPage.header_txt_Login.isDisplayed());
        Assert.assertEquals(expected,loginPage.header_txt_Login.getText());
    }

    @Then("user ends up on login page and navigate back page")
    public void userEndsUpOnLoginPageAndNavigateBackPage() {
        Driver.getDriver().navigate().back();
    }
}
