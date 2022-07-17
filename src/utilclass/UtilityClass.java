package utilclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	//waits
	
	@SuppressWarnings("deprecation")
	public static void implicitwait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	//parameterizattion
	
	
	public static void getData(WebDriver driver,String location,String sheetName,int Row,int Cell) throws EncryptedDocumentException, IOException 
	
	{
		  FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
			
			//dont forget to add xlsx and import from java
			
			
			Sheet workbook = WorkbookFactory.create(file).getSheet("sheet1");    //take create boolean 
			
			workbook.getRow(Row).getCell(Cell).getStringCellValue(); 
   
	}
	

	
	
    
    ////Taking ScreenShot:screenShot Method
    
    public static void screenshot(WebDriver driver) throws IOException
    {
	
    	
    	
    	SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
    	
    	
    	String date = formate.format(new Date());       //from java import date
    	
    	System.out.println(date);
    	
    	
    	
    	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	
    	File Destination = new File("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\Screenshots\\"+date+".jpg");
    	
    	
    	FileHandler.copy(source, Destination);           //IOException add kara
    }
	
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void getDataFromMultiple(WebDriver driver,String location,String sheetName,int initialRow,int finalRow,int Cell)
//	
//	{
//    	
//    	{
//  		  FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
//  			
//  			//dont forget to add xlsx and import from java
//  			
//  			
//  			Sheet workbook = WorkbookFactory.create(file).getSheet("sheet1");    //take create boolean 
//  			
//  			String value = workbook.getinitialRow().getfinalRow().getCell().getStringCellValue(); 
//     
//  	}
//   
//	}
	

