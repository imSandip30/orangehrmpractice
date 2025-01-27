package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.QualificationsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QualificationsSteps {

	// Step 1: Given - Navigate to the Qualifications page
	@Given("I am on the Qualifications page")
	public void i_am_on_the_Qualifications_page() throws InterruptedException {
		// driver = new ChromeDriver(); // You can replace this with your driver
		// initialization
		Keyword.driver
				.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewQualifications/empNumber/7"); // URL
																													// of
																													// the
																													// Qualifications
																													// page
		Thread.sleep(500);
		// Initialize the QualificationsPage object
	}

	// Step 2: When - Enter company name
	@When("I enter {string} as the company name")
	public void i_enter_as_the_company_name(String companyName) {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.qualificationsCompanyNameTextField(companyName);
	}

	// Step 3: When - Enter job title
	@When("I enter {string} as the job title")
	public void i_enter_as_the_job_title(String jobTitle) {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.qualificationsJobTitleTextField(jobTitle);
	}

	// Step 4: When - Set qualification start date
	@When("I set the qualification start date to {string}")
	public void i_set_the_qualification_start_date_to(String startDate) {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.setqualificationsFromTextField(startDate);
	}

	// Step 5: When - Set qualification end date
	@When("I set the qualification end date to {string}")
	public void i_set_the_qualification_end_date_to(String endDate) {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.setqualificationsToTextField(endDate);
	}

	// Step 6: When - Click the "Add" button
	@When("I click the \"Add\" button")
	public void i_click_the_Add_button() {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.clickqualificationsAddBtnButton();
	}

	// Step 7: When - Click the "Save" button
	@When("I click the \"Save\" button")
	public void i_click_the_Save_button() {
		QualificationsPage qualificationsPage = new QualificationsPage();
		qualificationsPage.clickqualificationsSaveBtnButton();
	}

	// Step 8: Then - Verify the qualification is saved successfully
	@Then("the qualification should be saved successfully")
	public void the_qualification_should_be_saved_successfully() {
		// Verify the qualification is saved successfully
		// This can be done by checking if the success message is displayed or verifying
		// the presence of the saved data
		// String successMessage = driver.getCurrentUrl(); // Or check for some success
		// message on the page
		// AssertTrue("Qualification not saved", successMessage.contains("success"));

		// Close the driver after the test
		// driver.quit();
	}
}
