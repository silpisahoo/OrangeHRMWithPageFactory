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
import java.util.Random;

public class TimeTest {
    OrangeHRMTestSession session;
    String testName = "TimeTest";
    Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//Data.xlsx");

    @BeforeMethod
    public void init() {
        session = new OrangeHRMTestSession();
        session.init("TimeTest");

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
        Random random=new Random();
        int num= random.nextInt(100000);
        new LaunchPage()
                .openBrowser("chrome")
                .gotoLoginPage()
                .submitUsernameAndPassword(username, password)
                .gotoTime()
               .selectMyTimesheet()
            //   .EnterTimeForTimesheet(data.get("ProjectName"))

              .selectEmployeeTimesheet(data.get("EmployeeName"))
               .Projectinfo(data.get("Name")+num, data.get("Description") )
                .Projectinfoforproject(data.get("Name"), data.get("CustomerName"), data.get("Description"), data.get("ProjectAdmin") )
               .Reports(data.get("ProjectName"),data.get("EmployeeName"));




    }

    @DataProvider
    public Object[][] getData() {
        return DataUtil.getData(testName, xls);
    }
}
