package MiscellaneousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouse_Over2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		driver.manage().window().maximize();
	}

	
	@Test
	public void mouseHover() throws InterruptedException
	
	{
		Actions action = new Actions(driver);
		
		// Hover on Fashion
		
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).pause(2000).perform();
		
		// Hover on Women Ethnic
		
	//	action.moveToElement(driver.findElement(By.xpath("//a[text()='Women Ethnic']"))).pause(2000).perform();
		
		// Click on Women Sarees
		
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Women Sarees']"))).click().build().perform();
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Women Dress Materials']"))).click().build().perform();
		
		//Hover on Electronics
		
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).pause(2000).perform();
		
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Gaming']"))).pause(2000).perform();
		
		//action.moveToElement(driver.findElement(By.xpath("//a[text()='Gaming Mouse']"))).click().build().perform();
		
		
		//Hover of Beauty, Food..
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Beauty, Food..']"))).pause(2000).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Nutrition & Health Care']"))).pause(2000).perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Ayurvedic Supplements']"))).click().build().perform();
		Thread.sleep(4000);
		
		
	}

	
	@AfterMethod
	public void tearDown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}

