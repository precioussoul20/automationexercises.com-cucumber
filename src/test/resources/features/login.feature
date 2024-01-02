Feature: Login Functionality

#  Test Case 2: Login User with correct email and password
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'Login to your account' is visible
#  6. Enter correct email address and password
#  7. Click 'login' button
#  8. Verify that 'Logged in as username' is visible
#  9. Click 'Delete Account' button
#  10. Verify that 'ACCOUNT DELETED!' is visible
 # @sanity
  Scenario: User should login successfully with correct email and password
    Given I am on homepage
    When I click on Signup-Login button
    Then I should see login page with text Login to your account
    And I enter email "patelPri@yahoo.co.in" in email field
    And I enter password "PatP20!" in password field
    And I click on login button
    Then I should see text logged in as Priya
    And  I click on Delete Account button
    Then I should see text ACCOUNT DELETED!


#  Test Case 3: Login User with incorrect email and password
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'Login to your account' is visible
#  6. Enter incorrect email address and password
#  7. Click 'login' button
#  8. Verify error 'Your email or password is incorrect!' is visible
 # @sanity
  Scenario: User should not login successfully with incorrect email and password
    Given I am on homepage
    When I click on Signup-Login button
    Then I should see login page with text Login to your account
    And I enter email "patelpriya@yahoo.co.in" in email field
    And I enter password "Priya20" in password field
    And I click on login button
    Then I should see error message Your email or password is incorrect!


#  Test Case 4: Logout User
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'Login to your account' is visible
#  6. Enter correct email address and password
#  7. Click 'login' button
#  8. Verify that 'Logged in as username' is visible
#  9. Click 'Logout' button
#  10. Verify that user is navigated to login page
 # @sanity
  Scenario: User should logout successfully
    Given I am on homepage
    When I click on Signup-Login button
    Then I should see login page with text Login to your account
    And I enter email "patelPri@yahoo.co.in" in email field
    And I enter password "PatP20!" in password field
    And I click on login button
    Then I should see text logged in as Priya
    And I click on Logout button
    Then I should navigated to login page




#  Test Case 16: Place Order: Login before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill email, password and click 'Login' button
#  6. Verify 'Logged in as username' at top
#  7. Add products to cart
#  8. Click 'Cart' button
#  9. Verify that cart page is displayed
#  10. Click Proceed To Checkout
#  11. Verify Address Details and Review Your Order
#  12. Enter description in comment text area and click 'Place Order'
#  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  14. Click 'Pay and Confirm Order' button
#  15. Verify success message 'Your order has been placed successfully!'
#  16. Click 'Delete Account' button
#  17. Verify 'ACCOUNT DELETED!' and click 'Continue' button
#@sanity-uptill blue
  Scenario: User should place Order: Login before Checkout
    Given I am on homepage
    When I click on Signup-Login button
    And I enter email "patelPri@yahoo.co.in" in email field
    And I enter password "PatP20!" in password field
    And I click on login button
    Then I should see text logged in as Priya
    And I add product Blue Top to the cart
    And I click on View Cart button on success message
    Then I am navigated on cart page with text displayed Shopping Cart
    And I click on Proceed To Checkout button
    And I should see text Address Details on checkout page
    And I should see text Review Your Order on checkout page
    And I enter comment "Gift packing" in comment field
    And I click on Place Order
    And I enter name "Priya" in Name on Card field
    And I enter card number "4800223340098000" in Card Number field
    And I enter cvv no "986" in CVC field
    And I enter month "05", year "2027" in Expiration field
    And I click on Pay and Confirm Order
    Then I should see success message Congratulations! Your order has been confirmed!
    And I click on Delete Account button
    Then I should see text ACCOUNT DELETED!
    And I click on Continue button
