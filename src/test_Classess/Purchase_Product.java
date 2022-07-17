package test_Classess;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import baseClass.BaseClass1;
import pom_Classess.Cart_Page;
import pom_Classess.Home_Page;
import pom_Classess.LogInPage;
import pom_Classess.Product_Details;
import utilclass.UtilityClass;

public class Purchase_Product {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

    
		
		driver= BaseClass1.getWebDriver();
	
		
		Thread.sleep(2000);
		
		
		
		Purchase_Product k = new Purchase_Product();  //creating object of class
		
		k.VerifyUserLogIn(driver);
		
		UtilityClass.screenshot(driver);
		
		k.VerifyProductIsAppear(driver);
		
		UtilityClass.screenshot(driver);
		
		k.VerifyPSpecificProductIsSelected(driver);
		
		k.VerifyElementAddToCart(driver);
	
	}

	    
		public void VerifyUserLogIn(WebDriver driver) throws InterruptedException
		{
		
			LogInPage loginpage= new LogInPage(driver);  //pass driver as argument
			
			loginpage.enteremailID();
			
			loginpage.password();
			
			loginpage.submitButton();
			
			Thread.sleep(2000);
			
			Home_Page homepage = new Home_Page(driver);
			
			
			String UserName = homepage.getUserName();
			
			System.out.println(UserName);
			
			if(!UserName.equals(null))
			{
				System.out.println("Test Passes");
			}
			else
			{
				System.out.println("Test Failed");
			}
		}
		
		
		
			public void VerifyProductIsAppear(WebDriver driver) throws InterruptedException
			{
			
				
				
				Home_Page homepage = new Home_Page(driver);
				
				
                homepage.SearchProduct();
				
				homepage.Search();
				
				Thread.sleep(5000);
			
			}
			
			public void VerifyPSpecificProductIsSelected(WebDriver driver) throws InterruptedException 
			{
			
				
				
				Product_Details MobileProductDetail = new Product_Details(driver);
				
				
				MobileProductDetail.SelectMobile();
				
				Thread.sleep(5000);
			
				MobileProductDetail.SwichToProduct();
				
				Thread.sleep(5000);
			}
			
			public void VerifyElementAddToCart(WebDriver driver) throws InterruptedException 
			{
			
				
				
				Cart_Page addtocart = new Cart_Page(driver);
				
				
				addtocart.AddToCart();
				
				Thread.sleep(10000);
				
				addtocart.MobilePlaceOrder();
				
				Thread.sleep(3000);
			
			}
	}


