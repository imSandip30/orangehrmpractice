Feature: Update Qualification Details

  Scenario: Successfully adding an Qualification Page
    Given I am logged in to the OrangeHRM
    And I am on the Qualifications page
    When I click the "Add" button
    And I enter "TCS" as the company name
    And I enter "Software Engineer" as the job title
    And I set the qualification start date to "2020-01-01"
    And I set the qualification end date to "2025-01-01"    
    And I click the "Save" button
   

