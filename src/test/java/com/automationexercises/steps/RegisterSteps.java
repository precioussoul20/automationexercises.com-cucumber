package com.automationexercises.steps;

import com.automationexercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Then("I should see login page with text New User Signup!")
    public void iShouldSeeLoginPageWithTextNewUserSignup() {
        new SignupLoginPage().getTextFromNewUserSignup();
    }

    @And("I enter name {string} in Name field to signup")
    public void iEnterNameInNameFieldToSignup(String name) {
        new SignupLoginPage().enterNameInNewUserSignup(name);
    }

    @And("I enter email {string} Email field to signup")
    public void iEnterEmailEmailFieldToSignup(String email) {
        new SignupLoginPage().enterEmailInNewUserSignup(email);
    }

    @And("I click on Signup button")
    public void iClickOnSignupButton() {
        new SignupLoginPage().clickOnSignupButton();
    }

    @Then("I should see Signup page with text ENTER ACCOUNT INFORMATION")
    public void iShouldSeeSignupPageWithTextENTERACCOUNTINFORMATION() {
        Assert.assertEquals(new SignupPage().getTextFromEnterAccInfo(), "ENTER ACCOUNT INFORMATION", "Error");
    }

    @And("I select Title Mrs from Title option")
    public void iSelectTitleMrsFromTitleOption() {
        new SignupPage().clickOnMrsRadioButton();
    }

    @And("I enter password {string} in Password field")
    public void iEnterPasswordInPasswordField(String password) {
        new SignupPage().enterPasswordInSignupPage(password);
    }

    @And("I enter day {string}, month {string}, year {string} in Date of Birth field")
    public void iEnterDayMonthYearInDateOfBirthField(String day, String month, String year) {
        new SignupPage().selectDayFromDropDown(day);
        new SignupPage().selectMonthFromDropDown(month);
        new SignupPage().selectYearFromDropDown(year);
    }

    @And("I select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new SignupPage().clickOnNewsLetterBox();
    }

    @And("I select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new SignupPage().clickOnSpecialOfferBox();
    }

    @And("I enter first name {string} in Firstname field")
    public void iEnterFirstNameInFirstnameField(String fname) {
        new SignupPage().enterFirstNameInSignupPage(fname);
    }

    @And("I enter last name {string} in Lastname field")
    public void iEnterLastNameInLastnameField(String lname) {
        new SignupPage().enterlastNameInSignupPage(lname);
    }

    @And("I enter address {string} in Address field")
    public void iEnterAddressInAddressField(String address1) {
        new SignupPage().enterAddress1InSignupPage(address1);
    }
    @And("I enter {string} in address field")
    public void iEnterInAddressField(String address2) {
        new SignupPage().enterAddress2InSignupPage(address2);
    }

    @And("I select country {string} from Country dropdown")
    public void iSelectCountryFromCountryDropdown(String country) {
        new SignupPage().selectCountryFromDropDown(country);
    }

    @And("I enter state {string} in State field")
    public void iEnterStateInStateField(String state) {
        new SignupPage().enterStateInSignupPage(state);
    }

    @And("I enter city {string} in City field")
    public void iEnterCityInCityField(String city) {
        new SignupPage().enterCityInSignupPage(city);
    }

    @And("I enter zipcode {string} in Zipcode field")
    public void iEnterZipcodeInZipcodeField(String zipcode) {
        new SignupPage().enterZipcodeInSignupPage(zipcode);
    }

    @And("I enter mobile number {string} in Mobile Number field")
    public void iEnterMobileNumberInMobileNumberField(String mobileNum) {
        new SignupPage().enterMobileNumberInSignupPage(mobileNum);
    }

    @And("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new SignupPage().clickOnCreateAccountButton();
    }

    @Then("I should see message ACCOUNT CREATED!")
    public void iShouldSeeMessageACCOUNTCREATED() {
        Assert.assertEquals(new SignupPage().getTextFromAccountCreated(),"ACCOUNT CREATED!", "Error");
    }

    @Then("I should see text Logged in as Priya")
    public void iShouldSeeTextLoggedInAsPriya() {
        Assert.assertEquals(new HomePage().verifyLoggedInAsUserText(),"Logged in as Priya", "Error");
    }

    @And("I click On Continue button after deleting the account")
    public void iClickOnContinueButtonAfterDeletingTheAccount() {
        new HomePage().clickOnContinueButton();
    }

    @Then("I should see error message Email Address already exist!")
    public void iShouldSeeErrorMessageEmailAddressAlreadyExist() {
        Assert.assertEquals(new SignupLoginPage().getTextFromSignupErrorMsg(),"Email Address already exist!","Error");
    }

    @When("I add product Sleeveless Dress to the cart")
    public void iAddProductStylishDressToTheCart() {
        new ProductsPage().clickOnAddToCartSleevelessDress();

    }

    @And("I click Cart button")
    public void iClickCartButton() {
        new HomePage().clickOnCartTab();
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutTab();
    }

    @And("I enter email {string} in Email field to signup")
    public void iEnterEmailInEmailFieldToSignup(String email) {
        new SignupLoginPage().enterEmailInNewUserSignup(email);
    }

    @Then("I should see text Logged in as Rakhi")
    public void iShouldSeeTextLoggedInAsRakhi() {
        Assert.assertEquals(new HomePage().verifyLoggedInAsUserText(), "Logged in as Rakhi", "Error");
    }

    @Then("I should see text on checkout page Address details")
    public void iShouldSeeTextOnCheckoutPageAddressDetails() {
        Assert.assertEquals(new CheckoutPage().getTextFromAddressDetails(),"Address Details", "Error");
    }

    @And("I should see text  on checkout page Review Your Order")
    public void iShouldSeeTextOnCheckoutPageReviewYourOrder() {
        Assert.assertEquals(new CheckoutPage().getTextFromReviewYourOrder(), "Review Your Order", "Error");
    }

    @Then("I should see text ACCOUNT CREATED!")
    public void iShouldSeeTextACCOUNTCREATED() {
        Assert.assertEquals(new SignupPage().getTextFromAccountCreated(),"ACCOUNT CREATED!", "Error");
    }

    @Then("I should see text Logged in as Veer")
    public void iShouldSeeTextLoggedInAsVeer() {
        Assert.assertEquals(new HomePage().verifyLoggedInAsUserText(), "Logged in as Veer", "Error");
    }

    @Then("I should navigate to cartpage with text displayed Shopping cart")
    public void iShouldNavigateToCartpageWithTextDisplayedShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromShoppingCart(), "Shopping cart", "Error");
    }




    @And("I enter comments {string} in comment section")
    public void iEnterCommentsInCommentSection(String msg) {
        new CheckoutPage().enterMessageInCommentArea(msg);
    }
}
