#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Validating index page functionalities
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Payment options page

  @PaymentPage @UnitTest
  Scenario: Validating four payment option are displayed in home page
    Given The payment application is loaded
    Then Payment options should be displayed


  Scenario: Payment method selection
    Given I want to open the payment page
    When I enter the payment due
    Then Payment page should be displayed

@regression @tc01
  Scenario: Debit card payment
    Given I want to select the payment through Debit card
    When I select the Debit card option
    Then Validate all the options are available for Debit card payment

@regression
  Scenario: Credit card payment
    Given I want to select the payment through Credit card
    When I select the Credit card option
    Then Validate all the options are available for Credit card payment

@regression @UnitTest
  Scenario: PayTm payment
    Given I want to select the payment through PayTm
    When I select the PayTm option
    Then Validate whether the page is redirected to the PayTm

@regression
  Scenario: NetBanking payment
    Given I want to select the payment through NetBanking
    When I select the NetBanking option
    And when i select the bank for NetBanking
    Then Validate whether the page is redirected to the PayTm
