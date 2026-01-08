package d29_HandlingCheckBoxes_DifferentTypesOfAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertByJavaScriptExecutor {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();  //open Alert
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		try {
			js.executeScript("window.alert = function();");
		} catch (Exception e) {
			
		}
	}

}
