package com.automationexercises.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/automationexercises/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
       //tags = ""
        tags = "  @sanity"
)

public class RunCukeTest extends AbstractTestNGCucumberTests {


}
