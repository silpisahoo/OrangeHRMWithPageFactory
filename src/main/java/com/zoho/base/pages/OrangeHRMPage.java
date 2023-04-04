package com.zoho.base.pages;

import java.util.Hashtable;

import com.zoho.pages.components.common.session.Header;
import com.zoho.pages.session.lead.LeadDetailsPage;
import com.zoho.pages.session.lead.LeadsPage;
import com.zoho.pages.session.task.TaskPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.web.WebConnector;

public interface OrangeHRMPage {


    void selectDateFromCalendar(String date);

	OrangeHRMPage openBrowser(String browser);
    OrangeHRMTestSession getSession();
    

    OrangeHRMPage gotoLoginPage();

    WebConnector validator(boolean flagAssertionType);


    void log(String message);














}
