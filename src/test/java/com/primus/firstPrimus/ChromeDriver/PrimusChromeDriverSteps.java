package com.primus.firstPrimus.ChromeDriver;


import cucumber.api.java.en.Given;

public class PrimusChromeDriverSteps
{
    static PrimusChromeDriver _target;

    @Given("^I can start chrome$")
    public void i_can_start_chrome() throws Throwable
    {
        _target = new PrimusChromeDriver();
        _target.startChrome();
    }
}