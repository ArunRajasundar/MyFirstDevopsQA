package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class MainPageStepDef {

	WebDriver driver;
	 public MainPageStepDef()
	 {
		 WebDriver driver = null;
	 }
@Given("^The payment application is loaded$")
public void the_payment_application_is_loaded() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.ie.driver", "Libs/IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.get("http://localhost:1010/DevEnv");
}

@SuppressWarnings("deprecation")
@Then("^Payment options should be displayed$")
public void payment_options_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement crediCardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Credit Card']")));
	Assert.assertNotNull(crediCardElement);
	WebElement netBankingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Credit Card']")));
	Assert.assertNotNull(netBankingElement);
	WebElement paytmElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Credit Card']")));
	Assert.assertNotNull(paytmElement);
	WebElement debitCardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Credit Card']")));
	Assert.assertNotNull(debitCardElement);
}

}
