package pageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import junit.framework.Assert;

public class pageFactory {
	public static WebDriver driver;
	
	public static WebDriver openBrowser() throws InterruptedException, IOException
	{
		URL url = Resources.getResource("TestProperties.properties");
		String text = Resources.toString(url, Charsets.UTF_8);
		System.out.println(text);
//		Properties pro = new Properties();
//		InputStream inputs = new FileInputStream("src/test/java/TestProperties.properties");
//		pro.load(inputs);
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.
  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability("ignoreProtectedModeSettings", true);
				
		System.setProperty("webdriver.ie.driver", "Libs/IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", "Libs/geckodriver.exe");
		driver = new InternetExplorerDriver();
		//driver = new FirefoxDriver();
		driver.get(text.replace("URL1=", ""));
	//	driver.manage().window().fullscreen();
		Thread.sleep(2000);
		return driver;
	}
	
	public void payOutstanding()
	{
//		WebElement web = driver.findElement(By.xpath("//div[@class='cont_ba_opcitiy']//input[@type='text']"));
//		web.click();
//	    web.sendKeys("300");
//	    driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
	}
	public void clickCreditcard() throws InterruptedException
	{
	       driver.findElement(By.xpath("//div[@id='horizontalTab']//span[contains(text(),'Credit Card')]")).click();
	       String creditcard = "//label[@class='pic1']";
	         if (existsElement(creditcard)) {
	        	 System.out.println("Pass : Element Exist - Credit card" );
			} else {
				 System.out.println("Fail : Element does not Exist - Credit card");
			}
	       Thread.sleep(2000);
	}
	public void clickPaytm() throws InterruptedException
	{
		 driver.findElement(By.xpath("//div[@id='horizontalTab']//span[contains(text(),'PayTM')]")).click();
		 Thread.sleep(2000);
		 
         
		
	}
	
