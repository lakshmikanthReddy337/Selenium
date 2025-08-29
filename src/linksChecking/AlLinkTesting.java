package linksChecking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlLinkTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.manage().window().maximize();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links Present"+allLinks.size());
		//preffered method for loop
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement link =allLinks.get(i);
			
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			link.click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(2000);

			
		}
		//Not Preffered for loop
		/*for(WebElement link: allLinks)
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			link.click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(2000);
		}*/
		Thread.sleep(3000);
		
		driver.quit();
	
	}

}
