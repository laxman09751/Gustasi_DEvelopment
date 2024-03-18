Feature: Gustasi Application

  Scenario: Gustasi Registration
    Given Users enter the login to the application using URL
    When User enter the mobile number with "CF202403111513@gustasi.com"
    And User enter the password with "12345678"
    And User clicks on the login button
    #And user Enter services
    # And user Enter Cuisiness
    # And user Enter rest PickupAddress
    And user Enter rest Identification
    And user Enter rest PayoutInformation
    Then user Verify the user name
	