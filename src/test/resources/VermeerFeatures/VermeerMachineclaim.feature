Feature: Create A Machine claim

  Background: 
    Given User is on Login page
    When Dealer enters an inventory in Serach box

  Scenario Outline: Login As Dealer and create a new machine Claim
    And Enters a value for all the required field 
    Then click on validate
    And submit the New claim

  
