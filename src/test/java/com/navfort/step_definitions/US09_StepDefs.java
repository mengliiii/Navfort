package com.navfort.step_definitions;

import com.navfort.pages.CalendarEventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US09_StepDefs {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user enters {string} into the Repeat")
    public void user_enters_into_the_repeat(String integer) {

        calendarEventsPage.repeatEveryDay_input.sendKeys(integer);
    }

    @And("user sees the error message_1 {string}")
    public void userSeesTheErrorMessage_1(String errorMsg) {
        calendarEventsPage.errorMsg_lessThan1.isDisplayed();
        Assert.assertEquals(errorMsg,calendarEventsPage.errorMsg_lessThan1.getText());
    }

    @And("user sees the error message_2 {string}")
    public void userSeesTheErrorMessage_2(String errorMsg) {
        calendarEventsPage.errorMsg_moreThan99.isDisplayed();
        Assert.assertEquals(errorMsg,calendarEventsPage.errorMsg_moreThan99.getText());
    }

}
