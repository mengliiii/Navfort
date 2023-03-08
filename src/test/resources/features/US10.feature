@regression
Feature: Calendar Events functionality
  Agile story:As a user, I want to write the “Description” when I create a calendar event. (Iframe)

  @US10
  Scenario: users should be able to write messages in the Description field on the calendar event page.
    Given user is on login page
    Given user login as "driver"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user writes message "Scrum meeting" in the Description field
    And user see the message "Scrum meeting" in the input box