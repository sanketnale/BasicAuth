package com.crm.generic_utility;

import org.testng.annotations.*;


public class BaseClass {

	
	@BeforeSuite
	public void configureBS() {
		
		System.out.println("Connect to the database");	
	}
	@BeforeTest
     public void configureBT() {
		
		System.out.println("execute the script into parallel mode");	
	}
	@BeforeClass
     public void configureBC() {
		
		System.out.println("Launching browser");	
	}
	@BeforeMethod
    public void configureBM() {
		
		System.out.println("Login to the browser");	
	}
	@AfterMethod
     public void configureAF() {
		
		System.out.println("Logout from the application");	
	}
	
	@AfterClass
     public void configureAC() {
		
		System.out.println("Close the browser");	
	}
	@AfterTest
     public void configureAT() {
		
		System.out.println("close the parallel mode");	
	}
	
	@AfterSuite
    public void configureAS() {
		
		System.out.println("Close the database Connection");	
	}
	
	
	
	
	
	
	
	
	
}
