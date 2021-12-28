package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.DressesPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ProductPage;
import com.automationpractice.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestShoppingCartSteps {
    @Given("^I select menu \"([^\"]*)\"$")
    public void iSelectMenu(String menu) {
        new HomePage().selectMenu(menu);
    }

    @When("^I click on selected product \"([^\"]*)\"$")
    public void iClickOnSelectedProduct(String product) {
        new DressesPage().selectProduct(product);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I click on proceed to checkout button$")
    public void iClickOnProceedToCheckoutButton() {
        new ProductPage().clickOnProceedToCheckoutButton();
    }

    @And("^I verify product is added to shopping cart$")
    public void iVerifyProductIsAddedToShoppingCart() throws InterruptedException {
        new ShoppingCartPage().verifyNumberOfProducts();
        Thread.sleep(2000);
    }

    @And("^I verify if delete button is available in shopping cart$")
    public void iVerifyIfDeleteButtonIsAvailableInShoppingCart() throws InterruptedException {
        new ShoppingCartPage().verifyDeleteButtonIsAvailable();
        Thread.sleep(2000);
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() throws InterruptedException {
        new ShoppingCartPage().clickOnDeleteButton();
        Thread.sleep(3000);
    }

    @Then("^I verify banner message \"([^\"]*)\"$")
    public void iVerifyBannerMessage(String expectedMessage) {
        new ShoppingCartPage().verifyMessageOfShoppingCartIsEmpty(expectedMessage);
    }
}
