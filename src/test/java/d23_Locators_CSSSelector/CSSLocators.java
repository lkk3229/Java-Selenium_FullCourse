package d23_Locators_CSSSelector;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		
		//CSS - cascading Style Sheets
		
		//tag id    tag#id  (tag name can be removed)
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   tag.className     (tag name can be removed)
		//mostly used with group of elements
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag attribute     tag[attribute='value']        (tag name can be removed)
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("T-shirts");
		
		//tag class attribute     tag.className[attribute='value']      (tag name can be removed)
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");
		
		
		
		
		
		driver.close();
	}

}
