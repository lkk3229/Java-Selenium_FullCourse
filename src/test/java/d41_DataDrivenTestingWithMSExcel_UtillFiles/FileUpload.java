package d41_DataDrivenTestingWithMSExcel_UtillFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.foundit.in/upload");
        driver.manage().window().maximize();
        
        // Open upload dialog/button if present
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click(); 
        Thread.sleep(3000);
        
        String filePath = "C:\\Users\\kasaudha\\OneDrive - Agilent Technologies\\Desktop\\Data\\Test.txt";
        
        // Prefer direct sendKeys on the file input if it's available and enabled
        try {
            WebElement fileInput = driver.findElement(By.xpath("//input[@id='file-upload']"));
            if (fileInput.isDisplayed() && fileInput.isEnabled()) {
                fileInput.sendKeys(filePath);
            } else {
                throw new RuntimeException("File input not interactable");
            }
        } catch (Exception e) {
            // Fallback: use JavaScript to click hidden input then Robot to paste path
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='file-upload']")));

            // Step 1: Copy the file path to clipboard
            StringSelection ss = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

            // Step 2: ctrl + v
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(3000);

            // Step 3: press Enter to confirm
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        
        Thread.sleep(2000);
        driver.quit();
    }

}