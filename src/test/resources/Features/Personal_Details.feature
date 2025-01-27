Feature: Verify ESS user can able to edit some certain fields on Personal Details  
    Scenario: Persoanl details fun
    Given I am on the OrangeHRM login page
    Given I enter valid username and valid password
    Given I should be logged in successfully
    When I click on "My Info" on the top menu
    And I fill in all personal details:
      | FullName1 | FullName2 | FullName3 | EmployeeId | OtherId | DriversLicenseNumber | LicenseExpiryDate | DateOfBirth   |
      | Sandip    | Kumar     | Sharma    | 123456     | 789101  | DL123456789         | 2025-12-31        | 1990-01-15    |
  