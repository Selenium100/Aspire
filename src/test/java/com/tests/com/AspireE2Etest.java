package com.tests.com;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.driverFactory.com.DriverFactory;
import com.pages.com.HomePage;
import com.pages.com.InventoryPage;
import com.pages.com.LoginPage;
import com.pages.com.ManufactureOrderingPage;
import com.pages.com.ManufacturingPage;
import com.pages.com.ProductPage;
import com.utility.com.BasePage;
import com.utility.com.ConfigReader;
import com.utility.com.ExcelUtils;

public class AspireE2Etest extends BasePage {
	
	String product="Product"+RandomStringUtils.randomAlphanumeric(5).toUpperCase();
	
	@Test(dataProvider="data")
	public void E2Etest(String emailId,String pass,String producttype,String countedquantity) throws InterruptedException {
		
		LoginPage login=new LoginPage(DriverFactory.getDriver());
		login.enterEmailid(emailId);
		login.enterPassword(pass);
		login.clickLogin();
		
		HomePage home=new HomePage(DriverFactory.getDriver());
		home.clickInventoryLink();
		
		InventoryPage inventory=new InventoryPage(DriverFactory.getDriver());
		inventory.clickProducts();
		inventory.clickProductsinsidelink();
		inventory.clickCreatebtn();
		
		ProductPage productpage=new ProductPage(DriverFactory.getDriver());
		productpage.enterProductName(product);
		productpage.selectProductType(producttype);
		productpage.clickUpdateQuantity();
		productpage.clickCreateBtn();
		productpage.enterCountedQuantity(countedquantity);
		
		
		productpage.clickSave();
		productpage.clickGivenProductName();
		productpage.clickHomeMenu();
		
		home.clickManufacturingLink();
		
		ManufacturingPage manufacturing=new ManufacturingPage(DriverFactory.getDriver());
		manufacturing.clickCreateBtn();
		System.out.println(product);
		manufacturing.enterProductIdTxtBox(product);
		Thread.sleep(3000);
		manufacturing.enterproductid();
		manufacturing.clickConfirmBtn();
		Thread.sleep(3000);
		ManufactureOrderingPage mordering=new ManufactureOrderingPage(DriverFactory.getDriver());
		mordering.clickmarkasdone();
		
		
		
	}
	
	
	@DataProvider(name="data")
	public Object[][] getdata() throws Exception{
		
		ExcelUtils utils=new ExcelUtils(this.getClass().getSimpleName()+".xlsx", new ConfigReader().getEnv());
		Object[][] data= utils.getTableArray();
		return data;
		
	}

}
