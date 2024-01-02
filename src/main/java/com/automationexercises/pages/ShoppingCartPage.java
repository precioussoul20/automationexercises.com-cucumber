package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//li[@class='active'])[1]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Blue Top'])[1]")
    WebElement blueTopText;
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Men Tshirt'])[1]")
    WebElement menTshirtText;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='4'])[1]")
    WebElement quantity4Text;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
    WebElement tabX;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement textCartEmpty;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutTab;




    public String getTextFromBlueTop(){
        log.info("Getting text from blue top " + blueTopText.toString());
        return getTextFromElement(blueTopText);
    }
    public String getTextFromMenTshirt(){
        log.info("Getting text from men tshirt " + menTshirtText.toString());
        return getTextFromElement(menTshirtText);
    }
    public String getTextFromQuantityField(){
        log.info("Getting text from quantity field " + quantity4Text.toString());
        return getTextFromElement(quantity4Text);
    }
    public String getTextFromShoppingCart(){
        log.info("Getting text from shopping cart " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public void clickOnXTab(){
        clickOnElement(tabX);
        log.info("Clicking on X tab " + tabX.toString());
    }
    public String getTextFromCartEmpty(){
        log.info("Getting text from cart is empty " + textCartEmpty.toString());
        return getTextFromElement(textCartEmpty);
    }
    public void clickOnProceedToCheckoutTab(){
        clickOnElement(proceedToCheckoutTab);
        log.info("Clicking on proceed to checkout tab " + proceedToCheckoutTab.toString());
    }

}
