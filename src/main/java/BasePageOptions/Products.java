package BasePageOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	WebDriver driver;
	
	public Products(WebDriver driver) {
		this.driver=driver;
	}
	
	private String productsOption="//a[@data-name='products']";
	private String moreproductsOption="//a[contains(@class,'add-product-btn')]";

	private String productsName="//input[@id='product_form_product_attributes_name']";
	private String saveProduct="//div/a[@class='submit']";
	private String cancelProduct="//div/a[@class='cancel']";
	private String productBasicInfo="//a[text()='Basic info']";
	private String productOptions="//span[text()='Product options']";
	private String productTaxes="//a[text()='Taxes']";
	private String productMoreSettings="//span[text()='More settings']";

	private String productDescription="//textarea[@name='product_form[product_attributes][description]']";
	private String sellingPrice="//input[@id='product_form_product_attributes_price']";
	private String originalPrice="//input[@id='product_form_product_attributes_list_price']";
	private String category="//div[@id='s2id_product_form_product_attributes_category_ids']/ul/li/input";
	private String totalStockQty="//input[@id='product_form_product_attributes_stock_sum']";
	private String uploadimage="//input[@id='upload-button']";
	private String skipEditing="//a[contains(@class,'skip-link')]";
	private String editHomePage="//a[contains(@class,'next-link')]";

	WebElement element;

	public void clickEditHomePage() {
		driver.findElement(By.xpath(editHomePage)).click();
	} 	
	public void clickSkipEditing() {
		driver.findElement(By.xpath(skipEditing)).click();
	} 
	
	public void clickProductsOption() {
		driver.findElement(By.xpath(productsOption)).click();
	}
	
	public void addMoreproductsOption() {
		driver.findElement(By.xpath(moreproductsOption)).click();
	}
	
	public void addProductsName(String name) {
		driver.findElement(By.xpath(productsName)).sendKeys(""+name);
	}
	
	public void addProductDescription(String name) {
		driver.findElement(By.xpath(productDescription)).sendKeys(""+name);
	}
	
	public void addSellingPrice(String price) {
		driver.findElement(By.xpath(sellingPrice)).sendKeys(""+price);
	}
	
	public void addOriginalPrice(String price) {
		driver.findElement(By.xpath(originalPrice)).sendKeys(""+price);
	}
	
	public void addCategory(String text) {
		element = driver.findElement(By.xpath(category));
		element.sendKeys(""+text);
		element.sendKeys("\n");
	}
	
	public void addTotalStockQty(String text) {
		element=driver.findElement(By.xpath(totalStockQty));
		element.clear();
		element.sendKeys(""+text);
	}
	
	public void clickSave() {
		driver.findElement(By.xpath(saveProduct)).click();
	}
	
	public void clickUploadImage() {
		driver.findElement(By.xpath(uploadimage)).click();
	}
	

}
