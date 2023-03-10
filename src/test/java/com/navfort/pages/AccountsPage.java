package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage {
    public AccountsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //div[@class='filter-item oro-drop']

    @FindBy(xpath = "//div[contains(@class,'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value')]")
    public List<WebElement> filtersOptions;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filter_btn;
}
