Feature: Gustasi Registration Application

  Scenario: Gustasi Registration with valid details
    Given users enter into the Customer  Signup page
    When User click on the start ordering
    And User enter the Customer details into the below fields
      | First name   | Gustasi   |
      | Last name    | Customer  |
      | Phone Number |           |
      | Email        |           |
      | password     |  12345678 |
      | City         | Vijaywada |
    And users enter the OTP
    And users click on the dashboard
    Then Users check the customername
