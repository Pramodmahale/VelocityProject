package com.soucedemo.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;                    
import org.openqa.selenium.io.FileHandler;

import com.SauceDemo.TestClasses.BaseClass;
import com.SauceDemo.TestClasses.BaseForLoginLogout;

public class UtilityClass 
{
	
//	WebDriver driver;
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date date = new Date();
		DateFormat d = new SimpleDateFormat("mm-dd-yy,hh-mm-ss");
		String newdate=d.format(date);
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\Dell\\eclipse-workspace\\SauceDemo01-v1\\screenshots"+newdate+".jpg");
		FileHandler.copy(source, des);
	     
		


		
	}

}
