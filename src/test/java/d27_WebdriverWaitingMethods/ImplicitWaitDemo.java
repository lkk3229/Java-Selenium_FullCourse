package d27_WebdriverWaitingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); 
		
		driver.close();
		
		//implicit Wait
		
		//Advantages:
		//1. single time/one statement
		//2. it will not wait till maximum time if the element is available
		//3. Applicable for elements
		//4. easy to use
		
		//Disadvantage: if the time is not sufficient then you wil get exception
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
