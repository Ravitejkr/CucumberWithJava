#tags can be given
@SmokeScenario
#here we give description of what functionality we are covering in this particular file
Feature: feature to create login functionality

  #give scenerio name
  @SmokeTest
  Scenario: check login is successful with valid login credentials
    #create steps using getkins
    #keywords used are Given, When, And, Then
    #since we have to do login scenario so Given will be
    Given user is on login page
    #conditions
    When user enters username and password
    And user clicks on login button
    Then user is navigated to the home page
