package com.navfort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends QuickLaunchpadPage {

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalenderEvent_btn;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeat_checkbox;
    @FindBy(xpath = "//label[@class='fields-row']/input[3]")
    public WebElement repeatEveryDay_input;

    @FindBy(xpath = "//span[text()='This value should not be blank.']")
    public WebElement errorMsg_repeatDayValue;

    @FindBy(xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement errorMsg_lessThan1;

    @FindBy(xpath = "//span[text()='The value have not to be more than 99.']")
    public WebElement errorMsg_moreThan99;

    @FindBy(id = "tinymce")
    public WebElement description_input;
}
