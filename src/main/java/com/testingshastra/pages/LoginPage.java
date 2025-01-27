package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testingshastra.Keyword;

public class LoginPage {

	@FindBy(css = "input[name=\"username\"]")
	WebElement usernameTxtBx;

	@FindBy(css = "input[name=\"password\"]")
	WebElement passwordTxtBx;

	@FindBy(css = "button[type=\"submit\"]")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void enterUserName(String username) {
		waitForLoginPageElementToBeClickable(usernameTxtBx);
		usernameTxtBx.sendKeys(username);
	}

	public void enterPassword(String password) {
		waitForLoginPageElementToBeClickable(passwordTxtBx);
		passwordTxtBx.sendKeys(password);
	}

	public void clickOnLoginBtn() {
		waitForLoginPageElementToBeClickable(loginBtn);
		loginBtn.click();
	}

	public void waitForLoginPageElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
