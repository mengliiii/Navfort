@regression
Feature:  Calendar Events functionality
  User Story:  As a user, I want to create a recurring(repetitive) calendar event.


  Scenario: Verify driver should see the number “1” by default in the Repeat Every input.
    Given user is on login page
    And user login as "driver"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY


  @US08
  Scenario: Verify store manager should see the number “1” by default in the Repeat Every input.
    Given user is on login page
    Given user login as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY


  Scenario: Verify sales manager should see the number “1” by default in the Repeat Every input.
    Given user is on login page
    Given user login as "sales manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY


  Scenario: Verify driver should see error message after clear repeat day
    Given user is on login page
    Given user login as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY


  Scenario: Verify sales manager should see error message after clear repeat day
    Given user is on login page
    Given user login as "sales manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY

  @US08
  Scenario: Verify store manager should see error message after clear repeat day
    Given user is on login page
    Given user login as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY