package d22_Locators_Id_Name_Linktext_Partiallinktext_Class_Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatorsDemoTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        /* ================================
           1️⃣ ID Locator
        ================================= */
        WebElement nameById = driver.findElement(By.id("phone"));
        nameById.sendKeys("9999999999");

        /* ================================
           2️⃣ Name Locator
        ================================= */
        driver.findElement(By.name("gender")).click();
       
        /* ================================
           3️⃣ Class Name Locator
        ================================= */
        WebElement phoneByClass = driver.findElement(By.className("form-control"));
        phoneByClass.sendKeys("Lav Kumar Kasaudhan");

        /* ================================
           4️⃣ Tag Name Locator
        ================================= */
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + allLinks.size());

        /* ================================
           5️⃣ Link Text
        ================================= */
        driver.findElement(By.linkText("Apple")).click();
        driver.navigate().back();

        /* ================================
           6️⃣ Partial Link Text
        ================================= */
        driver.findElement(By.partialLinkText("merrymoonmary")).click();
        driver.switchTo().defaultContent();

       driver.quit();
    }
}
