package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private static final By discussLink=By.xpath("//div[text()='Discuss']");
	private static final By inventoryLink=By.xpath("//div[text()='Inventory']");
	private static final By manufacturingLink=By.xpath("//div[text()='Manufacturing']");
	
	
	public void clickInventoryLink() {
		
		driver.findElement(inventoryLink).click();
	}
	
	public void clickManufacturingLink() {
		
		driver.findElement(manufacturingLink).click();
	}

}
