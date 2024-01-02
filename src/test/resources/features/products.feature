Feature: Product Page Functionality

#  Test Case 8: Verify All Products and product detail page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. The products list is visible
#  7. Click on 'View Product' of first product
#  8. User is landed to product detail page
#  9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

  Scenario: User should verify all products and products detail page
    Given I am on homepage
    When I click on Products button
    Then I should navigated to products page and see text ALL PRODUCTS
    And I click on View Product link of first product Blue Top
    Then I should navigated to product details page
    And I should see product name Blue Top
    And I should see category Category: Women>Tops
    And I should see price "Rs.500"
    And I should see availability Availability: In Stock
    And I should see condition Condition: New
    And I should see brand Brand: Polo


#  Test Case 9: Search Product
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Products' button
#  5. Verify user is navigated to ALL PRODUCTS page successfully
#  6. Enter product name in search input and click search button
#  7. Verify 'SEARCHED PRODUCTS' is visible
#  8. Verify all the products related to search are visible

  Scenario: User should be able to use search product feature successfully
    Given I am on homepage
    When I click on Products button
    Then I should navigated to the product page and see text ALL PRODUCTS
    And I enter the product name Stylish Dress in search input
    And I click on search button
    Then I should see text SEARCHED PRODUCTS on the page
    And  I should see the searched product Stylish Dress


#  Test Case 18: View Category Products
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that categories are visible on left side bar
#  4. Click on 'Women' category
#  5. Click on any category link under 'Women' category, for example: Dress
#  6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
#  7. On left side bar, click on any sub-category link of 'Men' category
#  8. Verify that user is navigated to that category page

  Scenario: User should able to view products category
    Given I am on homepage
    Then I should see categories are visible on left side bar
    And I click on Women category
    And I click on Dress category under Women category
    Then I am able to see WOMEN-DRESS PRODUCTS page
    And  I click on men category
    And I click on Tshirt category under Men category
    Then I am able to see MEN-TSHIRTS PRODUCTS page


#  Test Case 19: View & Cart Brand Products
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Click on 'Products' button
#  4. Verify that Brands are visible on left side bar
#  5. Click on any brand name
#  6. Verify that user is navigated to brand page and brand products are displayed
#  7. On left side bar, click on any other brand link
#  8. Verify that user is navigated to that brand page and can see products

  Scenario: User should able to view and cart brand products
    Given I am on homepage
    When I click on Products button
    Then I should see Brands are visible on left side bar
    And I click on POLO brand
    Then I am able see BRAND_POLO PRODUCTS page
    And I click on H&M brand
    Then I am able to see BRAND_H&M PRODUCTS


#  Test Case 20: Search Products and Verify Cart After Login
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Click on 'Products' button
#  4. Verify user is navigated to ALL PRODUCTS page successfully
#  5. Enter product name in search input and click search button
#  6. Verify 'SEARCHED PRODUCTS' is visible
#  7. Verify all the products related to search are visible
#  8. Add those products to cart
#  9. Click 'Cart' button and verify that products are visible in cart
#  10. Click 'Signup / Login' button and submit login details
#  11. Again, go to Cart page
#  12. Verify that those products are visible in cart after login as well

  Scenario: User should be able to search products and verify cart after login
    Given I am on homepage
    When I click on Products button
    Then I should navigated to the product page and see text ALL PRODUCTS
    And I enter the product name Stylish Dress in search input
    And I click on search button
    Then I should see text SEARCHED PRODUCTS on the page
    And  I should see the searched product "Stylish Dress"
    And I add product stylish dress to the cart
    And I click on View Cart button on success message
    Then I should see Stylish dress is visible in cart
    And I click on Signup-Login button
    And I enter email "patelPri@yahoo.co.in" in Email field
    And I enter password "PatP20!" in Password field
    And I click on Cart button
    Then I still should see stylish dress is visible in cart after login as well


#  Test Case 21: Add review on product
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Click on 'Products' button
#  4. Verify user is navigated to ALL PRODUCTS page successfully
#  5. Click on 'View Product' button
#  6. Verify 'Write Your Review' is visible
#  7. Enter name, email and review
#  8. Click 'Submit' button
#  9. Verify success message 'Thank you for your review.'

  Scenario: User should able to add review on product
    Given I am on homepage
    When I click on Products button
    Then I should navigated to the product page and see text ALL PRODUCTS
    And I click on View product button of the first product
    And I enter Name "Priya" in name field
    And I enter Email "patelPri@yahoo.co.in" in review field
    And I enter Review "Product quality is not good" in review field
    And I Click on Submit Tab
    Then I should see Success Message Thank you for your review











