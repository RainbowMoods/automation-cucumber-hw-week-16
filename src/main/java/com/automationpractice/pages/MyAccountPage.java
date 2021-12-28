package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='nav']//div[@class='row']//div[1]//a//span")
    WebElement accountNameText;

    public void verifyAccountNameText(String accountName) {
        boolean actual = accountNameText.getText().contains(accountName);
        log.info("verifying account name text: "+accountNameText.getText()+"'");
        Assert.assertTrue(actual);
    }


}
