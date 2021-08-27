Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And User clicks on login page
    Then User is navigated to home page

    Examples: 
      |username|password|
      |tomsmith|SuperSecretPassword!|
      |tomSmmiith|SuperPassword|
