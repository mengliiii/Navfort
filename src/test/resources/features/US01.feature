@regression
Feature: Home page
  Agile story: As a user, I should be accessing all main modules of the app

  @US01
  Scenario Outline: Store and sales manager should see 8 modules
    Given user is on login page
    And user login as "<user>"
    Then user should see modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
    Examples:
      | user          |
      | store manager |
   #   | sales manager |