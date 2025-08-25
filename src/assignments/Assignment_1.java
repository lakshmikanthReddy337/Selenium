package assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
			
	 ChromeDriver driver	=  new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/login\r\n");
	 driver.manage().window().maximize();
	 
	 
	 Thread.sleep(3000);
	 driver.findElement(By.id("username")).sendKeys("tomsmith");
	 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	 //Thread.sleep(3000);

	 driver.findElement(By.id("login")).submit();
	 Thread.sleep(3000);
	
	 WebElement flashMessage = driver.findElement(By.id("flash"));
     System.out.println("Flash Message (Login): " + flashMessage.getText().trim());
     
     String borderColor = flashMessage.getCssValue("border-color");
     System.out.println("Border Color: " + borderColor);

     // Check if border color is as expected
     if (borderColor.equals("rgba(69, 122, 26, 1)")) {
         System.out.println("✅ Border color is as expected.");
     } else {
         System.out.println("❌ Unexpected border color.");
     }
     driver.findElement(By.cssSelector("a.button.secondary.radius")).click();

     Thread.sleep(2000);

     WebElement flashLogout = driver.findElement(By.id("flash"));
     System.out.println("Flash Message (Logout): " + flashLogout.getText().trim());



	 driver.quit();
	 
	
	}

}
