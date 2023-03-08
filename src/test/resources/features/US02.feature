@regression
Feature: Oroinc Documentation
  Agile story: As a user, I should be access to the Oroinc Documentation page( window handle)

  @US02
  Scenario Outline: user access the Oronic Documentation page by clicking the question icon
    Given user is on login page
    And user login as "<user>"
    Then user click question icon
    And user see page url "https://doc.oroinc.com/"
    Examples:
      | user          |
      | store manager |
     # | sales manager |
    #  | driver        |