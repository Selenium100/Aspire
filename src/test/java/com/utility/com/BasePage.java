package com.utility.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.driverFactory.com.DriverFactory;

public class BasePage {
	
	
	private DriverFactory factory;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browserName) {
		
		factory=new DriverFactory();
		factory.init_driver(browserName);
		DriverFactory.getDriver().get(new ConfigReader().getApplicationUrl());
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		//DriverFactory.getDriver().quit();
	}
	

}
