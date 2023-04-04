package com.zoho.pages.normal;

import com.zoho.base.pages.OrangeHRMBasePage;
import com.zoho.base.pages.OrangeHRMPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage extends OrangeHRMBasePage{

        public BuzzPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "//p[text()='Buzz Newsfeed']")
    WebElement buzzNewsFeedHeader;
    @FindBy(xpath = "//h6[text()='Buzz']")
    WebElement buzzHeader;


    @FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
    WebElement comment;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement postbtn;

    @FindBy(xpath = "//*[name()='svg' and @id='heart-svg']")
    WebElement likebtn;
    @FindBy(xpath = "//i[@class='oxd-icon bi-chat-text-fill']")
    WebElement commentbtn;
    @FindBy(xpath = "//input[@placeholder='Write your comment...']")
    WebElement commenttxt;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']")
    WebElement mostrecentdpost;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button']")
    WebElement mostlikedpost;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-post-filters-button'])[2]")
    WebElement mostCommentedpost;

    public BuzzPage BuzzNewsfeedtest( String statusUpdate ,String commentBox) {

        comment.sendKeys(statusUpdate);
        postbtn.click();
        getDriver().Scrolltoelement(likebtn);
        likebtn.click();
        commentbtn.click();
        getDriver().Scrolltoelement(commenttxt);
        commenttxt.sendKeys(commentBox);
        getDriver().Scrolltoelement(commenttxt);
        commenttxt.sendKeys(Keys.ENTER);

            return this;

    }
    public BuzzPage mostrecentposttest(){
        mostrecentdpost.click();
        return this;

    }
    public BuzzPage mostLikedposttest(){
        mostlikedpost.click();
        return this;

    }

    public BuzzPage mostComentedtest(){
        mostCommentedpost.click();
        return this;

    }
}
