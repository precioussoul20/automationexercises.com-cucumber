Feature: Additional Functionality

#  Test Case 6: Contact Us Form
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Contact Us' button
#  5. Verify 'GET IN TOUCH' is visible
#  6. Enter name, email, subject and message
#  7. Upload file
#  8. Click 'Submit' button
#  9. Click OK button
#  10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#  11. Click 'Home' button and verify that landed to home page successfully
 # @sanity
 Scenario: User should log in Contact Us Form successfully
    Given I am on homepage
    When I click on Contact Us button
    Then I should see text GET IN TOUCH on contact us page
    And I enter name "Priya" in name field
    And I enter email "patelPri@yahoo.co.in" in email address field
    And I enter subject "Shirt" in subject field
    And I enter message "Shirt is defective" in message field
    And I Upload file
    And I click on Submit button
    And I click on OK button
    Then I should see message Success! Your details have been submitted successfully.
    And I click on Home button and verify that i am on homepage successfully
#  Test Case 7: Verify Test Cases Page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click on 'Test Cases' button
#  5. Verify user is navigated to test cases page successfully
  #@sanity
  Scenario: User should navigated to test cases page successfully
    Given I am on homepage
    When I click on Test Cases button
    Then I should be navigated to test cases page successfully


#  Test Case 10: Verify Subscription in home page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Scroll down to footer
#  5. Verify text 'SUBSCRIPTION'
#  6. Enter email address in input and click arrow button
#  7. Verify success message 'You have been successfully subscribed!' is visible
#@sanity
  Scenario: Verify Subscription in home page
    Given I am on homepage
    When I scroll down to footer
    Then I should see text SUBSCRIPTION
    And I enter email address "patelPri@yahoo.co.in" in input field
    And I click on arrow button
    Then I should see success message You have been successfully subscribed!


#  Test Case 11: Verify Subscription in Cart page
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#  4. Click 'Cart' button
#  5. Scroll down to footer
#  6. Verify text 'SUBSCRIPTION'
#  7. Enter email address in input and click arrow button
#  8. Verify success message 'You have been successfully subscribed!' is visible
#@sanity
  Scenario: Verify Subscription in Cart page
    Given I am on homepage
    When I click on Cart button
    And I scroll down to footer
    Then I should see text SUBSCRIPTION
    And I enter email address "patelPri@yahoo.co.in" in input field
    And I click on arrow button
    Then I should see success message You have been successfully subscribed!
