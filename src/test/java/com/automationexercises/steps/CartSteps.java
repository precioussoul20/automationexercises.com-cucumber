package com.automationexercises.steps;

import com.automationexercises.pages.HomePage;
import com.automationexercises.pages.ProductDetailsPage;
import com.automationexercises.pages.ProductsPage;
import com.automationexercises.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {
    @When("I click on Products button")
    public void iClickOnProductsButton() {
        new HomePage().clickOnProductsTab();
    }

    @And("I hover over first product Blue Top and click Add to cart")
    public void iHoverOverFirstProductBlueTopAndClickAddToCart() {
        new ProductsPage().hoverAndClickAddToCartBlueTop();
    }

    @And("I click Continue Shopping button on success message")
    public void iClickContinueShoppingButtonOnSuccessMessage() {
        new ProductsPage().clickOnContinueShoppingTab();
    }

    @And("I hover over second product Men Tshirt and click Add to cart")
    public void iHoverOverSecondProductMenTshirtAndClickAddToCart() {
        new ProductsPage().hoverAndClickAddToCartMenTshirt();
    }

    @And("I click View Cart button on success message")
    public void iClickViewCartButtonOnSuccessMessage() {
        new ProductsPage().clickOnViewCartTab();
    }
    @Then("I should see Blue Top in Shopping cart")
    public void iShouldSeeBlueTopInShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromBlueTop(), "Blue Top", "Error");
    }

    @And("I should see Men Tshirt as wel in shopping cart")
    public void iShouldSeeMenTshirtAsWelInShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromMenTshirt(), "Men Tshirt", "Error");
    }

    @When("I click on View Product of the product Stylish Dress on product page")
    public void iClickOnViewProductOfTheProductStylishDressOnProductPage() {
        new ProductsPage().clickOnViewProductTabOfStylishDress();
    }

    @Then("I should navigated to product details page with product name displayed Stylish Dress on the page")
    public void iShouldNavigatedToProductDetailsPageWithProductNameDisplayedStylishDressOnThePage() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromStylishDress(), "Stylish Dress", "Error");
    }
    @And("I increase quantity to {string}")
    public void iIncreaseQuantityTo(String quantity) {
        new ProductDetailsPage().updateQuantityField(quantity);
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartTab();
    }

    @And("I click on View Cart button on success message")
    public void iClickOnViewCartButtonOnSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartOfStylishDress();
    }

    @Then("I should see the product is displayed in cart with exact quantity")
    public void iShouldSeeTheProductIsDisplayedInCartWithExactQuantity() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromQuantityField(), "4", "Error");
    }

    @When("I add blue Top to the cart")
    public void iAddBlueTopToTheCart() {
        new ProductsPage().hoverAndClickAddToCartBlueTop();
    }

    @Then("I am navigated to shopping cart page with text displayed Shopping cart")
    public void iAmNavigatedToShoppingCartPageWithTextDisplayedShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromShoppingCart(),"Shopping Cart", "Error");
    }

    @And("I click on X button corresponding to Blue top")
    public void iClickOnXButtonCorrespondingToBlueTop() {
        new ShoppingCartPage().clickOnXTab();
    }

    @Then("I can see message Cart is empty!")
    public void iCanSeeMessageCartIsEmpty() {
        Assert.assertEquals(new ShoppingCartPage().getTextFromCartEmpty(),"Cart is empty!", "Error");
    }



}
