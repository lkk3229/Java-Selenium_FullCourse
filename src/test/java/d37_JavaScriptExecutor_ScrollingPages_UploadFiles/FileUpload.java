package d37_JavaScriptExecutor_ScrollingPages_UploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        
        //single file upload
       /* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\jar\New folder\PSSWJ\src\test\java\d37_JavaScriptExecutor_ScrollingPages_UploadFiles\\Text1.txt");
		
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text1.txt"))
        {
        	System.out.println("File is successfully uploaded");
        }
        else
        {
        	System.out.println("upload failed.");
        }
        */
        
        //Multiple files uploaded
        String file1="C:\\jar\\New folder\\PSSWJ\\src\\test\\java\\d37_JavaScriptExecutor_ScrollingPages_UploadFiles\\Text1.txt";
        String file2="C:\\jar\\New folder\\PSSWJ\\src\\test\\java\\d37_JavaScriptExecutor_ScrollingPages_UploadFiles\\Text2.txt";
	
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	
        int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
        
        //validation1 - number of files
        if(noOfFilesUploaded==2)
        {
        	System.out.println("All files are uploaded");
        }
        else
        {
        	System.out.println("Files are not uploaded or incorrect files uploaded");
        }
        
        //validate file names
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text1.txt")
        		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text2.txt"))
        {
        	System.out.println("Files name are matching....");
        }
        else
        {
        	System.out.println("Files name are incorrect.......");
        }
        
        
	}

}
