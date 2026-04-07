package d23_Locators_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CSS {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        /* ================================
           7️⃣ CSS SELECTORS
        ================================= */

        // a) CSS using ID
        driver.findElement(By.cssSelector("#email")).sendKeys("email@test.com");

        // b) CSS using Class
        driver.findElement(By.cssSelector(".form-control")).sendKeys("Name");

        // c) CSS using Attribute
        driver.findElement(By.cssSelector("input[placeholder='Enter Phone']")).sendKeys("8888888888");

        // d) CSS Parent > Child
        driver.findElement(By.cssSelector("div.form-group > input#name")).clear();

        // e) CSS Contains (*)
        driver.findElement(By.cssSelector("input[id*='nam']")).sendKeys("CSS Contains");

        // f) CSS Starts (^)
        driver.findElement(By.cssSelector("input[id^='na']")).clear();

        // g) CSS Ends ($)
        driver.findElement(By.cssSelector("input[id$='me']")).sendKeys("CSS Ends");

        
        /* ================================
           ✅ Close Browser
        ================================= */
        driver.quit();
        
    }
}
