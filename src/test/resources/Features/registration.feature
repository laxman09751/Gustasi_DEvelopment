Feature: Gustasi Registration Application

  Scenario: Gustasi Registration with valid details
    Given users enter into the Signup page
    When User click on the create your chef store
    When User enter the details into the below fields
      | First name   | Gustasi   |
      | Last name    | Chef      |
      | Phone Number |           |
      | Email        |           |
      | password     |  12345678 |
      | City         | Vijaywada |
    And User click on terms and conditions
    And User clicks on Create Account
    And User enters the OTP
    And User click on terms and conditions Commissions and payment policies
    And user click on Proceed
    And user click on individual
    And user enter the Display name "Lakshman"
    And user upload the Display image
    And user clicks on save and next
    And user Enter contactdetails
    And user Enter chefinfo
    And user Enter workinghours
    And user Enter services
    And user Enter Cuisiness
    And user Enter PickupAddress
    And user Enter Identification
    And user Enter PayoutInformation
    Then user Verify the user name
