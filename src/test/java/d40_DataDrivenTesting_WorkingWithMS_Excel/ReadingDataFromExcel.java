package d40_DataDrivenTesting_WorkingWithMS_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Add two dependency: apache.poi   and    poi-ooxml

// Excel File --> Workbook --> Sheets --> Rows --> Cells
//  FileInputStream - reading
// FileOutputStream - writing

//XSSFWorkbook  -- workbook
//XSSFSheet  -- Sheet
//XSSFRow  -- row
//XSSFCell  -- cell
public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");      //XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of Rows :"+totalRows );  //5
		System.out.println("Number of Cells :"+totalCells); //4
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);	
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");;
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}
