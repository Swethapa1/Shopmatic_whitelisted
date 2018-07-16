package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpWindow {
	 
    private WebDriver driver;

	private String email="//input[@id='email']";
    private String password = "//input[@id='password']";
    private String phone = "//input[@id='phone']";
    private String submit_button = "//button[@type='submit']";
	private String env_passcode="//input[@id='env_passcode']";
    
    public void addEnvPassCode() {
  		driver.findElement(By.xpath(env_passcode)).sendKeys("tempura");
  	}
    
    public SignUpWindow(WebDriver driver){
    	this.driver =driver;
    }
    
    public void addEmail(String email_address) {
    	driver.findElement(By.xpath(email)).sendKeys(email_address);
    }
    
    public void addPassword(String pwd) {
    	driver.findElement(By.xpath(password)).sendKeys(pwd);
    }
    
    public void addPhone(String ph) {
    	driver.findElement(By.xpath(phone)).sendKeys(ph);
    }
    
    public void clickSubmit() {
    	driver.findElement(By.xpath(submit_button)).click();
    }
    
}
