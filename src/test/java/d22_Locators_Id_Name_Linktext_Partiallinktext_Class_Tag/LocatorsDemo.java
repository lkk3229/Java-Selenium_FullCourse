package d22_Locators_Id_Name_Linktext_Partiallinktext_Class_Tag;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.agilent.com/");
		
		
		//name
		//driver.findElement(By.name("search")).sendKeys("hospital");
		
		//id
		//driver.findElement(By.id("homeSearchTextBox")).sendKeys("hospital");
		
		//linktext & partialLinktext
		//driver.findElement(By.linkText("Applications & Industries")).click();
		//driver.findElement(By.partialLinkText("Industries")).click();
		
		//tagName & className is mostly used for group of elements on web page
		
		//className
		//List <WebElement> headerLinks = driver.findElements(By.className("li"));
		//System.out.println("Total number of headerLinks: "+headerLinks.size());
		
		//tagName
		//List <WebElement> Links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of Links: "+Links.size());
		
		//List <WebElement> images = driver.findElements(By.tagName("img"));
		//System.out.println("Total number of images: "+images.size());
		
		//findElement() -- single webelement
		//findElements() -- multiple webelements
		
		
		
		driver.close();
	}

}
