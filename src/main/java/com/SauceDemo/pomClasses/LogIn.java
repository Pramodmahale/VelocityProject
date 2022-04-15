package com.SauceDemo.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement logbutt;
	
	
	public LogIn(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}

	public void sendPass()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogbutt()
	{
		logbutt.click();
		
	}
	
	
	
	}
	

