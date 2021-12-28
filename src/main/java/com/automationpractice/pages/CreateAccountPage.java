package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#customer_firstname")
    WebElement firstNameLocator;
    @CacheLookup
    @FindBy(css = "#customer_lastname")
    WebElement lastNameLocator;
    @CacheLookup
    @FindBy(css = "#passwd")
    WebElement passwordLocator;
    @CacheLookup
    @FindBy(css = "#address1")
    WebElement addressLocator;
    @CacheLookup
    @FindBy(css = "#city")
    WebElement cityLocator;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")   //dropdown
    WebElement stateLocator;
    @CacheLookup
    @FindBy(css = "#postcode")
    WebElement postcodeLocator;
    @CacheLookup
    @FindBy(css = "#id_country")    //dropdown
    WebElement countryLocator;
    @CacheLookup
    @FindBy(css = "#phone_mobile")
    WebElement phoneNumberLocator;
    @CacheLookup
    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButtonLocator;
    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Create an account']")
    WebElement createAccountText;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement myAccountTextHeading;

    @FindBy(xpath = "//div[@class='alert alert-danger']//p")
    WebElement errorHeadingText;

    @CacheLookup
    @FindBy(xpath = "//form[@id='account-creation_form']//input")
    List<WebElement> oneXpathForFrom;

    public void fillInFormWithOneXpath(String first, String last, String pass) {
        for (WebElement e : oneXpathForFrom) {
            if (e.getAttribute("id").equals("customer_firstname")) {
                doSendTextToElement(e, first);
            }
            if (e.getAttribute("id").equals("customer_lastname")) {
                doSendTextToElement(e, last);
            }
            if (e.getAttribute("id").equals("passwd")) {
                doSendTextToElement(e, pass);
            }
        break;
        }
    }

    public void verifyErrorMessageDisplayed(String expectedText) {
        String actual = errorHeadingText.getText();
        boolean verifyError = actual.contains(expectedText);
        log.info("verifying error message: '" + errorHeadingText.getText() + "'");
        Assert.assertTrue(verifyError);
    }


    public void enterYourFirstName(String name) {

        doSendTextToElement(firstNameLocator, name);
        log.info("Entering First Name : '" + name + "'");
    }

    public void enterYourLastName(String surname) {
        doSendTextToElement(lastNameLocator, surname);
        log.info("Entering Last Name: '" + surname + "'");
    }

    public void enterYourPassword(String pass) {

        doSendTextToElement(passwordLocator, pass);
        log.info("Entering Password : '" + pass + "'");
    }

    public void enterYourAddress(String add) {

        doSendTextToElement(addressLocator, add);
        log.info("Entering address : '" + add + "'");
    }

    public void enterYourCity(String city) {
        doSendTextToElement(cityLocator, city);
        log.info("Entering city: '" + city + "'");
    }

    public void selectYourState(String st) {
        doSelectByValueFromDropDown(stateLocator, st);
        log.info("Entering State: '" + st + "'");
    }

    public void enterYourPhoneNumber(String phone) {
        doSendTextToElement(phoneNumberLocator, phone);
        log.info("Entering Phone number: '" + phone + "'");
    }

    public void enterYourPostalCode(String postal) {
        doSendTextToElement(postcodeLocator, postal);
        log.info("Entering postcode: '" + postal + "'");
    }

    public void selectYourCountry(String country) {
        doSelectByValueFromDropDown(countryLocator, country);
        log.info("Entering Country: '" + country + "'");
    }

    public void clickOnRegisterButton() {
        doClickOnElement(registerButtonLocator);
        log.info("click on register button");
    }
}
