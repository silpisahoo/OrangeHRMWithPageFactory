package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage extends OrangeHRMBasePage {
    public RecruitmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Addbtn;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement candidatefirstname;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement candidatemiddlename;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement candidatelastname;

    @FindBy(xpath = "//input[@placeholder='Type here']")
    WebElement candidategmailid;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement savebtn;

    @FindBy(xpath = "//a[text()='Vacancies']")
    WebElement vacanciesTopMenu;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addbtn;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement Vacancyname;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement Selectdropdown;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    WebElement descriptionbox;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement ManagerNameAutoSuggest;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement Resetbtn;
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement Deletebtn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']")
    WebElement Cancelbtn;


    public RecruitmentPage addCandidatesdetails(String firstName , String middleName, String lastName ,String gmailId) {

        getDriver().waitForElement(Addbtn);
        Addbtn.click();

        candidatefirstname.sendKeys(firstName);
        candidatemiddlename.sendKeys(middleName);
        candidatelastname.sendKeys(lastName);
        candidategmailid.sendKeys(gmailId);

        getDriver().waitForElement(savebtn);
        savebtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }

    public RecruitmentPage viewVacanciesdetails(String vName , String description ,String empName){
        vacanciesTopMenu.click();
        addbtn.click();
        Vacancyname.sendKeys(vName);
        Selectdropdown.click();
        getDriver().waitForElement(Selectdropdown);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ARROW_DOWN);
        Selectdropdown.sendKeys(Keys.ENTER);
        getDriver().waitForElement(descriptionbox);
        descriptionbox.sendKeys(description);
        ManagerNameAutoSuggest.sendKeys(empName);
        getDriver().waitForElement(ManagerNameAutoSuggest);
        ManagerNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        ManagerNameAutoSuggest.sendKeys(Keys.ARROW_DOWN);
        ManagerNameAutoSuggest.sendKeys(Keys.ENTER);
        savebtn.click();
        getDriver().waitForElement(vacanciesTopMenu);
        vacanciesTopMenu.click();
        Deletebtn.click();
        getDriver().waitForElement(Cancelbtn);
        Cancelbtn.click();
        getDriver().Scrolltoelement(Resetbtn);

        return this;
    }

    }

