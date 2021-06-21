package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductHP_Page {

	WebDriver driver;

	public SelectProductHP_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;

	
	@FindBy(xpath = "//body[1]/div[1]/header[1]/div[1]/div[3]/div[11]/div[2]/div[1]/div[1]/ul[2]/li[4]/a[1]")
	WebElement laptop;

	

	@FindBy(xpath ="//span[contains(text(),'HP 15 (2021) Thin & Light Ryzen 3-3250 Laptop, 8 GB RAM, 1TB HDD')]")
	WebElement click;
	
	public WebElement search() {
		return search;
	
	}
	
	public WebElement laptop() {
		return laptop;
	}

	public WebElement select() {
		return click;
	}

}
