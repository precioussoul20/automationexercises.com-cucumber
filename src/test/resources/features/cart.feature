
Feature: Cart Functionality

  #  Test Case 12: Add Products in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Products' button
#  5. Hover over first product and click 'Add to cart'
#  6. Click 'Continue Shopping' button
#  7. Hover over second product and click 'Add to cart'
#  8. Click 'View Cart' button
#  9. Verify both products are added to Cart
#  10. Verify their prices, quantity and total price



  Scenario: User should be able to add products in cart
    Given I am on homepage
    When I click on Products button
    And I hover over first product Blue Top and click Add to cart
    And I click Continue Shopping button on success message
    And I hover over second product Men Tshirt and click Add to cart
    And I click View Cart button on success message
    Then I should see Blue Top in Shopping cart
    And I should see Men Tshirt as wel in shopping cart




#  Test Case 13: Verify Product quantity in Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'View Product' for any product on home page
#  5. Verify product detail is opened
#  6. Increase quantity to 4
#  7. Click 'Add to cart' button
#  8. Click 'View Cart' button
#  9. Verify that product is displayed in cart page with exact quantity

  Scenario: Verify Product quantity in Cart
    Given I am on homepage
    When I click on View Product of the product Stylish Dress on product page
    Then I should navigated to product details page with product name displayed Stylish Dress on the page
    And I increase quantity to "4"
    And I click on Add to cart button
    And I click on View Cart button on success message
    Then I should see the product is displayed in cart with exact quantity


#  Test Case 17: Remove Products From Cart
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click 'X' button corresponding to particular product
#  8. Verify that product is removed from the cart

  Scenario: User should able to remove products from Cart
    Given I am on homepage
    When I add blue Top to the cart
    And I click View Cart button on success message
    Then I am navigated to shopping cart page with text displayed Shopping cart
    And I click on X button corresponding to Blue top
    Then I can see message Cart is empty!

