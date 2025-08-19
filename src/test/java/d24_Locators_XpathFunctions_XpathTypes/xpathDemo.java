package d24_Locators_XpathFunctions_XpathTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://demo.nopcommerce.com/");
			
			//    //tagname[@attribute='value']
			
			//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
			//driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("T-shirts");
			
			//xpath with 'and' operator
			//driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("T-shirts");
			
			//xpath with 'or' operator
			//driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("T-shirts");
			
			//xpath with inner text ---by text method   inplace of text() we can use . also
			//driver.findElement(By.xpath("//*[text()='Computers ']")).click();
			
			//xpath with contains()
			//driver.findElement(By.xpath("//*[contains(text(),'Computers ')]")).click();
			//driver.findElement(By.xpath("//*[contains(.,'Computers ')]")).click();
			
			//xpath with starts-with()
			//driver.findElement(By.xpath("//*[starts-with(text(),'Computers')]")).sendKeys("Test");
			//driver.findElement(By.xpath("//input[starts-with(@name,'q')]")).sendKeys("Test");
			
			//handling dynamic attributes ==> by contains or starts-with method
			
			//chained xpath
			//boolean imgStatus = driver.findElement(By.xpath("//div[@class='picture']/a/img")).isDisplayed();
			//System.out.println(imgStatus);
			
			
			
			
			driver.close();
	}

}
