package com.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = {"src/test/resources/Features"},  // Path to feature file(s)
    glue = {"com.stepdefinitions"},  // Path to step definition classes
    tags = "not @skip",  // Exclude feature files tagged with @skip
    dryRun = false,   		
    plugin = {
        "pretty",  // Pretty output in the console
        //"json:target/cucumber-reports/CucumberTestReport.json",  // JSON output for further processing
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"  // Allure reporting plugin
    }
)
public class FeatureRunner extends AbstractTestNGCucumberTests {
    // No need for extra methods; this class is used to run the Cucumber tests
}




    
