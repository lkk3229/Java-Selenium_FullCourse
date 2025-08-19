package d28_BrowserAndNavigationCommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowIDs = driver.getWindowHandles();

		for (String winid : windowIDs) {
			String title = driver.switchTo().window(winid).getTitle();
			//String url=driver.switchTo().window(winid).getCurrentUrl();
			System.out.println(title);

			if (title.endsWith("Human Resources Management Software | OrangeHRM HR Software")
					|| title.equals("Some other title")) {
				driver.close();
			}
			
			
	//Assignment
	// https://testautomationpractice.blogspot.com/
	/*
	 1. provide some String search for it
	2. count number of links
	3. click on each link using for loop
	4. get window ID's for every browser window
	5. close specific browser
	*/
		}

	}

}
