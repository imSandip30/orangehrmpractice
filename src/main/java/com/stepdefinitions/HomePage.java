package com.stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class HomePage {

	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	WebElement profileButton;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutButton;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement alertMessage;

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	// Action methods
	public void clickLogoutButton() {
		waitForLoginPageElementToBeClickable(profileButton);
		profileButton.click();
		waitForLoginPageElementToBeClickable(logoutButton);
		logoutButton.click();
	}

	// Method to check if login is successful
	public boolean isLoggedIn() {
		return Keyword.driver.getCurrentUrl()
				.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

	}

	// Method to check if login is successful
	public boolean verifyInvalidLoginErrorMessage() {
		waitForLoginPageElementToBeClickable(alertMessage);
		String errorMessage = alertMessage.getText();
		// Assert that the message contains "Invalid credentials"
		//return errorMessage.contains("Invalid credentials");
		return errorMessage.contains("x");

	}

	public boolean isLoggedOut() {
		return Keyword.driver.getCurrentUrl()
				.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	public void waitForLoginPageElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
