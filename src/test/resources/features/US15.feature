@regression
Feature: Navfort logout functionality
  Agile Story:As a driver, I should be able to log out

  @US15
  Scenario: Log out as a driver and verify url
    Given user is on login page
    Given user login as "driver"
    When user click on profile
    And user select Logout button in profile menu
    Then user ends up on login page and verify url contains "Login"

  Scenario: Log out as a driver verify user see login page
    Given user is on login page
    Given user login as "driver"
    When user click on profile
    And user select Logout button in profile menu
    Then user ends up on login page and verify page header is "Login"

  Scenario: Log out as a driver and verify user should not have access to application with go back button
    Given user is on login page
    Given user login as "driver"
    When user click on profile
    And user select Logout button in profile menu
    Then user ends up on login page and navigate back page
    Then user ends up on login page and verify page header is "Login"