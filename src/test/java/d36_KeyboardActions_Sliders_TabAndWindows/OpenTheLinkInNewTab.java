package d36_KeyboardActions_Sliders_TabAndWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
	
		//switching to udemy link page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1)); //switch to udemy page
		
		WebElement HomePage=driver.findElement(By.xpath("//div[@id='PageList1']//a[normalize-space()='Home']"));
		
		act.keyDown(Keys.CONTROL).click(HomePage).keyUp(Keys.CONTROL).perform();
		
		
	}

}
