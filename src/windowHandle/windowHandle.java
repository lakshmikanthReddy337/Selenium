package windowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());
		driver.quit();
	}

}
