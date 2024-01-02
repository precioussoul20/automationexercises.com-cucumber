package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@name='name']")
   // @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    WebElement contactName;
    @CacheLookup
    @FindBy(xpath = "//input[@name='email']")
    //@FindBy(xpath = "//input[@placeholder='Name'")
    WebElement contactEmail;
    @CacheLookup
    @FindBy(xpath = "//input[@name='subject']")
    //@FindBy(xpath = "//input[@type='email' and @name='email']")
    WebElement contactSubject;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement contactMessage;
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFile;
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeTab;

    public String getTextFromGetInTouch() {
        log.info("Getting text get in touch " + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    public void enterNameInContactUs(String name) {
        sendTextToElement(contactName, name);
        log.info("Entering name " + name + "to name field " + contactName.toString());
    }

    public void enterEmailInContactUs(String email) {
        sendTextToElement(contactEmail, email);
        log.info("Entering email " + email + "to email field " + contactEmail.toString());
    }

    public void enterSubjectInContactUs(String subject) {
        sendTextToElement(contactSubject, subject);
        log.info("Entering subject " + subject + "to subject field " + contactSubject.toString());
    }

    public void enterMessageInContactUs(String message) {
        sendTextToElement(contactMessage, message);
        log.info("Entering message " + message + "to message field " + contactMessage.toString());
    }

    public void uploadFile() {
        uploadFile.sendKeys("C:/Users/pjeth/OneDrive/Desktop/Screenshots");
        log.info("Clicking on upload file " + uploadFile.toString());
    }

    public void clickOnSubmitButton() {
        clickOnElement(submitTab);
        log.info("clicking on submit tab " + submitTab.toString());
    }

    public void acceptPopUp() {
        acceptAlert();
        log.info("Accepting alert");
    }

    public String getsuccessMessage() {
        log.info("Getting success message " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnHomeTab() {
        clickOnElement(homeTab);
        log.info("Clicking on home tab " + homeTab.toString());
    }
}
