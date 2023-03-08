@regression
Feature: Vehicle Cost
  Agile story: As a user, I want to manage filters on the Vehicle Costs page
  @US13
  Scenario: user should see3 columns on the Vehicle Model page
    Given user is on login page
    Given user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Costs" in the sub menu
    And user see columns in the table
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  Scenario: user check the first checkbox to check all vehicle costs
    Given user is on login page
    Given user login as "store manager"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Costs" in the sub menu
    And user click the first checkbox
    And user see all vehicle costs are checked