package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.EmergencyContactsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EmergencyContactsSteps {

	

	@Given("I am on the Emergency Contacts page")
	public void i_am_on_the_emergency_contacts_page() throws InterruptedException {
		// emergencyContactsPage.clickEmergencyContactsLink();
		Keyword.driver
				.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/7");
		Thread.sleep(2000); // Adding a delay to ensure page load
	}

	@When("I click on the {string} button to add a new emergency contact")
	public void i_click_on_the_button_to_add_a_new_emergency_contact(String action) {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.clickAddButton();
	}

	@And("I enter the emergency contact name as {string}")
	public void i_enter_the_emergency_contact_name(String contactName) {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.setNameTextField(contactName);
	}

	@And("I enter the relationship as {string}")
	public void i_enter_the_relationship(String relationship) {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.setRelationshipTextField(relationship);
	}

	@And("I enter the home phone as {string}")
	public void i_enter_the_home_phone(String homePhone) {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.setHomeTelephoneTextField(homePhone);
	}

	@And("I enter the mobile phone as {string}")
	public void i_enter_the_mobile_phone(String mobilePhone) {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.setMobileTextField(mobilePhone);
	}

	@And("I click the save button to save Emergency contact details")
	public void i_click_the_save_button() {
		EmergencyContactsPage emergencyContactsPage = new EmergencyContactsPage();
		emergencyContactsPage.clickSaveButton();
	}

}
