Feature: Gustasi Reservation

  #Scenario: Vendor create and confirm reservation
    #Given User enters to the url
    #When user enter the mobile "1231233211"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user scroll and click on Reservations tab
    #And User clicks on creating booking in reservation tab
    #And user select the required menu in resturants
    #And user select the required date
    #And select the require time
    #And Add required number of guests
    #And enter the name of the guest
    #And enter the whatsapp contact number of guest
    #And enter the required notes for resturants
    #And Click on the reserve table
    #And Validate the user entered data with review booking details
    #And Observe the four-digit reservation id
    #And Click OK
    #And Click on myaccount tab on top right side
    #And user scroll and click on Reservations tab2
    #And enter the above submitted reservation ID in the ID input field
    #And click on the search button
    #And Observer the entered reservation ID
    #And click on the confirm button
    #Then check for the toast confirmed message
#
  #Scenario: Vendor create and cancel reservation
    #Given User enters to the url
    #When user enter the mobile "1231233211"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user scroll and click on Reservations tab
    #And User clicks on creating booking in reservation tab
    #And user select the required menu in resturants
    #And user select the required date
    #And select the require time
    #And Add required number of guests
    #And enter the name of the guest
    #And enter the whatsapp contact number of guest
    #And enter the required notes for resturants
    #And Click on the reserve table
    #And Validate the user entered data with review booking details
    #And Observe the four-digit reservation id
    #And Click OK
    #And Click on myaccount tab on top right side
    #And user scroll and click on Reservations tab2
    #And enter the above submitted reservation ID in the ID input field
    #And click on the search button
    #And Observer the entered reservation ID
    #And click on the cancel button
    #Then check for the toast confirmed message
#
  #Scenario: Customer is logged in the web Application and reservation confirm by vendor
    #Given User enters to the url
    #When user enter the mobile "9032777886"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user clicks on dashboard
    #And user landing on the vendor URL
    #And user clicks on reserve a table
    #And user select the required date
    #And select the require time
    #And Add required number of guests
    #And enter the name of the guest
    #And enter the whatsapp contact number of guest
    #And enter the required notes for resturants
    #And Click on the reserve table
    #And Validate the user entered data with review booking details
    #And Observe the four-digit reservation id
    #And Click OK
    #And user click on logout button on top right side
    #Given User enters to the url
    #When user enter the mobile "1231233211"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user scroll and click on Reservations tab2
    #And enter the above submitted reservation ID in the ID input field
    #And click on the search button
    #And Observer the entered reservation ID
    #And click on the confirm button
    #Then check for the toast confirmed message
#
  #Scenario: Customer is logged in the web Application and reservation confirm by vendor
    #Given User enters to the url
    #When user enter the mobile "9032777886"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user clicks on dashboard
    #And user landing on the vendor URL
    #And user clicks on reserve a table
    #And user select the required date
    #And select the require time
    #And Add required number of guests
    #And enter the name of the guest
    #And enter the whatsapp contact number of guest
    #And enter the required notes for resturants
    #And Click on the reserve table
    #And Validate the user entered data with review booking details
    #And Observe the four-digit reservation id
    #And Click OK
    #And user click on logout button on top right side
    #Given User enters to the url
    #When user enter the mobile "1231233211"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user scroll and click on Reservations tab2
    #And enter the above submitted reservation ID in the ID input field
    #And click on the search button
    #And Observer the entered reservation ID
    #And click on the cancel button
    #Then check for the toast confirmed message
#
  Scenario: CUSTOMER WITHOUT LOGGED IN ABLE TO RESERVE  A TABLE FROM REQUIRED VENDOR
    And user landing on the vendor URL
    And user clicks on reserve a table
    And user select the required date
    And select the require time
    And Add required number of guests
    And enter the name of the guest
    And enter the whatsapp contact number of guest
    And enter the required notes for resturants
    And Click on the reserve table
    And Validate the user entered data with review booking details
    And Observe the four-digit reservation id
    And Click OK
    Given User enters to the url
    When user enter the mobile "9848779686"
    And user enter pass "12345678"
    And User clicked login button
    And user scroll and click on Reservations tab2
    And enter the above submitted reservation ID in the ID input field
    And click on the search button
    And Observer the entered reservation ID
    And click on the confirm button
    Then check for the toast confirmed message
#
  #Scenario: CUSTOMER WITHOUT LOGGED IN ABLE TO RESERVE  A TABLE FROM REQUIRED VENDOR
    #And user landing on the vendor URL
    #And user clicks on reserve a table
    #And user select the required date
    #And select the require time
    #And Add required number of guests
    #And enter the name of the guest
    #And enter the whatsapp contact number of guest
    #And enter the required notes for resturants
    #And Click on the reserve table
    #And Validate the user entered data with review booking details
    #And Observe the four-digit reservation id
    #And Click OK
    #Given User enters to the url
    #When user enter the mobile "1231233211"
    #And user enter pass "Gustasi@1"
    #And User clicked login button
    #And user scroll and click on Reservations tab2
    #And enter the above submitted reservation ID in the ID input field
    #And click on the search button
    #And Observer the entered reservation ID
    #And click on the cancel button
    #Then check for the toast confirmed message
