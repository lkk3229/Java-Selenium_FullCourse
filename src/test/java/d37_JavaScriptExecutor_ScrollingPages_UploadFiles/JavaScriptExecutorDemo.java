package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// JavaScriptExecutor ==> interface

// executeScript() - we can sxeute javascript statement

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
        
        // passing the text into inputbox - alternate of sendKeys()
        JavascriptExecutor js=(JavascriptExecutor)driver;   //upCasting
        //JavascriptExecutor js=driver;   use this if going with ChromeDriver driver = new ChromeDriver();
        
        js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
        
        //clicking on element - alternate of click()
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radiobtn);
		
	}

}
