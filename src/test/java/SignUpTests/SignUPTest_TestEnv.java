package SignUpTests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import BasePageOptions.Products;
import HomePage.HomePage;
import PageBuilder.DomainNamePage;
import PageBuilder.PaymentOptionsPage;
import PageBuilder.ReadyToPublishPage;
import PageBuilder.ShippingOptionsPage;
import SignUp.BusinessInfo;
import SignUp.SignUp;
import SignUp.SignUpWindow;
import TemplateCategories.ClothingTemplate;

public class SignUPTest_TestEnv extends BaseClass{

	public SignUPTest_TestEnv() throws IOException, InvalidFormatException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testMethod() throws InterruptedException, MalformedURLException {
		
		SignUp s = new SignUp(driver);
		s.clickSignUpGetStarted();
		Thread.sleep(5000);
		
		ClothingTemplate clothingTemplate = new ClothingTemplate(driver);
		clothingTemplate.clickEditTemplate(1);
		Thread.sleep(2000);
		
		SignUpWindow sg = new SignUpWindow(driver);
		sg.addEmail(""+UUID.randomUUID().toString()+"@abc.com");
		sg.addPassword("Tester123*");
		sg.addPhone("1234567890");
		sg.addEnvPassCode();
		Thread.sleep(2000);
		sg.clickSubmit();
		Thread.sleep(5000);
		
		BusinessInfo businessInfo = new BusinessInfo(driver);
		businessInfo.addFirstName(UUID.randomUUID().toString());
		businessInfo.addLastName(UUID.randomUUID().toString());
		businessInfo.addStoreName(""+UUID.randomUUID().toString()+"'s company");
		businessInfo.clickNext();
		Thread.sleep(5000);
		
		businessInfo.clickBusinessAddressSearchButton();
		Thread.sleep(2000);
		businessInfo.addBusinessStreet("ABC Street");
		businessInfo.addBusinessCity("ABC City");
		businessInfo.addBusinessState("Karnataka");
		Thread.sleep(3000);
		businessInfo.addBusiness_Pincode("581115");
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
		p.clickSkipEditing();
		
		Thread.sleep(5000);
		
		DomainNamePage domainNamePage = new DomainNamePage(driver);
	//	domainNamePage.addDomainName("swethastores");
		domainNamePage.confirmDomainName();
		System.out.println("\nwindow handle: "+driver.getWindowHandle()+"\nCurrent URL: "+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		PaymentOptionsPage paymentOptionsPage = new PaymentOptionsPage(driver);
		paymentOptionsPage.clickEditOfflinePaymentOption(1);
		paymentOptionsPage.addOfflineInstructionForDomesticPayment("uerhfvherf");
		paymentOptionsPage.clickSaveAndEnablePayment(1);
		//driver.navigate().refresh();
		paymentOptionsPage.clickNext();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getCurrentUrl().contentEquals("https://shopmakerapp.com/on_board/shipping_options"), "Page not moved to shipping options page");
		ShippingOptionsPage shippingOptionsPage = new ShippingOptionsPage(driver);
		//Thread.sleep(3000);
		//shippingOptionsPage.enableFreeShippingforDomestic();
		//shippingOptionsPage.addSelfCollectDetails("rgyewgf");
		//shippingOptionsPage.clickSave();
		//shippingOptionsPage.clickEnableSelfCollect();
		//shippingOptionsPage.clickNext();
		shippingOptionsPage.clickNext();
		Thread.sleep(10000);
		Assert.assertTrue(driver.getCurrentUrl().contentEquals("https://shopmakerapp.com/on_board/ready_to_publish"), "Page not moved to Ready to publish page");
		ReadyToPublishPage readyToPublishPage = new ReadyToPublishPage(driver);
		readyToPublishPage.clickPublishSite();
		Thread.sleep(3000);
		readyToPublishPage.clickViewSite();
		Thread.sleep(10000);

	}
	
	

}
