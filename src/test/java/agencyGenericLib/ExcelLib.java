package agencyGenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String filePath = "C:\\Users\\Kris M\\workspace\\WebDriverTest\\excel\\TestData.xlsx";	
	public String getExcelData(String sheeetName , int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		//System.out.println(wb);
		Sheet sh = wb.getSheet(sheeetName);
		DataFormatter formatter = new DataFormatter();
		//System.out.println(sh);
		Row row = sh.getRow(rowNum);
		//System.out.println(row);
		//String data = formatter.formatCellValue();
		//int getCellType = row.getCell(colNum).getCellType();
		Cell cell = sh.getRow(rowNum).getCell(colNum);
	//	String dat = row.getCell(colNum).getStringCellValue();
		String data =formatter.formatCellValue(cell);
		
		//System.out.println(data);
		return data;
	}
	public void setExcelData(String sheetName , int rowNum , int colNum , String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		FileOutputStream fos = new FileOutputStream(filePath);
		cel.setCellValue(data);
		wb.write(fos);
		wb.close();
	}
	
	public int getRowCount(String sheetName) throws InvalidFormatException, IOException{    
	      FileInputStream fis = new FileInputStream(filePath);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      int rowCount = sh.getLastRowNum()+1;
	      return rowCount;
	}
	
	public int getcellCount(String sheetName,int rowNum) throws InvalidFormatException, IOException{
	      FileInputStream fis = new FileInputStream(filePath);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);    
	      Row row = sh.getRow(rowNum);
	     return row.getLastCellNum();     
	}
	

}