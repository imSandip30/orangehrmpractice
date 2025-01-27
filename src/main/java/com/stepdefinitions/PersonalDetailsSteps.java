package com.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.testingshastra.Keyword;
import com.testingshastra.pages.PersonalDetailsPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class PersonalDetailsSteps {
	@When("I click on {string} on the top menu")
	public void iClickOnOnTheTopMenu(String tab) {
		// Keyword.driver.findElement(By.xpath("//span[text()='" + tab + "']")).click();
		// System.out.println();
	}


	@When("I fill in all personal details:")
	public void fill(DataTable dataTable) throws InterruptedException {
	    // Convert the DataTable to a list of lists (rows of data)
	    List<List<String>> data = dataTable.asLists(String.class);

	    // Create an instance of the PersonalDetailsPage
	    PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();

	    // Click on "My Info" menu
	    personalDetailsPage.clickMyInfoLink();
	    Thread.sleep(2000);
	    // Map the DataTable to a Map<String, List<String>> manually
	    Map<String, List<String>> dataMap = new HashMap<>();
	    List<String> columnNames = data.get(0); // Get column names (first row)
	    
	    // Initialize the map with empty lists for each column
	    for (String columnName : columnNames) {
	        dataMap.put(columnName, new ArrayList<>());
	        //System.out.println(columnName);
	    }

	    // Add the corresponding values from each row (starting from the second row)
	    for (int i = 1; i < data.size(); i++) {
	        List<String> row = data.get(i);
	        for (int j = 0; j < columnNames.size(); j++) {
	            dataMap.get(columnNames.get(j)).add(row.get(j));
	            dataMap.get(columnNames.get(j)).add(row.get(j));
	          //  System.out.println(dataMap.get(columnNames.get(j)).add(row.get(j)));
	        }
	    }
	   // System.out.println(dataMap.get("FullName1").get(0));
	   // System.out.println(dataMap.get("FullName1").get(1));
	    // Fill in personal details from the map
	    personalDetailsPage.setEmployeeFullName1TextField(dataMap.get("FullName1").get(1));
	    personalDetailsPage.setEmployeeFullName2TextField(dataMap.get("FullName2").get(1));
	    personalDetailsPage.setEmployeeFullName3TextField(dataMap.get("FullName3").get(1));
	    personalDetailsPage.setEmployeeIdTextField(dataMap.get("EmployeeId").get(1));
	    personalDetailsPage.setOtherIdTextField(dataMap.get("OtherId").get(1));
	    personalDetailsPage.setDriversLicenseNumberTextField(dataMap.get("DriversLicenseNumber").get(1));
	    personalDetailsPage.setLicenseExpiryDateTextField(dataMap.get("LicenseExpiryDate").get(1));
	    personalDetailsPage.setDateOfBirthTextField(dataMap.get("DateOfBirth").get(1));

	   
	    // Click on "Save" button to save personal details
	    personalDetailsPage.clickSave1Button();
	
		// Specify the file path of the file you want to upload
		String filePath = "C:/Users/imsan/Downloads/photo.jpeg";

		System.out.println("Full path: " + filePath);

		personalDetailsPage.clickAddButton();
		//Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) Keyword.driver;
		jse.executeScript("window.scrollBy(0,450)");
	
		Keyword.driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/input"))
				.sendKeys(filePath);
		// Keyword.waitForElementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/input")).sendKeys(filePath);
		Thread.sleep(1000);
		// div[@class='orangehrm-attachment']//button[@class='oxd-button
		// oxd-button--medium oxd-button--secondary orangehrm-left-space']
		Keyword.driver.findElement(By.xpath(
				"//div[@class='orangehrm-attachment']//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
				.click();
		
	}
}