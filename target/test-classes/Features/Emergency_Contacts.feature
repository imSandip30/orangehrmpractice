Feature: Update Emergency Contact Details

  Scenario: Successfully adding an emergency contact
    Given I am logged in to the OrangeHRM
    And I am on the Emergency Contacts page
    When I click on the "Add" button to add a new emergency contact
    And I enter the emergency contact name as "John Doe"
    And I enter the relationship as "Brother"
    And I enter the home phone as "123-456-7890"
    And I enter the mobile phone as "987-654-3210"
    Then I click the save button to save Emergency contact details

