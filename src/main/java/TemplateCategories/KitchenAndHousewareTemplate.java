package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class KitchenAndHousewareTemplate {
	
	private String kitchen_houseware_template = "//div[contains(@data-name,'Kitchen - ')]";
	
TemplateActions templateactions;
	
	public KitchenAndHousewareTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(kitchen_houseware_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(kitchen_houseware_template, template_no);
	}

}
