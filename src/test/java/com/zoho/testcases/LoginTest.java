package com.zoho.testcases;


import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.base.pages.Constants;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.util.DataUtil;
import com.zoho.util.Xls_Reader;

public class LoginTest {
	// passing of driver object
	// other objects
	// base page class size
	// object validations
	// multiple return types from a function/action
	// Pagefactory Design Pattern - passing the driver,create object, init of elements/objects
	
	// no need - driver.findElement
	
	OrangeHRMTestSession session;
	String testName="LoginTest";
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//Data.xlsx");
	
	// session has ExtentReports and ExtentTest
	// no declation of reports in test
	// failure - critical or not critical - reported in extent reports
	// screenshots in the reports
	
	@BeforeMethod
	public void init() {
		       // 1 - driver object
				// 1 - report object
				
				// 1 -  ZohoTestSession driver report
				// 1 -  TestContext
		session= new OrangeHRMTestSession();
		session.init("Login Test");
			
	}
	
	@AfterMethod
	public void quit() {

		session.generateReport();
	}
	
	@Test(dataProvider = "getData")
	public void loginTest(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!DataUtil.isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}

			String username = data.get("Username");
			String password=data.get("Password");
			String userNameValid=data.get("UsernameValid");
			
			new LaunchPage()
		    .openBrowser("chrome")
		    .gotoLoginPage()
		    .validator(false).validateTitle(Constants.LOGIN_PAGE_TITLE_KEY)// returns home page object , dont have to stop
		    //.validator(false).validateText(Constants.HOME_PAGE_TEXT_KEY,"ABC")// returns home page object , stop if validation fails
		    .validator(true).validateElementPresence(Constants.LOGIN_TEXT_KEY)
			.submitUsernameAndPassword(username, password)
					.validator(false).validateTitle(Constants.HOME_PAGE_TITLE_KEY);

	}
	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(testName, xls);
		
	}
}
