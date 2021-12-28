Feature: Account Creation Test
  As a user I should be able to create account successfully

  @smoke @regression @underTest2
  Scenario: verify user is able to create account successfully
    Given I click on sign in link
    When I enter email for create account
    And  I click on create new account button
    And I enter below details in the form
      | firstName | lastName | password   | address           | city     | state | postal | country | phone      |
      | James     | Bond     | passworrd1 | James Bond street | New York | 1     | 10966  | 21      | 0199994653 |

    And I click on register button
    Then I verify account name "James"

  @smoke @regression
  Scenario: verify user is not able to create account successfully using invalid data in form
    Given I click on sign in link
    When I enter email for create account
    And  I click on create new account button
    And I enter below details in the form
      | firstName | lastName | password | address | city    | state | postal         | country | phone  |
      | xy        | %%       |          |         | 1234567 | 1     | PINCORRECTCODE | 21      | 198537 |
    And I click on register button
    Then I verify the error message displayed which contains "errors"

  @underTest1
  Scenario: verify user is not able to create account successfully using valid data in form but with the use of only one or two method to fill form and one xpath for all
    Given I click on sign in link
    When I enter email for create account
    And  I click on create new account button
    And I fill the form using one method

  @underTest2
  Scenario: verify user is able to create account successfully using data table without heading
    Given I click on sign in link
    When I enter email for create account
    And  I click on create new account button
    And I enter below details in the form using data table without heading
      | James | Bond | passworrd1 | James Bond street | New York | 1 | 10966 | 21 | 0199994653 |

    And I click on register button
    Then I verify account name "James"

  @underTest
  Scenario: verify user is able to create account successfully using data table without heading
    Given I click on sign in link
    When I enter email for create account
    And  I click on create new account button
    And I enter below details in the form using data table without heading but in column
      | James             |
      | Bond              |
      | passworrd1        |
      | James Bond street |
      | New York          |
      | 1                 |
      | 10966             |
      | 21                |
      | 0199994653        |

    And I click on register button
    Then I verify account name "James"