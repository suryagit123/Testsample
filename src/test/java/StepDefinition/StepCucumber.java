
package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Amazon.Base.BaseClass;
import Amazon.ExcelData.ReadExcelFile;
import Amazon.pages.AddCart_HP_Page;
import Amazon.pages.LoginPage;
import Amazon.pages.SelectProductHP_Page;
import Amazon.pages.SelectProduct_Apple_Page;
import Amazon.pages.ViewCart_Apple_Page;
import Amazon.pages.ViewCart_HP_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepCucumber extends BaseClass{
	
	     WebDriver driver;

		//get properties of data
	    Properties dataproperties = new Properties();
	    
	    //drive data from Excel
	  	ReadExcelFile userdata= new ReadExcelFile();

		 
@Given("^launch the amazon site with property file$")
public void launch_the_amazon_site_with_property_file() throws Throwable {
	  	 
	  //launch chrome
	driver=initializedriver();
	
	File file = new File("C:\\Users\\surya k\\eclipse-workspace\\SeleniumPractice\\src\\main\\java\\Com\\properties\\config.properties");	
	FileInputStream input= new FileInputStream(file);
	dataproperties.load(input);
	 
		 //Launch url
		driver.get(dataproperties.getProperty("url"));
}



@When("^Enter username and password and click login$")
public void enter_username_and_password_and_click_login() throws Throwable {
	
	//data from excel
		ArrayList<String> testdata=userdata.getdata("Amazon");

			
		// Login
			LoginPage Hp = new LoginPage(driver);
			
			System.out.println(testdata.get(0)  +   "Amazon product");

			//username
			Hp.Email().sendKeys(testdata.get(1));
			Hp.next().click();
			
			//password
			Hp.passowrd().sendKeys(testdata.get(2));
			Hp.login().click();
	
	
}

@When("^search hp model in search field$")
public void search_hp_model_in_search_field() throws Throwable {
	
	WebElement select1 = driver.findElement(By.id("searchDropdownBox")); 
	Select text = new Select(select1); //select class
    text.selectByVisibleText("Computers & Accessories");
    
	ArrayList<String> testdata=userdata.getdata("Amazon");

	// select Hp product
	 SelectProductHP_Page hp1 = new SelectProductHP_Page(driver);
	 WebElement searchhp = hp1.search();
	 
	 searchhp.sendKeys(testdata.get(3));
	 
	 searchhp.submit();
	
	
}

@When("^click the hp model$")
public void click_the_hp_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 SelectProductHP_Page hp1 = new SelectProductHP_Page(driver);

	  WebElement producthp= hp1.select(); 
	     JavascriptExecutor js = (JavascriptExecutor)driver; 

	     js.executeScript("arguments[0].click();", producthp);
	     
}

@When("^click add cart button of hp model$")
public void click_add_cart_button_of_hp_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 //window handle
    String parentwindow = driver.getWindowHandle();

		System.out.println(parentwindow  + "parentwindow");

		Set<String> tabs = driver.getWindowHandles();

		Iterator<String> it = tabs.iterator();
		 while (it.hasNext()) {
			String childwindow = it.next();

			if (!parentwindow.equals(childwindow)) {
				//driver.close();

				driver.switchTo().window(childwindow);	
		
				System.out.println(childwindow  + "childwindow");
				
				// Addcart
				AddCart_HP_Page add=new AddCart_HP_Page(driver);
				add.addcart().click();
			}}}


@When("^click cart button to view the added item of hp model$")
public void click_cart_button_to_view_the_added_item_of_hp_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	//view cart hp
	ViewCart_HP_Page viewhp=new ViewCart_HP_Page(driver);
	viewhp.viewcart().click();
	 System.out.println("viewed HP product");
		
	
}


@When("^search Apple model in search field$")
public void search_Apple_model_in_search_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	ArrayList<String> testdata=userdata.getdata("Amazon");

	
	// SelectApple brand
	SelectProduct_Apple_Page addproduct = new SelectProduct_Apple_Page(driver);
	
	WebElement selectone = driver.findElement(By.id("searchDropdownBox"));
	 Select textone = new Select(selectone);
	 textone.selectByVisibleText("Computers & Accessories");
	 
	WebElement searchmac = addproduct.search();
	
	
//	searchmac.sendKeys(dataproperties.getProperty("macproduct"));
	searchmac.sendKeys(testdata.get(4));
	
	
	searchmac.submit();

}

@When("^click the Apple model$")
public void click_the_Apple_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	SelectProduct_Apple_Page addproduct = new SelectProduct_Apple_Page(driver);

	WebElement productmac=addproduct.product();
    JavascriptExecutor js = (JavascriptExecutor)driver; 

	js.executeScript("arguments[0].click();", productmac);
	

}


@When("^click add cart button of apple model$")
public void click_add_cart_button_of_apple_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 //window handle
    String parentwindow = driver.getWindowHandle();

		System.out.println(parentwindow  + "parentwindow");

		Set<String> tabs = driver.getWindowHandles();

		Iterator<String> it = tabs.iterator();
		 while (it.hasNext()) {
			String childwindow = it.next();

			if (!parentwindow.equals(childwindow)) {
				//driver.close();

				driver.switchTo().window(childwindow);	
		
				System.out.println(childwindow  + "childwindow");
				
				// Addcart
				SelectProduct_Apple_Page addproduct = new SelectProduct_Apple_Page(driver);

				WebElement addmac=addproduct.cart();
			    JavascriptExecutor js = (JavascriptExecutor)driver; 

		       js.executeScript("arguments[0].click();", addmac);
			}}}



@When("^click cart button to view the added item of apple model$")
public void click_cart_button_to_view_the_added_item_of_apple_model() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//  viewcart
	  ViewCart_Apple_Page viewmac = new ViewCart_Apple_Page(driver);
	 viewmac.viewcart().click();
	 viewmac.viewcartone().click();
	 System.out.println("viewed Apple product");
	} 
	

@Then("^hp laptop details page has populated$")
public void hp_laptop_details_page_has_populated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("hp laptop details page has populated");
	Thread.sleep(5000);
	driver.quit();
}

@Then("^Apple laptop details page has populated$")
public void apple_laptop_details_page_has_populated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Apple laptop page has populated");
	Thread.sleep(5000);
	driver.quit();
	
}


@Then("^cart added page has populated$")
public void cart_added_page_has_populated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("cart added successfully");
	Thread.sleep(5000);
	driver.quit();
	
}


@Then("^view cart page has populated$")
public void view_cart_page_has_populated() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("view cart page has populated");
	
	Thread.sleep(5000);
	driver.quit();
}

}





