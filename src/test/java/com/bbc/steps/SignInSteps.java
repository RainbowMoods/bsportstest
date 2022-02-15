package com.bbc.steps;

import com.bbc.pages.Page1HomePage;
import com.bbc.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInSteps {
    @When("^I click on sign-in button$")
    public void iClickOnSignInButton() {
        new Page1HomePage().clickOnSignIn();
    }

    @And("^I enter invalid username and password \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterInvalidUsernameAndPassword(String email, String password) {
        new SignInPage().signInWithUsernameAndPassword(email, password);
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() {
        new SignInPage().clickOnSubmitSignInButton();
    }

    @Then("^I should see error message in username section\"([^\"]*)\"$")
    public void iShouldSeeErrorMessageInUsernameSection(String errormessage) {
        String actMsg = new SignInPage().getUsernameErrorMsg();
        Assert.assertEquals(actMsg, errormessage);
    }

    @And("^I enter invalid username and password for pwsection error \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInvalidUsernameAndPasswordForPwsectionErrorAnd(String email, String password) {
        new SignInPage().signInWithUsernameAndPassword(email, password);
    }

    @Then("^I should see error in password section \"([^\"]*)\"$")
    public void iShouldSeeErrorInPasswordSection(String error) {
        String act = new SignInPage().getBlankPasswordMessage();
        Assert.assertEquals(act, error);
    }
}