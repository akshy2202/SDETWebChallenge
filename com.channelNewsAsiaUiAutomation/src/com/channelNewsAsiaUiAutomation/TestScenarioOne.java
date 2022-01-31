package com.channelNewsAsiaUiAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class TestScenarioOne {
	
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHAY\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.channelnewsasia.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("********************** Value of title is ****************** " +title);
		
		
		
		WebElement newHeadline = driver.findElement(By.xpath("//a[@class='feature-card__heading-link feature-card__heading-link--']"));
		
		String headlines = newHeadline.getText();
		
		System.out.println("The news headlines is :: " +headlines);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		newHeadline.click();
		
		System.out.println("Successfully clicked on News Headline");
		
		WebElement newHeadlineAfterClick = driver.findElement(By.xpath("//h1[@class='h1 h1--page-title']"));
		
		String headlinesAftrClick = newHeadlineAfterClick.getText();
		
		
		System.out.println("The value is **************************  " +headlinesAftrClick);
		
		if(headlines.equalsIgnoreCase(headlinesAftrClick)) 
		{
			
			//Assert.assertTrue("Verified we are on the expected Page", true);
			
			Assert.assertEquals(headlines, headlinesAftrClick);
			
			
			
			System.out.println("********************The Test Case Passed **********************************");
		}
		
		

	}
}
