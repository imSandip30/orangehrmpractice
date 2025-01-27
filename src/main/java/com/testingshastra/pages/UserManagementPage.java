package com.testingshastra.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testingshastra.Keyword;

public class UserManagementPage {
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	private WebElement addBtn;

	@FindBy(css = "div.oxd-select-text")
	private WebElement userRoleList;

	@FindBy(css = "div[role='listbox'] div>span")
	private List<WebElement> roleList;

	@FindBy(css = "input[placeholder=\"Type for hints...\"]")
	private WebElement employeeName;

	@FindBy(css = "div[role='listbox'] div>span")
	private List<WebElement> employeeNames;

	public void clickOnAddBtn() {
		waitForElementToBeClickable(addBtn);
		addBtn.click();
	}

	public void clickOnUserRoleList() {
		waitForElementToBeClickable(userRoleList);
		userRoleList.click();
	}

	public void selectRole(String roleName) {
		for (WebElement role : roleList) {
			if (role.getText().equalsIgnoreCase(roleName)) {
				role.click();
				break;
			}
		}
	}

	public void enterEmployeeName(String employeeName) throws InterruptedException {
		waitForElementToBeClickable(this.employeeName);
		this.employeeName.sendKeys(employeeName);
		Thread.sleep(3000);
	}

	public List<String> getEmployeeNames() {
		List<String> names = new ArrayList<String>();
		for (WebElement employeeName : employeeNames) {
			names.add(employeeName.getText());
		}
		return names;
	}
	
	public void waitForElementToBeClickable(WebElement clickableofElement) {
		Keyword keyword = new Keyword();
		keyword.waitForElementToBeClickable(clickableofElement);
	}

}
