package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	private WebDriver driver;

	public ProductPage(WebDriver driver) {

		this.driver = driver;
	}

	private static final By productName = By.xpath("//input[@name='name']");
	private static final By productType=By.xpath("//select[@name='detailed_type']");
	private static final By saveBtn=By.xpath("//button[@title='Save record']");
	private static final By updateQuantity=By.xpath("//span[text()='Update Quantity']");
	private static final By createBtn=By.xpath("//button[@data-original-title='Create record']");
	private static final By countedQuantity=By.xpath("//input[@class='o_field_float o_field_number o_field_widget o_quick_editable o_input']");
	private static final By givenProductName=By.xpath("//li[@class='breadcrumb-item o_back_button']/a");
	private static final By homeMenu=By.xpath("//a[@title='Home menu']");

	public void enterProductName(String product) {

		driver.findElement(productName).sendKeys(product);
	}
	
	public void selectProductType(String producttype) {
		
		Select select=new Select(driver.findElement(productType));
		select.selectByVisibleText(producttype);
	}
	
	public void clickSave() {
		driver.findElement(saveBtn).click();
	}
	
	public void clickUpdateQuantity() {
		
		driver.findElement(updateQuantity).click();
	}
	
	public void clickCreateBtn() {
		driver.findElement(createBtn).click();
	}
	
	public void enterCountedQuantity(String countedquantity) {
		
		driver.findElement(countedQuantity).clear();
		driver.findElement(countedQuantity).sendKeys(countedquantity);
	}
	
	public void clickGivenProductName() {
		driver.findElement(givenProductName).click();
	}
	
	public void clickHomeMenu() {
		
		driver.findElement(homeMenu).click();
	}
	
	
}
