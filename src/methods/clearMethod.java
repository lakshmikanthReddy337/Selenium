package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("username")).sendKeys("kanth337");
		driver.findElement(By.id("password")).sendKeys("Kanth@337");
		
		driver.findElement(By.id("login")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("datepick_in")).clear();
		
		driver.findElement(By.id("datepick_in")).sendKeys("19/08/2025");

		
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
	}

}
