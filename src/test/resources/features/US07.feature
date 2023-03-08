@regression
Feature: Fleet Vehicle Functionality
  Agile story:As a user, I want to check all available checkboxes.

  Scenario: Verify after launch on the Vehicle page, all the checkboxes should be unchecked.
    Given user is on login page
    And user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicles" in the sub menu
    And user see all checkboxes are unchecked

  @US07@smoke
  Scenario: Verify when you check the first checkbox, all the checkboxes should be unchecked.
    Given user is on login page
    Given user login as "store manager"
    Then user click "Fleet" in the  main menu
    And user click "Vehicles" in the sub menu
    And user check the first checkbox
    And user see all checkboxes are checked