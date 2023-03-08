package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CampaignPage {

    public CampaignPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement btn_filter;
    @FindBy(className = "add-filter-button")
    public WebElement manage_filters;

    @FindBy(xpath = "//input[@name='multiselect_0']")
    public List<WebElement> filters;

}
