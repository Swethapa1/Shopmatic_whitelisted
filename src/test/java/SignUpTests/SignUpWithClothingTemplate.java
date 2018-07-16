package SignUpTests;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePageOptions.Products;
import BasePageOptions.Setup.Domain;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.ClothingTemplate;

public class SignUpWithClothingTemplate {
	WebDriver driver;
	String URL="http://goshopmatic.com/sg";
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/swetha/Documents/softwares/automation drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void endTest() {
		driver.quit();
	}
	
	public void launchURL() {
		driver.navigate().to(URL);
	}
	
	@Test
	public void testSignUpWithBlankTemplate() throws InterruptedException {
		//Launch URL
		launchURL();
		
		//SignUp
		SignUp signUp = new SignUp(driver);
		signUp.clickSignUp();
		Thread.sleep(10000);
		signUp.clickCategoryClothing(driver);
		Thread.sleep(1000);
		
		ClothingTemplate clothingTemplate = new ClothingTemplate(driver);
		clothingTemplate.clickEditTemplate(2);
		
		SignUpWindow signUpWindow = new SignUpWindow(driver);
		signUpWindow.addEmail("testshop_"+""+UUID.randomUUID().toString() +"@testshop.com" );
		signUpWindow.addPassword("Tester123*");
		signUpWindow.addPhone("1111111111");
		signUpWindow.clickSubmit();
		Thread.sleep(10000);
		
		// add business info
		
		BusinessInfo businessInfo = new BusinessInfo(driver);
		businessInfo.addFirstName(UUID.randomUUID().toString());
		businessInfo.addLastName(UUID.randomUUID().toString());
		businessInfo.addStoreName(""+UUID.randomUUID().toString()+"'s company");
		businessInfo.clickNext();
		Thread.sleep(5000);
		//businessInfo.addBusiness_address("ABC");
		businessInfo.clickBusinessAddressSearchButton();
		Thread.sleep(2000);
		businessInfo.addBusinessStreet("ABC Street");
		//businessInfo.addBusinessCity("ABC City");
		//businessInfo.addBusinessState("Singapore");
		Thread.sleep(3000);
		businessInfo.addBusiness_Pincode("1234");
		Thread.sleep(2000);
		businessInfo.clickBusinessFormAddressNextButton();
		Thread.sleep(10000);
		
		Products p = new Products(driver);
		p.clickProductsOption();
		Thread.sleep(2000);
		//p.clickSave();
		p.addProductsName("Product1");
		p.addOriginalPrice("100.00");
		p.addSellingPrice("120.00");
		p.addProductDescription("Description of product1");
		p.addCategory("category1");
		p.addTotalStockQty("10");
		Thread.sleep(2000);
		p.clickSave();
		Thread.sleep(3000);
		p.clickEditHomePage();
		
		
	}

}
