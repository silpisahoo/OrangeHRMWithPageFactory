package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimePage extends OrangeHRMBasePage {
    public TimePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement TimesheetsTopMenu;

    @FindBy(xpath = "//a[text()='My Timesheets']")
    WebElement MyTimesheetTopMenu;

    @FindBy(xpath = "//a[text()='Employee Timesheets']")
    WebElement EmployeeTimesheetTopMenu;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement Editbtn;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    List<WebElement> txtentertime;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement employeeNameAutoSuggest;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement customerNameAutoSuggest;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement Projectadmin;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement projectAutoSuggestion;

    @FindBy(xpath = " //i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement activityDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Savebtn;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Viewbtn;

    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
    WebElement ProjectinfoTopMenu;

    @FindBy(xpath = "//a[text()='Customers']")
    WebElement CustomerTopMenu;
    @FindBy(xpath = "//a[text()='My Records']")
    WebElement myrecordsMenu;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Addbtn;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement CustomerName;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    WebElement Descriptiontext;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Savebtn2;

    @FindBy(xpath = "//a[text()='Projects']")
    WebElement ProjectTopMenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
    WebElement ReportsTopMenu;
    @FindBy(xpath = "//a[text()='Project Reports']")
    WebElement ProjectReportsTopMenu;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement viewbtn;
    @FindBy(xpath = "//a[text()='Employee Reports']")
    WebElement employeeResportsTopMenu;
    @FindBy(xpath = "//a[text()='Attendance Summary']")
    WebElement attendancesummaryTopMenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    WebElement attendanceTopMenu;
    @FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
    WebElement calenderbox;



    public TimePage selectMyTimesheet() {
        getDriver().waitForElement(TimesheetsTopMenu);
        TimesheetsTopMenu.click();
        getDriver().waitForElement(MyTimesheetTopMenu);

        MyTimesheetTopMenu.click();
        Editbtn.click();
        getDriver().waitForElement(Savebtn);


//            NameAutoSuggest.sendKeys(empName);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
//        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
//        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
//        Selectdropdown.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
//        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
//        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
//        Selectdropdown.sendKeys(Keys.ENTER);
        Savebtn.click();

        return this;
    }

//    public TimePage EnterTimeForTimesheet(String projectName) {
//        projectAutoSuggestion.sendKeys(projectName);
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        projectAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
//        projectAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
//        projectAutoSuggestion.sendKeys(Keys.ENTER);
//
//        activityDropdown.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        activityDropdown.sendKeys(Keys.ARROW_DOWN);
//        activityDropdown.sendKeys(Keys.ARROW_DOWN);
//        activityDropdown.sendKeys(Keys.ENTER);
//        for (int i = 2; i <=8 ; i++) {
//            txtentertime.get(i).clear();
//            txtentertime.get(i).sendKeys("9:00");
//
//        }
//        return this;
//    }

    public TimePage selectEmployeeTimesheet(String empName) {
        getDriver().waitForElement(TimesheetsTopMenu);
        TimesheetsTopMenu.click();
        getDriver().waitForElement(EmployeeTimesheetTopMenu);

        EmployeeTimesheetTopMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);

        Viewbtn.click();

        return this;
    }

    public TimePage Projectinfo(String empName, String description) {
        getDriver().waitForElement(ProjectinfoTopMenu);
        ProjectinfoTopMenu.click();
        getDriver().waitForElement(CustomerTopMenu);
        CustomerTopMenu.click();
        Addbtn.click();
        getDriver().waitForElement(CustomerName);
        CustomerName.sendKeys(empName);
        Descriptiontext.sendKeys(description);
        getDriver().waitForElement(Savebtn2);
        Savebtn2.click();

        return this;

    }

    public TimePage Projectinfoforproject(String Name, String customerName, String description, String projectAdmin) {
        getDriver().waitForElement(ProjectinfoTopMenu);
        ProjectinfoTopMenu.click();

        getDriver().waitForElement(ProjectinfoTopMenu);
        ProjectTopMenu.click();
        Addbtn.click();
        getDriver().waitForElement(CustomerName);
        CustomerName.sendKeys(Name);
        customerNameAutoSuggest.sendKeys(customerName);
        getDriver().waitForElement(customerNameAutoSuggest);
        customerNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        customerNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        customerNameAutoSuggest.sendKeys(Keys.ENTER);
        Descriptiontext.sendKeys(description);
        Projectadmin.sendKeys(projectAdmin);
        getDriver().waitForElement(Projectadmin);
        Projectadmin.sendKeys(Keys.ARROW_DOWN);
        Projectadmin.sendKeys(Keys.ARROW_DOWN);
        Projectadmin.sendKeys(Keys.ENTER);
        Savebtn.click();
        return this;
    }
    public TimePage Reports(String projectName , String empName){
        ReportsTopMenu.click();
        ProjectReportsTopMenu.click();
        projectAutoSuggestion.sendKeys(projectName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        projectAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        projectAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        projectAutoSuggestion.sendKeys(Keys.ENTER);
        viewbtn.click();
        getDriver().Scrolltobuttom();
        getDriver().waitForElement(ReportsTopMenu);
        ReportsTopMenu.click();
        employeeResportsTopMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        viewbtn.click();
        ReportsTopMenu.click();
        attendancesummaryTopMenu.click();
        getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        viewbtn.click();
        getDriver().Scrolltobuttom();

        return this;
    }
    public TimePage attendanceTopMenu(){
        attendanceTopMenu.click();
        myrecordsMenu.click();
        calenderbox.click();
        viewbtn.click();

        return this;
    }
}