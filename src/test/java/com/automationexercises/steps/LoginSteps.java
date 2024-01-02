package com.automationexercises.steps;

import com.automationexercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @When("I click on Signup-Login button")
    public void iClickOnSignupLoginButton() {
        new HomePage().clickOnSignupLoginTab();
    }
    @Then("I should see login page with text Login to your account")
    public void iShouldSeeLoginPageWithTextLoginToYourAccount() {
        Assert.assertEquals(new SignupLoginPage().getTextFromLoginAccount(),"Login to your account", "Error");
    }

    @And("I enter email {string} in email field")
    public void iEnterEmailInEmailField(String email) {
        new SignupLoginPage().enterEmailInLoginAccount(email);
    }

    @And("I enter password {string} in password field")
    public void iEnterPasswordInPasswordField(String password) {
        new SignupLoginPage().enterPasswordInLoginAccount(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new SignupLoginPage().clickOnLoginButton();
    }

    @Then("I should see text logged in as Priya")
    public void iShouldSeeTextLoggedInAsPriya() {
        Assert.assertEquals(new HomePage().verifyLoggedInAsUserText(),"Logged in as priya", "Error");
    }

    @And("I click on Delete Account button")
    public void iClickOnDeleteAccountButton() {
        new HomePage().clickOnDeleteAccountTab();
    }

    @Then("I should see text ACCOUNT DELETED!")
    public void iShouldSeeTextACCOUNTDELETED() {
        Assert.assertEquals(new HomePage().getTextFromAccountDeleted(), "ACCOUNT DELETED!", "Error");
    }

    @Then("I should see error message Your email or password is incorrect!")
    public void iShouldSeeErrorMessageYourEmailOrPasswordIsIncorrect() {
        Assert.assertEquals(new SignupLoginPage().getTextFromLoginErrorMsg(),"Your email or password is incorrect!", "Error");
    }

    @And("I click on Logout button")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogoutTab();
    }

    @Then("I should navigated to login page")
    public void iShouldNavigatedToLoginPage() {
        Assert.assertEquals(new SignupLoginPage().getTextFromLoginAccount(),"Login to your account","Error");
    }

    @And("I add product Blue Top to the cart")
    public void iAddProductBlueTopToTheCart() {
        new ProductsPage().hoverAndClickAddToCartBlueTop();
    }

    @Then("I am navigated on cart page with text displayed Shopping Cart")
    public void iAmNavigatedOnCartPageWithTextDisplayedShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromShoppingCart(), "Shopping Cart","Error");
    }

    @And("I click on Proceed To Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutTab();
    }

    @And("I should see text Address Details on checkout page")
    public void iShouldSeeTextAddressDetailsOnCheckoutPage() {
        Assert.assertEquals(new CheckoutPage().getTextFromAddressDetails(), "Address Details", "Error");
    }

    @And("I should see text Review Your Order on checkout page")
    public void iShouldSeeTextReviewYourOrderOnCheckoutPage() {
        Assert.assertEquals(new CheckoutPage().getTextFromReviewYourOrder(), "Review Your Order", "Error");
    }

    @And("I enter comment {string} in comment field")
    public void iEnterCommentInCommentField(String msg) {
        new CheckoutPage().enterMessageInCommentArea(msg);
    }

    @And("I click on Place Order")
    public void iClickOnPlaceOrder() {
        new CheckoutPage().clickOnPlaceOrderTab();
    }

    @And("I enter name {string} in Name on Card field")
    public void iEnterNameInNameOnCardField(String name) {
        new PaymentPage().enterNameInPaymentPage(name);
    }

    @And("I enter card number {string} in Card Number field")
    public void iEnterCardNumberInCardNumberField(String cardNo) {
        new PaymentPage().enterCardNoInCardPaymentPage(cardNo);
    }

    @And("I enter cvv no {string} in CVC field")
    public void iEnterCvvNoInCVCField(String cvc) {
        new PaymentPage().enterCVCInCardPaymentPage(cvc);
    }

    @And("I enter month {string}, year {string} in Expiration field")
    public void iEnterMonthYearInExpirationField(String mon, String year) {
        new PaymentPage().enterMonthInCardPaymentPage(mon);
        new PaymentPage().enterYearInCardPaymentPage(year);
    }

    @And("I click on Pay and Confirm Order")
    public void iClickOnPayAndConfirmOrder() {
        new PaymentPage().clickOnPayAndConfirmTab();
    }
    @Then("I should see success message Congratulations! Your order has been confirmed!")
    public void iShouldSeeSuccessMessageCongratulationsYourOrderHasBeenConfirmed() {
        Assert.assertEquals(new PaymentPage().getTextFromOPrderSuccessMsg(), "Congratulations! Your order has been confirmed!", "Error");
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new PaymentPage().clickOnContinueTab();
    }


}
