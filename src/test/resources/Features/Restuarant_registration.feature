Feature: Gustasi Registration Application

  Scenario: Gustasi Resturant Registration with valid details
    Given users enter into the rest Signup page
    When User click on the Sign up NOW and Go Digital
    When User enter the rest details into the below fields
      | First name   | Gustasi   |
      | Last name    | Chef      |
      | Phone Number |           |
      | Email        |           |
      | password     |  12345678 |
      | City         | Vijaywada |
    And User click on rest terms and conditions
    And User clicks on rest Create Account
    And User enters the rest OTP
    And User click on rest terms and conditions Commissions and payment policies
    And user click on rest Proceed
    And user click on rest individual
    And user enter the rest Display name "Lakshman"
    And user upload the rest Display image
    And user clicks on rest save and next
    And user Enter rest contactdetails
    And user Enter rest chefinfo
    And user Enter rest workinghours
    And user Enter rest services
    And user Enter rest Cuisiness
    And user Enter rest PickupAddress
    And user Enter rest Identification
    And user Enter rest PayoutInformation
    Then user Verify the rest user name
