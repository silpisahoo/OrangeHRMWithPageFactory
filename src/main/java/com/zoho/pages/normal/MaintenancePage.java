package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenancePage extends OrangeHRMBasePage {
    public MaintenancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement confirmbtn;
    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement recordstopMenu;

    @FindBy(xpath = "//a[text()='Access Records']")
    WebElement accessrecordstopMenu;
    @FindBy(xpath = "//a[text()='Candidate Records']")
    WebElement candidatemenu;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement VacancyAutoSuggestion;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Searchbtn;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement downloadbtn;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[2]")
    WebElement purgeallbtn;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']")
    WebElement nothanksbtn;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement nameAutoSuggestion;

    public MaintenancePage loginTest(String passsword , String vacancyName){
        password.sendKeys(passsword);
        confirmbtn.click();
        getDriver().Scrolltoelement(recordstopMenu);
        recordstopMenu.click();
        candidatemenu.click();
        getDriver().Scrolltoelement(VacancyAutoSuggestion);
        VacancyAutoSuggestion.sendKeys(vacancyName);
        getDriver().Scrolltoelement(VacancyAutoSuggestion);
        VacancyAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        VacancyAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        VacancyAutoSuggestion.sendKeys(Keys.ENTER);
        Searchbtn.click();
        getDriver().Scrolltoelement(purgeallbtn);
        purgeallbtn.click();
        nothanksbtn.click();

return this;
    }
    public MaintenancePage AccessRecords(String empName){
        accessrecordstopMenu.click();
        getDriver().waitForElement(nameAutoSuggestion);
        nameAutoSuggestion.sendKeys(empName);
        getDriver().waitForElement(VacancyAutoSuggestion);
        VacancyAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        VacancyAutoSuggestion.sendKeys(Keys.ARROW_DOWN);
        VacancyAutoSuggestion.sendKeys(Keys.ENTER);
        Searchbtn.click();
        getDriver().Scrolltoelement(downloadbtn);
        downloadbtn.click();


        return this;
    }
}
