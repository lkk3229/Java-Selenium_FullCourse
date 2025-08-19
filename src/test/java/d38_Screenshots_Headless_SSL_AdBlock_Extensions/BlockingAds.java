package d38_Screenshots_Headless_SSL_AdBlock_Extensions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAds {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\jar\\CRX File\\uBlock-Origin.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");

	}

}

//Enable extensions in browser:
 /*   Step 1: Add CRX Extractor/Downloader to chrome Browser (manaully)
      Step 2: Add Selectorshub plugin to chrome broser (manaully)
	  Step 3: capture crx file for selectorshub extension
	  Step 4: pass crx file path in automation script in Chrome Options
*/