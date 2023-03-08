package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> Columns;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement firstCheckbox;

    @FindBy(xpath = "//table/tbody/tr/td[1]/input")
    public List<WebElement> row_checkboxes;


}
