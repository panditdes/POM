package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {

	
	public static WebDriver getWebDriver()
	{
       
		  System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();      //upcasting
			
			driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

			driver.manage().window().maximize();      //for maximize the method
			
			return driver;
	}
	
	
	
	
	
}
