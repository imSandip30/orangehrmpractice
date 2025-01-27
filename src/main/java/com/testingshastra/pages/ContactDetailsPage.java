package com.testingshastra.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;

public class ContactDetailsPage {
   
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--text")   
    private WebElement add;
    

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")   
    private WebElement home;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")   
    private WebElement city;

    @FindBy(css = "a.orangehrm-tabs-item.--active")   
    private WebElement contactDetails;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")  
    private WebElement mobile;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(3) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")   
    private WebElement otherEmail;
 
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")   
    private WebElement save;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(4) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")   
    private WebElement stateprovince;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")  
    private WebElement street1;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")   
    private WebElement street2;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(3) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")
    private WebElement work;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(3) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")  
    private WebElement workEmail;

    @FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(5) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")  
    private WebElement zippostalCode;

 
    /**
     * Click on Save Button.
     *
     * @return the login class instance.
     */
    public void clickSaveButton() {
        save.click();
        //return this;
    }

    public ContactDetailsPage() {
    	PageFactory.initElements(Keyword.driver, this);
    }

   
    /**
     * Click on Add Button.
     *
     * @  the login class instance.
     */
    public void clickAddButton() {
        add.click();
       
    }

    /**
     * Click on Contact Details Link.
     *
     * @  the login class instance.
     */
    public void clickContactDetailsLink() {
    	contactDetails.click();
       
    }

    /**
     * Set value to City Text field.
     *
     * @  the login class instance.
     */
    public void setCityTextField(String cityValue) {
    	
    	if (city.getAttribute("value").length() > 0) {

    		city.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", city); //
		}
        city.sendKeys(cityValue);
       
    }

    /**
     * Set value to Home Text field.
     *
     * @  the login class instance.
     */
    public void setHomeTextField(String homeValue) {
        home.sendKeys(homeValue);
       
    }
 
    /**
     * Set value to Mobile Text field.
     *
     * @  the login class instance.
     */
    public void setMobileTextField(String mobileValue) {
        mobile.sendKeys(mobileValue);
       
    }


    /**
     * Set value to Other Email Text field.
     *
     * @  the login class instance.
     */
    public void setOtherEmailTextField(String otherEmailValue) {
    	if (otherEmail.getAttribute("value").length() > 0) {

    		otherEmail.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", otherEmail); //
		}
        otherEmail.sendKeys(otherEmailValue);
       
    }


    /**
     * Set value to Stateprovince Text field.
     *
     * @  the login class instance.
     */
    public void setStateprovinceTextField(String stateprovinceValue) {
        stateprovince.sendKeys(stateprovinceValue);
       
    }


    /**
     * Set value to Street 1 Text field.
     *
     * @  the login class instance.
     */
    public void setStreet1TextField(String street1Value) {
        street1.sendKeys(street1Value);
       
    }

 
    /**
     * Set value to Street 2 Text field.
     *
     * @  the login class instance.
     */
    public void setStreet2TextField(String street2Value) {
        street2.sendKeys(street2Value);
       
    }

    /**
     * Set value to Work Email Text field.
     *
     * @  the login class instance.
     */
    public void setWorkEmailTextField(String workEmailValue) {
    	//workEmail.clear();
    	
    	if (workEmail.getAttribute("value").length() > 0) {

    		workEmail.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", workEmail); //
		}
	//	driversLicenseNumber.sendKeys(driversLicenseNumberValue);
        workEmail.sendKeys(workEmailValue);
       
    }

    /**
     * Set value to Work Text field.
     *
     * @  the login class instance.
     */
    public void setWorkTextField(String workValue) {
        work.sendKeys(workValue);     
    }


    /**
     * Set value to Zippostal Code Text field.
     *
     * @  the login class instance.
     */
    public void setZippostalCodeTextField(String zippostalCodeValue) {
        zippostalCode.sendKeys(zippostalCodeValue);
       
    }

    /**
     * Set default value to Work Text field.
     *
     * @  the login class instance.
     */
    public String getCityTextField() {
    	waitForElementToBeClickable(city);
    	
    	return city.getAttribute("value");
    	//city.getText();
          
    }

    public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}



}
