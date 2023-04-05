package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends OrangeHRMBasePage {
    public LeavePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Leave List']")
    WebElement leavelistTopMenu;

    @FindBy(xpath = "//a[text()='Apply']")
    WebElement ApplyTopMenu;

    @FindBy(xpath = "//a[text()='Assign Leave']")
    WebElement AssignleaveTopMenu;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement Selectdropdown2;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
    WebElement Selectdropdown3;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
    WebElement Selectdropdown4;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[5]")
    WebElement Selectdropdown5;

    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
    WebElement MoreOption;

    @FindBy(xpath = "//p[text()='Add Comment']")
    WebElement Adcomment;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement entitlmenttxt;


    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    WebElement commenthere;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement Savebtn;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Savebtn2;

    @FindBy(xpath = " //button[@type='reset']")
    WebElement Resetbtn;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement leaveTypeDropdown;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameAutoSuggest;



    @FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
    WebElement fromDate;

    @FindBy(xpath = "//*[contains(text(),'1')]")
    WebElement firstDayofMonth;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
    WebElement toDate;

    @FindBy(xpath = "//a[text()='My Leave']")
    WebElement myleaveTopMenu;
    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement entitlementTopMenu;
    @FindBy(xpath = "//a[text()='Add Entitlements']")
    WebElement addentitlementMenu;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']")
    WebElement Confirmbtn;
    @FindBy(xpath = "//a[text()='Employee Entitlements']")
    WebElement empentitlementMenu;
    @FindBy(xpath = "//a[text()='My Entitlements']")
    WebElement myentitlementMenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    WebElement ReportsTopMenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
    WebElement configureTopMenu;
    @FindBy(xpath = "//a[text()='Leave Entitlements and Usage Report']")
    WebElement leaveMenu;
    @FindBy(xpath = "(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]")
    WebElement checkbox;
    @FindBy(xpath = "//a[text()='My Leave Entitlements and Usage Report']")
    WebElement getMyleaveTopMenu;
    @FindBy(xpath = "//a[text()='Leave Period']")
    WebElement leaveperiodMenu;
    @FindBy(xpath = "//a[text()='Leave Types']")
    WebElement leavetypeMenu;
    @FindBy(xpath = "//a[text()='Work Week']")
    WebElement workweekMenu;
    @FindBy(xpath = "//a[text()='Holidays']")
    WebElement holidayMenu;







    public LeavePage AddLeaveComment(String comment){

        leavelistTopMenu.click();
        getDriver().Scrolltoelement(Resetbtn);
        MoreOption.click();
        Adcomment.click();
        commenthere.sendKeys(comment);
        getDriver().Scrolltoelement(Savebtn);
        Savebtn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }


    public LeavePage Applyleave( ){
       ApplyTopMenu.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }
    public LeavePage Assignleave(String empName ){
        AssignleaveTopMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        getDriver().Scrolltoelement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        Selectdropdown.click();
        getDriver().Scrolltoelement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        getDriver().Scrolltoelement(fromDate);
        fromDate.click();
        getDriver().Scrolltoelement(firstDayofMonth);
        firstDayofMonth.click();
        return this;
    }

    public LeavePage myleaveTab(){
        myleaveTopMenu.click();
        return this;
    }
    public LeavePage entitelmentsTopMenu(String empName , String text){
        entitlementTopMenu.click();
        addentitlementMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        getDriver().waitForElement(entitlmenttxt);
        entitlmenttxt.sendKeys(text);
        Savebtn2.click();
       Confirmbtn.click();
        getDriver().waitForElement(entitlementTopMenu);
        entitlementTopMenu.click();
        empentitlementMenu.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        Savebtn2.click();
        getDriver().waitForElement(entitlementTopMenu);
        entitlementTopMenu.click();
        myentitlementMenu.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        Savebtn2.click();
        return this;
    }
    public LeavePage reportsTopMenu(String empName){
        ReportsTopMenu.click();
        leaveMenu.click();
        getDriver().waitForElement(Selectdropdown3);
        Selectdropdown3.click();
        getDriver().waitForElement(Selectdropdown3);
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown3.sendKeys(Keys.ENTER);
        getDriver().waitForElement(Selectdropdown4);
        Selectdropdown4.click();
        getDriver().waitForElement(Selectdropdown4);
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown4.sendKeys(Keys.ENTER);
        getDriver().waitForElement(Selectdropdown5);
        Selectdropdown5.click();
        getDriver().waitForElement(Selectdropdown5);
        Selectdropdown5.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown5.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown5.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown5.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown5.sendKeys(Keys.ENTER);
        Savebtn2.click();
        checkbox.click();
        employeeNameAutoSuggest.sendKeys(empName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        Savebtn2.click();
        ReportsTopMenu.click();
        getMyleaveTopMenu.click();

        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);


        getDriver().waitForElement(Selectdropdown2);
        Selectdropdown2.click();
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ENTER);
        Savebtn2.click();

        return this;
    }
    public LeavePage configureTopMenu(){
        configureTopMenu.click();
        leaveperiodMenu.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        getDriver().waitForElement(configureTopMenu);

        configureTopMenu.click();
        leavetypeMenu.click();
        getDriver().waitForElement(configureTopMenu);
        configureTopMenu.click();
        workweekMenu.click();
        getDriver().waitForElement(configureTopMenu);
        configureTopMenu.click();
        holidayMenu.click();

        return this;
    }
}
