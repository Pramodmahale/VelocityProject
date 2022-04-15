package com.SauceDemo.TestClasses;




import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners( com.soucedemo.utility.ListenerClass.class)
public class BaseClass 

{
	
	WebDriver driver;
	Logger log;
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName)
	{
	log=Logger.getLogger("SauceDemo01-v1");
	PropertyConfigurator.configure("log4j.properties");

		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"./drivers//chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers//geckodriver.exe");
			 driver = new FirefoxDriver();
			 log.info("Firefox Browser is opened");
		}
		
		
		
		 log.info("Chrome Browser is opened");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		System.out.println("02.URL is sucessfully opened");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
		
		
		
		@AfterClass
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();
		}
		
		
	}
	
	
	
	
	
	
	
	


