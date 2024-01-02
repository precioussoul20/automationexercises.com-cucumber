Feature: Register Functionality

#  Test Case 1: Register User
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'New User Signup!' is visible
#  6. Enter name and email address
#  7. Click 'Signup' button
#  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#  9. Fill details: Title, Name, Email, Password, Date of birth
#  10. Select checkbox 'Sign up for our newsletter!'
#  11. Select checkbox 'Receive special offers from our partners!'
#  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#  13. Click 'Create Account button'
#  14. Verify that 'ACCOUNT CREATED!' is visible
#  15. Click 'Continue' button
#  16. Verify that 'Logged in as username' is visible
#  17. Click 'Delete Account' button
#  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
@sanity
  Scenario: user should be register successfully
    Given I am on homepage
    When I click on Signup-Login button
    Then I should see login page with text New User Signup!
    And I enter name "Priya" in Name field to signup
    And I enter email "patelP@yahoo.co.in" Email field to signup
    And I click on Signup button
    Then I should see Signup page with text ENTER ACCOUNT INFORMATION
    And I select Title Mrs from Title option
    And I enter password "PatP20!" in Password field
    And I enter day "20", month "November", year "1995" in Date of Birth field
    And I select checkbox Sign up for our newsletter!
    And I select checkbox Receive special offers from our partners!
    And I enter first name "Priya" in Firstname field
    And I enter last name "Patel" in Lastname field
    And I enter address "54,Shantinagar society" in Address field
    And I enter "Naranpura" in address field
    And I select country "India" from Country dropdown
    And I enter state "Gujarat" in State field
    And I enter city "Ahmedabad" in City field
    And I enter zipcode "380013" in Zipcode field
    And I enter mobile number "09886611144" in Mobile Number field
    And I click on Create Account button
    Then I should see text ACCOUNT CREATED!
    And I click on Continue button
    Then I should see text Logged in as Priya
    And I click on Delete Account button
    Then I should see text ACCOUNT DELETED!
    And I click On Continue button after deleting the account



#  Test Case 5: Register User with existing email
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Signup / Login' button
#  5. Verify 'New User Signup!' is visible
#  6. Enter name and already registered email address
#  7. Click 'Signup' button
#  8. Verify error 'Email Address already exist!' is visible
  #@sanity
  Scenario: User should not be able to register with existing email
    Given I am on homepage
    When I click on Signup-Login button
    Then I should see login page with text New User Signup!
    And I enter name "Priya" in Name field to signup
    And I enter email "patelPri@yahoo.co.in" Email field to signup
    And I click on Signup button
    Then I should see error message Email Address already exist!


#  Test Case 14: Place Order: Register while Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Add products to cart
#  5. Click 'Cart' button
#  6. Verify that cart page is displayed
#  7. Click Proceed To Checkout
#  8. Click 'Register / Login' button
#  9. Fill all details in Signup and create account
#  10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  11. Verify ' Logged in as username' at top
#  12.Click 'Cart' button
#  13. Click 'Proceed To Checkout' button
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Delete Account' button
#  20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  Scenario: User should place Order: Register while Checkout
    Given I am on homepage
    When I add product Sleeveless Dress to the cart
    And I click Cart button
    Then I am navigated on cart page with text displayed Shopping Cart
    And I click on Proceed to Checkout button
    And I click on Signup-Login button
    And I enter name "Rakhi" in Name field to signup
    And I enter email "rakhi3008@gmail.com" in Email field to signup
    And I click on Signup button
    And I select Title Mrs from Title option
    And I enter password "Smart2330" in Password field
    And I enter day "19", month "August", year "1995" in Date of Birth field
    And I enter first name "Rakhi" in Firstname field
    And I enter last name "Shah" in Lastname field
    And I enter address "30, kiritnagar" in Address field
    And I enter "Ashram road" in address field
    And I select country "India" from Country dropdown
    And I enter state "Gujarat" in State field
    And I enter city "Ahmedabad" in City field
    And I enter zipcode "380012" in Zipcode field
    And I enter mobile number "09825000667" in Mobile Number field
    And I click on Create Account button
    Then  I should see text ACCOUNT CREATED!
    And I click on Continue button
    Then I should see text Logged in as Rakhi
    And I click on Cart button
    And I click on Proceed to Checkout button
    Then I should see text on checkout page Address details
    And I should see text  on checkout page Review Your Order
    And I enter comments "Please deliver within one week" in comment section
    And I click on Place Order
    And I enter name "Rakhi" in Name on Card field
    And I enter card number "4011332244449000" in Card Number field
    And I enter cvv no "789" in CVC field
    And I enter month "11", year "2026" in Expiration field
    And I click on Pay and Confirm Order
    Then I should see success message Congratulations! Your order has been confirmed!
    And I click on Delete Account button
    Then I should see text ACCOUNT DELETED!
    And I click on Continue button


#  Test Case 15: Place Order: Register before Checkout
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Signup / Login' button
#  5. Fill all details in Signup and create account
#  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
#  7. Verify ' Logged in as username' at top
#  8. Add products to cart
#  9. Click 'Cart' button
#  10. Verify that cart page is displayed
#  11. Click Proceed To Checkout
#  12. Verify Address Details and Review Your Order
#  13. Enter description in comment text area and click 'Place Order'
#  14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  15. Click 'Pay and Confirm Order' button
#  16. Verify success message 'Your order has been placed successfully!'
#  17. Click 'Delete Account' button
#  18. Verify 'ACCOUNT DELETED!' and click 'Continue' button

  Scenario: User should place Order: Register before Checkout
    Given I am on homepage
    When I click on Signup-Login button
    And I enter name "Veer" in Name field to signup
    And I enter email "Veerputra@gmail.com" in Email field to signup
    And I click on Signup button
    And I select Title Mrs from Title option
    And I enter password "VeeraP007" in Password field
    And I enter day "30", month "August", year "1996" in Date of Birth field
    And I enter first name "Veera" in Firstname field
    And I enter last name "Patel" in Lastname field
    And I enter address "30,Manekbaug chowk" in Address field
    And I enter "Laldarwaja" in address field
    And I select country "India" from Country dropdown
    And I enter state "Gujarat" in State field
    And I enter city "Ahmedabad" in City field
    And I enter zipcode "380012" in Zipcode field
    And I enter mobile number "09725711222" in Mobile Number field
    And I click on Create Account button
    Then I should see text ACCOUNT CREATED!
    And I click on Continue button
    Then I should see text Logged in as Veer
    And I add product Blue Top to the cart
    And I click on View Cart button on success message
    Then I should navigate to cartpage with text displayed Shopping cart
    And I click on Proceed to Checkout button
    Then I should see text Address Details on checkout page
    And I should see text Review Your Order on checkout page
    And I click on Place Order
    And I enter name "Veer" in Name on Card field
    And I enter card number "4422897822111000" in Card Number field
    And I enter cvv no "900" in CVC field
    And I enter month "07", year "2025" in Expiration field
    And I click on Pay and Confirm Order
    Then I should see success message Congratulations! Your order has been confirmed!
    And I click on Delete Account button
    Then I should see text ACCOUNT DELETED!
    And I click on Continue button









