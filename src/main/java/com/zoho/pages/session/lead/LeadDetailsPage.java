package com.zoho.pages.session.lead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.pages.session.OrangeHRMBaseSessionPage;

public class LeadDetailsPage extends OrangeHRMBaseSessionPage {
	
	@FindBy(css=Constants.LEAD_BACKBUTTON)
	public WebElement leadBackButton;
	
	public void validateleadDeails() {
		
	}
	
	public LeadsPage gotoLeadsPage() {
		leadBackButton.click();
		return new LeadsPage();
				
	}

}
