@regression
Feature: Vehicle Odometer Functionality
  Agile story:As a user, I want to view car odometer info on the Vehicles Odometers page.

  Scenario: Store and Sales managers should see an error message “You do not have permission to perform this action.”
    Given user is on login page
    Given user login as "store manager"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Odometer" in the sub menu
    And user see alert message "You do not have permission to perform this action."

  @US11
  Scenario: Driver should see the default page as 1, the View Per Page is 25 by default.
    Given user is on login page
    Given user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicle Odometer" in the sub menu
    And user see the default page is "1"
    And user see the View Per Page is "25" by default.
