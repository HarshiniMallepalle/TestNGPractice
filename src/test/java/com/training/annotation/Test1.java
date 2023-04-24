package com.training.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * Testing for Git this is new Branch
 * 
 * 
 */
public class Test1 {
	
	@Test(priority = 0,groups="smoke")
	public void login() {
		System.out.println("1TestLogin");
	}

	@Test(priority = 1,groups={"smoke","regression"})
	public void login1() {
		System.out.println("1TestLogin 1");
	}

	@Test(priority = 2)
	public void login3() {
		System.out.println("1TestLogin 2");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("1Before Test");
	}

	@AfterSuite
	public void after() {
		System.out.println("1After suite");
	}

	@AfterMethod
	public void TearDown() {
		System.out.println("1After Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("1Before Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("1After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1Before Suite");
	}



}
