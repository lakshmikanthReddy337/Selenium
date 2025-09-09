package frameworkHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame_handling {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()

	{
		driver= new ChromeDriver();
		driver.get("https://www.angelfire.com/super/badwebs");
		driver.manage().window().maximize();
	}
	
	@Test
	public void framehandling() throws InterruptedException
	{
		driver.switchTo().frame("main");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='monkeyspaw.htm']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("contents");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
		Thread.sleep(3000);

		
		
	}
	@AfterMethod
	public void teardown()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	
	
}
}
