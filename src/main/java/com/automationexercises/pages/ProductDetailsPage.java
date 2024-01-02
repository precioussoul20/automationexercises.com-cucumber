package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductDetailsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//h2[normalize-space()='Stylish Dress'])[1]")
    WebElement stylishDressText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantityProduct;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartTab;

    @CacheLookup
    @FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    WebElement viewStylishDress;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement textBlueTop;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement textCategory;
    @CacheLookup
    @FindBy(xpath = "Availability: In Stock")
    WebElement textAvailability;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement textCondition;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement textBrand;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement nameInReview;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailInReview;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement reviewMsgField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submitButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement successMessageForReview;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement textPrice;

    public String getTextFromStylishDress(){
        log.info("Getting text from stylish dress " + stylishDressText.toString());
        return getTextFromElement(stylishDressText);
    }
   public void updateQuantityField(String quantity){
        clickOnElement(quantityProduct);
        quantityProduct.clear();
        sendTextToElement(quantityProduct, quantity);
        log.info("Updating the quantity " + quantityProduct.toString());
    }
    public void clickOnAddToCartTab(){
        clickOnElement(addToCartTab);
        log.info("Clicking on add to cart tab " + addToCartTab.toString());
    }
    public void clickOnViewCartOfStylishDress(){
        clickOnElement(viewStylishDress);
        log.info("Clicking on viw cart of stylish dress " + viewStylishDress.toString());
    }
    public String getTextFromBlueTop(){
        log.info("Getting text from blue top " + textBlueTop.toString());
        return getTextFromElement(textBlueTop);
    }
    public String getTextFromProductCategory(){
        log.info("Getting text product category " + textCategory.toString());
        return getTextFromElement(textCategory);
    }
    public String getTextFromProductAvailability(){
        log.info("Getting text product availability " + textAvailability.toString());
        return getTextFromElement(textAvailability);
    }
    public String getTextFromProductCondition(){
        log.info("Getting text product condition " + textCondition.toString());
        return getTextFromElement(textCondition);
    }
    public String getTextFromProductBrand(){
        log.info("Getting text product Brand " + textBrand.toString());
        return getTextFromElement(textBrand);
    }
    public void enterNameInReviewField(String name){
        sendTextToElement(nameInReview, name);
        log.info("Entering the name in review field" + nameInReview.toString());
    }
    public void enterMsgInReviewField(String msg){
        sendTextToElement(reviewMsgField, msg);
        log.info("Entering msg in review field " + reviewMsgField.toString());
    }
    public void clickOnSubmitButtom(){
        clickOnElement(submitButton);
        log.info("Clicking on submit button " + submitButton.toString());
    }
    public void enterEmailInReviewField(String email){
        sendTextToElement(emailInReview,email);
        log.info("Entering the email in review field" + emailInReview.toString());
    }
    public String verifyThatThankYouForReviewMessage() {
        log.info("Verify that Thank you for review Message: " + successMessageForReview.toString());
        return getTextFromElement(successMessageForReview);
    }
    public String verifyProductPrice(String price) {
        log.info("Verify product price " + textPrice.toString());
        return getTextFromElement(textPrice);
    }

}
