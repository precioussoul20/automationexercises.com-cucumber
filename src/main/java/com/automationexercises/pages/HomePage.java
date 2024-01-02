package com.automationexercises.pages;

import com.automationexercises.propertyreader.PropertyReader;
import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@href='/contact_us']")
    WebElement contactUsTab;
//    @CacheLookup
//    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
//    List<WebElement> headerTabs;
    @CacheLookup
    @FindBy(xpath = "//a[text()=' Test Cases']")
    WebElement testCasesTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement emailSubscription;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionEmailButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscribeSuccessfullyMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()=' Delete Account']")
    WebElement deleteAccountTab;
    @CacheLookup
    @FindBy(xpath = "//b[text()='Account Deleted!']")
    WebElement accDeleteText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUserText;
    @CacheLookup
    @FindBy(xpath = "(//a[@href='/products'])[1]")
    WebElement productTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutTab;


    public void verifyHomePage(){
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("Verifying homepage Url");
        AssertJUnit.assertEquals(expectedUrl,actualUrl);
    }

    public void clickOnContactUsTab(){
        clickOnElement(contactUsTab);
        log.info("Clicking on contact us tab " + contactUsTab.toString());
    }
//    public void clickOnHeaderTab(String option){
//        for (WebElement opt : headerTabs){
//            if (opt.getText().equalsIgnoreCase(option)) {
//                opt.click();
//                log.info("Clicking on " + option + "header tab " + headerTabs.toString());
//                break;
//            }
//        }
//
//    }
    public void clickOnTestCasesTab(){
        clickOnElement(testCasesTab);
        log.info("Clicking on test cases tab " + testCasesTab.toString());
    }
    public void scrollDownToFooter(){
       javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(subscriptionText);
        log.info("Scroll down to subscription text");
    }
    public String getTextForSubscription() {
        log.info("Verify Subscription text is displayed : " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }
    public void enterAnEmailToSubscriptionBox(String email) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(emailSubscription, email);
    }
    public void clickOnsubcriptionEmailButton(){
        clickOnElement(subscriptionEmailButton);
        log.info("Clicking on the subscribtion email button " + subscriptionEmailButton.toString());
    }
    public String verifyTheMessageSubscribeSuccessfully() {
        return getTextFromElement(subscribeSuccessfullyMessage);
    }


    public void clickOnCartTab(){
        clickOnElement(cartTab);
        log.info("Clicking on cart tab " + cartTab.toString());
    }
    public void clickOnSignupLoginTab(){
        clickOnElement(signupLoginTab);
        log.info("Clicking on signup/LoginTab tab " + signupLoginTab.toString());
    }
    public void clickOnDeleteAccountTab(){
        clickOnElement(deleteAccountTab);
        log.info("Clicking on delete account button " + deleteAccountTab.toString());
    }
    public String getTextFromAccountDeleted(){
        log.info("Getting text from account deleted " + accDeleteText.toString());
        return getTextFromElement(accDeleteText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueTab);
        log.info("Clicking on continue button " + continueTab.toString());
    }
    public String verifyLoggedInAsUserText(){
        log.info("Getting text from Logged user" + loggedInAsUserText.toString());
        return getTextFromElement(loggedInAsUserText);
    }
    public void clickOnProductsTab(){
        clickOnElement(productTab);
        log.info("Clicking on product tab " + productTab.toString());
    }
    public void clickOnLogoutTab(){
        clickOnElement(logoutTab);
        log.info("Clicking on logout tab " + logoutTab.toString());
    }

}
