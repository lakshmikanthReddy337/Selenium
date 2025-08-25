package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		new Select(driver.findElement(By.id("day"))).selectByValue("10");
		new Select(driver.findElement(By.id("month"))).selectByValue("8");
		new Select(driver.findElement(By.id("year"))).selectByValue("1998");
		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		
		driver.quit();
	}

}
