Feature: Feature to test functionality of login

  Scenario Outline: Check login is successful with valid login crendentials
    Given Browser is opned for user
    And User is on login page of the website
    When User enters <username> and <password> in login page
    And User will click on login button
    Then User is navigated to home page after the login

    Examples: 
      | username | password |
      | Ravitej  |     1234 |
      | Baljit   |     2345 |
      | Sarabjit |     3456 |
      | Jaskaran |     4567 |
