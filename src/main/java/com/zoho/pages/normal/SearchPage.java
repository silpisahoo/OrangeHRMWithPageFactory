package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends OrangeHRMBasePage {
    public  SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[1]")
    WebElement gotoadmintab;
    @FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper'][2]")
    WebElement gotopimtab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[3]")
    WebElement gotoleavetab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[4]")
    WebElement gototimetab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[5]")
    WebElement gotorecruitmenttab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[6]")
    WebElement gotomyinfotab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[7]")
    WebElement gotoperformancetab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[8]")
    WebElement gotodasboardtab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[9]")
    WebElement gotodirectorytab;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[10]")
    WebElement gotomaintenancetab;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement confirmbtn;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[11]")
    WebElement gotobuzztab;
public OrangeHRMPage searchField(String passsword){
        gotoadmintab.click();
        gotopimtab.click();
        gotoleavetab.click();
        gototimetab.click();
        gotorecruitmenttab.click();
        gotomyinfotab.click();
        gotoperformancetab.click();
        gotodasboardtab.click();
        gotodirectorytab.click();
        gotomaintenancetab.click();
    password.sendKeys(passsword);
    confirmbtn.click();
        gotobuzztab.click();
        return this;
}
}
