package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.pomClasses.Homepage;
import com.SauceDemo.pomClasses.LogIn;

public class BaseForLoginLogout extends BaseClass
{
	
	
	
	@BeforeMethod
	public void setUpMethod()
	{
	LogIn rv = new LogIn(driver);
	
		rv.sendUsername();
		log.info("user name send sucessfully");
		rv.sendPass();
		rv.clickLogbutt();
		System.out.println("login");
	}
	
	
	@AfterMethod
	public void tearDownMethod()
	{
		Homepage hp= new Homepage(driver);
		hp.menubuttclick();
		hp.logoutbuttclick();
		System.out.println("logout");
		
	}

}
