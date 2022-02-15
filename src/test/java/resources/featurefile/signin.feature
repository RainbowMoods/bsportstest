@NegativeLoginScenarios
Feature: Negative sign in functionality

  Scenario Outline: Verify failed sign in error in Username Section with invalid username and invalid password
    Given I am on homepage of BBC Website
    When I click on sign-in button
    And I enter invalid username and password "<email>" "<password>"
    And I click on submit button
    Then I should see error message in username section"<usernameSectionError>"

    Examples:
      | email               | password   | usernameSectionError                                                                                  |
      |                     |            | Something's missing. Please check and try again.                                                      |
      | svbgs2hgh@gmail.com | Qwerty@123 | Sorry, we can’t find an account with that email. You can register for a new account or get help here. |
      | svbgs2hgh@gmail     | Qwerty@123 | Sorry, that email doesn’t look right. Please check it's a proper email.                               |

  Scenario Outline:  Verify failed sign in error in Password Section with invalid username and invalid password
    Given I am on homepage of BBC Website
    When I click on sign-in button
    And I enter invalid username and password for pwsection error "<emailId>" and "<password1>"
    And I click on submit button
    Then I should see error in password section "<passwordSectionError>"

    Examples:
      | emailId        | password1  | passwordSectionError                                               |
      | abcd@gmail.com | Qwerty@123 | Uh oh, that password doesn’t match that account. Please try again. |
      | abcd@gmail.com |            | Something's missing. Please check and try again.                   |
      |                | Qwerty@123 | Something's missing. Please check and try again.                   |
