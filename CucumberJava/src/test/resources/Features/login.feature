@SmokeTestFeature
Feature: Feature to create login functionality

  @SmokeTest
  Scenario: Check login is successful with valid login crendentials
    Given User is on login page
    When User enters username and password
    And User clicks on login button
    Then User is navigated to home page
