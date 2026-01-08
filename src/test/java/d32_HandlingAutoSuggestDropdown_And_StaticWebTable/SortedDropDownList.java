package d32_HandlingAutoSuggestDropdown_And_StaticWebTable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//sorted list
		//WebElement value = driver.findElement(By.xpath("//select[@id='animals']")); 
		
		//unsorted list
		WebElement value = driver.findElement(By.xpath("//select[@id='colors']")); 
		
		Select dropdown = new Select (value);
		
		
		
		
		
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		List <WebElement> options = dropdown.getOptions();
		
		for (WebElement ele : options) {
			originalList.add(ele.getText());
			tempList.add(ele.getText());
		}
		
		System.out.println("Before Sorting: ");
		System.out.println("Original List: " + originalList);
		System.out.println("Temp List: " + tempList);
		
		Collections.sort(tempList); // Sort tempList in ascending order
		System.out.println("After Sorting: ");
		System.out.println("Original List: " + originalList);
		System.out.println("Temp List: " + tempList);
		
		if (originalList.equals(tempList)) {
			System.out.println("Dropdown is sorted in Ascending order");
		} else {
			System.out.println("Dropdown is NOT sorted in Ascending order");
		}
		
		driver.quit();
		
	}

}
