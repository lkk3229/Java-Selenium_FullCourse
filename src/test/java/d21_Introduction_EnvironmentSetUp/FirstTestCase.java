package d21_Introduction_EnvironmentSetUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/*
 * Test Cases
 * -----------
 * 1. Launch browser
 * 2. Open URL https:demo.opencart.com/
 * 3. Validate title should be "Your Store"
 * 4. Close browser
 */

// Chromium Driver consist of Chrome and Edge Driver

//Selenium webDriver
		/*
		 * one of the componenet in selenium 
		 * a java interface 
		 * an API
		 */
				
//SearchContext(I)--WebDriver(I) -- RemoteWebDriver (C) -- ChromeDriver and others

public class FirstTestCase {

	public static void main(String[] args) {

		// 1. Launch browser(chrome)
		// ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		
		// open the url
		driver.get("https://stgwww.agilent.com/");

		// validate the title
		String act_title = driver.getTitle();

		if (act_title.equals("Chemical Analysis, Life Sciences, and Diagnostics | Agilent")) {
			System.out.println("test passed");
		}

		else {
			System.out.println("test failed");
		}

		// close the browser
		driver.close();
		//driver.quit();
	}

}
