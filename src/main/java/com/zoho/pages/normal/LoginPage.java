package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends OrangeHRMBasePage {


	@FindBy(id=Constants.PASSWORD)
	WebElement loginPassword;

	@FindBy(xpath=Constants.LOGIN_BUTTON)
	WebElement loginButton;



	public HomePage submitUsernameAndPassword(String userid, String password) {
		waitForPageToLoad();
		getDriver().type(Constants.USERNAME_FIELD_KEY, userid);
		getDriver().type(Constants.PASSWORD_FIELD_KEY, password);
		getDriver().click(Constants.LOGIN_BUTTON_KEY);

		return new HomePage();
		//validate





	}
	
}
