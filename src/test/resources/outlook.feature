@outlook
Feature: This feature tests the outlook client webapp http://outlook.com.
  It tests login and logout.

  @accepted
  Scenario: We should be able to log in and log out?
    Given I am on the home page
    Then I can log into the service
    When I click the me profile menu
    Then I should be able to logout
    And I will be back home