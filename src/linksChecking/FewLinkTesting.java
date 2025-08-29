package linksChecking;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FewLinkTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
		List<WebElement> alLinkBlocks=block.findElements(By.tagName("a"));
		 
		System.out.println("No of Link Modules"+alLinkBlocks.size());
		
		for(int i=0;i<alLinkBlocks.size();i++)
		{
			WebElement link =alLinkBlocks.get(i);
			
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			link.click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(2000);
			block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
			alLinkBlocks= block.findElements(By.tagName("a"));
		}
		driver.quit();
	
	}

}
