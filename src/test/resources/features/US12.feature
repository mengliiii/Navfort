@regression
Feature: Accounts Functionality
  Agile story: As a user, I want to filter customer's info on the Account page

  @US12
  Scenario: store manager should see 8 filter items on the Accounts page
    Given user is on login page
    Given user login as "store manager"
    Then user click "Customers" in the  main menu
    And user click "Accounts" in the sub menu
    And user see filter options below
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |
