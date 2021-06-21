package Amazon.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct_Apple_Page {
WebDriver driver;
	
	public SelectProduct_Apple_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchone;
	
	@FindBy(xpath="//span[contains(text(),'2020 Apple MacBook Pro (13-inch, Apple M1 chip wit')]")
	WebElement product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add;
	
	
	public WebElement search() {
		return searchone;
	}

	public WebElement product() {
		return product;
	}
	public WebElement cart() {
		return add;
	}
	
	
	
}
