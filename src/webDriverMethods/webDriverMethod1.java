package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethod1 {

	public static void main(String[] args) {
		WebDriver driver;
		 driver =new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 
		 driver.quit();
		 
		 
	}

}
