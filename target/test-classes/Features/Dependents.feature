Feature: Update dependent Details

Scenario: Verify adding a new dependent for employee  
    Given I am logged in to the OrangeHRM
    When I navigate to the dependents page for employee
    And I add a new dependent with name "John Doe" and relationship "Child"
    