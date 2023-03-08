package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class US04_StepDefs {
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    LoginPage loginPage= new LoginPage();
    @And("user see title is {string}")
    public void userSeeTitleIs(String expectedTitle) {
        BrowserUtils.sleep(2);

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @And("user see error message {string}")
    public void userSeeErrorMessage_( String errorMsg) {
        BrowserUtils.sleep(2);
        Assert.assertTrue(quickLaunchpadPage.permission_alertMsg.isDisplayed());

    }

    @Given("user login as {string}")
    public void userLoginAs(String userType) {
        //based on input enter that user information
       loginPage.login(userType);
    }
}
