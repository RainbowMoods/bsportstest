package com.bbc.pages;

import com.bbc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page1HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page1HomePage.class.getName());

    public Page1HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='gel-layout gel-layout--center'])[2]")
    List<WebElement> frame;
    @FindBy(className = "se-searchbox__submit")
    WebElement searchButton;
    @FindBy(id = "orb-search-q")
    WebElement searchtab;
    @FindBy(xpath = ("//span[@id='idcta-username']"))
    WebElement signInButton;

    public void getAllGamesOnPage() {

        List<WebElement> allGames = driver.findElements(By.xpath("//span[@class=\"gs-u-display-none gs-u-display-block@m qa-full-team-name sp-c-fixture__team-name-trunc\"]"));

        if (allGames.size() == 0) {
            System.out.println("There is no game today");
        } else {
            for (WebElement link : allGames) {
                System.out.println("Teams playing today are :" + link.getText());
            }
        }
    }

    public void serchByText(String searchText) {
        pmMouseHoverAndClick(searchtab);
        pmSendTextToElement(searchtab, searchText);
    }

    public void clickOnSearchButton() {
        pmClickOnElement(searchButton);
    }

    public void clickOnSignIn() {
        pmClickOnElement(signInButton);
    }
}
