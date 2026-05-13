package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.googlesearch;
public class tests {
	WebDriver driver;
@BeforeMethod
	public void setup()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	
	public void testCase1() {
		Assert.assertEquals(driver.getTitle(),"Google");
		
		googlesearch searchPage = new googlesearch(driver);
		searchPage.EnterKeyword("selenium");
		//driver.findElement(By.name("q")).sendKeys("testing");
		
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
