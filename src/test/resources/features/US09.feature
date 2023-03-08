@regression
Feature: Calendar Events functionality
  Agile story: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

  @US09
  Scenario: Verify users see error messages If enters less than 1.
    Given user is on login page
    Given user login as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user enters "-2" into the Repeat
    And user sees the error message_1 "The value have not to be less than 1."



  Scenario: Verify users see error messages If enters more than 99.
    Given user is on login page
    Given user login as "diver"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user enters "100" into the Repeat
    And user sees the error message_2 "The value have not to be more than 99."