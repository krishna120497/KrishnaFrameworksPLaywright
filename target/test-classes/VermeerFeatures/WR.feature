Feature: Create A Warranty Registartion

  Background: 
    Given Admin is on Login page
    When Admin enters an inventory in Serach box

  Scenario: Login As Admin and create a new Warranty Registartion
    When Enters Required feilds of Basic Information
    When Enters Required feilds of Customer Information
    Then click on Review and submit Warranty Registartion
  
