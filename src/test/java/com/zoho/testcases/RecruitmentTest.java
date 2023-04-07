package com.zoho.testcases;

import com.zoho.pages.normal.LaunchPage;
import com.zoho.session.OrangeHRMTestSession;
import com.zoho.util.DataUtil;
import com.zoho.util.Xls_Reader;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class RecruitmentTest {
    OrangeHRMTestSession session;
    String testName = "RequirmentTest";
    Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//Data.xlsx");

    @BeforeMethod
    public void init() {
        session = new OrangeHRMTestSession();
        session.init("RequirmentTest");

    }

    @AfterMethod
    public void quit() {
        session.generateReport();
    }

    @Test(dataProvider = "getData")
    public void TimesheetTest(Hashtable<String, String> data) {
        session.log(data.toString());

        if (!DataUtil.isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
            // skip in extent rep
            session.skipTest("Skipping the test as Runmode was NO");
            //skip - testng
            throw new SkipException("Skipping the test as Runmode was NO");
        }

        String username = data.get("Username");
        String password = data.get("Password");


        new LaunchPage()
                .openBrowser("chrome")
                .gotoLoginPage()
                .submitUsernameAndPassword(username, password)
                .gotoRecruitment()
                .addCandidatesdetails(data.get("FirstName"),data.get("MiddleName"),data.get("LastName"),data.get("Email"))
                .viewVacanciesdetails(data.get("Vacancy"),data.get("Description"),data.get("MangerName"));
    }

    @DataProvider
    public Object[][] getData() {
        return DataUtil.getData(testName, xls);
    }
}
