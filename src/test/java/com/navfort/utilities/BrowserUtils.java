package com.navfort.utilities;

import com.navfort.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    //sleep method:

    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){}
    }

    //switchWindowAndVerifyTitle
    public static void switchWindowAndVerifyTitle( String expectedInUrl, String expectedInTitle){

        for (String eachWindow : Driver.getDriver().getWindowHandles()) {

            Driver.getDriver().switchTo().window(eachWindow);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;  //switch to the expectedUrl and break the loop
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }

    public static void verifyTitle( String expectedTitle){
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
    public static void verifyTitleContains( String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    //method: explicit wait===>WebDriverWait====>wait for invisibility of
    public static void waitForInvisibility(WebElement target){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static void waitForTitleContains(String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static List<String> convertDropdownOptionsToListOfString(WebElement dropDownElement){
        //1- create select obj, pass out dropDown element
        Select select = new Select(dropDownElement);

        //2-get all options_webElements
        List<WebElement> options_webElements = select.getOptions();

        //3- convert list of web element to list of string
        List<String> resultStringList= new ArrayList<>();
        for (WebElement each : options_webElements) {
            resultStringList.add(each.getText());
        }
        return resultStringList;
    }


    public static List<String> convertListOfWebElementToListOfString(List<WebElement> elements){
        List<String> resultStringList= new ArrayList<>();
        for (WebElement each : elements) {
            resultStringList.add(each.getText().trim());
        }
        return resultStringList;
    }



    public static void waitForInvisibilityOf(WebElement target) {
        //create a explicit wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
        //wait until invisbility of the target web element
    }

    //method: return WebElements texts inside a list
    public static List<String> getTexts(List<WebElement> elements) {

        List<String> result = new ArrayList<>();
        for (WebElement each : elements) {
            String eachText = each.getText();
            result.add(eachText);
        }
        return result;

    }

    public static void scrollToElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(element).perform();
    }

    public static void scrollToElement(By by) {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(Driver.getDriver().findElement(by)).perform();
    }

    public static void clickElement(WebElement element) {
        waitForVisibilityOf(element);
        element.click();
    }

    public static void waitForVisibilityOf(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static void clickElement(By by) {
        //need to have one condition for visibilty

        WebElement element = Driver.getDriver().findElement(by);
        waitForVisibilityOf(element);
        element.click();
    }
    public static  void hover(WebElement element){
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //Click main menu: Fleet, Customers, Activities, System
    public static void clickMainMenu(String mainMenu) {
        //we are making a dynamic locator, example: //ul[contains(@class,'main-menu')]/li[contains(.,'Fleet')]
        //we can locate any main menu by changing the name of the main menu inside the locator
        String dynamic_locator = "//ul[contains(@class,'main-menu')]/li[contains(.,'" + mainMenu + "')]";
        WebElement target_mainMenu = Driver.getDriver().findElement(By.xpath(dynamic_locator));
        target_mainMenu.click();

    }

    public static void clickSubMenu(String mainMenu, String subMenu) {
        clickMainMenu(mainMenu);
        String dynamic_locator = "//ul[contains(@class,'main-menu')]/li[contains(.,'" + mainMenu
                + "')]//li[contains(.,'" + subMenu + "')]";
        WebElement target_subMenu = Driver.getDriver().findElement(By.xpath(dynamic_locator));
        target_subMenu.click();

    }

    public static void clickSubMenu(String subMenu){
        //you can pass argument:
        // Fleet subMenu:   Vehicles / Vehicle Odometer / Vehicle Costs / Vehicle Contracts / Vehicle Fuel Logs / Vehicle Services Logs / Vehicle Model
        // Customer subMenu:    Contacts
        // Activities subMenu: Calendar Events
        // System subMenu:  Jobs / Menus    / System Calendars

        String dynamic_locator="//a[.='"+subMenu+"']";
        BrowserUtils.clickElement(By.xpath(dynamic_locator));

    }

    public static WebElement waitForClickablility(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
