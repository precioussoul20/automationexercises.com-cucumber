package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignupPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    WebElement enterAccInfoText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Mrs']")
    WebElement radioMrs;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Mr']")
    WebElement radioMr;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dayField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newLetterBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialOfferBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1Field;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2Field;
    @CacheLookup
    @FindBy(xpath = "//select[@id='country']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement stateField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcodeField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumberField;
    @CacheLookup
    //FindBy(xpath = "//button[text()='Create Account']")
    //@FindBy(xpath = "//button[normalize-space()='Create Account']")
    //@FindBy(xpath = "(//button[@type='submit'])[1]")////button[normalize-space()='Create Account']
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccountTab;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;



    public String getTextFromEnterAccInfo(){
        log.info("Getting text from enter account info " + enterAccInfoText.toString());
        return getTextFromElement(enterAccInfoText);
    }
    public void clickOnMrsRadioButton(){
        clickOnElement(radioMrs);
        log.info("Clicking on Mrs radio button " + radioMrs.toString());
    }
    public void enterPasswordInSignupPage(String password){
        sendTextToElement(passwordField, password);
        log.info("Sending password " + password + " to the password field" + passwordField.toString() );
    }
    public void selectDayFromDropDown(String day){
        selectByVisibleTextFromDropDown(dayField,day);
        log.info("Selecting day from dropdown " + dayField.toString());
    }
    public void selectMonthFromDropDown(String month){
        selectByVisibleTextFromDropDown(monthField, month);
        log.info("Selecting month from dropdown " + monthField.toString());
    }
    public void selectYearFromDropDown(String year){
        selectByVisibleTextFromDropDown(yearField, year);
        log.info("Selecting year from dropdown " + yearField.toString());
    }
    public void clickOnNewsLetterBox(){
        clickOnElement(newLetterBox);
        log.info("Clicking on news letter box " + newLetterBox.toString());
    }
    public void clickOnSpecialOfferBox(){
        clickOnElement(specialOfferBox);
        log.info("Clicking on special offer box " + specialOfferBox.toString());
    }
    public void enterFirstNameInSignupPage(String fname){
        sendTextToElement(firstNameField,fname);
        log.info("Sending first name " + fname + " to the first name field " + firstNameField.toString());
    }
    public void enterlastNameInSignupPage(String lname){
        sendTextToElement(lastNameField,lname);
        log.info("Sending last name " + lname + " to the last name field " + lastNameField.toString());
    }
    public void enterAddress1InSignupPage(String address1){
        sendTextToElement(address1Field, address1);
        log.info("Sending  address1 " + address1 + "to the " + "to the address1 field " + address1Field.toString());
    }
    public void enterAddress2InSignupPage(String address2){
        sendTextToElement(address2Field,address2);
        log.info("Sending address2 " + address2 + "to the address2 field " + address2Field.toString());
    }
    public void selectCountryFromDropDown(String country){
        selectByValueFromDropDown(countryField,country);
        log.info("selecting country from dropdown " + countryField.toString());
    }
    public void enterStateInSignupPage(String state){
        sendTextToElement(stateField, state);
        log.info("Sending state name " + state + " to the state field " + stateField.toString());
    }
    public void enterCityInSignupPage(String city){
        sendTextToElement(cityField, city);
        log.info("Sending city name " + city + " to the city field " + cityField.toString());
    }
    public void enterZipcodeInSignupPage(String zipcode){
        sendTextToElement(zipcodeField, zipcode);
        log.info("Sending zipcode number " + zipcode + " to the zipcode field " + zipcodeField.toString());
    }
    public void enterMobileNumberInSignupPage(String mobileNum){
        sendTextToElement(mobileNumberField, mobileNum);
        log.info("Sending mobile number " + mobileNum + " to the mobile number field " + mobileNumberField.toString());
    }
//    public void clickOnCreateAccountButton(){
//        //clickOnElement(createAccountTab);
//        javaExecutorScriptExecuteScriptToClick(createAccountTab);
//        log.info("Clicking on create on account button " + createAccountTab.toString());
//    }
    public void clickOnCreateAccountButton(){
        //clickOnElement(createAccountTab);
        javaExecutorScriptExecuteScriptToClick(createAccountTab);
        log.info("Click on create an account button : " + createAccountTab.toString());
    }
    public String getTextFromAccountCreated(){
        log.info("Getting text from account created " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Clicking on continue button " + continueButton.toString());
    }
}
