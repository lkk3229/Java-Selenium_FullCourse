package d41_DataDrivenTestingWithMSExcel_UtillFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposite-calculator-SBI-BSB001.html");
		 driver.manage().window().maximize();
		 
		 String filePath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		 
		int rows= ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			// 1. read data from  excel
			String pric=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofinterest=ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1=ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2=ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre=ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			
			String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			  
			// 2. pass above data into application
			driver.findElement(By.xpath("input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("input[@id='tenure']")).sendKeys(per1);
			
			Select predrp=new Select(driver.findElement(By.xpath("input[@id='tenurePeriod']")));
			predrp.selectByValue(per2);
			
			Select fredrp=new Select(driver.findElement(By.xpath("input[@id='frequency']")));
			fredrp.selectByValue(fre);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//validation
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			
			else 
			{
				System.out.println("Test Faile");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL%'")).click();  //clicked on clear button
		} //ending of for loop
		driver.quit();
		
	}

}
