package com.channelNewsAsiaUiAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.pageLocators;
import junit.framework.Assert;

public class TestScenarioTwo 
{
	

	static WebDriver driver;
	pageLocators pageLocators = new pageLocators();
	
	
	@BeforeClass
	public static void initDriver() 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHAY\\Downloads\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.channelnewsasia.com/news/international");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void ValidateSingaporeNews() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='all-section-menu main-menu__link']")).click();
		
		Thread.sleep(3000);
		
		WebElement el =  driver.findElement(By.xpath("//ul[@class='hamburger-menu hamburger-menu--sub hamburger-menu--sub-1']/li/a[@href='/singapore'][1]"));

		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", el);
		
		System.out.println("After clicking ***************************************");
		
		Thread.sleep(3000);
		
		
		WebElement el2 = driver.findElement(By.xpath("//a[@class='h3__link h3__link-- list-object__heading-link'][1]"));
		
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("arguments[0].click();", el2);
		
		Assert.assertTrue(true);
		
		System.out.println("After clicking on the Singapore news");
		
		
		
		
		

		
		
		
	}

}
