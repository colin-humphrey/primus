package com.primus.firstPrimus.Outlook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class OutlookSteps
{
    static OutlookActions _target;

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Exception
    {
        _target = new OutlookActions();
        _target.homePage();
    }

    @Then("^I can log into the service$")
    public void i_can_log_into_the_service() throws Throwable
    {
        _target.logIn();
    }

    @When("^I click the me profile menu$")
    public void i_click_the_me_profile_menu()
    {
        _target.clickMeMenu();
    }

    @Then("^I should be able to logout$")
    public void i_should_be_able_to_logout()
    {
        _target.logOut();
    }

    @And("^I will be back home$")
    public void i_will_be_back_home() throws Exception
    {
        _target.backHome();
    }
}