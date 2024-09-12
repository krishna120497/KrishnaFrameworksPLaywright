Feature: Verify the login page of Trimble application

  Background: 
    Given User is on TrimbleLogin page

  @ValidCredentials
  Scenario Outline: Login with valid credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to login sucessfully open homepage

    Examples: 
      | username                              | password |
      | tavant.testuser@tavant.com/gs.stg.uat | Q@test10 |

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters username as "<username>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples: 
      | username                              | password | errorMessage        |
      | tavant.testuser@tavant.com/gs.stg.uat | Q@test   | Invalid credentials |
      | tavant.testuser@tavant.com/gs.stg     | Q@test10 | Invalid credentials |
