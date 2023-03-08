@regression
Feature: Vehicles Functionality
  Agile story: As a user, I want to see edit car info icons form the Vehicle page

  @US06@smoke
  Scenario: user should see view edit delete when they hover over the mouse over the 3 dots
    Given user is on login page
    And user login as "driver"
    Then user click "Fleet" in the  main menu
    And user click "Vehicles" in the sub menu
    And user hover over first line three dots
    And use see view edit delete icons are displayed
      | View   |
      | Edit   |
      | Delete |