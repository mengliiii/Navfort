package com.navfort.step_definitions;

import com.navfort.pages.AccountsPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class US12_StepDefs {
    AccountsPage accountsPage = new AccountsPage();

    @And("user see filter options below")
    public void userSeeFilterOptionsBelow(List<String> expectedFilterOptions) {
        accountsPage.filter_btn.click();
        BrowserUtils.sleep(1);
        List<String> actualFilterOptions = new ArrayList<>();
        for (WebElement filtersOption : accountsPage.filtersOptions) {
            actualFilterOptions.add(filtersOption.getText().substring(0, filtersOption.getText().indexOf(":")));
        }
        System.out.println(actualFilterOptions);
        Assert.assertEquals(expectedFilterOptions, actualFilterOptions);


    }
}
