package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeClassTestNg {

	@Test(priority=2)
	public void methodA() {
		System.out.println("methodA");
	}

	@Test(priority=1)

	public void methodB() {
		System.out.println("methodB");
	}

	@Test(priority=3)

	public void methodC() {
		System.out.println("methodC");
	}

	@Test(invocationCount=5)

	public void methodD() {
		System.out.println("methodD");
	}

	@Test(enabled=true)

	public void methodE() {
		System.out.println("methodE");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = {"methodE"})

	public void methodF() {
		System.out.println("methodF");
	}
	
	@Test(timeOut=1600)

	public void methodG() throws InterruptedException {
		System.out.println("methodG");
		Thread.sleep(1500);
	}


}
