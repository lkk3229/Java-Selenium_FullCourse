package d33_HandingDynamicPaginationWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		
		username.clear();
		username.sendKeys("demo");
		
        WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		
        password.clear();
        password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@normalize-space()='Login']")).click();
		
		//close window if available
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent']")).click();  //customers main menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();   //Customer sub menu
		
		//capture number of pages from pagination table
		
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
	
	    //repeating pages
		for(int p=1;p<=total_pages;p++)
		{
			if(p>1)
			{
				WebElement active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_pages.click();
				Thread.sleep(5000);
			}
			
			//reading data from the page
			
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
			for(int r=1;r<=noOfRows;r++)
			{
				String CustomerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
			
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				
				String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(CustomerName+"\t"+email+"\t"+Status);
			}
		
		
		}
		
	
	}

}


//Assignment ==> testautomationpractice.blogspot.com = Practice pagination table
// https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers    = practice table of admin section whose tagname is not table or tb (bootStrap table)


