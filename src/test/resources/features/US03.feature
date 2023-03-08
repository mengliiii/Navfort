@regression
Feature: Pinbar Functionality
  Agile story: As a user, I want to  learn how to use the pinbar

  @US03
  Scenario Outline: When user click "Learn how to use this space" link on the homepage user see info
    Given user is on login page
    And user login as "<user>"
    Then user click Learn how to use this space
    And user see header "How To Use Pinbar"
    And user see text "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And user see an image on the page with expected source "/bundles/oronavigation/images/pinbar-location.jpg"
    Examples:
      | user          |
      | store manager |
      #| sales manager |
      #| driver        |