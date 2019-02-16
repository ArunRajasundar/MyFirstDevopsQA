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

  @PaymentPage @UnitTest @Regression
  Scenario: Validating four payment option are displayed in home page
    Given The payment application is loaded
    Then Payment options should be displayed
