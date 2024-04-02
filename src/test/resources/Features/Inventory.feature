<<<<<<< HEAD
Feature: Inventory

  Scenario: Add the inventory items from suppliers
    Given User enters to the url
=======
Feature:  Inventory

Scenario: Add the inventory items from suppliers

		Given User enters to the url
>>>>>>> cb2b35412ed05cba1ef098e21abdc50642a1f22a
    When user enter the mobile "1231233211"
    And user enter pass "Gustasi@1"
    And User clicked login button
    And Scroll to ManageInvetory
    And Click on create for inventory
    And Enter the Order_ID "id_004"
    And Select the supplier Mocktail
    And Enter the Quantity "200"
    And Enter the order Amount "3600"
    And clicks on Save
<<<<<<< HEAD
    And check the units added in the inventory
    
    
=======
    And check the units added in the inventory
>>>>>>> cb2b35412ed05cba1ef098e21abdc50642a1f22a
