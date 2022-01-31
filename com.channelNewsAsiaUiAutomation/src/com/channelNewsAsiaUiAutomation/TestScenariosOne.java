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

public class TestScenariosOne 
{
	
	static WebDriver driver;
	pageLocators pageLocators = new pageLocators();
	
	
	@BeforeClass
	public static void initDriver() 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHAY\\Downloads\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.channelnewsasia.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void ValidateTitle() throws InterruptedException 
	{
		
		String title = driver.getTitle();
	
	System.out.println("********************** Value of title is ****************** " +title);
	
	
	
	WebElement newHeadline = driver.findElement(By.xpath("//a[@class='feature-card__heading-link feature-card__heading-link--']"));
	
	String headlines = newHeadline.getText();
	
	System.out.println("The news headlines is :: " +headlines);
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	newHeadline.click();
	
	Assert.assertEquals(true, true);
	
	System.out.println("Successfully clicked on News Headline");
	
	WebElement newHeadlineAfterClick = driver.findElement(By.xpath("//h1[@class='h1 h1--page-title'][1]"));
	
	String headlinesAftrClick = newHeadlineAfterClick.getText();
	
	
	System.out.println("The value is **************************  " +headlinesAftrClick);
	
	if(headlines.equalsIgnoreCase(headlinesAftrClick)) 
	{
		
		//Assert.assertTrue("Verified we are on the expected Page", true);
		
		Assert.assertEquals(headlines, headlinesAftrClick);
		
		
		
		System.out.println("********************The Test Case Passed **********************************");
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//JavascriptExecutor jse6 = (JavascriptExecutor) driver;
	//jse6.executeScript("window.scrollBy(0,3800)", "");
	
	Thread.sleep(2000);
	
	//JavascriptExecutor jse7 = (JavascriptExecutor) driver;
	//jse7.executeScript("window.scrollBy(0,100)", "");
	
	Thread.sleep(3000);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	System.out.println("********************After Scrolling **********************************");
//	
WebElement SecndHeadlineAfterClick1 = driver.findElement(By.xpath("//h1[@class='h1 h1--page-title']"));

String newHeadlineText = SecndHeadlineAfterClick1.getText();

System.out.println("The new Headlines is :: " +newHeadlineText);

Thread.sleep(3000);



//System.out.println("After Clicking the Read Full Article *******************************");
//
Actions actions = new Actions(driver);
//
actions.moveToElement(driver.findElement(By.xpath("//a[@class='article__read-full-story-button article__read-full-story-button--']")));

WebElement el =   driver.findElement(By.xpath("//a[@class='article__read-full-story-button article__read-full-story-button--']"));

System.out.println("After reading full article ***************************************");

JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("arguments[0].click();", el);

//el.click();
//	
//	String SecndheadlinesAftrClick = newHeadlineAfterClick.getText();
//	
	System.out.println("After clcicking full artcile :: ************************ " );
//	
//	SecndHeadlineAfterClick.click();
	
	
	}
	
	
//	@SuppressWarnings("deprecation")
//	@Test
//	public void clickHeadline() 
//	{
//		
//		
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement newHeadline1 = driver.findElement(By.xpath(pageLocators.newsHeadlinesTitle));
//		
//		newHeadline1.click();
//		
//		Assert.assertTrue(true);
//	
//	}
//	@SuppressWarnings("deprecation")
//	@Test
//	public void verifyExpectedPage() 
//	{
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		
//		WebElement newHeadline1 = driver.findElement(By.xpath("//a[@class='feature-card__heading-link feature-card__heading-link--']"));
//		
//		WebElement newsHeadlineAfterClick = driver.findElement(By.xpath("//h1[@class='h1 h1--page-title']"));
//		
//		String newsHeadlineAfterClick1 = newHeadline1.getText();
//		
//		String newsHeadline1= newsHeadlineAfterClick.getText();
//		
//		
//		
//		if(newsHeadlineAfterClick1.equalsIgnoreCase(newsHeadline1)) 
//		{
//			
//
////			
//			Assert.assertEquals(newsHeadlineAfterClick1, newsHeadline1);
//			
//			System.out.println("********************The Test Case Passed **********************************");
//		}
//		
//	//}
	
	

}
