package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        //Scroll bars are not webElement
        
        JavascriptExecutor js=(JavascriptExecutor)driver;   //upCasting
        
        // 1. Scroll down the page by pixel number
      //  js.executeScript("window.scrollBy(0,1500)", "");
       // System.out.println(js.executeScript("return window.pageYOffset;"));
        
        //2. Scroll the page till element is visible
      /*  WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));
       */
        
        //3. Scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");   //if horizontal scroll bar then use width instead of height
        System.out.println(js.executeScript("return window.pageYOffset;")); //2009.3333740234375
	
	   //Scrolling up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); //2009.3333740234375
	
	
	
	}

}
