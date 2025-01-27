Feature: Config Expense Types

  Scenario: Add a new config expense type
    Given I am logged in to the OrangeHRM
    And I am on the config expense types page
    When I click on the Add Config expense button on config event page
    And I enter the config expense type name as "New Expense Type"
    And I enter the config expense type description as "This is a description of the new expense type"
    And I click on the Save button on config expense type page
    Then the new config expense type should be saved successfully
