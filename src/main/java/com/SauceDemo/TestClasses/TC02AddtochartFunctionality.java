package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.AddToCart;
import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
@Listeners( com.soucedemo.utility.ListenerClass.class)
public class TC02AddtochartFunctionality extends BaseForLoginLogout
{
	
	@Test(invocationCount=3,priority=1)
	public void verifyAddTocartFunctionality()
	{
		Homepage hp =new Homepage(driver);
		hp.addtocartbuttclick();
		
		String actualtext=hp.addtocartbuttclick();
		String expectedtext="ADD TO CART";
		System.out.println(actualtext);
		
		Assert.assertEquals(actualtext, expectedtext, "Wrong Text");
		

	}

}
