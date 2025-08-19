package d38_Screenshots_Headless_SSL_AdBlock_Extensions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");  //setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		// validate the title
		String act_title = driver.getTitle();

		if (act_title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Test Passed");
		}

		else {
			System.out.println("Test Failed");
		}

		
		driver.quit();
	}

}

// Advantages:
// 1. we can do multiple tasks(since execution happend at backend)
// 2. faster execution

//Disadvantage:
// 1. Users cannot see the actions on the page. SO, he can not understand flow/functionality of the test
