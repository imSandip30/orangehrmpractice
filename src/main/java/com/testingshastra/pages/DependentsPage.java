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

public class DependentsPage {
  
	                     
	@FindBy(css = ".oxd-select-text--arrow")	
    private WebElement dependentsRelationship;
	/*
    @FindBy(xpath = "//div[@class='oxd-select-text-input' and text()='Child']")
   
    private WebElement relationshipOptions ;*/
	
	@FindBy(css = "div.oxd-select-dropdown.--positon-bottom div:nth-child(2)")   
    private WebElement relationshipOptions ;


  //  @FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]")
 //   private WebElement dependentsRelationship;  
   
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")   
    private WebElement dependentsName;
   
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/div/div/input")    
    private WebElement dependentsDOB;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")   
    private WebElement dependentsSaveBtn;

    @FindBy(xpath = " /html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
    private WebElement dependentsAddBtn;
    
   
	public DependentsPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	 
	 public void setdependentsNameTextField(String nameValue) {
		 waitForLoginPageElementToBeClickable(dependentsName);
		 dependentsName.sendKeys(nameValue);
	     
	    }
	
	 public void setdependentsRelationshipTextField(String nameValue) throws InterruptedException {
		
		 dependentsRelationship.click();
		 Thread.sleep(500);
		 relationshipOptions.click();

	     
	    }
	 
	 public void setdependentsDOBTextField(String nameValue) {
		 waitForLoginPageElementToBeClickable(dependentsDOB);
		 dependentsDOB.sendKeys(nameValue);
	     
	    }


	 public void    clickdependentsAddBtnButton() {
		 waitForLoginPageElementToBeClickable(dependentsAddBtn);
		 dependentsAddBtn.click(); 
	    }
	
	 public void    clickdependentsSaveBtnButton() {
		 waitForLoginPageElementToBeClickable(dependentsSaveBtn);
		 dependentsSaveBtn.click(); 
	    }
		
	
	public void waitForLoginPageElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}
	
	
	
	
}
