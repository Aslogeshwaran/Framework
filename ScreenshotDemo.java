package com.selenium.webOperations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);

		File screenshotTo=new File(".\\screenshots\\screen"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(screenshotAs, screenshotTo);
		
		WebElement emailField = driver.findElement(By.id("email"));
		
		File screenshotAsField = emailField.getScreenshotAs(OutputType.FILE);
		
		File screenshotToField=new File(".\\screenshots\\field"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(screenshotAsField, screenshotToField);

	}

}
