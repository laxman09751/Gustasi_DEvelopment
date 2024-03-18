Feature: Gustasi Application

  Scenario: Gustasi Login with valid username and passwordGiven user enter the gustasi URL
    Given user enter the gustasi URL
    When user click on login
    And user enter the login id
    And user enter the password
    And user click on login
    And user click on my account select profile
    And user click multiple menu
    And user add the hotel,bar,restaurant
    And user click on menu categories
    And user add biryani,non veg,veg,starters
    And user click on my store
    And user select manage menu
    And user click on create item
    And user click on title
    And user writes the title name
    And user click on item menu type
    And user select hotel
    And user click on category
    And user select biryani
    And user click on organic,lunch,dinner
    And user click on meat
    And user click on price
    And user writes the price
    And user click on save
    And item status has been saveed successfully
    And user click on publish too see the item in hotel menu
    Then item status has been updated successfully
    
