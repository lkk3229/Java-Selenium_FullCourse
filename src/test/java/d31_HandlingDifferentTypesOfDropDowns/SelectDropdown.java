package d31_HandlingDifferentTypesOfDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//dropdown box

//1. Select dropdown
//2. Bootstrap dropdown
//3. Hidden drop down

public class SelectDropdown {

	public static void main(String[] args) {
	
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryEle);
		
		//Select options from the drop down
		//selectByVisibleText()
		//selectByValue()
		//selectByIndex()
		
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("japan");
		//drpCountry.selectByIndex(2);
		
		//capture the options from the drop down
		//getOptions() ==> returns all the options from the dropdown as a WebElement
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("Total number of options: "+options.size());
		
		//printing the options
		/*
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		//enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		driver.close();
	}

}
