package com.training.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority = 0)
	public void login() {
		System.out.println("2TestLogin");
	}

	@Test(priority = 1)
	public void login1() {
		System.out.println("2TestLogin 1");
	}

	@Test(priority = 2)
	public void login3() {
		System.out.println("2TestLogin 2");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("2Before Test");
	}

	@AfterSuite
	public void after() {
		System.out.println("2After suite");
	}

	@AfterMethod
	public void TearDown() {
		System.out.println("2After Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("2Before Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("2After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("2Before Suite");
	}



}
