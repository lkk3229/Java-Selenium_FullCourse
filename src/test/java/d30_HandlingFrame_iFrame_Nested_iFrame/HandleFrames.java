package d30_HandlingFrame_iFrame_Nested_iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("http://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1); //passed frame as a webelement //switched to frame1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		//go back to default frame, we can not go directly from frame 1 to frame2 directly, from frame1 go to default frame then switch to required frame
		
		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		driver.switchTo().defaultContent(); //go back to default frame
		
		//Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);		
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//inner iframe - part of frame 3
		driver.switchTo().frame(0);  //switching to frame using index
		
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		driver.switchTo().defaultContent(); //go back to default frame
		
		driver.close();

	}

}

/*
==>3 types of switching methods
    1. browser windows
         driver.switchTo.window(windowID/window handle)
         
    2. alerts
         driver.switchTo.alert()
         driver.switchTo.alert().accept()
         driver.switchTo.alert().dismiss()
         
    3. frames
         driver.switchTo.frame(id);
         driver.switchTo.frame(name);
         driver.switchTo.frame(WebElement);
*/

/*
 Assignment
 -----------------
http://ui.vision/demo/webtest/frames/
1. switch to 5th frame
2. click on link - open new iframe
3. switch to inner frame
4. check logo presence in the inner frame

*/

