package com.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ManufactureOrderingPage {

	private WebDriver driver;

	public ManufactureOrderingPage(WebDriver driver) {

		this.driver = driver;
	}

	private static final By markasdoneBtn = By.xpath("//button[4]/span[text()='Mark as Done']");
    private static final By applyBtn=By.xpath("//span[text()='Apply']");
	public void clickmarkasdone() throws InterruptedException {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(markasdoneBtn));
		} catch (StaleElementReferenceException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(markasdoneBtn));
		}
		
		System.out.println("Continue code after catch");
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		
        driver.findElement(applyBtn).click();
		
	}

}
