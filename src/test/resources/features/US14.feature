@regression
Feature:Campaign functionality
  Agile Story:As a user, I should be able to manage filters on the marketing page

  @filter
  Scenario: Verify store manager see 5 filter options are checked by default
    Given user is on login page
    Given user login as "store manager"
    Then user click "Marketing" in the  main menu
    And user click "Campaigns" in the sub menu
    And user click Filters button on campaigns page
    And user click Manage Filters on campaigns page
    Then user see options are checked by default

