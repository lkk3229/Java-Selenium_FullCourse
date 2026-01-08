package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindNumberOfBooks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://booksbykilo.in/new-books");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act= new Actions(driver);
		
		//Failed
		/*
		List <WebElement> books=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		System.out.println("Number of books displayed on the page: " + books.size());
		*/
		
		//using js
		/*
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List <WebElement> books=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		System.out.println("Number of books displayed on the page: " + books.size());
		*/
		
		//logic
		int previousCount = 0;
		int currentCount = 0;
		
		while(true)
		{
			List <WebElement> books=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			currentCount = books.size();
			if(currentCount== previousCount) 
			{
				break;	
			} 
			previousCount = currentCount;
			
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			act.sendKeys(Keys.END).build().perform();
			
			Thread.sleep(3000);
			
		}
		
		System.out.println("Number of books displayed on the page: " + currentCount);
		
		driver.quit();
		
		

	}

}
