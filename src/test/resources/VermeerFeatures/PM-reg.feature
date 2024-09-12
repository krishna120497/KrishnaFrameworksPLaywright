Feature: Create A Planned Maintenance Warranty Registartion

  #Background:
  #Given Admin is on Login page
  Scenario: Login As Admin and create a new Planned Maintenance Registartion
    Given Admin enters an inventory in Serach box and select PM Registartion
    When Enters Required feilds Contract Date ,Purchase Date and Registration Date
    Then click on next button ,select Planned Maintenance Packages and submit it
