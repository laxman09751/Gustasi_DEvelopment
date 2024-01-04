Feature: Gustasi Application

  
  Scenario: Gustasi Login
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1231233211"
    And User enter the password with "Gustasi@1"
    And User clicks on the login button
    Then User logged into the gustasi webpage

  Scenario: Gustasi Login with invalid username
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1232233211"
    And User enter the password with "12345678"
    And User clicks on the login button
    Then User unable to login with invalid details

  Scenario: Gustasi Login with invalid password
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1231233211"
    And User enter the password with "12345679"
    And User clicks on the login button
    Then User unable to logged into the gustasi webpage

  Scenario: Gustasi Login with invalid username and password
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1231233211"
    And User enter the password with "12345679"
    And User clicks on the login button
    Then User unable to logged into the gustasi webpage
