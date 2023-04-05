package com.zoho.pages.normal;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;

public class HomePage extends OrangeHRMBasePage {

    public AdminPage gotoAdmin() {
        getDriver().click(Constants.ADMIN_LEFT_MENU);
        return new AdminPage(getSession().getCon().getCurrentDriver());
    }
    public PIMPage gotoPIM() {
        getDriver().click(Constants.PIM_LEFT_MENU);
        return new PIMPage(getSession().getCon().getCurrentDriver());
    }
    public LeavePage gotoleave() {

        getDriver().click(Constants.LEAVE_LEFT_MENU);
        return new  LeavePage((getSession().getCon().getCurrentDriver()));
    }
    public TimePage gotoTime() {

        getDriver().click(Constants.TIME_LEFT_MENU);
        return new TimePage((getSession().getCon().getCurrentDriver()));
    }
    public MyInfoPage gotoMyInfo() {

        getDriver().click(Constants.MYINFO_LEFT_MENU);
        return new MyInfoPage((getSession().getCon().getCurrentDriver()));
    }

    public PerformancePage gotoPerformance() {

        getDriver().click(Constants.PERFORMANCE_LEFT_MENU);
        return new PerformancePage((getSession().getCon().getCurrentDriver()));
    }
    public RecruitmentPage gotoRecruitment() {

        getDriver().click(Constants.RECRUITMENT_LEFT_MENU);
        return new RecruitmentPage((getSession().getCon().getCurrentDriver()));
    }

    public DirectoryPage gotoDirectory() {

        getDriver().click(Constants.DIRECTORY_LEFT_MENU);
        return new DirectoryPage((getSession().getCon().getCurrentDriver()));
    }

    public MaintenancePage gotoMaintenance() {

        getDriver().click(Constants.MAINTENANCE_LEFT_MENU);
        return new MaintenancePage((getSession().getCon().getCurrentDriver()));
    }

    public BuzzPage gotoBuzz() {

        getDriver().click(Constants.BUZZ_LEFT_MENU);
        return new BuzzPage((getSession().getCon().getCurrentDriver()));
    }
    public SearchPage gotoSearchtab() {

        getDriver().click(Constants.SEARCH_TAB_MENU);
        return new SearchPage((getSession().getCon().getCurrentDriver()));
    }
    }

