package com.SauceDemo.pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage 
{
	
	private WebDriver driver;
	
	@FindBy(xpath="(//html//div//button)[3]")
	private  WebElement Backpackaddtocartbutt;
	
	@FindBy(xpath="//html//div//button")
	private List<WebElement> addtocartbuttallprod;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartbutt;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubutt;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutt; 
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterbutt;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutbutt;

	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

    public String addtocartbuttclick()
    {
    	Backpackaddtocartbutt.click();
    	String text=Backpackaddtocartbutt.getText();
    	return(text);
    	
    }
    
    
   
	
	public void cartbuttclick()
	{
		cartbutt.click();
	}
	
	public void menubuttclick()
	{
		menubutt.click();
//		Actions act = new Actions (driver);
//		act.click(menubutt).perform();
//		
		
	}
	
	
	public void logoutbuttclick()
	{
		logoutbutt.click();
	}
	
	public void filterbuttclick() throws InterruptedException
	{
	
		filterbutt.click();
	Select sel = new Select(filterbutt);
	sel.selectByIndex(2);
	filterbutt.getText();

		
	}
	public void alladdtocartbutt()
	{
		for (int i=0;i<addtocartbuttallprod.size();i++)
		{
			addtocartbuttallprod.get(i).click();
		}
		
		
	}
	public void aboutButtonClick()
	{
		aboutbutt.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
