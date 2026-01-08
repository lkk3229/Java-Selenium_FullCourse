package d39_HandlingBrokenLinks_SVGElements_ShadowDOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxCalls {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='loadContent']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement loadedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));

		System.out.println("Loaded Element Text: " + loadedElement.getText());

		driver.quit();

	}

}

/*
 * Ajax calls: ---------------------
 * 
 * An AJAX call is a web development technique that allows website to update
 * part of its content without reloading the entire page.
 * 
 * AJAX stands for Asynchronous JavaScript and XML, and It's a collection of
 * technologies that make web applications more dynamic and responsive to the
 * user.
 * 
 */