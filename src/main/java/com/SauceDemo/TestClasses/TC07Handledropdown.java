package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
@Listeners(com.soucedemo.utility.ListenerClass.class)
public class TC07Handledropdown extends BaseForLoginLogout
{
	
	
	
	@Test(priority=5)
	public void verifyDropDown() throws InterruptedException
	{

		Homepage hp = new Homepage(driver);
		hp.filterbuttclick();
		String expectedtext="Price (low to high)";
		
		
		
		
		
	}
	
	
	
		
		
	
	
	
	
	
	

}
