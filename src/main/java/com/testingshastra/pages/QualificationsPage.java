package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class QualificationsPage {
	
	@FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]//button[@class='oxd-button oxd-button--medium oxd-button--text']")	
	private WebElement qualificationsAddBtn;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")	
	private WebElement qualificationsCompanyName;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")	
	private WebElement qualificationsJobTitle;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")	
	private WebElement qualificationsFrom;

	// @FindBy(xpath
	// ="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]")
	// private WebElement qualificationsRelationship;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")	
	private WebElement qualificationsTo;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]")	
	private WebElement qualificationsSaveBtn;

	public QualificationsPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void qualificationsCompanyNameTextField(String nameValue) {
		waitForElementToBeClickable(qualificationsCompanyName);
		qualificationsCompanyName.sendKeys(nameValue);
	}
	
	public void qualificationsJobTitleTextField(String nameValue) {
		waitForElementToBeClickable(qualificationsJobTitle);
		qualificationsJobTitle.sendKeys(nameValue);
	}
	
	
	public void setqualificationsFromTextField(String nameValue)  {
		waitForElementToBeClickable(qualificationsFrom);
		qualificationsFrom.sendKeys(nameValue);
	}

	public void setqualificationsToTextField(String nameValue) {
		waitForElementToBeClickable(qualificationsTo);
		qualificationsTo.sendKeys(nameValue);
		qualificationsTo.click();
	}

	public void clickqualificationsAddBtnButton() {
		waitForElementToBeClickable(qualificationsAddBtn);
		qualificationsAddBtn.click();
	}

	public void clickqualificationsSaveBtnButton() {
		waitForElementToBeClickable(qualificationsSaveBtn);
		qualificationsSaveBtn.click();
	}

	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
