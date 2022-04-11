package com.driverFactory.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public static ThreadLocal<WebDriver> tlocal=new ThreadLocal<WebDriver>();
	
	
	public WebDriver init_driver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlocal.set(new ChromeDriver());
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlocal.set(new FirefoxDriver());
		}else {

			System.out.println("Pass a valid browser name " + browserName);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		
		return tlocal.get();
	}

}
