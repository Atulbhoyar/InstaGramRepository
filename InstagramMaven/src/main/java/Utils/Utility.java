package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
//	public static void captureScreenshot() {
//		TakesScreenshot driver = null;
//		Date date = new Date(); 
//		String currentdate =date.toString().replace(" ", "_").replace(":", "_")+".jpeg";
//		System.out.println(currentdate);
//
//		//TakesScreenshot ts=(TakesScreenshot)driver;
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File desti=new File("E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\Selenium\\scr\\"+currentdate);
//		try {
//			FileHandler.copy(src, desti);
//			
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//			
//		}
//		
//		
//	
//	}
	
	
//    Date date = new Date();  
//    //System.out.println(date);
//    String currentdate =date.toString().replace(" ", "_").replace(":", "_")+".jpeg";
//    System.out.println(currentdate);
//   
// 
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File src=ts.getScreenshotAs(OutputType.FILE);
//	File desti=new File("E:\\Software Testing\\Automation\\3rd Month 13.01.2023\\Selenium\\scr\\"+currentdate);
//	FileHandler.copy(src, desti);
	
	
	public static String dataGettingMethod(String sheetname,int rowno,int cellno) throws IOException,IllegalStateException  {
		String data=null;
		String path="src\\main\\resources\\RequiredTestData\\Book1.xlsx";
		FileInputStream file=new FileInputStream (path);
		Workbook book =WorkbookFactory.create(file);
		Sheet sheet=book.getSheet(sheetname);
		Row row=sheet.getRow(rowno);
		Cell cell=row.getCell(cellno);
			try {
				data=cell.getStringCellValue();
			}
			catch(IllegalStateException f) {
				f.printStackTrace();
				double value=cell.getNumericCellValue();
				data= String.valueOf(value);
			}
			return data;
	}
	
//	public static String getData(String sheet, int row, int cell) throws IllegalStateException, IOException {
//		String data=null;
//		try {
//			String path="src/main/resources/RequiredTestData/Book1.xlsx";
//			FileInputStream file = new FileInputStream(path);
//			Workbook workbook = WorkbookFactory.create(file);
//			data = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//			file.close();
//			return data;
//		} catch (Exception e) {
//			String path="src/main/resources/RequiredTestData/Book1.xlsx";
//			FileInputStream file = new FileInputStream(path);
//			Workbook workbook = WorkbookFactory.create(file);
//			double value = workbook.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
//			data = String.valueOf(value);
//			file.close();
//			return data;
//		}
//	}
	
	
//	public static String dataGettingMethod2(String sheet,int row,int cell) throws IOException,IllegalStateException  {
//		String data=null;
//		String path="src\\main\\resources\\RequiredTestData\\Book1.xlsx";
//		FileInputStream file=new FileInputStream (path);
//		Workbook book =WorkbookFactory.create(file);
//	try {
//		data=book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//	}
//	catch(IllegalStateException f) {
//		f.printStackTrace();
//		double value=book.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
//		data= String.valueOf(value);
//	}
//	return data;
//}
}
	

		    
		    
		
		
	       
		
	
	


