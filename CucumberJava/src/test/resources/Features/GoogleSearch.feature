Feature: Feature to test google search functionality

  Scenario: Google search is working as expected
    Given Browser is opned
    And User is on search page
    When User enters a text in search box
    And User presses enter key on keyboard
    Then User is navigated to search results
