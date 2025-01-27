package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.DependentsPage;

import io.cucumber.java.en.When;

public class DependentsSteps {

	@When("I navigate to the dependents page for employee")
	public void i_navigate_to_the_dependents_page_for_employee_with_emp_number() {

		// Search for employee by empNumber (you can use empNumber in URL)
		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewDependents/empNumber/7");
	}

	@When("I add a new dependent with name {string} and relationship {string}")
	public void i_add_a_new_dependent_with_name_and_relationship(String dependentName, String relationship)
			throws InterruptedException {
		DependentsPage dependentsPage = new DependentsPage();

		dependentsPage.clickdependentsAddBtnButton(); // Save the new dependent
		dependentsPage.setdependentsNameTextField(dependentName);
		dependentsPage.setdependentsRelationshipTextField(relationship);
		dependentsPage.setdependentsDOBTextField("2000-10-10"); // Assuming a DOB, as it's a required field
		dependentsPage.clickdependentsSaveBtnButton(); // Save the new dependent
	}
}
