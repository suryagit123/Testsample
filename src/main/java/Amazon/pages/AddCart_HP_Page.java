package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart_HP_Page {
WebDriver driver;
	
	public AddCart_HP_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@id='add-to-cart-button']")
WebElement addcart;

//input[@id='add-to-cart-button']

     public WebElement addcart() {
	  return addcart;
	  }	
}







