package MiscellaneousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouse_Over {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");		
		driver.manage().window().maximize();
	}

	
	@Test
	public void mouseHover()
	
	{
	Actions action = new Actions(driver);
	
	action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']")))
	.pause(3000)
	.click(driver.findElement(By.xpath("(//div[text()='Excess Baggage'])[1]")))
	.build().perform();
		
		
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

