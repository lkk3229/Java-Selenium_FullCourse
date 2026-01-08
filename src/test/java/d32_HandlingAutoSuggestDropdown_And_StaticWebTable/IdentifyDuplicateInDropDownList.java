package d32_HandlingAutoSuggestDropdown_And_StaticWebTable;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyDuplicateInDropDownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// WebElement
		// listboxElement=driver.findElement(By.xpath("//select[@id='colors']"));
		WebElement listboxElement = driver.findElement(By.xpath("//select[@id='animals']"));

		Select listbox = new Select(listboxElement);

		Set<String> uniqueOptions = new HashSet<String>();

		Boolean flag = false;

		for (WebElement option : listbox.getOptions()) {
			String optionText = option.getText();
			if (!uniqueOptions.add(optionText)) {
				System.out.println("Duplicate option found: " + optionText);
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("No duplicate options found in the dropdown list.");
		}

		driver.quit();

	}

}
