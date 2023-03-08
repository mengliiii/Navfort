@regression
Feature: Vehicle contracts functionality
  Agile story: As a user, I want to access to Vehicle contracts page

  Scenario: Store manager can access the vehicle contracts page
    Given user is on login page
    And user login as "store manager"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Contracts" in the sub menu
    And user see title is "All - Vehicle Contract - Entities - System - Car - Entities - System"

  Scenario: Sales manager can access the vehicle contracts page
    Given user is on login page
    And user login as "sales manager"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Contracts" in the sub menu
    And user see title is "All - Vehicle Contract - Entities - System - Car - Entities - System"
  @US04@smoke
  Scenario: driver can not access the vehicle contracts page
    Given user is on login page
    And user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Contracts" in the sub menu
    And user see error message "You do not have permission to perform this action."
