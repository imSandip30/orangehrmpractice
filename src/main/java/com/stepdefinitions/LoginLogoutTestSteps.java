package com.stepdefinitions;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.testingshastra.Keyword;
import com.testingshastra.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogoutTestSteps {

	@Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orangehrm_login_page() throws InterruptedException, MalformedURLException {
		//System.out.println("I am in hooks");
		Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
		Thread.sleep(500);
    }
	
	
	
	@Given("I am logged in to the OrangeHRM")
    public void i_am_logged_in_to_the_OrangeHRM_platform() throws InterruptedException, MalformedURLException {
		//System.out.println("I am in hooks");
		Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
		String screenshotDir = System.getProperty("user.dir") + "/target/screenshots/";
		System.out.println(screenshotDir);	
		Thread.sleep(500);
		
		LoginPage loginPage = new LoginPage();
		Thread.sleep(500);
		loginPage.enterUserName("Admin");
		// Thread.sleep(1500);
		loginPage.enterPassword("admin123");
		// Thread.sleep(1500);
		loginPage.clickOnLoginBtn();
		Thread.sleep(1000);
		
		HomePage homePage = new HomePage();
        // Check if the page title matches the expected value
        Assert.assertTrue(homePage.isLoggedIn(), "The page title is incorrect.");
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() throws InterruptedException {
    	LoginPage loginPage = new LoginPage();
		Thread.sleep(500);
		loginPage.enterUserName("Admin");
		// Thread.sleep(1500);
		loginPage.enterPassword("admin123");
		// Thread.sleep(1500);
		loginPage.clickOnLoginBtn();
		Thread.sleep(1000);
    }


    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
    	HomePage homePage = new HomePage();
        // Check if the page title matches the expected value
        Assert.assertTrue(homePage.isLoggedIn(), "The page title is incorrect.");
    }
    
    
    @When("I enter username {string} and password {string}")
    public void iEnterInvalidUsernameAndValidPassword(String username, String password) throws InterruptedException {
    	LoginPage loginPage = new LoginPage();
		Thread.sleep(500);
		loginPage.enterUserName(username);
		// Thread.sleep(1500);
		loginPage.enterPassword(password);
		// Thread.sleep(1500);
		loginPage.clickOnLoginBtn();
		Thread.sleep(1500);
    }
    
    // Step to verify the error message for invalid username
    @Then("I should see an error message for invalid credentials")
    public void i_Should_See_An_Error_Message_ForInvalid_Username() {
    	HomePage homePage = new HomePage();
    	// Wait for the error message to be visible (consider using WebDriverWait in real tests)
        // Thread.sleep(2000);  // Optional, replace with WebDriverWait for better reliability
        
        // Get the error message text
        //String errorMessageText = errorMessage.getText();
        
        // Assert that the error message contains the expected text
    	Assert.assertTrue(homePage.verifyInvalidLoginErrorMessage(),"Error message is not displayed as expected");
    }
    
    // When I click on the logout button
    @When("^I click on the logout button$")
    public void i_click_on_the_logout_button() throws InterruptedException {
    	HomePage homePage = new HomePage();
    	Thread.sleep(1500);
    	homePage.clickLogoutButton();
    //	Keyword.driver.quit();
    }

    // Then I should be redirected to the login page
    @Then("^I should be redirected to the login page$")
    public void i_should_be_redirected_to_the_login_page() {
    	HomePage homePage = new HomePage();
    	Assert.assertTrue(homePage.isLoggedOut(),"Error isLoggedOut");
    }
    

}


