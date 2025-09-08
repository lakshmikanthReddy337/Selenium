package alert_Handling;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class alertHandlingTest2 {
	WebDriver driver;

	@BeforeMethod

	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		driver.manage().window().maximize();

	}

	@Test
	public void alertCheck() throws InterruptedException {
		
		//(1) ---Launch alert
		driver.findElement(By.xpath("//button[@id='my-alert']")).click();

		Alert alert = driver.switchTo().alert();

		String actUsernameText = alert.getText();
		
		//validating popUp 
		assertEquals(actUsernameText, "Hello world!");

		alert.accept();
		
		Thread.sleep(5000);
		//(2)--Launch confirm
		driver.findElement(By.xpath("//button[@id='my-confirm']")).click();
		Alert alert2 = driver.switchTo().alert();

		
		String actUsernameText2 = alert2.getText();
		assertEquals(actUsernameText2, "Is this correct?");
		
		alert2.dismiss();
		Thread.sleep(5000);

		//(3)----Launch prompt
		driver.findElement(By.xpath("//button[@id='my-prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("kanth");
		Thread.sleep(5000);
		
		String actUsernameText3 = alert3.getText();
		assertEquals(actUsernameText3, "Please enter your name");


		

		alert3.accept();

		



		
		

	}

	@AfterMethod
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
