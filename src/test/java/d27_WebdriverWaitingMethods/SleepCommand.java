package d27_WebdriverWaitingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);  //pause the execution ==>   java command, not a WebDriver command
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); 
		
		driver.close();
		
		//NoSuchElementException - Element is not present on the page. Synchronization.
		//ElementNotFoundException - locator is incorrect

		//sleep()
		
		//Advantage: easy to use
		
		//Disadvantages:
		//1. if the time is not sufficient then you will get exception
		//2. it will wait for maximum time out, this will reduce the performance script
		//3. multiple times
		
		
		
		
		
		
		
		
		
	}

}
