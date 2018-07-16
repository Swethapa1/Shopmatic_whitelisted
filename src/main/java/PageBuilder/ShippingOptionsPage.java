package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingOptionsPage {
	WebDriver driver;
	
	private String next="//a[text()='Next']";
	private String shipping_domestic_tab="//a[contains(@href,'domestic')]";
	private String shipping_international_tab="//a[contains(@href,'international')]";
	private String shipping_provider_list="//span[@class='provider-name']";
	private String enable_shipping_option="//button[text()='Enable']";
	private String enable_selfCollectOption="//div[@class='self_collect control-unit']/button[text()='Enable']";
	private String enable_free_shipping_domestic="//*[@id='panel_domestic']/div[2]/div/label/input";
	private String enable_free_shipping_international="//*[@id='panel_international']/div[2]/div/label/inpu";
	private String self_collect_details="//textarea[@name='description']";
	private String saveButton="//button[text()='Save']";
	private String cancelButton="//button[text()='Cancel']";
	private String flatShippingFreeCharge="//*[@id='flat_shipping_fee']";
	private String viewShippingRatesLink="//a[contains(text(),'View shipping rates.')]";
	
	public ShippingOptionsPage(WebDriver driver) {
		this.driver=driver;
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='title']']")));
	}
	
	public void clickNext() {
		if(driver.findElement(By.xpath(next)).isDisplayed())
			driver.findElement(By.xpath(next)).click();
	}
	
	public void clickEnableSelfCollect() {
		driver.findElement(By.xpath(enable_selfCollectOption)).click();
	}
	
	public String listOfShippingProviders() {
		return driver.findElement(By.xpath(shipping_provider_list)).getText();
	}
	
	public void clickEnableShipping(int shipping_option_num) {
		driver.findElement(By.xpath(""+enable_shipping_option+"["+shipping_option_num+"]")).click();
	}
	
	public void clickViewShippingOptionsLink(int shipping_option_num) {
		driver.findElement(By.xpath(""+viewShippingRatesLink+"["+shipping_option_num+"]")).click();
	}
	
	public void enableFreeShippingforDomestic() {
		driver.findElement(By.xpath(enable_free_shipping_domestic)).click();
	}
	
	public void enableFreeShippingforInternational() {
		driver.findElement(By.xpath(enable_free_shipping_international)).click();
	}
	
	public void clickDomesticShippingTab() {
		driver.findElement(By.xpath(shipping_domestic_tab)).click();
	}
	
	public void clickInternatioanlShippingTab() {
		driver.findElement(By.xpath(shipping_international_tab)).click();
	}
	
	public void addSelfCollectDetails(String text) {
		driver.findElement(By.xpath(self_collect_details)).sendKeys(""+text);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(saveButton)).click();
	}
	
	public void clickCancel() {
		driver.findElement(By.xpath(cancelButton)).click();
	}
	
	public void addFlatShippingFeeCharges(Float charges) {
		driver.findElement(By.xpath(flatShippingFreeCharge)).sendKeys(""+charges);
	}

}
