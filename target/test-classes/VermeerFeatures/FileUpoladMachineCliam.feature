Feature: upload A file to a claim

  @Prodbug
  Scenario: Login As admin and create a new Claim
    Given Login as Admin
    When User enters an claim in SerachBox
    Then Verify user able upload the files.
