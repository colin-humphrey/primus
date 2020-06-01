package com.primus.firstPrimus.ExamplePackage;

import cucumber.api.java.en.Given;

public class ExampleSteps
{
    static ExampleActions _target;

    @Given("^I want to check if this scenario exists$")
    public void i_want_to_check_if_this_scenario_exists() throws Throwable
    {
        _target = new ExampleActions();
        _target.actionOne();
    }
}