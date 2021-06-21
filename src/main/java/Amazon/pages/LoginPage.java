package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	
	public WebElement Email() {
		return email;
	}
	public WebElement next() {
		return conti;
	}
	public WebElement passowrd() {
		return password;
	}
	public WebElement login() {
		return login;
	}
	
	
	
	
}




