package pom_Classess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {

	WebDriver driver;

	private By profileName = By.xpath("(//div[@class='exehdJ'])[1]");
	
	private By Search = By.xpath("//input[@class='_3704LK']");
	
	private By SearchButton = By.xpath("//button[@class='L0Z3Pu']");
	

	

	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public String getUserName()
	{

		String UserName = driver.findElement(profileName).getText();

		return UserName;
	}

	public void SearchProduct()
	{
		driver.findElement(Search).sendKeys("readmi 10prime");
	
	}


	public void Search()
	{
		driver.findElement(SearchButton).click();;
	}
	

	


		
	}


