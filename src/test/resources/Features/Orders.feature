Feature: Orders the Gustasi

  Scenario: Orders pizza from Gustasi
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And User clicks on Liveorders button
    And User clicks on Menu button
    And User press Escape key
    And user selects the pizza items
    And user orders from ordernow button

  Scenario: Updating orders pizza from Gustasi
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And User clicks on Liveorders button
    And User clicks on Menu button
    And User press Escape key
    And user selects the pizza items
    And user orders from ordernow button
    And User clicks on Live orders
    And user clicks on Approved button
    And user clicks on update order button
    And User press Escape key
    And user clicks on Margharia pizza
    And user clicks on settlenow button
    And user pays with card

  Scenario: Discount orders from Gustasi
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And User clicks on Liveorders button
    And User clicks on Menu button
    And User press Escape key
    And user selects the pizza items
    And user orders from settlenow button
    And user enters the discount amount
    And user pays with card

  Scenario: Discount orders using percent from Gustasi
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And User clicks on Liveorders button
    And User clicks on Menu button
    And User press Escape key
    And user selects the pizza items
    And user orders from settlenow button
    And user select the percent
    And user enters the discount percent
    And user pays with card
    
    
   Scenario: Inventory order
    Given User enters to the url
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And user checks for the inventory units how many in the inventory0
    And User clicks on Liveorders button
    And User clicks on Menu button
    And User press Escape key
    And user hovers the mouse to Teashop and clicks on it
    And User press Escape key
    And user selects the items from Teashop
    And user orders from settlenow button
    And user pays with card
    And User press Escape key
    And user navigate to the Dashboard
    And user checks for the inventory units how many in the inventory
    
