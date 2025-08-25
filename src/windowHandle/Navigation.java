package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get(" https://adactinhotelapp.com/"	);
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Forgot Password?")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		driver.navigate().back();
		
		System.out.println(driver.getWindowHandle());

		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());



		driver.quit();
	
	}

}
