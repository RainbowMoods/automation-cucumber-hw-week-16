package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.OurStoresPage;
import com.automationpractice.utility.Utility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMapSteps {
    @When("^I click on information link \"([^\"]*)\"$")
    public void iClickOnInformationLink(String infoLink)  {
        new HomePage().selectInformation(infoLink);
    }

    @Then("^I am able to drag map to Palm Beach Location and take screenshot$")
    public void iAmAbleToDragMapToPalmBeachLocationAndTakeScreenshot() throws InterruptedException {
        new OurStoresPage().clickOKFromAlert();
        new OurStoresPage().getXandYpoints();
        new OurStoresPage().dragMapToTarget();
        Thread.sleep(3000);
        Utility.takeScreenShot();
    }
}
