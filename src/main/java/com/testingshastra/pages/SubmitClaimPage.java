package com.testingshastra.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshastra.Keyword;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SubmitClaimPage {
  
	                     
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")	
    private WebElement submitClaimEventDropdown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")	
    private WebElement submitClaimEvent;
	
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/i")    
    private WebElement submitClaimCurrencyDropdown ;
	
	@FindBy(xpath = "//div[@class='oxd-select-option' and span[text()='Euro']]")   
    private WebElement submitClaimCurrency ;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")   
    private WebElement submitClaimCreateBtn;

   
	public SubmitClaimPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	 
	 public void setSubmitClaimEventTextField(String nameValue) {
		 waitForElementToBeClickable(submitClaimEventDropdown);
		 submitClaimEventDropdown.click();
		 
		 waitForElementToBeClickable(submitClaimEvent);
		 submitClaimEvent.click();
		 
	     
	    }
	
	 public void setSubmitClaimCurrencyTextField(String nameValue) {
		 waitForElementToBeClickable(submitClaimCurrencyDropdown);
		 submitClaimCurrencyDropdown.click();
		 
		 waitForElementToBeClickable(submitClaimCurrency);
		 submitClaimCurrency.click();
		 
	     
	    }
	
	 
	 public void clickOnSubmitClaimCreateBtn(String nameValue) {
		 waitForElementToBeClickable(submitClaimCreateBtn);
		 submitClaimCreateBtn.click();
		 		 
	     
	    }
		
	
	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}
	
	
	
	
}
