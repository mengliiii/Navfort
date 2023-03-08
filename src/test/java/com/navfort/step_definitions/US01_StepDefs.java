package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US01_StepDefs {
    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();

    @Then("user should see modules")
    public void userShouldSeeModules(List<String> expectedModules) {
        List<WebElement> menuElements = quickLaunchpadPage.main_menu;
        List<String> actualMenus = BrowserUtils.convertListOfWebElementToListOfString(menuElements);
        Assert.assertEquals(expectedModules, actualMenus);


    }
}