	public void netbanking() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='horizontalTab']//span[contains(text(),'Net Banking')]")).click();
		 String Netbanking = "//label[@class='pic2']";
         if (existsElement(Netbanking)) {
        	 System.out.println("Pass : Element Exist - Netbanking" );
		} else {
			 System.out.println("Fail : Element does not Exist - Netbanking");
		}
         
		 Thread.sleep(2000);
	}
	public void paybyNetbanking() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='radio']/label[contains(text(),'Andhra Bank')]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div//a[contains(text(),'Continue')]")).click();
		if(driver.findElement(By.xpath("//h2")).getText().contentEquals("You are being redirected to bank website"))
		{
            System.out.println("Pass:Redirecting to bank website");

		}
		closeBrowser();
	}
	
	public void paytmLogin() throws InterruptedException
	{
		String Paytm = "//label[@class='pic3']";
		if (existsElement(Paytm)) {
       	 System.out.println("Pass : Element Exist - Paytm" );
		} else {
			 System.out.println("Fail : Element does not Exist -Paytm ");
		}
		WebElement uname =driver.findElement(By.xpath("//div[@class='user-login']/form/input[@type='text']"));
		WebElement pass =driver.findElement(By.xpath("//div[@class='user-login']/form/input[@type='password']"));
		WebElement LoginBtn =driver.findElement(By.xpath("//div[@class='user-right']/a[contains(text(),'Login')]"));
               uname.sendKeys("Abin");
				pass.sendKeys("Abin");
				LoginBtn.click();
				if(driver.findElement(By.xpath("//h2")).getText().contentEquals("Thank you for Choosing PAYTM"))
				{
		System.out.println("Pass :Able to login to paytm payments");
		driver.navigate().back();
	    clickPaytm();
		Thread.sleep(2000);
				}
		
		
		}

	public void invaliduname() throws InterruptedException
	{
		WebElement uname =driver.findElement(By.xpath("//div[@class='user-login']/form/input[@type='text']"));
		WebElement pass =driver.findElement(By.xpath("//div[@class='user-login']/form/input[@type='password']"));
		WebElement LoginBtn =driver.findElement(By.xpath("//div[@class='user-right']/a[contains(text(),'Login')]"));
		uname.click();
		uname.sendKeys("Abin");
		LoginBtn.click();
		if(driver.findElement(By.xpath("//h2")).getText().contentEquals("Thank you for Choosing PAYTM"))
		{
            System.out.println("Failed :password is not entered and the user is able to login");

		}
		closeBrowser();
		
	}
	
		
		
	
	public void clickDebitcard() throws InterruptedException
	{
	       driver.findElement(By.xpath("//div[@id='horizontalTab']//span[contains(text(),'Debit Card')]")).click();
	       Thread.sleep(2000);
	}
	public void CreditCardDetails() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[1]")).sendKeys("Abin Raju");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[2]")).sendKeys("9999999999999999");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='MM']")).sendKeys("05");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='YYYY']")).sendKeys("2020");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-right user-form-rt']/input[1]")).sendKeys("2021");
	       int year = Calendar.getInstance().get(Calendar.YEAR);
	       System.out.println(year);
	       Thread.sleep(1000);
	       System.out.println("Submitting Debit card details");
	       int cyear=2021;
	       if(cyear<year)
	       {
	    	   
		       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//input[@type='submit']")).click();
		       System.out.println("\"Credit card details submitted successfully");
	    	   System.out.println("Failed :Card expired error not thrown");
	       }
	       else
	       {
		       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//input[@type='submit']")).click();
		       System.out.println("Credit card details submitted successfully");
	    	   System.out.println("Pass :Credit card is valid");
	       }

	       closeBrowser();
	}
	public void DebitCarddetails() throws InterruptedException
	{
		
		String Debitcard = "//label[@class='pic4']";
        if (existsElement(Debitcard)) {
       	 System.out.println("Pass : Element Exist - Debit card" );
		} else {
			 System.out.println("Fail : Element does not Exist - Debit card");
		}
		  driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[1]")).sendKeys("Abin Raju");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//form/div/input[2]")).sendKeys("9999999999999999");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='MM']")).sendKeys("05");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-left user-form']//ul/li/input[@value='YYYY']")).sendKeys("2020");
	       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//div[@class='tab-form-right user-form-rt']/input[1]")).sendKeys("2014");
	       int year = Calendar.getInstance().get(Calendar.YEAR);
	       System.out.println(year);
	       Thread.sleep(1000);
	       System.out.println("Submitting Debit card details");
	       int cyear=2014;
	       if(cyear<year)
	       {
	    	   
		       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//input[@type='submit']")).click();
		       System.out.println("Debit card details submitted successfully");
	    	   System.out.println("Failed :Card expired error not thrown");
	    	   Assert.fail("Failed :Card expired error not thrown");
	       }
	       else
	       {
		       driver.findElement(By.xpath("//div[@class='tab-1 resp-tab-content resp-tab-content-active']//input[@type='submit']")).click();
		       System.out.println("Debit card details submitted successfully");
	    	   System.out.println("Pass :Credit card is valid");
	       }

	       closeBrowser();
	}
	
	public void validatepaymentpage() throws InterruptedException
	{
			String pageTitle1 = driver.getTitle();
	           String ExpTitle1 = "Payment Screen";
	           if (ExpTitle1.equals(pageTitle1)) {
	        	   System.out.println("Pass : Expected Title : " + ExpTitle1 + "Actual Title : " +pageTitle1 );
			} else {
				System.out.println("Fail : Expected Title : " + ExpTitle1 + "Actual Title : " +pageTitle1 );
			}
	        
	         String creditcard = "//label[@class='pic1']";
	         if (existsElement(creditcard)) {
	        	 System.out.println("Pass : Element Exist - Credit card" );
			} else {
				 System.out.println("Fail : Element does not Exist - Credit card");
			}
	         
	         String Netbanking = "//label[@class='pic2']";
	         if (existsElement(Netbanking)) {
	        	 System.out.println("Pass : Element Exist - Netbanking" );
			} else {
				 System.out.println("Fail : Element does not Exist - Netbanking");
			}
	         
	         String Paytm = "//label[@class='pic3']";
	         if (existsElement(Paytm)) {
	        	 System.out.println("Pass : Element Exist - Paytm" );
			} else {
				 System.out.println("Fail : Element does not Exist -Paytm ");
			}
	         
	         String Debitcard = "//label[@class='pic4']";
	         if (existsElement(Debitcard)) {
	        	 System.out.println("Pass : Element Exist - Debit card" );
			} else {
				 System.out.println("Fail : Element does not Exist - Debit card");
			}
		
        Thread.sleep(1000);
		closeBrowser();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	private boolean existsElement(String xpath) {
	    try {
	        driver.findElement(By.xpath(xpath));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
}
