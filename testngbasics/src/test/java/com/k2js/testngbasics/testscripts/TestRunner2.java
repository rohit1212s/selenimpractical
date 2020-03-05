package com.k2js.testngbasics.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestRunner2 {
	String bn, rm, url;


	@BeforeSuite
	public void dbConnect() {
		System.out.println("code to connect db");
	}
	
	@Parameters({ "browser", "runmode" })
	@BeforeClass
	public void readData(@Optional("chrome") String b, @Optional("local") String r) {
		System.out.println("Step 1-Read browser name from property file" + b);
		System.out.println("Step 2-Read runnmode from property file" + r);
		System.out.println("Step 3-Read Url from property file" + url);
	}

	@BeforeMethod
	public void preConditions() {
		System.out.println("Step 4-Open Browser");
		System.out.println("Step 5-Open URl");
		System.out.println("Step 6-Create Homepage object");
	}

	@Test
	public void verifyHeadings() {
		System.out.println("Step 7-read username from property file");
		System.out.println("Step 8-Enter username");
		System.out.println("Step 9-read password from property file");
		System.out.println("Step 10-Enter password");
		System.out.println("Step 11-click on Login button");
		System.out.println("Step 12-Get the heading 1");
		System.out.println("Step 13-Get the heading 2");
		System.out.println("Step 14-click on sign of");

	}

	@AfterMethod
	public void closure() {
		System.out.println("Test case completed");
		System.out.println("--------------------------------------------");
		System.out.println("Browser is closed");
	}

	@AfterClass
	public void classCompleted() {
		System.out.println(this.getClass().getName() + "is completed");
	}

	@AfterSuite
	public void closeDBConnection() {
		System.out.println("code to close db connection");
	}

}
