package com.testingshastra.allurelistener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testingshastra.Keyword;

import io.qameta.allure.Allure;

public class MyAllureListener implements ITestListener {

	
	
	@Override
    public void onTestFailure(ITestResult result) {
        // Code to run when a test fails
        System.out.println("Test failed: " + result.getName());
        captureScreenshotAndAttachToAllure(result);
    }

	private void captureScreenshotAndAttachToAllure(ITestResult result) {
	    // Get WebDriver instance from the test context
	   // WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
		
	    // Create screenshot folder if not exists
	    String screenshotDir = System.getProperty("user.dir") + "/target/screenshots/";
	    File screenshotFolder = new File(screenshotDir);
	    if (!screenshotFolder.exists()) {
	        screenshotFolder.mkdirs();  // Create folder if not exists
	    }

	    // Generate a unique timestamp for the screenshot
	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String screenshotPath = screenshotDir + "screenshot_" + timestamp + ".png";

	    // Capture the screenshot using Selenium
	    File screenshot = ((TakesScreenshot) Keyword.driver).getScreenshotAs(OutputType.FILE);
	    
	    try {
	        // Save the screenshot to the desired location
	        FileUtils.copyFile(screenshot, new File(screenshotPath));

	        // Attach screenshot to Allure report
	        try (FileInputStream screenshotStream = new FileInputStream(screenshotPath)) {
	            Allure.addAttachment("Screenshot: " + timestamp, "image/png", screenshotStream, "png");
	        }

	        System.out.println("Screenshot saved to: " + screenshotPath);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}