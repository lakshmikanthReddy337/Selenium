package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RelativeXpath {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}

	@Test
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='login_input' and @type='password']")).sendKeys("Kanth@337");
		
		Thread.sleep(2000);
		driver.quit();

	}
	
}
