$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testaccountcreation.feature");
formatter.feature({
  "line": 1,
  "name": "Account Creation Test",
  "description": "As a user I should be able to create account successfully",
  "id": "account-creation-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13795387700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify user is able to create account successfully",
  "description": "",
  "id": "account-creation-test;verify-user-is-able-to-create-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@regression"
    },
    {
      "line": 4,
      "name": "@underTest2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on sign in link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter email for create account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on create new account button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter below details in the form",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "password",
        "address",
        "city",
        "state",
        "postal",
        "country",
        "phone"
      ],
      "line": 10
    },
    {
      "cells": [
        "Micky",
        "Mouse",
        "passwrod1",
        "The new street",
        "New York",
        "1",
        "10934",
        "21",
        "0192384755"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify account name \"Micky\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnSignInLink()"
});
formatter.result({
  "duration": 3472805300,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iEnterEmailForCreateAccount()"
});
formatter.result({
  "duration": 185916900,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnCreateNewAccountButton()"
});
formatter.result({
  "duration": 158212100,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iEnterBelowDetailsInTheForm(DataTable)"
});
formatter.result({
  "duration": 3121110100,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 3902933100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Micky",
      "offset": 23
    }
  ],
  "location": "TestAccountCreationSteps.iVerifyAccountName(String)"
});
formatter.result({
  "duration": 68934100,
  "status": "passed"
});
formatter.after({
  "duration": 1187693600,
  "status": "passed"
});
formatter.before({
  "duration": 9987193200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "verify user is not able to create account successfully using invalid data in form",
  "description": "",
  "id": "account-creation-test;verify-user-is-not-able-to-create-account-successfully-using-invalid-data-in-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smoke"
    },
    {
      "line": 16,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I click on sign in link",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter email for create account",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on create new account button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter below details in the form",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "password",
        "address",
        "city",
        "state",
        "postal",
        "country",
        "phone"
      ],
      "line": 22
    },
    {
      "cells": [
        "$$",
        "\u0026\u0026",
        "",
        "",
        "1234567",
        "1",
        "PINCORRECTCODE",
        "21",
        "1923755"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify the error message displayed which contains \"errors\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnSignInLink()"
});
formatter.result({
  "duration": 2586063400,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iEnterEmailForCreateAccount()"
});
formatter.result({
  "duration": 234157600,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnCreateNewAccountButton()"
});
formatter.result({
  "duration": 126488900,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iEnterBelowDetailsInTheForm(DataTable)"
});
formatter.result({
  "duration": 2600049400,
  "status": "passed"
});
formatter.match({
  "location": "TestAccountCreationSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 1824462000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "errors",
      "offset": 53
    }
  ],
  "location": "TestAccountCreationSteps.iVerifyTheErrorMessageDisplayedWhichContains(String)"
});
formatter.result({
  "duration": 54773200,
  "status": "passed"
});
formatter.after({
  "duration": 767324800,
  "status": "passed"
});
});