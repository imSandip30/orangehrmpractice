Feature: Config Events

  Scenario: Add a new config event
    Given I am logged in to the OrangeHRM
    And I am on the config events page
    When I click on the Add Config Event button on config event page
    And I enter the event name as "New Event"
    And I enter the event description as "This is a description of the new event"
    And I click on the Save button on config event page
    Then the new config event should be saved successfully
