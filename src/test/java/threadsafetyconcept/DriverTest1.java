package threadsafetyconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DriverTest1 {
	
	WebDriver driver;
	
	@Test
	void mytest1() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of the page: " + driver.getTitle());
		driver.quit();
	}
	
	@Test
	void mytest2() {
		driver = new EdgeDriver();
		driver.get("https://www.bing.com");
		System.out.println("Title of the page: " + driver.getTitle());
		driver.quit();
	}
	
}
