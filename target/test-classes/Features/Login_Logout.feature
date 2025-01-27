
Feature: Testing Login and Logout functionality on OrangeHRM website

  #Valid Login
  Scenario: Successful login with valid credentials
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "admin123"
    Then I should be logged in successfully

  #Invalid login credentials
  Scenario: Unsuccessful login with invalid username
    Given I am on the OrangeHRM login page
    When I enter username "invalidUser" and password "admin123"
    Then I should see an error message for invalid credentials
  
  #Invalid login credentials
  Scenario: Unsuccessful login with invalid password
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "admin1243"
    Then I should see an error message for invalid credentials
    
  #Logout scenarios
  Scenario: Successful logout
    Given I am logged in to the OrangeHRM
    When I click on the logout button
    Then I should be redirected to the login page