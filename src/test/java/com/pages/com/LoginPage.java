package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private static final By emailid=By.xpath("//input[@id='login']");
	private static final By password=By.xpath("//input[@id='password']");
	private static final By loginbtn=By.xpath("//button[text()='Log in']");
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void enterEmailid(String emailId) {
		
		driver.findElement(emailid).sendKeys(emailId);
	}
	
	public void enterPassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}

}
