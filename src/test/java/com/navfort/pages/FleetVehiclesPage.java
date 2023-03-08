package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FleetVehiclesPage {
    public FleetVehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement btn_filter;
    @FindBy(className = "add-filter-button")
    public WebElement manage_filters;
    @FindBy(xpath = "//input[@value='Location']")
    public WebElement checkbox_location;

    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement btn_locationAll;
    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement btn_contains;
    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]/li")
    public List<WebElement> dropdown_contains;
    @FindBy(xpath = "//input[@name='value']")
    public WebElement inputBar;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement btn_update;


    @FindBy(xpath = "(//a[.='...'])[1]")
    public WebElement threeDots_firstLine;
    //tbody/tr[1]/td[20]//a

    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]/li/a")
    public List<WebElement> threeDots_funcs;

    @FindBy(xpath = "//thead[@class='grid-header']//input[@type='checkbox']")
    public WebElement firstCheckbox;

    @FindBy(xpath = "//table/tbody/tr/td[1]/input")
    public List<WebElement> row_checkboxes;


    public void selectLocationFilterMethod(String method) {
        //location filter methods:
        //  contains    does not contain    is equal to     ends with
        //  is any of   is not any of   is empty    is not empty
        String dynamic_method_locator = method.toLowerCase();
        Driver.getDriver().findElement(By.linkText(dynamic_method_locator)).click();

    }
}
