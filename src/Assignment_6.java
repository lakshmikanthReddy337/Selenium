package frameworkHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_6 {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void assigment() throws InterruptedException
	
	{
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		Thread.sleep(3000);
		
		 Set<String> windowHandles = driver.getWindowHandles();
	        List<String> tabs = new ArrayList<>(windowHandles);
	        driver.switchTo().window(tabs.get(1));

	        List<WebElement> tutorials = driver.findElements(
	            By.xpath("//p[text()='Top Tutorials']/ancestor::div[contains(@class,'wp-block-kadence-column')][1]/descendant::span[@class='kt-blocks-info-box-title']")
	        );

	        System.out.println("Top Tutorials:");
	        for (WebElement tutorial : tutorials) {
	            System.out.println(" - " + tutorial.getText());
	}
	
	

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
