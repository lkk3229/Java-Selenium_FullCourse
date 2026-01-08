package d33_HandingDynamicPaginationWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		System.out.println("No of rows are: " + rows.size());

		for (int r = 1; r <= rows.size(); r++) {
			WebElement name = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + r + "]//td[1]"));
			// System.out.println(name.getText());
			if (name.getText().equalsIgnoreCase("chrome")) {
				String cpuLoad = driver
						.findElement(By
								.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]"))
						.getText();

				String value = driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();

				if (cpuLoad.equals(value)) {
					System.out.println("CPU Load of Chrome is equal.");
				} else {
					System.out.println("CPU Load of Chrome is NOT equal.");
				}
				break;

			}
		}

		driver.quit();
	}

}
