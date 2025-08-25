package linksChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest1 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	
		
		
	}

}
