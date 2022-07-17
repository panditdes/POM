package pom_Classess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	WebDriver driver;     //intialise WebDriver driver as global
	
	
	private By emailID = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	
	private By password = By.xpath("//input[@type='password']");
	
	private By submitButton = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	

	public LogInPage(WebDriver driver)
	
	{
		this.driver = driver;
	}

	
	public void enteremailID()
	{
		driver.findElement(emailID).sendKeys("deshpandepandit143@gmail.com");
	}
	
	
	public void password()
	{
		driver.findElement(password).sendKeys("Ponds@123");
	}
	
	
	public void submitButton()
	{
		driver.findElement(submitButton).click();
	}
	
	

	
	
	
	
}
