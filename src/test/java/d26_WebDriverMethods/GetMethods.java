package d26_WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// 1. get methods
		// 2. conditional methods
		// 3. browser methods
		// 4. navigational methods
		// 5. wait methods

		// get methods - we can access these methods through webdriver instance

		// get(url) - opens the url on the browser
		// getTitle() - returns title of the page
		// getCurrentUrl() - returns URL of the page
		// getPageSource() - returns source code of the page
		// getWindowHandle() - returns ID of the single Browser window
		// getWindowHandles() - returns ID's of the multiple Browser windows

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());

		// getWindowHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  //this will open new browse window
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds); // [669832A8E37EE69AF70B70E343564E39, F40DAAECFBA3039D1C82529500860395]

		driver.quit();

		// quit - closes all windows/tabs
		// close - only close the current window/tab

	}

}
