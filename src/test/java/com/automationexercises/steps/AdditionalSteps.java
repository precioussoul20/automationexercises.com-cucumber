package com.automationexercises.steps;

import com.automationexercises.pages.ContactUsPage;
import com.automationexercises.pages.HomePage;
import com.automationexercises.pages.TestCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdditionalSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        new HomePage().verifyHomePage();
    }

    @When("I click on Contact Us button")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnContactUsTab();
    }

    @Then("I should see text GET IN TOUCH on contact us page")
    public void iShouldSeeTextGETINTOUCHOnContactUsPage() {
        Assert.assertEquals(new ContactUsPage().getTextFromGetInTouch(),"GET IN TOUCH", "Error");
    }

    @And("I enter name {string} in name field")
    public void iEnterNameInNameField(String name) {
        new ContactUsPage().enterNameInContactUs(name);
    }

    @And("I enter email {string} in email address field")
    public void iEnterEmailInEmailAddressField(String email) {
        new ContactUsPage().enterEmailInContactUs(email);
    }

    @And("I enter subject {string} in subject field")
    public void iEnterSubjectInSubjectField(String subject) {
        new ContactUsPage().enterSubjectInContactUs(subject);
    }

    @And("I enter message {string} in message field")
    public void iEnterMessageInMessageField(String message) {
        new ContactUsPage().enterMessageInContactUs(message);
    }

    @And("I Upload file")
    public void iUploadFile() {
        new ContactUsPage().uploadFile();
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I click on OK button")
    public void iClickOnOKButton() {
        new ContactUsPage().acceptPopUp();
    }

//    @Then("I should see message {string}")
//    public void iShouldSeeMessageSuccessYourDetailsHaveBeenSubmittedSuccessfully() {
//        Assert.assertEquals(new ContactUsPage().getsuccessMessage(), "Success! Your details have been submitted successfully.", "Error");
//    }

    @And("I click on Home button and verify that i am on homepage successfully")
    public void iClickOnHomeButtonAndVerifyThatIAmOnHomepageSuccessfully() {
        new ContactUsPage().clickOnHomeTab();
        new HomePage().verifyHomePage();

    }

    @When("I click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new HomePage().clickOnTestCasesTab();
    }

    @Then("I should be navigated to test cases page successfully")
    public void iShouldBeNavigatedToTestCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().getTextFromTextCases(), "TEST CASES", "Error");
    }

    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownToFooter();
    }

//    @Then("I should see text {string}")
//    public void iShouldSeeTextSUBSCRIPTION() {
//        Assert.assertEquals(new HomePage().getTextFromSubscription(), "SUBSCRIPTION", "Error");
//    }

    @And("I enter email address {string} in input field")
    public void iEnterEmailAddressInInputField(String email) throws InterruptedException {
        new HomePage().enterAnEmailToSubscriptionBox(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnsubcriptionEmailButton();
    }

//    @Then("I should see success message {string}")
//    public void iShouldSeeSuccessMessageYouHaveBeenSuccessfullySubscribed() {
//        Assert.assertEquals(new HomePage().getSuccessMessageFromSubscription(), "You have been successfully subscribed!", "Error");
//    }

    @When("I click on Cart button")
    public void iClickOnCartButton() {
        new HomePage().clickOnCartTab();
    }


    @Then("I should see message Success! Your details have been submitted successfully.")
    public void iShouldSeeMessageSuccessYourDetailsHaveBeenSubmittedSuccessfully() {
        Assert.assertEquals(new ContactUsPage().getsuccessMessage(), "Success! Your details have been submitted successfully.", "Error");
    }

    @Then("I should see text SUBSCRIPTION")
    public void iShouldSeeTextSUBSCRIPTION() {
        Assert.assertEquals(new HomePage().getTextForSubscription(), "SUBSCRIPTION", "Error");
    }

    @Then("I should see success message You have been successfully subscribed!")
    public void iShouldSeeSuccessMessageYouHaveBeenSuccessfullySubscribed() {
        Assert.assertEquals(new HomePage().verifyTheMessageSubscribeSuccessfully(), "You have been successfully subscribed!", "Error");
    }
}
