package com.zoho.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.asserts.SoftAssert;

import com.zoho.session.OrangeHRMTestSession;

public interface WebConnector extends OrangeHRMWebConnector {

	void openBrowser(String bName);
	void navigate(String url);
	void quit();
	EventFiringWebDriver getCurrentDriver();
	void waitForElementLoad();
	OrangeHRMTestSession getSession();
	boolean isStopExecution();
    void setStopExecution(boolean stopExecution);
    void assertAll();
    SoftAssert getSoftAssert();
	void setSoftAssert(SoftAssert softAssert);
	void log(String message);
	void fail(String message);
	void click(String object);
	public void Scrolltobuttom();
	public void Scrolltoelement(WebElement element);
	public void ScrolltoTop();
	void type(String objectKey,String data);
	void clear(String objectKey);
	void select(String objectKey,String data);
	By getObject(String objectKey);
	void waitForElement(WebElement element);
	
	
}
