package PageBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentOptionsPage {
	WebDriver driver;
	
	private String next="//a[text()='Next']";
	private String payment_options_list="//div[contains(@class,'option-lists')]/div/div[contains(@class,'option-list-base')]";
	private String enable_payment_option="//button[text()='Enable']";
	private String save_and_enable_payment_option="//button[text()='Save & Enable']";
	private String edit_offline_payment_option="//button[text()='Edit']";
	private String close_button="//button[contains(@class,'close')]";
	private String offlineInstructions_domestic="//div[4]/div/div[2]/div/div/div[2]/textarea[@class='offline-payment-instructions-textarea']";
	private String offlineInstructions_international="//div[7]/div/div[2]/div/div/div[2]/textarea[@class='offline-payment-instructions-textarea']";

	public PaymentOptionsPage(WebDriver driver) {
		this.driver=driver;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='title']']")));
	
	}
	
	public void clickNext() {
		driver.findElement(By.xpath(next)).click();
	}
	
	public void clickEnablePayment(int payment_option_num) {
		driver.findElement(By.xpath(""+enable_payment_option+"["+payment_option_num+"]")).click();
	}
	
	public void clickSaveAndEnablePayment(int payment_option_num) {
		driver.findElement(By.xpath(""+save_and_enable_payment_option+"["+payment_option_num+"]")).click();
	}
	
	public void clickClose() {
		driver.findElement(By.xpath(close_button));
	}
	
	public void clickEditOfflinePaymentOption(int payment_option_num) {
		driver.findElement(By.xpath(""+edit_offline_payment_option+"["+payment_option_num+"]")).click();	
	}
	
	public void addOfflineInstructionForDomesticPayment(String instructions) {
		driver.findElement(By.xpath(offlineInstructions_domestic)).sendKeys(""+instructions);
	}

}
