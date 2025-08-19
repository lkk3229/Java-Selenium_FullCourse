package d26_WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/register");

		// conditional method - access these commands through WebElement - returns
		// boolean value (true/false)

		// isDispalyed() - we can check display status of the element

		// WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']"));
		// System.out.println("Display status of logo : "+logo.isDisplayed());

		// Boolean logoStatus = driver.findElement(By.xpath("//img[@alt='nopCommerce
		// demo store']")).isDisplayed();
		// System.out.println("Display status of logo : "+logoStatus);

		// isEnabled() - we can check enable/disable status of the element/operational
		// element

		// Boolean Status =
		// driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		// System.out.println("Enable status : "+Status);

		// isSelected() - we can check the element is selected or not

		//WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		//WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

		//System.out.println("Before Selection..........");
		//System.out.println(male_rd.isSelected()); // false
		//System.out.println(female_rd.isSelected()); // false

		
		//System.out.println("After Selecting male..........");
		//male_rd.click();
		//System.out.println(male_rd.isSelected()); // true
		//System.out.println(female_rd.isSelected()); // false
		
		//System.out.println("After Selecting female..........");
		//female_rd.click();
		//System.out.println(male_rd.isSelected()); // false
		//System.out.println(female_rd.isSelected()); // true
		
		boolean newsletterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbox status : " + newsletterStatus); //true
		
		
		driver.close();

	}

}
