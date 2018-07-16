package TemplateCategories;
import org.openqa.selenium.WebDriver;
import TemplateActions.TemplateActions;

public class InteriorDesignTemplate {
	
	private String interior_design_template = "//div[contains(@data-name,'Interior - ')]";
	
TemplateActions templateactions;
	
	public InteriorDesignTemplate(WebDriver driver) {
		
		templateactions = new TemplateActions(driver);
	}
	
	public void clickEditTemplate(int template_no) 
	{
		templateactions.clickEditTemplate(interior_design_template, template_no);
	}
	
	public void clickPreview(int template_no) 
	{
		templateactions.clickPreview(interior_design_template, template_no);
	}

}
