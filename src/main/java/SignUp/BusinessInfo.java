package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessInfo {
	
	WebDriver driver;
	
	private String firstName="//input[@name='business[first_name]']";
	private String lastName="//input[@name='business[last_name]']";
	private String storeName="//input[@name='business[business_name]']";
	private String businessPhone="//input[@name='business[phone]']";
	private String next_button="//input[@value='Next']";
	private String next_button_1="//*[@id=\"business-form-address\"]/div[4]/div/div/input";
	private String business_address="//div[contains(@class,'geosuggest')]/input";
	private String business_address_search_button="//span[contains(@class,'Geosuggest')]";
	private String business_street="//input[@name='business[street]']";
	private String business_city="//input[@name='business[city_name]']";
	private String business_state="//input[@name='business[province_name]']";
	private String business_pincode="//input[@name='business[postcode]']";

	public BusinessInfo(WebDriver driver){
		this.driver = driver;
	}
	
	public void addFirstName(String name) {
    	driver.findElement(By.xpath(firstName)).sendKeys(name);
    }
	
	public void addLastName(String name) {
    	driver.findElement(By.xpath(lastName)).sendKeys(name);
    }
	
	public void addStoreName(String name) {
    	driver.findElement(By.xpath(storeName)).sendKeys(name);
    }
	
	public void addBusinessPhone(String phone) {
    	driver.findElement(By.xpath(businessPhone)).sendKeys(phone);
    }
	
	public void clickNext() {
		driver.findElement(By.xpath(next_button)).click();
	}
	
	public void clickBusinessFormAddressNextButton() {
		driver.findElement(By.xpath(next_button_1)).click();
	}
	
	public void addBusiness_address(String name) {
    	driver.findElement(By.xpath(business_address)).sendKeys(name);
    }
	
	public void clickBusinessAddressSearchButton() {
    	driver.findElement(By.xpath(business_address_search_button)).click();
    }
	
	public void addBusinessStreet(String name) {
    	driver.findElement(By.xpath(business_street)).sendKeys(name);
    }

	public void addBusinessCity(String name) {
    	driver.findElement(By.xpath(business_city)).sendKeys(name);
    }
	
	public void addBusinessState(String name) {
    	driver.findElement(By.xpath(business_state)).sendKeys(name);
    }
	
	public void addBusiness_Pincode(String name) {
    	driver.findElement(By.xpath(business_pincode)).sendKeys(name);
    }
}
