package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement textAddressDetails;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement textReviewOrder;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement textAreaField;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderTab;

    public String getTextFromAddressDetails(){
        log.info("Getting text from address details " + textAddressDetails.toString());
        return getTextFromElement(textAddressDetails);
    }
    public String getTextFromReviewYourOrder(){
        log.info("Getting text from review your order " + textReviewOrder.toString());
        return getTextFromElement(textReviewOrder);
    }
    public void enterMessageInCommentArea(String msg){
        sendTextToElement(textAreaField, msg);
        log.info("Sending message in comments area " + textAreaField.toString());

    }
    public void clickOnPlaceOrderTab(){
        clickOnElement(placeOrderTab);
        log.info("Clicking on place order tab " + placeOrderTab.toString());
    }
}
