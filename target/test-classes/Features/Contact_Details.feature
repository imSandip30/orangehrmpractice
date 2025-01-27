Feature: Update Contact Details

  Scenario: Successfully updating contact details
    Given I am logged in to the OrangeHRM
    And I am on the Contact Details page
    When I enter street address 1 as "123 Main St"
    And I enter street address 2 as "Apt 4B"
    And I enter city as "Metropolis"
    And I enter state as "New State"
    And I enter zip code as "12345"
    And I enter home phone as "123-456-7890"
    And I enter mobile phone as "987-654-3210"
    And I enter work phone as "555-555-5555"
    And I enter work email as "user@company.com"
    And I enter other email as "user.other@company.com"
    And I click the save button on contact details page
    And I am logged in to the OrangeHRM
    And I am on the Contact Details page
    Then the contact details should be saved successfully