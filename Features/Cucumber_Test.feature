@FunctionalTest
Feature: Sample Application 
How to ignore some scenarios and execut eonly few amoung all 

@SmokeTest @RegressionTest
Scenario: Successful login
Given This is the blank test 



@RegressionTest
Scenario: Unsuccessful login 
Given This is the blank test 


@SmokeTest
Scenario: Add product to cart 
Given This is the blank test 


Scenario: Add multiple products to cart 
Given This is the blank test 


@SmokeTest @RegressionTest
Scenario: Remove product from cart 
Given This is the blank test 


@RegressionTest
Scenario: Remove all products from cart 
Given This is the blank test 


@SmokeTest 
Scenario: Product quantity from cart page
Given This is the blank test 



Scenario: Decrease product quantity from cart page
Given This is the blank test 


@SmokeTest @E2ETest
Scenario: Buy product with cash payment  
Given This is the blank test 

@SmokeTest @E2ETest
Scenario: Buy product with CC payment  
Given This is the blank test 

@E2ETest
Scenario Outline:  Payment declined
Given This is the blank test 



Examples:
| Payment method |
| CC  |
| DC |
| Net Banking |
| Wallet |