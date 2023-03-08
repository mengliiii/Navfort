package com.navfort.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//to make it runnable
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"

        },
        features= "src/test/resources/features",
        glue = "com/navfort/step_definitions",
        dryRun = false,
        tags = "@US10",
        publish = true //generating a report with public link


)
public class CukesRunner {
}
