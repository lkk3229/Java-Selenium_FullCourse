package threadsafetyconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DriverTest2 {
	
	private static ThreadLocal <WebDriver> tdriver = new ThreadLocal<>();
	
	WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		tdriver.set(driver);
	}
	
	public WebDriver getDriver() {
		return tdriver.get();
	}
	
	@Test
	void mytest1() {
		driver = new ChromeDriver();
		setDriver(driver);
		getDriver().get("https://www.google.com");
		System.out.println("Title of the page: " + getDriver().getTitle());
		getDriver().quit();
	}
	
	@Test
	void mytest2() {
		driver = new EdgeDriver();
		setDriver(driver);
		getDriver().get("https://www.bing.com");
		System.out.println("Title of the page: " + getDriver().getTitle());
		getDriver().quit();
	}
	
	@AfterClass
	void teardown() {
		tdriver.remove();
	}
	
}
