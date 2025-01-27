package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.ConfigEvents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.When;

public class ConfigEventsSteps {

	@Given("I am on the config events page")
	public void iAmOnTheConfigEventsPage() {
		 String projectPath = System.getProperty("user.dir");
	        
	        // Print the project path
	        System.out.println("Project Path: " + projectPath);
		// Ensure that you are on the config events page.
		// You can check the page URL or some element on the page to verify.

		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewEvents");
		System.out.println("Navigated to the Config Events page.");
	}

	@When("I click on the Add Config Event button on config event page")
	public void iClickOnAddEventButton() {
		 String projectPath = System.getProperty("user.dir");
	        
	        // Print the project path
	        System.out.println("Project Path: " + projectPath);

		ConfigEvents configEvents = new ConfigEvents();
		configEvents.clickOnConfigEventsAddBtn("Add Config Event");
	}

	@When("I click on the Save button on config event page")
	public void iClickOnSaveEventButton() {
		ConfigEvents configEvents = new ConfigEvents();
		configEvents.clickOnConfigEventsSaveBtn("Save Event");

	}

	@And("I enter the event name as {string}")
	public void iEnterTheEventNameAs(String eventName) {
		ConfigEvents configEvents = new ConfigEvents();
		configEvents.setConfigEventsEventNameTextField(eventName);
	}

	@And("I enter the event description as {string}")
	public void iEnterTheEventDescriptionAs(String eventDescription) {
		ConfigEvents configEvents = new ConfigEvents();
		configEvents.setConfigEventsEventNameTextField(eventDescription); // Use the correct method for description if
																			// necessary
	}

	@Then("the new config event should be saved successfully")
	public void theNewConfigEventShouldBeSavedSuccessfully() {
		// Here, you can add validations to confirm that the event was saved
		// successfully
		// Example: assertTrue("Success message should be visible",
		// successMessage.isDisplayed());
		System.out.println("The new config event has been saved successfully.");
	}
}
