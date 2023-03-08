@US05@regression
Feature: Vehicle Model
  Agile story: As a user, I want to view columns on the Vehicle model page (web-table)

  @smoke
  Scenario Outline: store manager should see 10 columns on the Vehicle Model Page
    Given user is on login page
    And user login as "<user>"
    Then user click "Fleet" in the  main menu
    And user click "Vehicles Model" in the sub menu
    And user see columns below
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |
    Examples:
      | user          |
      | store manager |
     # | sales manager |


  Scenario:driver should not be able to access the Vehicle Model
    Given user is on login page
    And user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicles Model" in the sub menu
    Then user should see error message displayed