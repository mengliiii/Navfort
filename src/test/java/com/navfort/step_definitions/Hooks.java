package com.navfort.step_definitions;

import com.navfort.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(order = 1)//import from cucumber,  not junit
    public void setupMethod() {
        System.out.println("from Hook class---> @Before: Running before each scenario");

    }
    @After  //will be executed automatically after every scenario in the project
    public void tearDownMethod(Scenario scenario) {

        //Scenario obj keeping track of the on executing scenario, name, status

        if (scenario.isFailed()) {//if scenario failed, take screenshots

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("from Hook class---> @After: Running after each scenario");
        Driver.closeDriver();
    }

}