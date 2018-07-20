package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageBuilderPage {
	WebDriver driver;
	
	private String customization_dropdown_List_Button="//a[@class='current-list']";
	private String EditHomePage="//div[@class='top-bar-center']/div";
	//private String customization_dashboard_link="//ul[contains(@class,'drop-list')]/li/a/span[@class='ico-menu-dashboard']";
	private String editHomeDropDown="//div[contains(@class,'page-drop-list-group checked')]/ul/li[@data-name='home']";
	private String editAboutUsDropDown="//div[contains(@class,'page-drop-list-group checked')]/ul/li[@data-name='about-us']";
	private String editShippingReturnsDropDown="//div[contains(@class,'page-drop-list-group checked')]/ul/li[@data-name='shipping-returns']";
	private String editFAQDropDown="//div[contains(@class,'page-drop-list-group checked')]/ul/li[@data-name='faq']";
	private String editContactUsDropDown="//div[contains(@class,'page-drop-list-group checked')]/ul/li[@data-name='contact-us']";
	private String editAddPageDropdown="//input[@placeholder='Add a new page']";
	private String publish_site="//div[@class='switch']";
	private String save="//div[contains(@class,'save-btn')]";
	private String view_site="//div[contains(@class,'preview-btn')]";
	private String subscribe="//strong[text()='Subscribe']";
	
	//nav
	private String page_dropdown="//div[contains(@class,'page-dropdown')]/div/span[@class='ico-arrow-down ']";
	private String home="//div[@class='page-drop-list-group checked']/ul/li[@data-name='home']";
	private String about_us="//div[@class='page-drop-list-group checked']/ul/li[@data-name='about-us']";
	private String shipping_returns="//div[@class='page-drop-list-group checked']/ul/li[@data-name='shipping-returns']";
	private String faq="//div[@class='page-drop-list-group checked']/ul/li[@data-name='faq']";
	private String contact_us="//div[@class='page-drop-list-group checked']/ul/li[@data-name='contact-us']";
	private String add_Page="//div[@class='page-add']";
	
	private String page_setting="//div[@data-for='page-setting-btn-tip']";
	private String page_section="//div[@data-for='page-section-btn-tip']";
	private String device_dropdown="//div[contains(@class,'device-dropdown')]";
	private String mobile_view="//button[@data-target='mobile']";
	private String tab_view="//button[@data-target='tablet']";

	
	public PageBuilderPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickDeviceDropDown() {
		driver.findElement(By.xpath(device_dropdown)).click();
	}
	
	public void selectMobileView() {
		driver.findElement(By.xpath(mobile_view)).click();
	}
	
	public void selectTabView() {
		driver.findElement(By.xpath(tab_view)).click();
	}
	
	public void clickPageSetting() {
		driver.findElement(By.xpath(page_setting)).click();
	}
	
	public void clickPageSection() {
		driver.findElement(By.xpath(page_section)).click();
	}
	
	public void clickPageDropDown() {
		driver.findElement(By.xpath(page_dropdown)).click();
	}
	
	public void selectHome() {
		driver.findElement(By.xpath(home)).click();
	}
	
	public void selectAboutUs() {
		driver.findElement(By.xpath(about_us)).click();
	}
	public void selectShippingReturns() {
		driver.findElement(By.xpath(shipping_returns)).click();
	}
	public void selectFaq() {
		driver.findElement(By.xpath(faq)).click();
	}
	public void selectContactUs() {
		driver.findElement(By.xpath(contact_us)).click();
	}
	public void selectAddPage() {
		driver.findElement(By.xpath(add_Page)).click();
	}
	
	public void clickSubscribe() {
		driver.findElement(By.xpath(subscribe)).click();
	}
	
	public void addPage(String pageName) {
		driver.findElement(By.xpath(editAddPageDropdown)).sendKeys(""+pageName);
	}
	
	public void clickEditSite() {
		driver.findElement(By.xpath(customization_dropdown_List_Button)).click();;
	}
	
	public void clickEditHomeOnTopBar() {
		driver.findElement(By.xpath(EditHomePage)).click();;
	}
	
	public void clickDashboard() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Dashboard");
	}
	
	public void clickEditSiteDropdown() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Edit site");
	}
	
	public void clickProducts() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Products");
	}
	public void clickOrders() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Orders");
	}
	public void clickCustomers() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Customers");
	}
	public void clickFinancialServices() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Financial Services");
	}
	public void clickAdditionalServices() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Additional Services");
	}
	public void clickHelp() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Help");
	}
	public void clickSignOut() {
		Select s= new Select(driver.findElement(By.xpath(customization_dropdown_List_Button)));
		s.selectByVisibleText("Sign out");
	}
	
	public void clickEditHomeDropDown() {
		driver.findElement(By.xpath(editHomeDropDown)).click();;
	}
	public void clickEditAboutUsDropDown() {
		driver.findElement(By.xpath(editAboutUsDropDown)).click();;
	}
	public void clickEditShippingReturns() {
		driver.findElement(By.xpath(editShippingReturnsDropDown)).click();;
	}
	public void clickEditFaqDropDown() {
		driver.findElement(By.xpath(editFAQDropDown)).click();;
	}
	public void clickEditContactUsDropDown() {
		driver.findElement(By.xpath(editContactUsDropDown)).click();;
	}
	
	public void clickPublishSiteSwitchButton() {
		driver.findElement(By.xpath(publish_site)).click();
	}
	
	public void clickSaveButton() {
		driver.findElement(By.xpath(save)).click();
	}
	
	public void clickViewSiteButton() {
		driver.findElement(By.xpath(view_site)).click();
	}
	
}
