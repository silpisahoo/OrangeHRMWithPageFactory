package com.zoho.web;

import com.zoho.base.pages.OrangeHRMPage;

public interface OrangeHRMWebConnector {
	
	
	void logout();
	OrangeHRMPage validateTitle(String expectedTitle);
	OrangeHRMPage validateText(String objectKey, String expectedText);
	boolean isElementPresent(String objectKey);
	void validateLogin();
	OrangeHRMPage validateElementPresence(String objectKey);
	OrangeHRMPage validateElementNotPresence(String objectKey);
	


}
