Feature:Navfort login functionality
  Agile Story: As a user, I should be able to login.

  Scenario: Login as a driver with wrong credentials and verify error message
    Given user is on login page
    Then use see proper placeholder "Username or Email" for Username input box
    And user see proper placeholder "Password" for Password input box

  Scenario: Login as a driver without username  and verify warning message
    Given user is on login page
    Then user enters username
    And user click on LOG IN button
    Then user should see warning message displayed

  Scenario: Login as a driver and verify page title
    Given user is on login page
    When user enters username
    And user enters password
    And user click on LOG IN button
    Then user land on the Quick Launchpad page, should see should page title is "Quick Launchpad"

  Scenario: Login as a driver and verify page heading
    Given user is on login page
    When user enters username
    And user enters password
    And user click on LOG IN button
    Then user land on the Quick Launchpad page, should see page heading contains the below
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  @login1
  Scenario Outline: User login with valid credentials
    Given user is on login page
    When user enters username "<username>"
    And user enters password "<password>"
    And user click on LOG IN button
    Then user land on the Quick Launchpad page, should see should page title is "Quick Launchpad"
    And user see their username "<expectedUsername>" in the profile menu
    Examples: valid credentials
      | username | password    | expectedUsername |
      | user1    | UserUser123 | John Doe         |
      | user2    | UserUser123 | John Doe         |
      | user3    | UserUser123 | John Doe         |

