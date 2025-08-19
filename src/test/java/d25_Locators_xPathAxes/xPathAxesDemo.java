package d25_Locators_xPathAxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//Self - Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
		System.out.println("Self : "+text);  //L&T
		
		//Parent - Selects the parent of the current node (always One)
		text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText(); //there is no text for parent, so it is 
		System.out.println("Parent : "+text);  //L&T
		
		//Child - Selects all children of the current node (One or many)
		List<WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : "+child.size());  //5
		
		//Ancestor - Selects all ancestors (parent, grandparent, etc.) 
		text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr")).getText(); 
		System.out.println("Ancestor : "+text);  
		
		//Descendant - Selects all descendants (children, grandchildren, etc.) of the current node
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/descendant::*")); 
		System.out.println("Number of descendant nodes : "+descendants.size());  //7
		
		//Following - Selects everything in the document after the closing tag of the current node
		List<WebElement> followingnodes=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following::tr")); 
		System.out.println("Number of descendant nodes : "+followingnodes.size());  //267
				
		//Preceding - Selects all nodes that appear before the current node in document
		List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding::tr")); 
		System.out.println("Number of descendant nodes : "+precedings.size());  //31
		
		//Following-sibling : Selects all siblings after the current node
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following-sibling::tr")); 
		System.out.println("Number of Following Siblings : "+followingsiblings.size());  //265
				
		//Preceding-sibling : Selects all siblings before the current node
		List<WebElement> precedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding-sibling::tr")); 
		System.out.println("Number of descendant Siblings : "+precedingsiblings.size());  //30
		
		
		driver.close();
		

	}

}
