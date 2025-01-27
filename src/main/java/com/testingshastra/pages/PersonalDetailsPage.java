package com.testingshastra.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshastra.Keyword;


public class PersonalDetailsPage {
	private Map<String, String> data;
	//private WebDriver driver;
	//private int timeout = 15;

	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--text")	
	private WebElement add;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")	
	private WebElement dateOfBirth;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")	
	private WebElement driversLicenseNumber;

	@FindBy(css = "a[href='/web/index.php/pim/viewEmergencyContacts/empNumber/7']")	
	private WebElement emergencyContacts;
	
	@FindBy(css = "input[name = 'firstName']")	
	private WebElement employeeFullName1;

	@FindBy(css = "input[ name= 'middleName']")	
	private WebElement employeeFullName2;

	@FindBy(css = "input[name = 'lastName']")	
	private WebElement employeeFullName3;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")	
	private WebElement employeeId;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) div.oxd-input-group div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div.oxd-radio-wrapper label input[type='radio']")
	
	private List<WebElement> female;
	private final String femaleValue = "2";

	@FindBy(css = ".orangehrm-custom-fields .oxd-select-text")	
	private WebElement bloodType;


	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/input")	
	private WebElement licenseExpiryDate;


	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) div.oxd-input-group div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.oxd-radio-wrapper label input[type='radio']")	
	private List<WebElement> male;

	private final String maleValue = "1";
	@FindBy(css = "a[href='/web/index.php/pim/viewMemberships/empNumber/7']")
	
	private WebElement memberships;

	@FindBy(css = "li[class='oxd-main-menu-item-wrapper']:nth-of-type(6) > a[class*='oxd-main-menu-item']")	
	private WebElement myInfo;


	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement otherId;


	@FindBy(css = "a.orangehrm-tabs-item.--active")	
	private WebElement personalDetails;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(1) form.oxd-form div:nth-of-type(4) button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")	
	private WebElement save1;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) aside.oxd-sidepanel nav.oxd-navbar-nav div:nth-of-type(2) div.oxd-main-menu.--fixed div.oxd-main-menu-search input.oxd-input.oxd-input--active")	
	private WebElement testfield1;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-card-container form.oxd-form div:nth-of-type(1) div.oxd-grid-3.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")	
	private WebElement testfield2;


	public PersonalDetailsPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	/**
	 * Click on Add Button.
	 *
	 * @return the login class instance.
	 */
	public void clickAddButton() {
		waitForElementToBeClickable(save1);
		add.click();
	
	}


	/**
	 * Click on My Info Link.
	 *
	 * @return the login class instance.
	 */
	public void clickMyInfoLink() {
		waitForElementToBeClickable(myInfo);
		myInfo.click();

	}

	
	/**
	 * Click on Personal Details Link.
	 *
	 * @return the login class instance.
	 */
	public void clickPersonalDetailsLink() {
		personalDetails.click();

	}


	/**
	 * Click on Save Button.
	 *
	 * @return the login class instance.
	 */
	public void clickSave1Button() {
		waitForElementToBeClickable(save1);
		save1.click();

	}



	/**
	 * Set value to Date Of Birth Text field.
	 *
	 * @return the login class instance.
	 */
	public void setDateOfBirthTextField(String dateOfBirthValue) {
		waitForElementToBeClickable(dateOfBirth);
		if (dateOfBirth.getAttribute("value").length() > 0) {

			dateOfBirth.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", dateOfBirth); //
		}

		dateOfBirth.sendKeys(dateOfBirthValue);

	}

	/**
	 * Set value to Drivers License Number Text field.
	 *
	 * @return the login class instance.
	 */
	public void setDriversLicenseNumberTextField(String driversLicenseNumberValue) {
		
		waitForElementToBeClickable(driversLicenseNumber);
		if (driversLicenseNumber.getAttribute("value").length() > 0) {

			driversLicenseNumber.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", driversLicenseNumber); //
		}
		driversLicenseNumber.sendKeys(driversLicenseNumberValue);

	}


	/**
	 * Set value to Employee Full Name Text field.
	 *
	 * @return the login class instance.
	 */
	public void setEmployeeFullName1TextField(String employeeFullName1Value) {
		waitForElementToBeClickable(employeeFullName1);

		if (employeeFullName1.getAttribute("value").length() > 0) {

			employeeFullName1.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", employeeFullName1); //
		}
		

		employeeFullName1.sendKeys(employeeFullName1Value);

	}



	/**
	 * Set value to Employee Full Name Text field.
	 *
	 * @return the login class instance.
	 */
	public void setEmployeeFullName2TextField(String employeeFullName2Value) {
		waitForElementToBeClickable(employeeFullName2);
		clearField(employeeFullName2);
		employeeFullName2.sendKeys(employeeFullName2Value);

	}

	/**
	 * Set default value to Employee Full Name Text field.
	 *
	 * @return the login class instance.
	 */
	public void setEmployeeFullName3TextField() {
		setEmployeeFullName3TextField(data.get("EMPLOYEE_FULL_NAME_3"));
	}

	/**
	 * Set value to Employee Full Name Text field.
	 *
	 * @return the login class instance.
	 */
	public void setEmployeeFullName3TextField(String employeeFullName3Value) {
		waitForElementToBeClickable(employeeFullName3);
		clearField(employeeFullName3);
		employeeFullName3.sendKeys(employeeFullName3Value);

	}


	/**
	 * Set default value to Female Radio Button field.
	 *
	 * @return the login class instance.
	 */
	public void setFemaleRadioButtonField() {
		for (WebElement el : female) {
			if (el.getAttribute("value").equals(femaleValue)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}

	}


	/**
	 * Set value to License Expiry Date Text field.
	 *
	 * @return the login class instance.
	 */
	public void setLicenseExpiryDateTextField(String licenseExpiryDateValue) {
		waitForElementToBeClickable(licenseExpiryDate);

		if (licenseExpiryDate.getAttribute("value").length() > 0) {

			licenseExpiryDate.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", licenseExpiryDate); //
		}

		licenseExpiryDate.sendKeys(licenseExpiryDateValue);

	}

	/**
	 * Set default value to Male Radio Button field.
	 *
	 * @return the login class instance.
	 */
	public void setMaleRadioButtonField() {
		for (WebElement el : male) {
			if (el.getAttribute("value").equals(maleValue)) {
				if (!el.isSelected()) {
					el.click();
				}
				break;
			}
		}

	}

	/**
	 * Set value to Other Id Text field.
	 *
	 * @return the login class instance.
	 */
	public void setOtherIdTextField(String otherIdValue) {
		waitForElementToBeClickable(otherId);
		otherId.clear();
		otherId.sendKeys(otherIdValue);

	}


	/**
	 * Set value to Testfield Text field.
	 *
	 * @return the login class instance.
	 */
	public void setTestfield1TextField(String testfield1Value) {
		waitForElementToBeClickable(testfield1);
		testfield1.sendKeys(testfield1Value);

	}

	/**
	 * Set value to Testfield Text field.
	 *
	 * @return the login class instance.
	 */
	public void setTestfield2TextField(String testfield2Value) {
		waitForElementToBeClickable(testfield2);
		testfield2.sendKeys(testfield2Value);

	}

	public void setBloodTypeField(int bloodTypeValue) {
		/*
		 * Select dropdown = new Select(bloodType);
		 * dropdown.selectByIndex(bloodTypeValue); /*if
		 * (bloodType.getAttribute("value").length() > 0) {
		 * 
		 * bloodType.sendKeys(Keys.BACK_SPACE); JavascriptExecutor js =
		 * (JavascriptExecutor) Keyword.driver;
		 * js.executeScript("arguments[0].value = '';", bloodType); // }
		 */
		bloodType.click();
	}

	static void clearField(WebElement claerFiledValue) {
		
		if (claerFiledValue.getAttribute("value").length() > 0) {

			claerFiledValue.sendKeys(Keys.BACK_SPACE);
			JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
			js.executeScript("arguments[0].value = '';", claerFiledValue); //
		}
	}

	/**
	 * Set value to Employee Id Text field.
	 *
	 * @return the login class instance.
	 * @throws InterruptedException
	 */
	public void setEmployeeIdTextField(String employeeIdValue) throws InterruptedException {
		waitForElementToBeClickable(employeeId);
		clearField(employeeId);	
        employeeId.sendKeys(employeeIdValue);

	}

	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}
}
