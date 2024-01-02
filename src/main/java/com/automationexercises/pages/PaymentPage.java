package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement cardNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvcField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement expMonthField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement expYearField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmTab;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderSuccessMsg;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueTab;

    public void enterNameInPaymentPage(String name){
        sendTextToElement(cardNameField, name);
        log.info("Entering name in card payment page" + cardNameField.toString());

    }
    public void enterCardNoInCardPaymentPage(String cardNo){
        sendTextToElement(cardNumField, cardNo);
        log.info("Entering card number in card payment page" + cardNumField.toString());

    }
    public void enterCVCInCardPaymentPage(String cvc){
        sendTextToElement(cvcField, cvc);
        log.info("Entering CVC in card payment page" + cvcField.toString());

    }
    public void enterMonthInCardPaymentPage(String mon){
        sendTextToElement(expMonthField, mon);
        log.info("Entering month in card payment page" + expMonthField.toString());

    }
    public void enterYearInCardPaymentPage(String year){
        sendTextToElement(expYearField, year);
        log.info("Entering year in card payment page" + expYearField.toString());

    }
    public void clickOnPayAndConfirmTab(){
        clickOnElement(payAndConfirmTab);
        log.info("Clicking on pay and confirm tab " + payAndConfirmTab.toString());
    }
    public String getTextFromOPrderSuccessMsg(){
        log.info("Getting text from success msg " + orderSuccessMsg.toString());
        return getTextFromElement(orderSuccessMsg);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
        log.info("Clicking on continue tab " + continueTab.toString());
    }

}
