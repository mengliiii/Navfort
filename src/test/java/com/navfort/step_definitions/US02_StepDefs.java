package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US02_StepDefs {
    LoginPage loginPage = new LoginPage();
    @Then("user click question icon")
    public void userClickQuestionIcon() {
        BrowserUtils.sleep(2);
        loginPage.btn_question.click();
    }

    @And("user see page url {string}")
    public void userSeePageUrl(String expectedURL) {
        //switch window
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().contains("Welcome")){
                break;
            }
        }

        Assert.assertEquals(expectedURL,Driver.getDriver().getCurrentUrl());
    }
}
