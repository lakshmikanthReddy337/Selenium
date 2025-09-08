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

public class alertHandlingTest {
	WebDriver driver;

	@BeforeMethod

	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

	}

	@Test
	public void alertCheck() {
		driver.findElement(By.xpath("//button[@name='proceed']")).click();

		Alert alert = driver.switchTo().alert();

		String actUsernameText = alert.getText();
		
		//validating popUp 
		assertEquals(actUsernameText, "Please enter a valid user name");

		alert.accept();

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
