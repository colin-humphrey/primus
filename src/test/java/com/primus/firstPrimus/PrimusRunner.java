package com.primus.firstPrimus;


import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict   = false,
        features = "src/test/resources",
        plugin   = { "pretty",
                     "html:target/cucumber-html-reports/",
                     "json:target/cucumber.json"
                   }
)
public class PrimusRunner {}