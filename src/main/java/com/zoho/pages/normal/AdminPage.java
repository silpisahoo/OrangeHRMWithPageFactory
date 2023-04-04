package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AdminPage extends OrangeHRMBasePage {
    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeNameAutoSuggest;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchbtn;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement username;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement jobtitle;


    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addbtn;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement savebtn;
    //button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement Selectdropdown2;


    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordtxt;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmpasswordtxt;
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deletebtn;
    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    WebElement descriptionbox;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement submitbtn;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    WebElement jobtopmenu;
    @FindBy(xpath = "//a[text()='Job Titles']")
    WebElement jobtitlemenu;
    @FindBy(xpath = "//a[text()='Pay Grades']")
    WebElement paygrademenu;
    @FindBy(xpath = "//a[text()='Employment Status']")
    WebElement empstatusmenu;
    @FindBy(xpath = "//a[text()='Email Configuration']")
    WebElement cofiguremenu;
    @FindBy(xpath = "//a[text()='Email Subscriptions']")
    WebElement emailSubemenu;
    @FindBy(xpath = "//a[text()='Localization']")
    WebElement localizationmenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
    WebElement organizationmenu;
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[5]")
    WebElement configurationmenu;
    @FindBy(xpath = "//a[text()='General Information']")
    WebElement generalinfo;
    @FindBy(xpath = "//a[text()='Locations']")
    WebElement location;
    @FindBy(xpath = "//a[text()='Structure']")
    WebElement structure;
    @FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[2]")
    WebElement checkbox;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
    WebElement deletebttn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']")
    WebElement cancelbtn;
    //button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']
    @FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
    WebElement qualificationmenu;
    @FindBy(xpath = "//a[text()='Nationalities']")
    WebElement nationalitiesTopmenu;
    @FindBy(xpath = "//a[text()='Corporate Branding']")
    WebElement corporatebrandingTopmenu;
    @FindBy(xpath = "//a[text()='Skills']")
    WebElement skillmenu;
    @FindBy(xpath = "//a[text()='Education']")
    WebElement educationmenu;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement txtbox;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement txtmailbox;
    @FindBy(xpath = "//a[text()='Licenses']")
    public WebElement license;
    @FindBy(xpath = "//a[text()='Languages']")
    public WebElement Languagemenu;
    @FindBy(xpath = "//a[text()='Memberships']")
    public WebElement membershipmenu;
    @FindBy(xpath = "//div[@class='oxd-switch-wrapper']//span")
    public WebElement toggle;


    public AdminPage SearchEmployee(String empName){
        employeeNameAutoSuggest.sendKeys(empName);
        employeeNameAutoSuggest.click();
        getDriver().waitForElement(employeeNameAutoSuggest);

        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        getDriver().waitForElement(searchbtn);
          searchbtn.click();
        //   return lblValidationError.getText();
        return this;
    }
    public AdminPage createUser(String empName , String userName , String passWord , String confirmPassword){
        addbtn.click();
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        employeeNameAutoSuggest.sendKeys(empName);
        employeeNameAutoSuggest.click();
        getDriver().waitForElement(employeeNameAutoSuggest);

        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        Selectdropdown2.click();
        getDriver().waitForElement(Selectdropdown2);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ENTER);
        Random random=new Random();
        username.sendKeys(userName+random.nextInt(1000));
        passwordtxt.sendKeys(passWord);
        confirmpasswordtxt.sendKeys(confirmPassword);
        getDriver().waitForElement(savebtn);
        savebtn.click();
        return this;
    }
    public AdminPage searchaddedEmployeeDetails(String addedempName){
        getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(addedempName);
        employeeNameAutoSuggest.click();
        getDriver().waitForElement(employeeNameAutoSuggest);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        employeeNameAutoSuggest.sendKeys(Keys.ENTER);
        getDriver().waitForElement(searchbtn);
        searchbtn.click();
        getDriver().Scrolltoelement(deletebtn);
        deletebtn.click();
        submitbtn.click();

        return this;
    }
    public AdminPage jobTitleMenu( String jobTitle , String descriptionBox){
        jobtopmenu.click();
        jobtitlemenu.click();
        getDriver().waitForElement(addbtn);
        addbtn.click();
        getDriver().waitForElement(jobtitle);
        jobtitle.sendKeys(jobTitle);
        descriptionbox.sendKeys(descriptionBox);
        getDriver().Scrolltoelement(savebtn);
        savebtn.click();
        jobtopmenu.click();
        paygrademenu.click();
        getDriver().Scrolltoelement(jobtopmenu);
        jobtopmenu.click();
        empstatusmenu.click();

        return this;
    }
    public AdminPage organizationMenu(){
        organizationmenu.click();
        generalinfo.click();
        getDriver().Scrolltoelement(organizationmenu);
        organizationmenu.click();
        getDriver().Scrolltoelement(location);
        location.click();
        getDriver().Scrolltoelement(checkbox);
        checkbox.click();
        deletebttn.click();
        getDriver().Scrolltoelement(cancelbtn);
        cancelbtn.click();
        getDriver().Scrolltoelement(organizationmenu);
        organizationmenu.click();
        structure.click();

        return this;
    }
    public AdminPage qualificationmenu(String name,String description,String level,String licenses){
        qualificationmenu.click();
        skillmenu.click();
        addbtn.click();
        username.sendKeys(name);
        descriptionbox.sendKeys(description);
        savebtn.click();
        getDriver().Scrolltoelement(qualificationmenu);
        qualificationmenu.click();
        educationmenu.click();
        addbtn.click();
        txtbox.sendKeys(level);
        savebtn.click();
        getDriver().Scrolltoelement(qualificationmenu);
        qualificationmenu.click();
        license.click();
        addbtn.click();
        txtbox.sendKeys(licenses);
        savebtn.click();
        getDriver().Scrolltoelement(qualificationmenu);
        qualificationmenu.click();
        Languagemenu.click();
        getDriver().Scrolltoelement(qualificationmenu);
        qualificationmenu.click();
        membershipmenu.click();

        return this;
    }
    public AdminPage nationalitiesMenu(String nationName){
        nationalitiesTopmenu.click();
        addbtn.click();
        txtbox.sendKeys(nationName);

        savebtn.click();

        return this;
    }
    public AdminPage corporateBrandingMenu(){
        corporatebrandingTopmenu.click();

        return this;
    }
    public AdminPage configurationMenu(String testEmail){
        configurationmenu.click();
        cofiguremenu.click();
        getDriver().Scrolltoelement(toggle);
        toggle.click();
        txtmailbox.sendKeys(testEmail);
        savebtn.click();

        getDriver().Scrolltoelement(configurationmenu);
        configurationmenu.click();
        emailSubemenu.click();
        getDriver().Scrolltoelement(toggle);
        toggle.click();
        configurationmenu.click();
        localizationmenu.click();
        Selectdropdown2.click();
        getDriver().Scrolltoelement(Selectdropdown2);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown2.sendKeys(Keys.ENTER);
        savebtn.click();

        return this;
    }

    }
