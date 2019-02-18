package elementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class elementLocators_paymentmode {

	//Need to identify the locators here	
	
	@FindBy(xpath="//div[@class='cont_ba_opcitiy']//input[@type='text']")
	WebElement outstanding;
	
	@FindBy(xpath="//button[contains(text(),'Pay')]")
	WebElement payButton;
	
	@FindBy(xpath="//div[@id='horizontalTab']//span[contains(text(),'Credit Card')]")
	WebElement CreditCardLabel;
	
	@FindBy(xpath="//div[@id='horizontalTab']//span[contains(text(),'Debit Card')]")
	WebElement DebitCardLabel;
	
	@FindBy(xpath="//div[@id='horizontalTab']//span[contains(text(),'PayTM')]")
	WebElement NetBankingLabel;
	
	@FindBy(xpath="//div[@id='horizontalTab']//span[contains(text(),'Net Banking')]")
	WebElement PaytmLabel;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[1]")
	WebElement CreditCardName;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[2]")
	WebElement CreditCardNumber;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='MM']")
	WebElement CreditCardMonth;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='YYYY']")
	WebElement CreditCardYear;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-right user-form-rt']/input[1]")
	WebElement CreditCardCVVNumb;
	
	@FindBy(xpath="//div[@class='tab-1 resp-tab-content resp-tab-content-active']//input[@type='submit']")
	WebElement CreditCardSubmit;
	
	@FindBy(xpath="//div[@class='radio']/label[contains(text(),'Andhra Bank')]/i")
	WebElement Netbankingradio;
	
	@FindBy(xpath="//div//a[contains(text(),'Continue')]")
	WebElement NetbankingContinuebutton;
	
	@FindBy(xpath="//div[@class='user-login']/form/input[1]")
	WebElement PaytmUsername;
	
	@FindBy(xpath="//div[@class='user-login']/form/input[2]")
	WebElement PaytmPwd;
	
	@FindBy(xpath="//div[@class='user-right']/a[contains(text(),'Login')]")
	WebElement PaytmLoginButton;




	

	
	
	
	
	
	
	
	
}
