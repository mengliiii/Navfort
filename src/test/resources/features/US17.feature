@locationfilter
Feature:Filter functionality
  Agile Story:As a user, I should be able to use the Location filter under the Fleet-Vehicle page

  Scenario: Verify Location filter has valid methods
    Given user is on login page
    Given user login as "driver"
    Then user click "Fleet" in the menu
    And user click "Vehicles" in the Fleet dropdown
    And user click filter button
    And user click Manage Filters
    Then user select Location checkbox
    And  user click Location:All button
    And user click Contains button
    Then user should see methods below
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |


  Scenario: Verify Location filter "contains" method
    Given user is on login page
    Given user login as "driver"
    Then user click "Fleet" in the menu
    And user click "Vehicles" in the Fleet dropdown
    And user click filter button
    And user click Manage Filters
    Then user select Location checkbox
    And  user click Location:All button
    And user input "new" and click update
    And user see "<result>" under LOCATION
    |NEW FLORENTINO|
    |NEW JANEEN    |
    |NEW ANIBAL    |
    |NEW CAMILALAND|
    |NEW LOUIS     |
