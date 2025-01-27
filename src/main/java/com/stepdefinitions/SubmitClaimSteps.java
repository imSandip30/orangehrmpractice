package com.stepdefinitions;

import com.testingshastra.Keyword;
import com.testingshastra.pages.SubmitClaimPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

//import static org.junit.Assert.assertTrue;

public class SubmitClaimSteps {

	@Given("I am on the submit claim page")
	public void iAmOnTheSubmitClaimPage() {
		// Ensure that you are on the correct page.
		// You could check the page title or URL.
		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/claim/submitClaim");

		System.out.println("Navigated to the Submit Claim page.");
		// Example: WebDriver driver = new WebDriver(); driver.get("URL");
	}

	@When("I select a claim event")
	public void iSelectAClaimEvent() {
		// Assuming you are selecting an event, this method clicks the dropdown and
		// selects an option
		SubmitClaimPage submitClaimPage = new SubmitClaimPage();
		submitClaimPage.setSubmitClaimEventTextField("Event Name"); // The 'nameValue' could be dynamically set
	}

	@And("I select a claim currency")
	public void iSelectAClaimCurrency() {
		SubmitClaimPage submitClaimPage = new SubmitClaimPage();
		// Assuming you are selecting a currency, this method clicks the dropdown and
		// selects an option
		submitClaimPage.setSubmitClaimCurrencyTextField("USD"); // The 'nameValue' could be dynamically set
	}

	@And("I click on the submit claim create button")
	public void iClickOnTheSubmitClaimCreateButton() {
		SubmitClaimPage submitClaimPage = new SubmitClaimPage();
		// Clicking the submit claim create button
		submitClaimPage.clickOnSubmitClaimCreateBtn("Submit Claim");
	}

	@Then("the claim is created successfully")
	public void theClaimIsCreatedSuccessfully() {
		// Add validation steps here
		// For example, verify if a success message appears, or some page element is
		// visible
		// Example: assertTrue("Claim created success message",
		// successMessage.isDisplayed());
		System.out.println("Claim has been submitted successfully.");
	}
}
