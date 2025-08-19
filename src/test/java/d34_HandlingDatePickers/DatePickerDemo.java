package d34_HandlingDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	//selecting future date
	static void selectFutureDate(WebDriver driver, String year, String month, String date)
	{
		//select month & Year
		
				while(true)
				{
					String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
					String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
				
					if(currentMonth.equals(month) && currentYear.equals(year))
					{
						break;
					}
					
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
					//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
					
				}	
				
             //select the date
				
				List<WebElement>alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
				
				for(WebElement dt:alldates)
				{
					if(dt.getText().equals(date))
					{
					   dt.click();
					   break;
					}
				}
	}
	
	//selecting past date
		static void selectPastDate(WebDriver driver, String year, String month, String date)
		{
			//select month & Year
			
					while(true)
					{
						String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
						String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
					
						if(currentMonth.equals(month) && currentYear.equals(year))
						{
							break;
						}
						
						//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
						
					}	
					
	             //select the date
					
					List<WebElement>alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td//a"));
					
					for(WebElement dt:alldates)
					{
						if(dt.getText().equals(date))
						{
						   dt.click();
						   break;
						}
					}
		}
		
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method 1 : using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/09/2025"); //mm/dd/yyyy
		
		//Method 2 : using date picker
		//expected data
		String year="2026";
		String month="April";
		String date="10";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		selectFutureDate(driver,year,month,date);
		//selectPassDate(driver,year,month,date);
	}

}
