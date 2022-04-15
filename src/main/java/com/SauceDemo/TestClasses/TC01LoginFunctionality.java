package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners( com.soucedemo.utility.ListenerClass.class)
public class TC01LoginFunctionality extends BaseForLoginLogout
{
	
	
	@Test(priority=0)
	public void TC01LoginFunctionality1()
	{
		
		
		String expectedurl="//www.saucedemo.com/inventory.html";
         String current=driver.getCurrentUrl();
		System.out.println(current);
		Assert.assertEquals(current, expectedurl, "null");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
