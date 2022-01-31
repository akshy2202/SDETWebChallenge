package com.channelNewsAsiaUiAutomation;

import java.awt.List;
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

public class TestScenariosThree {
	static WebDriver driver;
	pageLocators pageLocators = new pageLocators();

	@BeforeClass
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHAY\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.channelnewsasia.com/news/international");

		driver.manage().window().maximize();

	}

	@Test
	public void ValidateSingaporeNews() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='all-section-menu main-menu__link']")).click();

		Thread.sleep(3000);
		WebElement el3 = driver.findElement(By.xpath("//a[@href='https://www.channelnewsasia.com/weather']"));

		JavascriptExecutor j3 = (JavascriptExecutor) driver;
		j3.executeScript("arguments[0].click();", el3);

		java.util.List<WebElement> vals = driver.findElements(By
				.xpath("//ul[@class='weather__list-block--view']/li/ul/li/div/div[@class='tabular-list__view--city']"));
		int size = vals.size();

		//System.out.println("The count is ::::   **************************** " + size);
		
		String st =vals.get(12).getText();
		
		System.out.println("The city is  :: " +st);
		
		Assert.assertEquals("Kuala Lumpur", st);

		

		java.util.List<WebElement> vals1 = driver.findElements(By.xpath(
				"//ul[@class='weather__list-block--view']/li/ul/li/div/div[@class='tabular-list__view--condition']"));

		int size2 = vals1.size();

		//System.out.println("The count is ::::   **************************** " + size2);
		
		String st1 =vals1.get(12).getText();
		
		System.out.println("The weather  is  :: " +st1);
		
		Assert.assertEquals("Thunderstorm", st1);

		

		
		java.util.List<WebElement> vals2 = driver.findElements(By.xpath(
				"//ul[@class='weather__list-block--view']/li/ul/li/div[@class='tabular-list__view--temp']/span[@class='tabular-list__view--temp--max']"));

		int size3 = vals2.size();
 
	//	System.out.println("The count is ::::   **************************** " + size3);

		
			String st2 =vals2.get(12).getText();
			
			System.out.println("The Max Temperature is  :: " +st2);
			
			Assert.assertEquals("33", st2);
			
			
			java.util.List<WebElement> vals3 = driver.findElements(By.xpath(
					"//ul[@class='weather__list-block--view']/li/ul/li/div[@class='tabular-list__view--temp']/span[@class='tabular-list__view--temp--min']"));

			int size4 = vals3.size();
	 
		//	System.out.println("The count is ::::   **************************** " + size3);

			
				String st3 =vals3.get(12).getText();
				
				System.out.println("The Min Temperature is  :: " +st3);
				
				Assert.assertEquals("24", st3);
		}

	}

