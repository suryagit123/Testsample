package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart_HP_Page {

WebDriver driver;
	
	public ViewCart_HP_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='attachAccessoryModal_feature_div']/div[@id='attach-dss-placeholder']/div[@id='attach-desktop-sideSheet']/div[@id='attach-accessory-pane']/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[5]/div[4]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")	

	WebElement viewcart;
	
	  public WebElement viewcart() {
		  return viewcart;
		  }	
	//body[1]/div[2]/div[2]/div[5]/div[4]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]	
	
	
	
}








