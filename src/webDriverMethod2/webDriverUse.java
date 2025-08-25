package webDriverMethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		String title= driver.getTitle(); 
	  
		System.out.println(title);
	  
		System.out.println(driver.getCurrentUrl());
	  
		driver.quit();
	
	}

}
