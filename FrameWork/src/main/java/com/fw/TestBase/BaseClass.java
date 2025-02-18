package com.fw.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private WebDriver driver;

	
	public WebDriver createDriver(String browserName)
	{
		switch(browserName.toLowerCase())
		{
		case "chrome": new ChromeDriver(); break;
		}
		return driver;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(String browserName) {
		this.driver = createDriver(browserName);
	}
	
	
}
