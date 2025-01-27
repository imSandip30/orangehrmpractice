package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class MembershipsPage {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")	
	private WebElement membershipsAddBtn;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")	
	private WebElement membershipsName;
	
	@FindBy(css = "div[data-v-d130bb63][data-v-13cf171c] > span[data-v-13cf171c]")	
	private WebElement membershipsNameDropdown;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")	
	private WebElement membershipsSubscriptionPaidByDropdown;

	@FindBy(css = "div.oxd-select-option > span[data-v-13cf171c]")	
	private WebElement membershipsSubscriptionPaidBy;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")	
	private WebElement membershipsSubscriptionAmt;
	                 
    @FindBy(xpath  ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")
	private WebElement  membershipsCurrencyDropdown;
    
    @FindBy(xpath ="//div[@class='oxd-select-option' and span[text()='Euro']]")
   	private WebElement membershipsCurrency;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/input")	
	private WebElement membershipsCommenceDate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/input")	
	private WebElement membershipsRenewalDate;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")	
	private WebElement membershipsSaveBtn;

	public MembershipsPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void setMembershipsNameTextField(String nameValue) {
		waitForElementToBeClickable(membershipsName);
		membershipsName.click();
		waitForElementToBeClickable(membershipsNameDropdown);
		membershipsNameDropdown.click();
		
	}
	
	public void setMembershipsSubscriptionPaidByTextField(String nameValue) {
		
		waitForElementToBeClickable(membershipsSubscriptionPaidByDropdown);
		membershipsSubscriptionPaidByDropdown.click();
		waitForElementToBeClickable(membershipsSubscriptionPaidBy);
		membershipsSubscriptionPaidBy.click();
	}
	
	
	public void setMembershipsCurrencyField(String nameValue)  {
		
		waitForElementToBeClickable(membershipsCurrencyDropdown);
		membershipsCurrencyDropdown.click();
		waitForElementToBeClickable(membershipsCurrency);
		membershipsCurrency.click();
	}

	
	public void setMembershipsSubscriptionAmtField(String nameValue)  {
		waitForElementToBeClickable(membershipsSubscriptionAmt);
		membershipsSubscriptionAmt.sendKeys(nameValue);
	}

	public void setMembershipsCommenceDateTextField(String nameValue) {
		waitForElementToBeClickable(membershipsCommenceDate);
		membershipsCommenceDate.sendKeys(nameValue);
		membershipsCommenceDate.click();
	}

	public void setMembershipsRenewalDateTextField(String nameValue) {
		waitForElementToBeClickable(membershipsRenewalDate);
		membershipsRenewalDate.sendKeys(nameValue);
		membershipsRenewalDate.click();
	}
	
	public void clickmembershipsAddBtnButton() {
		waitForElementToBeClickable(membershipsAddBtn);
		membershipsAddBtn.click();
	}

	public void clickmembershipsSaveBtnButton() {
		waitForElementToBeClickable(membershipsSaveBtn);
		membershipsSaveBtn.click();
	}

	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
