package com.channelNewsAsiaUiAutomation;

import java.util.List;
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

public class TestScenariosOne {

	static WebDriver driver;
	pageLocators pageLocators = new pageLocators();

	@BeforeClass
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHAY\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.channelnewsasia.com/");

		driver.manage().window().maximize();

	}

	@SuppressWarnings("deprecation")
	@Test
	public void ValidateTitle() throws InterruptedException {

		String title = driver.getTitle();

		

		WebElement newHeadline = driver
				.findElement(By.xpath(pageLocators.newsHeadlinesTitle));

		String headlines = newHeadline.getText();

		System.out.println("The news headlines is :: " + headlines);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newHeadline.click();

		Assert.assertEquals(true, true);

		System.out.println("Successfully clicked on News Headline");

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

		WebElement el = driver.findElement(
				By.xpath(pageLocators.ReadFullArticle));

		jse6.executeScript("arguments[0].scrollIntoView();", el);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", el);
		
		Assert.assertTrue("Clicked on Read Full Article", true);
		
		System.out.println("Clicked on Read Full Article");

	}

}
