package com.SauceDemo.TestClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.Cartpage;
import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
@Listeners( com.soucedemo.utility.ListenerClass.class)
public class TC05BuyingProd extends BaseForLoginLogout

{
	
	@Test(priority=4)
	public void TC05VerifyTheYourInfoInCartButt()
	{
		
		Homepage hp=new Homepage(driver);
		hp.cartbuttclick();
		Cartpage cp = new Cartpage(driver);
		cp.checkout();
	
		cp.enterfn();
		cp.enterln();
		cp.enterzip();
		cp.conbutt2();
		
		String expectedurl = "https://www.saucedemo.com/checkout-step-two.html";
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, expectedurl, "URL not Matched");
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


