package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			//Step1: Set the file path of the excel file
				XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateLead.xlsx");
				
				// Step2: Get the sheet
				XSSFSheet sheet = workBook.getSheetAt(0);
//				workBook.getSheet("Sheet1");
				
				//Step3: Get the row count
				int lastRowNum = sheet.getLastRowNum();
				System.out.println(lastRowNum);
				
				// Step4: Get the Column Count
				int colCount = sheet.getRow(0).getLastCellNum();
				System.out.println(colCount);
				
				//Step5: Get the particular cell
				XSSFCell cell11 = sheet.getRow(1).getCell(1);
				String stringCellValue = cell11.getStringCellValue();
				System.out.println(stringCellValue);
				
				String stringCellValue2 = sheet.getRow(2).getCell(1).getStringCellValue();
				System.out.println(stringCellValue2);
				
				String stringCellValue3 = sheet.getRow(1).getCell(3).getStringCellValue();
				System.out.println(stringCellValue3);
				
				//Step6: Close the workBook
				workBook.close();
				
			
			
		

	}

}
