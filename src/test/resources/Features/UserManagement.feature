@skip
Feature: User Management

Scenario: Verify if name of already created user populates in the list on User Managment page

	Given I am logged in to the OrangeHRM
	When User clicks on PIM Menu
	And Click on Add button
	And Creates an user with valid details
	And User clicks on Admin menu
	And Click on Add button on user management page
	And User selects role as ESS
	And Enters employee name
	Then Populated list must contain newly created users name


