package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
		//driver.manage().window().minimize();

        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;   //upCasting
        
        js.executeScript("document.body.style.zoom='50%'");  //set zoom level 50%
        Thread.sleep(5000);
		
        js.executeScript("document.body.style.zoom='120%'");  //set zoom level 120%
        Thread.sleep(5000);
		
		
	}

}
