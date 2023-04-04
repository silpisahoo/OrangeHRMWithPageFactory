package com.zoho.base.pages;

import java.util.Hashtable;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.pages.components.common.session.Header;
import com.zoho.pages.session.lead.LeadDetailsPage;
import com.zoho.pages.session.lead.LeadsPage;
import com.zoho.pages.session.task.TaskPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.web.WebConnector;

public class OrangeHRMBasePage implements OrangeHRMPage {

	
	public OrangeHRMBasePage() {// page class object is created
		System.out.println("----------ZohoBase Page Consructor-------");
		//PageFactory.initElements(getCurrentDriver(), this);
		// set the page in the session
		getSession().setCurrentPage(this);
		//getSession().takeScreenShot();
	}
	
	
	public OrangeHRMPage openBrowser(String browser) {
		System.out.println("ZohoBasePage openBrowser");
		return null;
	}

	public WebConnector validator(boolean stopExecution) {
		   // update the flag in web layer
		    getSession().getCon().setStopExecution(stopExecution);
			return getSession().getCon();
	}
	
	public OrangeHRMTestSession getSession() {
		return (OrangeHRMTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}

	@Override
	public OrangeHRMPage gotoLoginPage() {
		return null;
	}

	public WebConnector getDriver() {
		return getSession().getCon();
	}
	
	public EventFiringWebDriver getCurrentDriver() {
		return getSession().getCon().getCurrentDriver();
	}
	
	public void log(String message) {
		getSession().log(message);
	}


	public OrangeHRMPage validateIntermediatePageOptions() {
		return null;
	}

    public void selectDateFromCalendar(String date) {
    }
	
		
	public void waitForPageToLoad(){

	}
	
	public void wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
