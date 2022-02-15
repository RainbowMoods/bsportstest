package com.bbc.pages;

import com.bbc.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-identifier-input")
    WebElement usernameField;

    @FindBy(id = "password-input")
    WebElement passwordField;

    @FindBy(xpath = "//div[@id='form-message-username']")
    WebElement usernameError;

    @FindBy(id = "submit-button")
    WebElement submitButton;

    @FindBy(xpath = "//div[@id='form-message-general']")
    WebElement generalError;

    @FindBy(xpath = "//div[@id='form-message-password']")
    WebElement passwordError;

    public void signInWithUsernameAndPassword(String email, String password) {
        pmSendTextToElement(usernameField, email);
        pmSendTextToElement(passwordField, password);
    }

    public void clickOnSubmitSignInButton() {
        pmClickOnElement(submitButton);
    }

    public String getUsernameErrorMsg() {
        return pmGetTextFromElement(usernameError);
    }
    public String getPasswordErrorMsg() {
        return pmGetTextFromElement(passwordError);
    }
    public String getGeneralErrorMsg() {
        return pmGetTextFromElement(generalError);
    }
    public String getBlankPasswordMessage() {
        return pmGetTextFromElement(generalError);
    }
}
