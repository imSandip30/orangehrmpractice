package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class EmergencyContactsPage {


	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	private WebElement add1;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(6) div:nth-of-type(1) div.orangehrm-action-header button.oxd-button.oxd-button--medium.oxd-button--text")	
	private WebElement add2;

	@FindBy(css = "a.orangehrm-tabs-item.--active")	
	private WebElement emergencyContacts;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement homeTelephone;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement mobile;

	@FindBy(css = "a.oxd-main-menu-item.active.toggle")	
	private WebElement myInfo;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement name;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement relationship;


	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")	
	private WebElement save;	
	
	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")
	private WebElement workTelephone;

	public EmergencyContactsPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void setNameTextField(String nameValue) {
		waitForElementToBeClickable(name);
		name.sendKeys(nameValue);

	}

	public void setRelationshipTextField(String nameValue) {
		waitForElementToBeClickable(relationship);
		relationship.sendKeys(nameValue);

	}

	public void setHomeTelephoneTextField(String nameValue) {
		waitForElementToBeClickable(homeTelephone);
		homeTelephone.sendKeys(nameValue);

	}

	public void setMobileTextField(String nameValue) {
		waitForElementToBeClickable(mobile);
		mobile.sendKeys(nameValue);

	}

	public void clickSaveButton() {
		waitForElementToBeClickable(save);
		save.click();
	}

	public void clickAddButton() {
		waitForElementToBeClickable(add1);
		add1.click();
	}

	public void clickEmergencyContactsLink() {
		waitForElementToBeClickable(emergencyContacts);
		emergencyContacts.click();

	}

	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
