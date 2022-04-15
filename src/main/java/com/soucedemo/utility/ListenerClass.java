package com.soucedemo.utility;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.soucedemo.utility.UtilityClass;

public class ListenerClass  implements ITestListener


{
   public void onTestStart(ITestResult result)
   {
	  System.out.println("Execution Start");
   }
   public void onTestSuccess(ITestResult result)
   {
	   System.out.println("Test Case sucessfully Passed");
   }
   public void  onTestFailure(ITestResult result) 
   {
	   System.out.println("Test Case Fail sc taken");
	  

	}
	   
	  
	
	   
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Case Skipped");
	}
	public void onTestFailedButwithinSucessPercentage(ITestResult result)
	{
		System.out.println("failed but sucess per");
	}
	public void onStart(ITestResult result)
	{
		System.out.println("TestCase start");
	}
	public void onFinish(ITestResult result)
	{
		System.out.println("Test Case Finish");
	}
	
	
	
	
	
	
	

}
