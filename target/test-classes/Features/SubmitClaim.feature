Feature: Submit Claim

  Scenario: Submit a claim event and currency selection
    Given I am logged in to the OrangeHRM
    And I am on the submit claim page
    When I select a claim event
    And I select a claim currency
    And I click on the submit claim create button
    Then the claim is created successfully
