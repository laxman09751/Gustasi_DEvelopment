Feature: Gustasi Web Application

  Scenario Outline: Gustasi Web Item creation
    Given Users enter the login to the application using URL
    When User enter the mobile number with "1231233211"
    And User enter the password with "Gustasi@1"
    And User clicks on the login button
    And user click on Mystore
    And user click on managemenu
    Then user click on create item
  	And user uploads the image
    And user Enters the Title of the item "<itemname>"
    And user gives description of the item "<itemdescription>"
    And user selects item menu type
    And user selects category of the item
    And user selects the organic or Glutenfree
    And user selects food avail
    And user selects foodtype
    And user enter the price of the item "<price>"
    And saves the item
    And item saves succesfully
    And make the item publish

    
    Examples: 
    |itemname	|itemdescription|price|
    |pineapple pizza|pineapple|199|