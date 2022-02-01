package com.channelNewsAsiaUiAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		
		driver.findElement(By.xpath(pageLocators.AllScetions)).click();
		
		Thread.sleep(3000);
		
		WebElement el =  driver.findElement(By.xpath(pageLocators.Singapore));

		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", el);
		
		System.out.println("After clicking ***************************************");
		
		Thread.sleep(3000);
		
		
		WebElement el2 = driver.findElement(By.xpath(pageLocators.SingaporeNews));
		
		String headlines = el2.getText();
		
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("arguments[0].click();", el2);
		
		Assert.assertTrue(true);
		
		System.out.println("After clicking on the Singapore news");
		
		
		
		WebElement newHeadlineAfterClick = driver.findElement(By.xpath(pageLocators.newHeadlineAfterClick));

		String headlinesAftrClick = newHeadlineAfterClick.getText();
		
		if (headlines.equalsIgnoreCase(headlinesAftrClick)) {

			Assert.assertTrue("Verified we are on the expected Page", true);

			Assert.assertEquals(headlines, headlinesAftrClick);

			System.out.println("We are on the expected page");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor jse6 = (JavascriptExecutor) driver;

		jse6.executeScript("window.scrollBy(0,8500)", "");

		

		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(
				By.xpath(pageLocators.ReadFullArticle)));

		WebElement el1 = driver.findElement(
				By.xpath(pageLocators.ReadFullArticle));

		jse6.executeScript("arguments[0].scrollIntoView();", el1);

		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", el1);
		
		Assert.assertTrue("Clicked on Read Full Article", true);
		
		System.out.println("Clicked on Read Full Article");

		
		
		
		
		
		
		

		
		
		
	}

}
