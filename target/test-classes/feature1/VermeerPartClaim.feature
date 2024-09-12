Feature: Create A part claim

  Background: 
    Given User Login to an application
    When Dealer enters an inventory in SerachBox

  Scenario: Login As Dealer and create a new Claim
    And Enters a value for all the required Field
    Then click on validate button
    And submit the NewClaim
