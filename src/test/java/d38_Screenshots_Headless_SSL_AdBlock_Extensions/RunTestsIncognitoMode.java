package d38_Screenshots_Headless_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
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

