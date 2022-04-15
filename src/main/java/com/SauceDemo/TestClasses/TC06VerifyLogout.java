package com.SauceDemo.TestClasses;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
@Listeners( com.soucedemo.utility.ListenerClass.class)
public class TC06VerifyLogout extends BaseForLoginLogout
{

		@Test(priority=6)
		public void TC06VerifyLogoutFunctionality() 
		{
			
			
			String expectedurl="https://www.saucedemo.com/inventory.html";
			String actualurl= driver.getCurrentUrl();
			System.out.println(actualurl);
			Assert.assertEquals(actualurl, expectedurl, "Url does't matched");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

