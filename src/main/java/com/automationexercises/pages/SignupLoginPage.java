package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignupLoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement textNewUserSignup;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement signupName;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmail;
    @CacheLookup
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButton;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement textLoginAccount;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPassword;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement loginErrorMsg;


    @CacheLookup
    @FindBy(xpath = "//p[text()='Email Address already exist!']" )
    WebElement signUpErrorMsg;

    public String getTextFromNewUserSignup(){
        log.info("Getting text from New user signup " + textNewUserSignup.toString());
        return getTextFromElement(textNewUserSignup);
    }
    public void enterNameInNewUserSignup(String name){
        sendTextToElement(signupName, name);
        log.info("Sending name " + name +" to the name field " + signupName.toString());
    }
    public void enterEmailInNewUserSignup(String email){
        sendTextToElement(signupEmail,email);
        log.info("Sending email " + email +" to the email address field " + signupEmail.toString());
    }
    public void clickOnSignupButton(){
        clickOnElement(signupButton);
        log.info("Clicking on signup button " + signupButton.toString());
    }
    public String getTextFromLoginAccount(){
        log.info("Getting text from login to your account " + textLoginAccount.toString());
        return getTextFromElement(textLoginAccount);
    }
    public void enterEmailInLoginAccount(String email){
        sendTextToElement(loginEmail, email);
        log.info("Sending email " +email +" to the email field " + loginEmail.toString());
    }
    public void enterPasswordInLoginAccount(String password){
        sendTextToElement(loginPassword, password);
        log.info("Sending password " + password +" to the password field " + loginPassword.toString());
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on login button " + loginButton.toString());
    }
    public String getTextFromLoginErrorMsg(){
        log.info("Getting text from login error msg " + loginErrorMsg.toString());
        return getTextFromElement(loginErrorMsg);
    }

    public String getTextFromSignupErrorMsg(){
        log.info("Getting text from signup error msg " + signUpErrorMsg.toString());
        return getTextFromElement(signUpErrorMsg);
    }
}
