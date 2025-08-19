package d31_HandlingDifferentTypesOfDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    // driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0.2");
	     driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		 driver.manage().window().maximize();
		 
		 //driver.findElement(By.xpath("//button[contains(@class,'multiselects')]")).click();  //opens dropdown options
		 driver.findElement(By.xpath("//button[@id='menu1']")).click();  //opens dropdown options
		 
		 //1. Select one option
		// driver.findElement(By.xpath("//input[@value='Java']")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='HTML']")).click();
		 
		 //2. capture all the options and find out size
		// List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		 List<WebElement> options=driver.findElements(By.xpath("//a[@role='menuitem']"));
		 
		 System.out.println("Number of options: "+options.size());
	
		 //3. Print options from dropdowns
		
		   for(WebElement op:options)
		    {
			 System.out.println("The options are : "+op.getText());
		    }
		 
		 
		 //4. select multiple options
		/* for(WebElement op:options)
		    {
			 String option=op.getText();
			 
			 if(option.equals("HTML") || option.equals("CSS") || option.equals("JavaScript"))
			 {
				 op.click();
			 }
		    }
		 */
		 
		 
	}

}
