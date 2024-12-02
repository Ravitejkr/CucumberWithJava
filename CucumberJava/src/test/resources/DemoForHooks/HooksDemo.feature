Feature: Check login functionality

  @smoke
  Scenario: 
    Given user is on login page of the product
    When user enter valid username and password
    And clicks on the login button
    Then home page loads

  Scenario: 
    Given user is on login page of the product
    When user enter valid username and password
    And clicks on the login button
    Then home page loads
