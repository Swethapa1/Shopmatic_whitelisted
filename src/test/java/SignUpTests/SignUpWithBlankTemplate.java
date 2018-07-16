package SignUpTests;
/****
 * TestCase to SignUp for goshopmatic with Blank Template
 * Step1: Launch the  shopmatic URL.
 * Step 2: Navigate to Sign Up Page
 * Step 3: Select category as 'Blank Template'
 * Step 4: Select the default template
 * Step 5: Sign up using credentials and phone number
 * Step 6: Fill Business info
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePageOptions.Products;

import java.util.UUID;

import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.BlankTemplate;


public class SignUpWithBlankTemplate {
	
	WebDriver driver;
	String URL="https://goshopmatic.com/in/";
	
	@BeforeTest
	public void launchBrowser() {
	//	System.setProperty("webdriver.chrome.driver", "/Users/swetha/Documents/softwares/automation drivers/chromedriver");
		driver = new SafariDriver();
		driver.manage().window().maximize();
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
		Thread.sleep(2000);
		signUp.clickCategoryBlankTemplate();
		Thread.sleep(2000);
		BlankTemplate  blankTemplate = new BlankTemplate(driver);
		blankTemplate.clickEditTemplate();
		
		//SignUp with email, password and phone number
		SignUpWindow signUpWindow = new SignUpWindow(driver);
		signUpWindow.addEmail(""+UUID.randomUUID().toString() +"@mailinator.com" );
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
		Thread.sleep(2000);
		
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
