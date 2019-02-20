package stepDefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pageActions.Action_paymentMode;
import pageFactory.pageFactory;


public class stepDef_paymentMode {
	public static WebDriver driver;
	pageFactory pf =new pageFactory();
		

	@Given("^I want to open the payment page$")
	public void i_want_to_open_the_payment_page() throws Throwable {
		
		pf.openBrowser();
		pf.payOutstanding();  
	}

	@When("^I enter the payment due$")
	public void i_select_the_paymant_method() throws Throwable {
		
		pf.clickCreditcard();
     
      
	}

	@Then("^Payment page should be displayed$")
	public void payment_page_should_be_displayed() throws Throwable {

		pf.validatepaymentpage();
		

	}
	
	@Given("^I want to select the payment through Debit card$")
	public void i_want_to_select_the_payment_through_Debit_card() throws Throwable {


		pf.openBrowser();
		//pf.payOutstanding();  
	}

	@When("^I select the Debit card option$")
	public void i_select_the_Debit_card_option() throws Throwable {

		pf.clickDebitcard();
	}

	@Then("^Validate all the options are available for Debit card payment$")
	public void validate_all_the_options_are_available_for_Debit_card_payment() throws Throwable {
		
		pf.DebitCarddetails();
		
	}

	@Given("^I want to select the payment through Credit card$")
	public void i_want_to_select_the_payment_through_Credit_card() throws Throwable {
		pf.openBrowser();
		pf.payOutstanding(); 
	}

	@When("^I select the Credit card option$")
	public void i_select_the_Credit_card_option() throws Throwable {
		pf.clickCreditcard();
	}

	@Then("^Validate all the options are available for Credit card payment$")
	public void validate_all_the_options_are_available_for_Credit_card_payment() throws Throwable {
      pf.CreditCardDetails();
	}

	@Given("^I want to select the payment through PayTm$")
	public void i_want_to_select_the_payment_through_PayTm() throws Throwable {

		pf.openBrowser();
		//pf.payOutstanding();  
	}

	@When("^I select the PayTm option$")
	public void i_select_the_PayTm_option() throws Throwable {
       pf.clickPaytm();
	}

	@Then("^Validate whether the page is redirected to the PayTm$")
	public void validate_whether_the_page_is_redirected_to_the_PayTm() throws Throwable {
		pf.paytmLogin();
		pf.invaliduname();

	}

	@Given("^I want to select the payment through NetBanking$")
	public void i_want_to_select_the_payment_through_NetBanking() throws Throwable {
		pf.openBrowser();
		pf.payOutstanding(); 
	}

	@When("^I select the NetBanking option$")
	public void i_select_the_NetBanking_option() throws Throwable {
        pf.netbanking();
		
	}

	@When("^when i select the bank for NetBanking$")
	public void when_i_select_the_bank_for_NetBanking() throws Throwable {
		pf.paybyNetbanking();

	}

	
}
