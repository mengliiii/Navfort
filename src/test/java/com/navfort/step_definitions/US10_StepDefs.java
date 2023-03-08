package com.navfort.step_definitions;

import com.navfort.pages.CalendarEventsPage;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US10_StepDefs {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @And("user writes message {string} in the Description field")
    public void userWritesMessageInTheDescriptionField(String msg) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));//iframe id is dynamic
        calendarEventsPage.description_input.sendKeys(msg);
    }

    @And("user see the message {string} in the input box")
    public void userSeeTheMessageInTheInputBox(String expectedMsg) {
        Assert.assertEquals(expectedMsg, calendarEventsPage.description_input.getText());
    }
}
