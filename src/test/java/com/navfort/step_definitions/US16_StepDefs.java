package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.List;

public class US16_StepDefs {
   LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username")
    public void userEntersUsername() {
        loginPage.userNameInputBox.sendKeys(ConfigurationReader.getProperty("truckDriver.username"));
    }

    @And("user enters password")
    public void userEntersPassword() {
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("user click on LOG IN button")
    public void userClickOnLOGINButton() {
        loginPage.loginBtn.click();
    }



    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();


    @Then("user land on the Quick Launchpad page, should see should page title is {string}")
    public void userLandOnTheQuickLaunchpadPageShouldSeeShouldPageTitleIs(String expectedPageTitle) {
        String actualPageTitle = quickLaunchpadPage.pageHeader.getText();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @Then("user land on the Quick Launchpad page, should see page heading contains the below")
    public void userLandOnTheQuickLaunchpadPageShouldSeePageHeadingContainsTheBelow(List<String> expectedMenus) {
        List<WebElement> menuElements = quickLaunchpadPage.main_menu;
        List<String> actualMenus = BrowserUtils.convertListOfWebElementToListOfString(menuElements);

        Assert.assertEquals(expectedMenus,actualMenus);

    }

    @Then("use see proper placeholder {string} for Username input box")
    public void useSeeProperPlaceholderForUsernameInputBox(String expectedPlaceHolderText) {
            String actualPlaceHolderText=loginPage.userNameInputBox.getAttribute("placeholder");
            Assert.assertEquals(expectedPlaceHolderText,actualPlaceHolderText);

    }

    @And("user see proper placeholder {string} for Password input box")
    public void userSeeProperPlaceholderForPasswordInputBox(String expectedPlaceHolderText) {
        String actualPlaceHolderText=loginPage.passwordInputBox.getAttribute("placeholder");
        Assert.assertEquals(expectedPlaceHolderText,actualPlaceHolderText);


    }


    @Then("user should see warning message displayed")
    public void userShouldSeeWarningMessageDisplayed() {
    }

    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        loginPage.userNameInputBox.sendKeys(username);

    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        loginPage.passwordInputBox.sendKeys(password);
    }


    @And("user see their username {string} in the profile menu")
    public void userSeeTheirUsernameInTheProfileMenu(String expectedUsername) {
        Assert.assertEquals(expectedUsername,quickLaunchpadPage.txt_username_profile.getText().trim());
    }
}
