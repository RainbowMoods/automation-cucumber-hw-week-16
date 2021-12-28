package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.SignInPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class TestAccountCreationSteps {
    @Given("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @When("^I enter email for create account$")
    public void iEnterEmailForCreateAccount() {
        new SignInPage().fillInEmailToCreateAccount();
    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new SignInPage().clickOnCreateAccountButton();
    }

    @And("^I enter below details in the form$")
    public void iEnterBelowDetailsInTheForm(DataTable dataTable) {
        // here we use List of Map since we have headings in datatable in feature file
        List<Map<String, String>> form = dataTable.asMaps(String.class, String.class);

/*        // below passing index value instead of key value in string. though it worked -
        // it's not recommended since index value is in Integer and key is String
        String fName = form.get(0).get(0);
        String lName = form.get(0).get(1);
        String pass = form.get(0).get(2);
        String add = form.get(0).get(3);
        String cty = form.get(0).get(4);
        String st = form.get(0).get(5);
        String post = form.get(0).get(6);
        String ctry = form.get(0).get(7);
        String ph = form.get(0).get(8);*/


        // here we are passing row index (0) and key value -> can work this way too
        String fName = form.get(0).get("firstName");
        String lName = form.get(0).get("lastName");
        String pass = form.get(0).get("password");
        String add = form.get(0).get("address");
        String cty = form.get(0).get("city");
        String st = form.get(0).get("state");
        String post = form.get(0).get("postal");
        String ctry = form.get(0).get("country");
        String ph = form.get(0).get("phone");

        new CreateAccountPage().enterYourFirstName(fName);
        new CreateAccountPage().enterYourLastName(lName);
        new CreateAccountPage().enterYourPassword(pass);
        new CreateAccountPage().enterYourAddress(add);
        new CreateAccountPage().enterYourCity(cty);
        new CreateAccountPage().selectYourState(st);
        new CreateAccountPage().enterYourPostalCode(post);
        new CreateAccountPage().selectYourCountry(ctry);
        new CreateAccountPage().enterYourPhoneNumber(ph);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^I verify account name \"([^\"]*)\"$")
    public void iVerifyAccountName(String firstName) {
        new MyAccountPage().verifyAccountNameText(firstName);
    }

    @Then("^I verify the error message displayed which contains \"([^\"]*)\"$")
    public void iVerifyTheErrorMessageDisplayedWhichContains(String expectedText) {
        new CreateAccountPage().verifyErrorMessageDisplayed(expectedText);
    }

    @And("^I fill the form using one method$")
    public void iFillTheFormUsingOneMethod() {
        new CreateAccountPage().fillInFormWithOneXpath(
                "Micky", "Mouse", "password1");
    }

    @And("^I enter below details in the form using data table without heading$")
    public void iEnterBelowDetailsInTheFormUsingDataTableWithoutHeading(DataTable dataTable) {
      //  List<List<String>> form = dataTable.asLists(String.class);
        List<List<String>> form = dataTable.asLists(String.class);

        // first row index and then first data index - since we only have one row first index will be 0
            String fName = form.get(0).get(0);
            String lName = form.get(0).get(1);
            String pass = form.get(0).get(2);
            String add = form.get(0).get(3);
            String cty = form.get(0).get(4);
            String st = form.get(0).get(5);
            String post = form.get(0).get(6);
            String ctry = form.get(0).get(7);
            String ph = form.get(0).get(8);

        new CreateAccountPage().enterYourFirstName(fName);
        new CreateAccountPage().enterYourLastName(lName);
        new CreateAccountPage().enterYourPassword(pass);
        new CreateAccountPage().enterYourAddress(add);
        new CreateAccountPage().enterYourCity(cty);
        new CreateAccountPage().selectYourState(st);
        new CreateAccountPage().enterYourPostalCode(post);
        new CreateAccountPage().selectYourCountry(ctry);
        new CreateAccountPage().enterYourPhoneNumber(ph);
    }

    @And("^I enter below details in the form using data table without heading but in column$")
    public void iEnterBelowDetailsInTheFormUsingDataTableWithoutHeadingButInColumn(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);

        // since we have all data in first column, only row index will be changed- data column index will always be 0
        String fName = form.get(0).get(0);
        String lName = form.get(1).get(0);
        String pass = form.get(2).get(0);
        String add = form.get(3).get(0);
        String cty = form.get(4).get(0);
        String st = form.get(5).get(0);
        String post = form.get(6).get(0);
        String ctry = form.get(7).get(0);
        String ph = form.get(8).get(0);

        new CreateAccountPage().enterYourFirstName(fName);
        new CreateAccountPage().enterYourLastName(lName);
        new CreateAccountPage().enterYourPassword(pass);
        new CreateAccountPage().enterYourAddress(add);
        new CreateAccountPage().enterYourCity(cty);
        new CreateAccountPage().selectYourState(st);
        new CreateAccountPage().enterYourPostalCode(post);
        new CreateAccountPage().selectYourCountry(ctry);
        new CreateAccountPage().enterYourPhoneNumber(ph);
    }
}
