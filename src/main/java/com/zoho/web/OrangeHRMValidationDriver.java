package com.zoho.web;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.zoho.base.pages.OrangeHRMPage;
import com.zoho.session.OrangeHRMTestSession;


public abstract class OrangeHRMValidationDriver implements WebConnector{
	EventFiringWebDriver driver;
	Properties prop;
	boolean stopExecution;
	SoftAssert softAssert = new SoftAssert();


	public void validateLogin() {
		System.out.println("ZohoValidationDriver validateLogin");
		
	}

	public OrangeHRMPage validateTitle(String expTitleKey) {
		log("Expedted Title "+ prop.getProperty(expTitleKey));
		log("Actual Title "+ driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), expTitle);
      //  System.out.println(" validateTitle Status is "+ isStopExecution());
		if(!prop.getProperty(expTitleKey).equals(driver.getTitle())) {
			fail("Titles do not match. Got title as "+driver.getTitle());
			
		}
		return getSession().getCurrentPage();
		
	}
	
	public OrangeHRMPage validateText(String objectKey, String expectedText) {
		By locator = getObject(objectKey);
		log("validateText");
		//Assert.assertEquals(actual, expected);
		String actualText = driver.findElement(locator).getText();
		log("Actual Text {"+actualText+"}. Expected Text {"+expectedText+"}");
		if(!expectedText.equals(actualText)) {
			fail("Text not Matching. Got text as "+actualText);
		}
		return getSession().getCurrentPage();
	}
	
	public OrangeHRMPage validateElementPresence(String objectKey) {
		
		if(!isElementPresent(objectKey))
			fail("Element not found - "+objectKey);
		
		return getSession().getCurrentPage();
	}
	

	
	public OrangeHRMPage validateElementNotPresence(String objectKey) {
		
		if(isElementPresent(objectKey))
			fail("Element not found - "+objectKey);
		
		return getSession().getCurrentPage();
	}
	
	//true - present
	//false - not present
	public boolean isElementPresent(String objectKey) {
		By locator = getObject(objectKey);
		getSession().setExecuteListener(false);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}catch(TimeoutException e) {
			getSession().setExecuteListener(true);
			return false;
		}
		getSession().setExecuteListener(true);
		return true;
		
	}
	
	
	
	public void assertAll() {// control will come to stop the test.. some critical err
		// take screenshot
		softAssert.assertAll();
	}
	
	
	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
		
		
	}

	public OrangeHRMTestSession getSession() {
		return (OrangeHRMTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}

	public SoftAssert getSoftAssert() {
		return softAssert;
	}
	
	public By getObject(String objectKey) {
		log("Finding locator for "+objectKey);
		By locatorStrat = null;
			
		if(objectKey.endsWith("_id"))
			locatorStrat= By.id(prop.getProperty(objectKey));
		else if(objectKey.endsWith("_xpath"))
			locatorStrat= By.xpath(prop.getProperty(objectKey));
		else if(objectKey.endsWith("_name"))
			locatorStrat= By.name(prop.getProperty(objectKey));
		else if(objectKey.endsWith("_css"))
			locatorStrat= By.cssSelector(prop.getProperty(objectKey));
		
		
		return locatorStrat;
	}
	

	public void setSoftAssert(SoftAssert softAssert) {
		this.softAssert = softAssert;
	}
	
	public void log(String message) {
		getSession().log(message);
	}
	
	public void fail(String message) {
		// fail in extent reports
		getSession().failTest(message);
		
		// fail in testng
		softAssert.fail(message);
		
		// decide - if exec has to be stopped
		if(isStopExecution())
			assertAll();
	}
	
	
	
}
