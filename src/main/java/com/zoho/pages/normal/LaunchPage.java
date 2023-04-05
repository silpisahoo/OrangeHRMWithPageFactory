package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;

public class LaunchPage extends OrangeHRMBasePage {
	
	

    public LaunchPage openBrowser(String browser) {
    	getDriver().openBrowser("browser");
    	return this;
    }
    
	public LoginPage gotoLoginPage() {
		log("Navigaing to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getDriver().navigate(Constants.URK_KEY);
		return new LoginPage();
	}



}
