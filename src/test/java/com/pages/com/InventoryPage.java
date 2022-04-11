package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InventoryPage {

	private WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	private static final By productLink = By.xpath("//span[normalize-space()='Products']");
    
	private static final By createLink=By.xpath("//button[@title='Create record']");
	
	public void clickProducts() {

		driver.findElement(productLink).click();

	}

	public void clickProductsinsidelink() {

		Actions a = new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();

	}
	
	public void clickCreatebtn() {
		
		driver.findElement(createLink).click();
	}
}
