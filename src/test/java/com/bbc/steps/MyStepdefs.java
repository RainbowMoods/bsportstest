package com.bbc.steps;

import com.bbc.pages.Page1HomePage;
import com.bbc.pages.SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on homepage of BBC Website$")
    public void iAmOnHomepageOfBBCWebsite() {
        System.out.println("I am on home page of BBC Sport website");
    }

    @Then("^I am able to see Output all team names with a match today,If there are no matches today, output a message to convey this\\.$")
    public void iAmAbleToSeeOutputAllTeamNamesWithAMatchTodayIfThereAreNoMatchesTodayOutputAMessageToConveyThis() {
        new Page1HomePage().getAllGamesOnPage();

    }

    @When("^I Search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0)  {
        new Page1HomePage().serchByText(arg0);
    }

    @And("^I click on Search tab$")
    public void iClickOnSearchTab() {
        new Page1HomePage().clickOnSearchButton();
    }

    @Then("^I can see sports news List$")
    public void iCanSeeSportsNewsList() {
        new SearchResultPage().getResult();
    }
}
