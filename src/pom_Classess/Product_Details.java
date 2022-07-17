package pom_Classess;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Details {
	
	WebDriver driver;
    private By MobileName = By.xpath("(//div[@class='col col-7-12'])[1]");
	public Product_Details(WebDriver driver)
	{
		this.driver = driver;
	}
	public void SelectMobile()
	{
		driver.findElement(MobileName).click();
		
	}
	public void SwichToProduct() throws InterruptedException
	{
	String mainpage = driver.getWindowHandle();
		
		System.out.println(mainpage);
		
		
		  Set<String> setOfAddresses = driver.getWindowHandles();
	         
	         
	      List<String> listOfPopups = new ArrayList<>(setOfAddresses);
	      
	      int count =setOfAddresses.size();
		
	         for (int i=1; i<count;i++)
	         {
	        	 driver.switchTo().window(listOfPopups.get(i));
	        	 
	        	 Thread.sleep(3000);
	        	 
	        	 System.out.println(driver.getTitle());
	        	 
	        	 
	        	 driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
	         }

	
	    }
	
	
	
	
	
	
	
	
}
