Feature: demo login functionality

  @Smoke
  Scenario: check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: check login with inavlid credentials
    Given user calculates 1/0
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials
