package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ManufacturingPage {
	
	private WebDriver driver;
	
	public ManufacturingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private static final By createBtn= By.xpath("//button[@data-original-title='Create record']");
	private static final By productIdTxtbox= By.xpath("//div[@name='product_id']/div/div/input");
	private static final By confirmBtn=By.xpath("//span[text()='Confirm']");
	private static final By markasdoneBtn=By.xpath("//button[4]/span[text()='Mark as Done']");
	
	
	public void clickCreateBtn() {
		
		driver.findElement(createBtn).click();
	}
	
	public void enterProductIdTxtBox(String productId) {
		driver.findElement(productIdTxtbox).sendKeys(productId);
	}
	
	public void enterproductid() {
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickConfirmBtn() {
		
		driver.findElement(confirmBtn).click();
	}
	
	public void clickmarkasdone() {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(markasdoneBtn));
	}

}
