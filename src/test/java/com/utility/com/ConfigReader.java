package com.utility.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader {
	
	private Properties pro;
	private FileInputStream fis;
	
	
	public ConfigReader() {
		
		pro=new Properties();
		
		try {
			
			fis=new FileInputStream(".\\src\\main\\resources\\config\\Config.properties");
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getApplicationUrl() {
		
		return pro.getProperty("url");
	}
	
	public String getEnv() {
		return pro.getProperty("env");
	}

}
