package d32_HandlingAutoSuggestDropdown_And_StaticWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//web table

//1. static web table
//2. dynamic web table
//3. table with pagination

public class StaticTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  //multiple size
		
		//int rows=driver.findElements(By.tagName("tr")).size();  //applicable when only one table
		
		System.out.println("Number of rows : "+rows);  //7
		
		//2. find total number of column
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();   //multiple table
		//int cols=driver.findElements(By.tagName("th")).size();  //single table
		
		System.out.println("Number of column are :"+cols);
		
		//3. Read data from specific row and column (e.g. 5th row and 1st column)
		String bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr//td[1]")).getText();
		System.out.println("BookName is "+bookname);
		
		//4. Read data from all the rows and columns
		/*
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			    System.out.print(value+"\t");
			}
			System.out.println();
			
		}
		*/
		
		//5. Print book name if Author name is Mukesh
		/*
		for(int r=2;r<=rows;r++)
		{
			String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(AuthorName.equals("Mukesh"))
			{
			   String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			   System.out.println(BookName+"\t"+AuthorName);
			}
			   
			}
			*/
		
		//6. Find total price of all the books
		
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(Price);
		}
		System.out.println("Total Price of books: "+total);
		
//Assignment ==> https://blazedemo.com
	//	find lowest price and choose that flight and book it then verify the success message
		
		
		driver.close();
		
	}

}
