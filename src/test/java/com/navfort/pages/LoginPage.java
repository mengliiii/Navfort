package com.navfort.pages;

import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userNameInputBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInputBox;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='alert alert-error']/div")
    public WebElement errorMessage1;

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement header_txt_Login;


    @FindBy(xpath = "//a[@href='http://www.oroinc.com/doc']")
    public WebElement btn_question;


    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement learnHowToUseThisSpace;


    @FindBy(xpath = "//h3[normalize-space()='How To Use Pinbar']")
    public WebElement header_pinbar;
    @FindBy(xpath = "//div[@class='clearfix']/p")
    public WebElement paragraph_pinbar;

    @FindBy(xpath = "//div[@class='clearfix']//img")
    public WebElement image;


    public void login(String userNameStr, String passwordStr) {

        userNameInputBox.sendKeys(userNameStr);
        passwordInputBox.sendKeys(passwordStr);
        loginBtn.click();
        // verification that we logged
    }


    //Overload login Method: login with correct credential as different type of user
    public void login(String userType) {//accept: driver, store manager, sales manager
        //based on input enter that user information
        if (userType.equalsIgnoreCase("driver")) {
            userNameInputBox.sendKeys(ConfigurationReader.getProperty("driver.username"));
            passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
            loginBtn.click();
        } else if (userType.equalsIgnoreCase("sales manager")) {
            userNameInputBox.sendKeys(ConfigurationReader.getProperty("salesManager.username"));
            passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
            loginBtn.click();
        } else if (userType.equalsIgnoreCase("store manager")) {
            userNameInputBox.sendKeys(ConfigurationReader.getProperty("storeManager.username"));
            passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
            loginBtn.click();
        }

    }

}
