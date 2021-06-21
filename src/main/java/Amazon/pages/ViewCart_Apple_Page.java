package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart_Apple_Page {
	WebDriver driver;

	public ViewCart_Apple_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	WebElement close;

	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement view;

	
	public WebElement viewcart() {
		return close;
	}
	public WebElement viewcartone() {
		return view;
		}
}