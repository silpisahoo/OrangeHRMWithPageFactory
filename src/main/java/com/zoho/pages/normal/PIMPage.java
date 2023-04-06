package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage extends OrangeHRMBasePage {


        @FindBy(className = "oxd-button")
        public List<WebElement> btnAddEmployee;

        @FindBy(name = "firstName")
        WebElement txtFirstName;

        @FindBy(xpath = "//a[text()='Add Employee']")
        WebElement addEmployeeTopMenu;
    @FindBy(xpath = "//a[text()='Reports']")
    WebElement reportsTopMenu;
    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement ConfigureTopMenu;


    @FindBy(xpath = "//div[@class='orangehrm-tabs-wrapper'][2]")
        WebElement ContactDetails;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
        WebElement txtStreet1;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
        public WebElement txtCity;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
        public WebElement txtState;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
        public WebElement txtZip;

        @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
        public WebElement txtMobileno;
        @FindBy(xpath = "//button[@type='submit']")
        public List <WebElement>  btnsSave;


        @FindBy(name = "lastName")
        WebElement txtLastName;


        @FindBy(className = "oxd-switch-input")
        public WebElement toggleButton;

        @FindBy(xpath = "//input[@placeholder='Type for hints...']")
        public WebElement employeeNameAutoSuggest;


        @FindBy(css = "[type = submit]")
        WebElement btnSubmit;

        @FindBy(xpath = "(//button[@type='submit'])[2]")
        WebElement btnSave1;

        @FindBy(className = "oxd-main-menu-item--name")
        public List<WebElement> myInfo;

        @FindBy(className = "oxd-select-text-input")
        public List <WebElement>  dropdownBox;

        @FindBy(className = "oxd-radio-input")
        public List <WebElement> radioButton;

        @FindBy(className = "oxd-input-field-error-message")
        public WebElement lblValidationError;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
    WebElement Selectdropdown;
    @FindBy(xpath = "//a[text()='Dependents']")
    WebElement dependentMenu;
    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    WebElement emrgcont;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")
    WebElement addbtn;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addbtn2;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement name;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement relationship;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    WebElement mobileno;
   // @FindBy(xpath = "(//button[@type='submit'])[1]")
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement savebtn;
    @FindBy(xpath = "//a[text()='Immigration']")
    WebElement immigrationMenu;
    @FindBy(xpath = "//a[text()='Job']")
    WebElement jobMenu;
    @FindBy(xpath = "//a[text()='Salary']")
    WebElement salaryMenu;
    @FindBy(xpath = "//a[text()='Tax Exemptions']")
    WebElement taxMenu;
    @FindBy(xpath = "//a[text()='Report-to']")
    WebElement reporttoMenu;
    @FindBy(xpath = "//a[text()='Optional Fields']")
    WebElement optfield;
    @FindBy(xpath = "//a[text()='Custom Fields']")
    WebElement customfield;
    @FindBy(xpath = "//a[text()='Qualifications']")
    WebElement qualificationMenu;
    @FindBy(xpath = "//a[text()='Memberships']")
    WebElement membershipMenu;

        public PIMPage(WebDriver driver){
            PageFactory.initElements(driver, this);
        }

        public OrangeHRMPage checkIfUserExists(String username){
            employeeNameAutoSuggest.sendKeys(username);
            getDriver().waitForElement(employeeNameAutoSuggest);
            employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
            employeeNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
            employeeNameAutoSuggest.sendKeys(Keys.ENTER);
            //   return lblValidationError.getText();
            return this;
        }

        public PIMPage createEmployee(String firstName, String lastName, String employeeID){

            addEmployeeTopMenu.click();
            txtFirstName.sendKeys(firstName);
            txtLastName.sendKeys(lastName);
            getDriver().waitForElement(btnSubmit);
            btnSubmit.click();
            return this;
        }
    public PIMPage saveEmployeePersonalDetails()  {

        getDriver().Scrolltobuttom();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        btnsSave.get(0).click();
        return this;
    }

    public PIMPage createEmployeeContanctDetails(String street1, String city, String state,String zip,String mobileno){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getDriver().ScrolltoTop();
        ContactDetails.click();
        getDriver().waitForElement(txtStreet1);
        txtStreet1.sendKeys(street1);

        txtCity.sendKeys(city);

        txtState.sendKeys(state);
        System.out.println("AAAA");
        txtZip.sendKeys(zip);
        System.out.println("AAAA");
        txtMobileno.sendKeys(mobileno);
        System.out.println("AAAA");
        getDriver().waitForElement(btnSubmit);
        btnSubmit.click();
        return this;
    }

    public PIMPage emergencyContact(String empnamr , String relationshipName ,String mobileNo){

        emrgcont.click();
        getDriver().waitForElement(addbtn);
        addbtn.click();
        getDriver().waitForElement(name);
        name.sendKeys(empnamr);
        relationship.sendKeys(relationshipName);
        mobileno.sendKeys(mobileNo);
        btnSubmit.click();

        return this;
    }
    public PIMPage dependent(String dependentname ){

        dependentMenu.click();
        getDriver().waitForElement(addbtn);
        addbtn.click();
        getDriver().waitForElement(name);
        name.sendKeys(dependentname);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        savebtn.click();

        return this;
    }
    public PIMPage immigration( ){
        immigrationMenu.click();
        return this;
    }
    public PIMPage job(){
        jobMenu.click();
        return this;
    }
    public PIMPage salaryPage(){
        salaryMenu.click();
        return this;
    }
    public PIMPage taxPage(){
        taxMenu.click();
        return this;
    }
    public PIMPage reportPage(){
        reporttoMenu.click();
        return this;
    }
    public PIMPage qualificationPage(){
        qualificationMenu.click();
        return this;
    }
    public PIMPage membershipPage(){
        membershipMenu.click();
        return this;
    }
    public PIMPage reportpage(String reportName){
        reportsTopMenu.click();
        getDriver().waitForElement(addbtn2);
        addbtn2.click();
        getDriver().waitForElement(name);
        name.sendKeys(reportName);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        getDriver().waitForElement(savebtn);
        savebtn.click();
            return this;
    }
    public PIMPage configurationPage(){
        ConfigureTopMenu.click();
        optfield.click();
        savebtn.click();
        ConfigureTopMenu.click();
        customfield.click();

        return this;
    }
}
