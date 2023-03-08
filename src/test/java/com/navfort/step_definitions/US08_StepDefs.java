package com.navfort.step_definitions;
import com.navfort.pages.CalendarEventsPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US08_StepDefs {
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


    @Then("user clicks {string} main menu and sub menu {string}   MY")
    public void userClicksMainMenuAndSubMenuMY(String mainMenu, String subMenu) {
        quickLaunchpadPage.clickMainMenu(mainMenu);
        quickLaunchpadPage.clickSubMenu(subMenu);
    }


    @Then("user clicks create calendar event MY")
    public void user_clicks_create_calendar_event_my() {
        BrowserUtils.sleep(3);
        calendarEventsPage.createCalenderEvent_btn.click();
    }

    @Then("user clicks Repeat checkbox MY")
    public void user_clicks_repeat_checkbox() {
        BrowserUtils.waitForClickablility(calendarEventsPage.repeat_checkbox, 2);
        calendarEventsPage.repeat_checkbox.click();
    }


    @And("user sees Repeat Every day input default value is {string} MY")
    public void userSeesRepeatEveryDayInputDefaultValueIs(String expectedValue) {
        String actualValue = calendarEventsPage.repeatEveryDay_input.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @And("user clears the repeat day MY")
    public void userClearsTheRepeatDay() {
        calendarEventsPage.repeatEveryDay_input.clear();
        BrowserUtils.sleep(1);
    }

    @And("user sees the error message {string} MY")
    public void userSeesTheErrorMessage(String errorMsg) {
        Assert.assertEquals(errorMsg, calendarEventsPage.errorMsg_repeatDayValue.getText());

    }
}
