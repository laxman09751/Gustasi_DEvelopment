Feature: Inventory

  Scenario Outline: Add the inventory items from suppliers
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And Scroll to suppliers
    And click on create
    And Enter the name of the supplier details "<name>"
    And enter the email ID "<email>"
    And enter the mobile number "<mobilenumber>"
    And enter the address "<address>"

    Examples: 
    
    |name|email|mobilenumber|address|
    |Whisky|gudivada@gmail.com|1223334444|Gudivada|