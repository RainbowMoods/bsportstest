package com.bbc.pages;

import com.bbc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchResultPage.class.getName());

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }


   public void getResult () {
       List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@class='ssrcss-v19xcd-Stack e1y4nx260']//li//a"));
       int size = searchResult.size();
       System.out.println("**********************************************************************************");
       System.out.println("Total Search Result  :"+searchResult.size());
       System.out.println("**********************************************************************************");
       System.out.println("First Result in List:"+ searchResult.get(0).getText());
       System.out.println("Last Result in List :"+searchResult.get(size-1).getText());
       System.out.println("**********************************************************************************");

        }

}
