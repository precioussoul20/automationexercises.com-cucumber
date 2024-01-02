package com.automationexercises.pages;

import com.automationexercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement addToBlueTop;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue Shopping']")  ////button[normalize-space()='Continue Shopping']
    WebElement continueShoppingTab;
    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]")
    WebElement addToMensTshirt;
    @CacheLookup
    @FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    WebElement viewCartTab;
    @CacheLookup
    //@FindBy(xpath = "(//a[contains(text(),'View Product')])[4]")
            //@FindBy(xpath = "(//a[text()='View Product'])[1]")
            @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewStylishDress;

    @CacheLookup
    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement addSleevelessDress;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductText;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProductBlueTop;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProductField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement textSearchProducts;

    @CacheLookup
    @FindBy(xpath = "(//p[contains(text(),'Stylish Dress')])[2]")
    WebElement textStylishDress;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement textCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement dressTab;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement tshirtTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement textMensTshirt;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement textBrand;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement polo;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement textPolo;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement handm;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    WebElement textHAndM;


    public void hoverAndClickAddToCartBlueTop(){
        mouseHoverToElementAndClick(addToBlueTop);
        clickOnElement(allProductText);
        log.info("Clicking on Blue top add to cart tab " + addToBlueTop.toString());
    }
    public void clickOnContinueShoppingTab(){
        clickOnElement(continueShoppingTab);
        log.info("Clicking on continue shopping tab " + continueShoppingTab.toString());
    }
    public void hoverAndClickAddToCartMenTshirt(){
       mouseHoverToElementAndClick(addToMensTshirt);
        log.info("Clicking on Men tshirt add to cart tab2 " +addToMensTshirt.toString());
    }
    public void clickOnViewCartTab(){
        clickOnElement(viewCartTab);
        log.info("Clicking on view cart tab " + viewCartTab.toString());
    }
    public void clickOnViewProductTabOfStylishDress(){
        clickOnElement(viewStylishDress);
        log.info("Clicking on view product tab of stylish dress " + viewStylishDress.toString());
    }
    public void clickOnAddToCartSleevelessDress(){
        clickOnElement(addSleevelessDress);
        log.info("Clicking on add to cart of sleeveless dress " + addSleevelessDress.toString());
    }
    public String getTextFromAllProducts(){
        log.info("Getting text from all products " + allProductText.toString());
        return getTextFromElement(allProductText);
    }
    public void clickOnViewProductOfBlueTop(){
        clickOnElement(viewProductBlueTop);
        log.info("Clicking on view product of blue top " + viewProductBlueTop.toString());
    }
    public void enterProductNameInSearchField(String product){
        sendTextToElement(searchProductField,product);
    }
    public void clickOnSearchTab(){
        clickOnElement(searchButton);
        log.info("Clicking on search button " + searchButton.toString());
    }
    public String getTextFromSearchProducts(){
        log.info("Getting text from search products " + textSearchProducts.toString());
        return getTextFromElement(textSearchProducts);
    }
    public String getTextFromproductStlishDress(){
        log.info("Getting the text from stylish dress " + textStylishDress.toString());
        return getTextFromElement(textStylishDress);
    }
    public String getTextFromCategory(){
        log.info("Getting the text category " + textCategory.toString());
        return getTextFromElement(textCategory);
    }
    public void clickOnWomenTab(){
        clickOnElement(womenTab);
        log.info("Clicking on women tab " + womenTab.toString());
    }
    public void clickOnWomenDressTab(){
        clickOnElement(dressTab);
        log.info("Clicking on women dress tab " + dressTab.toString());
    }
    public String getTextFromWomenDress(){
        log.info("Getting text  women dress " + womenDressText.toString());
        return getTextFromElement(womenDressText);
    }
    public void clickOnMenTab(){
        clickOnElement(menTab);
        log.info("Clicking on men tab " + menTab.toString());
    }
    public void clickOnMenTshirtTab(){
        clickOnElement(tshirtTab);
        log.info("Clicking on men tshirt tab " + tshirtTab.toString());
    }
    public String getTextFromMenTshirt(){
        log.info("Getting text men tshirt " + textMensTshirt.toString());
        return getTextFromElement(textMensTshirt);
    }
    public String getTextFromBrand(){
        log.info("Getting text brands " + textBrand.toString());
        return getTextFromElement(textBrand);
    }
    public void clickOnBrandPolo(){
        clickOnElement(polo);
        log.info("Clicking brand polo " + polo.toString());
    }
    public String getTextFromBrandPolo(){
        log.info("Getting text from brand polo " + textPolo.toString());
        return getTextFromElement(textPolo);
    }
    public void clickOnBrandHAndM(){
        clickOnElement(handm);
        log.info("Clicking brand h&m " + handm.toString());
    }
    public String getTextFromBrandHAndM(){
        log.info("Getting text from brand H and M " + textHAndM.toString());
        return getTextFromElement(textHAndM);
    }
}
