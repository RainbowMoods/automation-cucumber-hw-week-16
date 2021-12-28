package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressToCreateAccount;


    public void fillInEmailToCreateAccount() {
        String randomString = getRandomString(5);
        String email= "www."+randomString+"@gmail.com";
        doSendTextToElement(emailAddressToCreateAccount, email);
        log.info("fill in email: '" + email + "'");
    }

    public void clickOnCreateAccountButton(){
        doClickOnElement(createAccountButton);
        log.info("clicking on create account button: "+createAccountButton.getText()+"'");
    }

}
