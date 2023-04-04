package com.zoho.testcases;

import com.zoho.base.pages.Constants;
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

public class AdminSearchTest {
    OrangeHRMTestSession session;
    String testName="AdminSearchTest";
    Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//Data.xlsx");

    @BeforeMethod
    public void init() {
        session= new OrangeHRMTestSession();
        session.init("AdminSearchTest");

    }

    @AfterMethod
    public void quit() {
        session.generateReport();
    }

    @Test(dataProvider = "getData")
    public void searchEmployeeTest(Hashtable<String,String> data) {
        session.log(data.toString());

        if(!DataUtil.isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
            // skip in extent rep
            session.skipTest("Skipping the test as Runmode was NO");
            //skip - testng
            throw new SkipException("Skipping the test as Runmode was NO");
        }

        String username = data.get("Username");
        String password=data.get("Password");
        System.out.println("^^^^"+username);
        System.out.println("^^^^"+password);
        new LaunchPage()
                .openBrowser("chrome")
                .gotoLoginPage()
                .submitUsernameAndPassword(username, password)
                //.validator(false).validateTitle(Constants.HOME_PAGE_TITLE_KEY)
                .gotoAdmin()
                .SearchEmployee(data.get("EmployeeName"))
                .createUser(data.get("EmployeeName"),data.get("UserName"),data.get("UpdatePassword"),data.get("ConfirmPassword"))
                .searchaddedEmployeeDetails(data.get("UpdateEmployeeName"));
//                .jobTitleMenu(data.get("JobTitle"),data.get("Description"))
//                .organizationMenu()
//                .qualificationmenu(data.get("Skills"),data.get("Skilldescription"),data.get("Level"),data.get("Licenses"))
//                .nationalitiesMenu(data.get("NationName"))
//                .corporateBrandingMenu()
//                .configurationMenu(data.get("TestEmailid"));

    }

    @DataProvider
    public Object[][] getData(){
        return DataUtil.getData(testName, xls);

    }
}
