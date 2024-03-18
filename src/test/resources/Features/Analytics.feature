Feature: Gustasi Analytics

  Scenario: Checking for Daily Item sale
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1231233211"
    And User enter the password with "Gustasi@1"
    And User clicks on the login button
    And User click on the three menu lines
    And user clicks on the Analytics button
    And User clicks on the Today
    And user clicks on menu and select the Restaurant
    And user clicks on show button
    And user gets the Total sales data
    And user gets Orders data
    And user gets Quantity sold data
    And user gets Tempered sales data
