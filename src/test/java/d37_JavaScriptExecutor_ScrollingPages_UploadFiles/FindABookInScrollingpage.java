package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindABookInScrollingpage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://booksbykilo.in/new-books");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//The Vile Victorians
		
		//failed - Actions
       // WebElement book=driver.findElement(By.xpath("//h3[normalize-space()='The Vile Victorians']"));
		//act.scrollToElement(book).perform();
        
        //failed - js
       // js.executeScript("arguments[0].scrollIntoView(true);", book);
		
        //Logic
        boolean found=false;
        
        while(!found)
        {
            List <WebElement> books=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
           
            for(WebElement b:books)
			{
				String bookname=b.getText();
				
				if(bookname.equals("Funnybones"))
				{
					System.out.println("Book found: "+bookname);
					found=true;
					break;
				}
			}
          //  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
          act.sendKeys(Keys.END).perform();
          Thread.sleep(2000); //static wait to load new items
        
        }
		
		
		
		driver.quit();
	}

}
