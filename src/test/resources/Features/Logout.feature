Feature: Logout functionality  Gustasi

  Scenario: Logout the Gustasi
    Given  User navigate to the url
    When user enter the mobile number "1231233211"
		And user enter password "Gustasi@1"
		And User clicked on the login
    And user clicked on the Logout button
    Then User should logout from the application