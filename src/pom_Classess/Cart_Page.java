package pom_Classess;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page {

	WebDriver driver;
	
	private By AddToCartButton = By.xpath("(//li[@class='col col-6-12'])[1]");
	
	private By PlaceOrder = By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']");     
	

	public Cart_Page(WebDriver driver)
	
	{
		this.driver = driver;
	}

	
	public void AddToCart()
	{
		driver.findElement(AddToCartButton).click();;
	}
	
	public void MobilePlaceOrder()
	{
		driver.findElement(PlaceOrder).click();;
	}


	

	
}
	
	
	
	
	
	
	
	
	
	
	

