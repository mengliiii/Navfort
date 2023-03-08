package com.navfort.pages;

import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuickLaunchpadPage {
    public QuickLaunchpadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader;

    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public List<WebElement> main_menu;

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement txt_username_profile;
    @FindBy(linkText = "Logout")
    public WebElement Logout;

    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement alertMsg;


    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement permission_alertMsg;








    public void clickMainMenu(String mainMenu) {//argument accept: Fleet, Customers, Activities, System
        //span[@class='title title-level-1'][normalize-space()='Activities']

        String dynamic_locator = "//span[@class='title title-level-1'][normalize-space()='" + mainMenu + "']";
        WebElement target_mainMenu = Driver.getDriver().findElement(By.xpath(dynamic_locator));
        BrowserUtils.sleep(3);
        target_mainMenu.click();


    }


    public void clickSubMenu(String subMenu) {
        //you can pass argument:
        // Fleet subMenu:   Vehicles / Vehicle Odometer / Vehicle Costs / Vehicle Contracts / Vehicle Fuel Logs / Vehicle Services Logs / Vehicle Model
        // Customer subMenu:    Contacts
        // Activities subMenu: Calendar Events
        // System subMenu:  Jobs / Menus    / System Calendars

        String dynamic_locator = "//span[@class='title title-level-2'][normalize-space()='"+subMenu+"']";
        BrowserUtils.clickElement(By.xpath(dynamic_locator));

    }


}
