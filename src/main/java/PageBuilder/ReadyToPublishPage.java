package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadyToPublishPage {
	
	WebDriver driver;
	
	private String publishSite="//a[contains(text(),'Publish site')]";
	private String editSite="//a[contains(text(),'Edit site')]";
	private String addMoreProducts="//a[contains(text(),'Add more products')]";
	private String viewSite="//a[@class='ico-view-site']";
	
	public ReadyToPublishPage(WebDriver driver) {
		this.driver=driver;
		WebDriverWait wait = new WebDriverWait(driver,30);

	}
	
	public void clickViewSite() {
		driver.findElement(By.xpath(viewSite)).click();
	}
	
	public void clickPublishSite() {
		driver.findElement(By.xpath(publishSite)).click();
	}
	
	public void clickEditSite() {
		driver.findElement(By.xpath(editSite)).click();
	}

	public void clickAddMoreProducts() {
		driver.findElement(By.xpath(addMoreProducts)).click();
	}

}
