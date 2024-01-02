package com.automationexercises.steps;

import com.automationexercises.pages.HomePage;
import com.automationexercises.pages.ProductDetailsPage;
import com.automationexercises.pages.ProductsPage;
import com.automationexercises.pages.SignupLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductSteps {
    @Then("I should navigated to products page and see text ALL PRODUCTS")
    public void iShouldNavigatedToProductsPageAndSeeTextALLPRODUCTS() {
        Assert.assertEquals(new ProductsPage().getTextFromAllProducts(),"ALL PRODUCTS", "Error");
    }

    @And("I click on View Product link of first product Blue Top")
    public void iClickOnViewProductLinkOfFirstProductBlueTop() {
        new ProductsPage().clickOnViewProductOfBlueTop();
    }

    @Then("I should navigated to product details page")
    public void iShouldNavigatedToProductDetailsPage() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromBlueTop(),"Blue Top", "Error");
    }

    @And("I should see product name Blue Top")
    public void iShouldSeeProductNameBlueTop() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromBlueTop(),"Blue Top","Error");
    }

    @And("I should see category Category: Women>Tops")
    public void iShouldSeeCategoryCategoryWomenTops() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromProductCategory(),"Category: Women > Tops", "Error");
    }

    @And("I should see availability Availability: In Stock")
    public void iShouldSeeAvailabilityAvailabilityInStock() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromProductAvailability(), "Availability: In Stock", "Error");
    }

    @And("I should see condition Condition: New")
    public void iShouldSeeConditionConditionNew() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromProductCondition(), "Condition: New", "Error");
    }

    @And("I should see brand Brand: Polo")
    public void iShouldSeeBrandBrandPolo() {
        Assert.assertEquals(new ProductDetailsPage().getTextFromProductBrand(),"Brand: Polo", "Error");
    }
    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String product) {
        new ProductsPage().enterProductNameInSearchField(product);
    }
    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductsPage().clickOnSearchTab();
    }

    @Then("I should see text SEARCHED PRODUCTS on the page")
    public void iShouldSeeTextSEARCHEDPRODUCTSOnThePage() {
        Assert.assertEquals(new ProductsPage().getTextFromSearchProducts(),"SEARCHED PRODUCTS", "Error");
    }

    @And("I should see the searched product Stylish Dress")
    public void iShouldSeeTheSearchedProductStylishDress() {
        new ProductsPage().getTextFromproductStlishDress();
    }

    @Then("I should see categories are visible on left side bar")
    public void iShouldSeeCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ProductsPage().getTextFromCategory(),"CATEGORY", "Error");
    }

    @And("I click on Women category")
    public void iClickOnWomenCategory() {
        new ProductsPage().clickOnWomenTab();
    }

    @And("I click on Dress category under Women category")
    public void iClickOnDressCategoryUnderWomenCategory() {
        new ProductsPage().clickOnWomenDressTab();
    }

    @Then("I am able to see WOMEN-DRESS PRODUCTS page")
    public void iAmAbleToSeeWOMENDRESSPRODUCTSPage() {
        Assert.assertEquals(new ProductsPage().getTextFromWomenDress(),"WOMEN - DRESS PRODUCTS", "Error");
    }

    @And("I click on men category")
    public void iClickOnMenCategory() {
        new ProductsPage().clickOnMenTab();
    }

    @And("I click on Tshirt category under Men category")
    public void iClickOnTshirtCategoryUnderMenCategory() {
        new ProductsPage().clickOnMenTshirtTab();
    }

    @Then("I am able to see MEN-TSHIRTS PRODUCTS page")
    public void iAmAbleToSeeMENTSHIRTSPRODUCTSPage() {
        Assert.assertEquals(new ProductsPage().getTextFromMenTshirt(),"MEN - TSHIRTS PRODUCTS", "Error");
    }

    @Then("I should see Brands are visible on left side bar")
    public void iShouldSeeBrandsAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ProductsPage().getTextFromBrand(), "BRANDS", "Error");
    }

    @And("I click on POLO brand")
    public void iClickOnPOLOBrand() {
        new ProductsPage().clickOnBrandPolo();
    }

    @Then("I am able see BRAND_POLO PRODUCTS page")
    public void iAmAbleSeeBRAND_POLOPRODUCTSPage() {
        Assert.assertEquals(new ProductsPage().getTextFromBrandPolo(), "BRAND - POLO PRODUCTS", "Error");
    }

    @And("I click on H&M brand")
    public void iClickOnHMBrand() {
        new ProductsPage().clickOnBrandHAndM();
    }

    @Then("I am able to see BRAND_H&M PRODUCTS")
    public void iAmAbleToSeeBRAND_HMPRODUCTS() {
        Assert.assertEquals(new ProductsPage().getTextFromBrandHAndM(),"BRAND - H&M PRODUCTS", "Error");
    }

    @And("I add product stylish dress to the cart")
    public void iAddProductStylishDressToTheCart() {
        new ProductsPage().cli
    }

    @Then("I should see Stylish dress is visible in cart")
    public void iShouldSeeStylishDressIsVisibleInCart() {
        Assert.assertEquals(new ProductsPage().getTextFromproductStlishDress(),"Stylish Dress", "Error");
    }

    @And("I click on Signup\\/Login button")
    public void iClickOnSignupLoginButton() {
        new HomePage().clickOnSignupLoginTab();
    }

    @And("I enter email {string} in Email field")
    public void iEnterEmailInEmailField(String email) {
        new SignupLoginPage().enterEmailInNewUserSignup(email);
    }

    @Then("I still should see stylish dress is visible in cart after login as well")
    public void iStillShouldSeeStylishDressIsVisibleInCartAfterLoginAsWell() {
        Assert.assertEquals(new ProductsPage().getTextFromproductStlishDress(), "Stylish Dress", "error");
    }

    @And("I click on View product button of the first product")
    public void iClickOnViewProductButtonOfTheFirstProduct() {
        new ProductsPage().clickOnViewProductOfBlueTop();
    }

    @And("I enter Name {string} in name field")
    public void iEnterNameInNameField(String name) {
        new ProductDetailsPage().enterNameInReviewField(name);
    }

    @And("I enter Review {string} in review field")
    public void iEnterReviewInReviewField(String msg) {
        new ProductDetailsPage().enterMsgInReviewField(msg);
    }

    @And("I Click on Submit Tab")
    public void iClickOnSubmitTab() {
        new ProductDetailsPage().clickOnSubmitButtom();
    }

    @Then("I should see Success Message Thank you for your review")
    public void iShouldSeeSuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new ProductDetailsPage().verifyThatThankYouForReviewMessage(),"Thank you for your review");
    }

    @And("I enter Email {string} in review field")
    public void iEnterEmailInReviewField(String email) {
        new ProductDetailsPage().enterEmailInReviewField(email);

    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        new ProductDetailsPage().verifyProductPrice(price);
    }

    @Then("I should navigated to the product page and see text ALL PRODUCTS")
    public void iShouldNavigatedToTheProductPageAndSeeTextALLPRODUCTS() {
        Assert.assertEquals(new ProductsPage().getTextFromAllProducts(), "All PRODUCTS", "Error");
    }


    @And("I enter the product name Stylish Dress in search input")
    public void iEnterTheProductNameStylishDressInSearchInput() {
        new ProductsPage().clickOnWomenDressTab();
    }
}
