package com.SauceDemo.pomClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage 
{
	
	
	private  WebDriver driver;
	//button[@id='checkout']
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement fn;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement sn;
	
	@FindBy(xpath="//input[@id='postal-code']")
	
	private WebElement zip;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement contbutt;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement cont;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;

    public Cartpage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   
    
  
    public void checkout()
    {
    	checkout.click();
    }
    
    public void conbutt()
    {
    	cont.click();
    }
    public void enterfn()
    {
    	fn.sendKeys("pramod");
    }
    public void enterln()
    {
    	sn.sendKeys("mahale");
    }
    public void enterzip()
    {
    	zip.sendKeys("422209");
    }
    public void continuebutt()
    {
    	cont.click();
    }
    public void finish()
    {
    	finish.click();
    }
    public void conbutt2() 
    {
    	contbutt.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
