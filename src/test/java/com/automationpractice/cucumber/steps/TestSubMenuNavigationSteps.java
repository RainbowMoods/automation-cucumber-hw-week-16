package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSubMenuNavigationSteps {
    @Given("^I hover mouse to \"([^\"]*)\"$")
    public void iHoverMouseTo(String menu) {
        new HomePage().hoverMouseToMenu(menu);
    }

    @When("^I hover mouse and click on submenu \"([^\"]*)\"$")
    public void iHoverMouseAndClickOnSubmenu(String subMenu) {
        new HomePage().hoverMouseAndClickOnSubMenu(subMenu);
    }

    @Then("^I verify if heading of page is \"([^\"]*)\"$")
    public void iVerifyIfHeadingOfPageIs(String expectedText) {
        new SummerDressesPage().verifyHeadingText(expectedText);
    }

    @And("^I change the price range on slider of max price to \"([^\"]*)\"$")
    public void iChangeThePriceRangeOnSliderOfMaxPriceTo(String setMaxPrice)  {
        new SummerDressesPage().setSliderPriceTo(setMaxPrice);
    }

    @Then("^I verify if search results are priced withing the max price range \"([^\"]*)\"$")
    public void iVerifyIfSearchResultsArePricedWithingTheMaxPriceRange(String setMaxPrice)  {
        new SummerDressesPage().verifyIfListedProductsAreWithInSelectedPriceRange(setMaxPrice);
    }
}
