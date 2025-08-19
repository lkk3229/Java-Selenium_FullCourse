package d26_WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browse window
		
		//driver.close();
		driver.quit();
		
		// quit - closes all browser windows/tabs
		// close - only close the single browser window/tab wherever the driver is focused
		
		//Sample url for practice : https://testautomationpractice.blogspot.com/
		
		
	}

}
