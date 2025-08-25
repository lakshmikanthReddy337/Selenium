package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		System.out.println(driver.findElement(By.id("username_span")).getText());
		
		System.out.println(driver.findElement(By.id("username_span")).getAttribute("class"));
		  System.out.println(driver.findElement(By.id("username_span")).getAttribute("href"));
		  System.out.println(driver.findElement(By.id("username_span")).getCssValue("color"));
		  System.out.println(driver.findElement(By.id("username_span")).getCssValue("font-size"));
		
		driver.quit();
	}

}
