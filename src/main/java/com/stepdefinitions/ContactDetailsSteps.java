package com.stepdefinitions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.testingshastra.Keyword;
import com.testingshastra.pages.ContactDetailsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetailsSteps {
	// WebDriver driver;
	

	@And("I am on the Contact Details page")
	public void i_am_on_the_contact_details_page() throws InterruptedException {
	
		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7");
		Thread.sleep(2000);
		
	}

	@When("I enter street address 1 as {string}")
	public void i_enter_street_address_1(String address) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setStreet1TextField(address);
	}

	@And("I enter street address 2 as {string}")
	public void i_enter_street_address_2(String address) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setStreet2TextField(address);
	}

	@And("I enter city as {string}")
	public void i_enter_city(String cityName) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setCityTextField(cityName);
	}

	@And("I enter state as {string}")
	public void i_enter_state(String stateName) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setStateprovinceTextField(stateName);
	}

	@And("I enter zip code as {string}")
	public void i_enter_zip_code(String zip) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setZippostalCodeTextField(zip);
	}

	@And("I enter home phone as {string}")
	public void i_enter_home_phone(String homePhone) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setHomeTextField(homePhone);
	}

	@And("I enter mobile phone as {string}")
	public void i_enter_mobile_phone(String mobilePhone) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setMobileTextField(mobilePhone);
	}

	@And("I enter work phone as {string}")
	public void i_enter_work_phone(String workPhone) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setWorkTextField(workPhone);
	}

	@And("I enter work email as {string}")
	public void i_enter_work_email(String workEmail) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setWorkEmailTextField(workEmail);
	}

	@And("I enter other email as {string}")
	public void i_enter_other_email(String otherEmail) {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.setOtherEmailTextField(otherEmail);
	}

	@And("I click the save button on contact details page")
	public void i_click_the_save_button() throws InterruptedException {
		ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
		contactDetailsPage.clickSaveButton();	
		HomePage homePage = new HomePage();
    	Thread.sleep(1500);
    	homePage.clickLogoutButton();
        Keyword.driver.quit();
	}
	

    @Then("the contact details should be saved successfully")
    public void the_contact_details_should_be_saved_successfully() throws InterruptedException { 
    	
    	Thread.sleep(500);
    	ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
    	String actualCityText =contactDetailsPage.getCityTextField(); 
    	System.out.println(actualCityText);
    	Assert.assertEquals(actualCityText, "Metropolis", "Text does not match!");
    	
    }
	
	
	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
