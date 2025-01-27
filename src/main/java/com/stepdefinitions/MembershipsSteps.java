package com.stepdefinitions;


import com.testingshastra.Keyword;
import com.testingshastra.pages.MembershipsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MembershipsSteps {

  //  WebDriver driver = new ChromeDriver();
   


    @Given("I navigate to the Memberships page for employee")
    public void iNavigateToTheMembershipsPageForEmployee() throws InterruptedException {
        // Navigate to the Memberships page
        Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewMemberships/empNumber/7");
        Thread.sleep(500);
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String buttonName) {
    	 MembershipsPage membershipsPage = new MembershipsPage();
        if(buttonName.equals("Add")) {
            membershipsPage.clickmembershipsAddBtnButton();
        } else if(buttonName.equals("Save")) {
            membershipsPage.clickmembershipsSaveBtnButton();
        }
    }

    @And("I fill in the membership details with name {string}, paid by {string}, amount {string}, currency {string}, commencement date {string}, and renewal date {string}")
    public void iFillInTheMembershipDetails(String name, String paidBy, String amount, String currency, String commenceDate, String renewalDate) {
    	MembershipsPage membershipsPage = new MembershipsPage();
    	membershipsPage.setMembershipsNameTextField(name);
        membershipsPage.setMembershipsSubscriptionPaidByTextField(paidBy);
        membershipsPage.setMembershipsSubscriptionAmtField(amount);
        membershipsPage.setMembershipsCommenceDateTextField(commenceDate);
        membershipsPage.setMembershipsRenewalDateTextField(renewalDate);
        membershipsPage.setMembershipsCurrencyField(currency);
       
    }

    @Then("the membership should be saved successfully")
    public void theMembershipShouldBeSavedSuccessfully() {
        // Verify that the membership was added successfully
        // For this, you might want to check if there's any confirmation or change in the UI
        // Assuming a simple check here like an assertion
       // assertTrue("Membership was not saved", driver.getPageSource().contains("Membership added successfully"));
      //  driver.quit();
    }
}

