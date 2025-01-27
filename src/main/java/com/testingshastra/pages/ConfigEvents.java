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

public class ConfigEvents {
  
	                  
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button")
    private WebElement configEventsAddBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
	private WebElement configEventsEventName;
	
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/textarea")
    private WebElement configEventsDescription ;
	
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    private WebElement configEventsSaveBtn;

   
	public ConfigEvents() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	 
	 public void clickOnConfigEventsAddBtn(String nameValue) {
		 
		 waitForElementToBeClickable(configEventsAddBtn);
		 configEventsAddBtn.click();
		 
	     
	    }
	
	 public void setConfigEventsEventNameTextField(String nameValue) {
		 
		 waitForElementToBeClickable(configEventsEventName);
		 configEventsEventName.sendKeys(nameValue);
		 
	     
	    }
	
	 
	 public void clickOnConfigEventsSaveBtn(String nameValue) {
		 waitForElementToBeClickable(configEventsSaveBtn);
		 configEventsSaveBtn.click();
		 		 
	     
	    }
		
	
	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}
	
	
	
	
}
