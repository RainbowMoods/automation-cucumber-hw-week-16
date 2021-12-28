package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='block_top_menu']//li")
    List<WebElement> menuBarLocatorByCustomXPath;

    @FindBy(xpath = "//header[@id='header']//div[2]//div//div//div[1]//a")
    WebElement signInOrSingOutLink;

    @FindBy(xpath = "//section[@id='block_various_links_footer']//ul//li//a")
    List<WebElement> listOfInformationLinks;


    public void selectInformation(String info){
        for (WebElement e : listOfInformationLinks){
            if(e.getText().equalsIgnoreCase(info)){
                doClickOnElement(e);
                break;
            }
        }
    }

    // click on sig in link
    public void clickOnSignInLink() {
        doClickOnElement(signInOrSingOutLink);
        log.info("click on sign in link"+signInOrSingOutLink.getText()+"'");
    }



    public void selectMenu(String menu){
        for(WebElement element : menuBarLocatorByCustomXPath){
            if(element.getText().trim().equals(menu)){
                element.click();
                log.info("selecting menu: '"+element.getText()+"'");
                break;
            }
        }
    }

    public void hoverMouseToMenu(String menu){
        for(WebElement element: menuBarLocatorByCustomXPath){
            if(element.getText().trim().equals(menu)){
                doMouseHoverTo(element);
                log.info("hovering mouse to menu: '"+element.getText()+"'");
                break;
            }
        }
    }

    public void hoverMouseAndClickOnSubMenu(String subMenu){
        for(WebElement element: menuBarLocatorByCustomXPath){
            if(element.getText().trim().equals(subMenu)){
                doMouseHoverAndClick(element);
                log.info("havering mouse to and click on submenu: '"+element.getText()+"'");
                break;
            }
        }
    }

}
