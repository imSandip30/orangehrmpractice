Feature: Memberships Page

  Scenario: Add a new membership to an employee's profile
    Given I am logged in to the OrangeHRM
    And I navigate to the Memberships page for employee
    When I click on the "Add" button
    And I fill in the membership details with name "Premium Membership", paid by "Company", amount "100", currency "USD", commencement date "2025-01-01", and renewal date "2026-01-01"
    And I click on the "Save" button
    Then the membership should be saved successfully
