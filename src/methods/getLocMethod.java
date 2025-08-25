package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		/*System.out.println(	driver.getCurrentUrl());
		System.out.println(	driver.getPageSource());*/
		//System.out.println(	driver.getTitle());
		System.out.println(	driver.getWindowHandles());


		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		
		System.out.println(driver.findElement(By.id("username")).getRect().getX());
		System.out.println(driver.findElement(By.id("username")).getRect().getY());
		System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		
		System.out.println(driver.findElement(By.id("username")).getTagName());
		
		


		driver.quit();
		
		
	}

}
