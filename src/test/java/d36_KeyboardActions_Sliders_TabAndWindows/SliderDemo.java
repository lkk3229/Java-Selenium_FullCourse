package d36_KeyboardActions_Sliders_TabAndWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
		System.out.println("Location of Slider before moving: "+button.getLocation());  //846, 2021
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(button, 2, 2021).perform();
		
		System.out.println("Location of Slider after moving: "+button.getLocation());
		
		//Max slider   
		WebElement max_slider=driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
		System.out.println("Location of Slider before moving: "+max_slider.getLocation());  //976, 2021
	
        act.dragAndDropBy(max_slider, -100, 2021).perform();
		
		System.out.println("Location of Slider after moving: "+max_slider.getLocation());
		
		
		
	}

}
