package com.SauceDemo.TestClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.Cartpage;
import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
@Listeners(com.soucedemo.utility.ListenerClass.class)
public class TC04VerifyAbleToClickOnContbutt extends BaseForLoginLogout
{
	@Test(priority=3,timeOut=1500)
	public void TC04VerifyAbleToClickOnContbutt()
	{
		Homepage hp = new Homepage(driver);
		hp.cartbuttclick();
		Cartpage cp = new Cartpage(driver);

		cp.checkout();
	    String expectedurl="https://www.saucedemo.com/checkout-step-one.html";
	    String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, expectedurl, "URL not matched");
		
	}
		
		
	   
	
	
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	


