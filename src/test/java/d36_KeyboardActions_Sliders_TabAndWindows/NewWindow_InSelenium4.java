package d36_KeyboardActions_Sliders_TabAndWindows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_InSelenium4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Avaialble in selenium 4 onwards
		driver.switchTo().newWindow(WindowType.TAB); //open new Tab
		
		driver.get("https://orangehrm.com/");
		
		//Avaialble in selenium 4 onwards
		driver.switchTo().newWindow(WindowType.WINDOW); //open new window
				
		driver.get("https://orangehrm.com/");
	}
}
