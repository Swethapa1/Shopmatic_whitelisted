package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DomainNamePage {
	WebDriver driver;
	
	private String domain_name="//input[@name='subdomain']";
	private String confirm_domain_name="//div[@class='submit']/input[@value='Confirm']";

	public DomainNamePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addDomainName(String name) {
		driver.findElement(By.xpath(domain_name)).sendKeys(""+name);
	}
	
	public void confirmDomainName() {
		driver.findElement(By.xpath(confirm_domain_name)).click();
	}

}
