package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class ConfigExpenseTypes {
  
	                     
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button")
	@CacheLookup
    private WebElement configExpenseTypesAddBtn;
	              
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
	@CacheLookup
    private WebElement configExpenseTypesEventName;
	
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/textarea")   
    private WebElement configExpenseTypesDescription ;
	
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")   
    private WebElement configExpenseTypesSaveBtn;

   
	public ConfigExpenseTypes() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	 
	 public void clickOnconfigExpenseTypesAddBtn(String nameValue) {
		 
		 waitForElementToBeClickable(configExpenseTypesAddBtn);
		 configExpenseTypesAddBtn.click();
		 
	     
	    }
	
	 public void setconfigExpenseTypesEventNameTextField(String nameValue) {
		 
		 waitForElementToBeClickable(configExpenseTypesEventName);
		 configExpenseTypesEventName.sendKeys(nameValue);
		 
	     
	    }
	
	 
	 public void clickOnconfigExpenseTypesSaveBtn(String nameValue) {
		 waitForElementToBeClickable(configExpenseTypesSaveBtn);
		 configExpenseTypesSaveBtn.click();
		 		 
	     
	    }
		
	
	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}
	
	
	
	
}
