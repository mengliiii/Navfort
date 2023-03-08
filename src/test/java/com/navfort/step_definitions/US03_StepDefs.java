package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US03_StepDefs {
    LoginPage loginPage = new LoginPage();
    @Then("user click Learn how to use this space")
    public void userClickLearnHowToUseThisSpace() {
        BrowserUtils.sleep(2);
        loginPage.learnHowToUseThisSpace.click();
    }

    @And("user see header {string}")
    public void userSeeHeader(String expectedHeader) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedHeader,loginPage.header_txt_Login.getText());
    }

    @And("user see text {string}")
    public void userSeeText(String expectedText) {
        Assert.assertEquals(expectedText,loginPage.paragraph_pinbar.getText().trim());
    }

    @And("user see an image on the page with expected source {string}")
    public void userSeeAnImageOnThePageWithExpectedSource(String expectedSource) {
        Assert.assertTrue(loginPage.image.getAttribute("src").contains(expectedSource));
    }
}
