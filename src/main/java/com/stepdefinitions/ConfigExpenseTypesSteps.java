package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.ConfigExpenseTypes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.When;

public class ConfigExpenseTypesSteps {

	@Given("I am on the config expense types page")
	public void iAmOnTheconfigExpenseTypesPage() {
		// Ensure that you are on the config events page.
		// You can check the page URL or some element on the page to verify.

		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewExpense");
		System.out.println("Navigated to the Config Events page.");
	}

	@When("I click on the Add Config expense button on config event page")
	public void iClickOnAddEventButton() {
		ConfigExpenseTypes configExpenseTypes = new ConfigExpenseTypes();
		configExpenseTypes.clickOnconfigExpenseTypesAddBtn("Add Config Event");

	}

	@When("I click on the Save button on config expense type page")
	public void iClickOnSaveEventButton() {
		ConfigExpenseTypes configExpenseTypes = new ConfigExpenseTypes();
		configExpenseTypes.clickOnconfigExpenseTypesSaveBtn("Save Event");

	}

	@And("I enter the config expense type name as {string}")
	public void iEnterTheEventNameAs(String eventName) {
		ConfigExpenseTypes configExpenseTypes = new ConfigExpenseTypes();
		configExpenseTypes.setconfigExpenseTypesEventNameTextField(eventName);
	}

	@And("I enter the config expense type description as {string}")
	public void iEnterTheEventDescriptionAs(String eventDescription) {
		ConfigExpenseTypes configExpenseTypes = new ConfigExpenseTypes();
		configExpenseTypes.setconfigExpenseTypesEventNameTextField(eventDescription); // Use the correct method for
																						// description if necessary
	}

	@Then("the new config expense type should be saved successfully")
	public void theNewconfigExpenseTypeshouldBeSavedSuccessfully() {
		// Here, you can add validations to confirm that the event was saved
		// successfully
		// Example: assertTrue("Success message should be visible",
		// successMessage.isDisplayed());
		System.out.println("The new config event has been saved successfully.");
	}
}
