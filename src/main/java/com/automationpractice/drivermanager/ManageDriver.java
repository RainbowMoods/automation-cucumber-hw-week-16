package com.automationpractice.drivermanager;

import com.automationpractice.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageDriver {


    // CUCUMBER NOTES-for log4j reports - below Logger statement is for log4j reporting purpose - you can use log.info() for reportin in each method in this class
    private static final Logger log = LogManager.getLogger(ManageDriver.class.getName());

    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    public String secondsInString = PropertyReader.getInstance().getProperty("implicitlyWait");
    public long seconds = Long.parseLong(secondsInString);

    // CUCUMBER NOTES-for log4j- reports -log4j2.properties configuration connectivity defined in constructor under manage driver.
    public ManageDriver() {
        PageFactory.initElements(driver,this);
        // configuring log4j properties file- giving file path to read from
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/resources/propertiesfile/log4j2.properties");
    }

    // browser selection
    public void selectBrowser(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                log.info("Launching Chrome Browser");
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                log.info("Launching FireFox Browser");
                driver = new FirefoxDriver();
                break;

            case "ie":
                WebDriverManager.iedriver().setup();
               log.info("Launching Internet Explorer Browser");
                driver = new InternetExplorerDriver();
                break;

            case "opera":
                WebDriverManager.operadriver().setup();
               log.info("Launching Opera Browser");
                driver = new OperaDriver();
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                log.info("Launching Safari Browser");
                driver = new SafariDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
