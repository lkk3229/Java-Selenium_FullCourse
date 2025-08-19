package d27_WebdriverWaitingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//explicit wait  ==> work based on condition
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));  //declaration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("Admin123");
		
		WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-apace()='Login']")) );
		loginbutton.click();
		
		
		driver.close();
		
		//Explicit Wait  ==> mostly kept in try catch block
		
		//1. Conditional based, it will work more effectively
		//2. finding element is inclusive (for some condition)
		//3. it will wait for condition to be true, then consider the time
		//4. we need to write multiple statements for multiple elements
		
		
		//Conditions
		
		//alertIsPresent()
		//elementSelectedStateToBe()
		//elementToBeClickable()
		//elementToBeSelected()
		//frameToBeAvaialbleAndSwitchToIt()
		//presenceOfAllElementsLocatedBy()
		//presenceOfElementsLocated()
		//textToBePresentInElement()
		//textToBePresentInElementLocated()
		//textToBePresentInElement()
		//titleIs()
		//titleContains()
		//visibilityOf()
		//visibilityOfAllElemets()
		//visibilityOfAllElemetsLocatedBy()
		//visibilityOfAllElemetsLocated()
	
		
		
		
		
		
		
		
		
		
		
	}

}
