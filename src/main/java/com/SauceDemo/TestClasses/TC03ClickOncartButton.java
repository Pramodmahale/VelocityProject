package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.pomClasses.Cartpage;
import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;
import com.soucedemo.utility.UtilityClass;
@Listeners( com.soucedemo.utility.ListenerClass.class)
public class TC03ClickOncartButton extends BaseForLoginLogout
{
	@Test(priority=2)
	public void VerifyableToBuyProd() throws IOException, InterruptedException
	{
		
		Homepage hp =new Homepage(driver);
		hp.cartbuttclick();
		
		String actualurl=driver.getCurrentUrl();
		String expectedurl= "https://www.saucedemo.com/cart.html";
		
		Assert.assertEquals(actualurl, expectedurl, "URL nao matched");
		
		
		
	}
	 

}
