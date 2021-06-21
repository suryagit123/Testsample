package Amazon.TestCases;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Amazon.Base.BaseClass;
import Amazon.ExcelData.ReadExcelFile;
import Amazon.pages.AddCart_HP_Page;
import Amazon.pages.LoginPage;
import Amazon.pages.SelectProductHP_Page;
import Amazon.pages.SelectProduct_Apple_Page;
import Amazon.pages.ViewCart_Apple_Page;
import Amazon.pages.ViewCart_HP_Page;


public class MainTest extends BaseClass {
	 WebDriver driver;
	 
  	ReadExcelFile userdata= new ReadExcelFile();

	 
@Test(priority=0)
	public void launchsite() throws InterruptedException, IOException  {
	
	//launch chrome
	driver=initializedriver();
	
	//get properties of data
    Properties dataproperties = new Properties();
	 
	File file = new File("C:\\Users\\surya k\\eclipse-workspace\\SeleniumPractice\\src\\main\\java\\Com\\properties\\config.properties");	
	FileInputStream input= new FileInputStream(file);
	dataproperties.load(input);
	 
	 //Launch url
	driver.get(dataproperties.getProperty("url"));
}
	
@Test(priority=1)
	public void loginpage() throws IOException {
	

  //data from excel
	ArrayList<String> testdata=userdata.getdata("Amazon");

		
	// Login
		LoginPage login = new LoginPage(driver);
		
		System.out.println(testdata.get(0)  +   "Amazon product");

		//username
		login.Email().sendKeys(testdata.get(1));
		login.next().click();
		
		//password
		login.passowrd().sendKeys(testdata.get(2));
		login.login().click();

		WebElement select1 = driver.findElement(By.id("searchDropdownBox")); 
		Select text = new Select(select1); //select class
	    text.selectByVisibleText("Computers & Accessories");
	}


@Test(priority=2)	
	public void productHP() throws IOException
	{
	

		ArrayList<String> testdata=userdata.getdata("Amazon");

		// select Hp product
		 SelectProductHP_Page hp1 = new SelectProductHP_Page(driver);
		 WebElement searchhp = hp1.search();
		 
	//	System.out.println(testdata.get(0)  +   "productslist");
 
		 searchhp.sendKeys(testdata.get(3));
		 
		 searchhp.submit();
		 
	     WebElement producthp= hp1.select(); 
	     JavascriptExecutor js = (JavascriptExecutor)driver; 

	     js.executeScript("arguments[0].click();", producthp);
	     
	     
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
				}}}


@Test(priority=3)				
	public void addcartHP() {
		
			// Addcart
			AddCart_HP_Page add=new AddCart_HP_Page(driver);
			add.addcart().click();
	}

	
@Test(priority=4)
	public void viewcartHP() {		
			//view cart hp
			ViewCart_HP_Page viewhp=new ViewCart_HP_Page(driver);
			viewhp.viewcart().click();
					
	}
			

@Test(priority=5)
			public void selectproductapple() throws IOException {
	

				ArrayList<String> testdata=userdata.getdata("Amazon");

				
			// SelectApple brand
			SelectProduct_Apple_Page addproduct = new SelectProduct_Apple_Page(driver);
			
			WebElement selectone = driver.findElement(By.id("searchDropdownBox"));
			 Select textone = new Select(selectone);
			 textone.selectByVisibleText("Computers & Accessories");
			 
			WebElement searchmac = addproduct.search();
			searchmac.clear();
			
		//	searchmac.sendKeys(dataproperties.getProperty("macproduct"));
			searchmac.sendKeys(testdata.get(4));
			
			
			searchmac.submit();

			WebElement productmac=addproduct.product();
		    JavascriptExecutor js = (JavascriptExecutor)driver; 

			js.executeScript("arguments[0].click();", productmac);


			Set<String> tabs = driver.getWindowHandles();

	Iterator<String> it1 = tabs.iterator();
			while (it1.hasNext()) {

				String grandchildwindow = it1.next();
				//if (!childwindow.equals(grandchildwindow)) {
					System.out.println(grandchildwindow  + "grandwindow");
					
					driver.switchTo().window(grandchildwindow);	
					
					
			
			 // Addcart 
					WebElement addmac=addproduct.cart();
			  js.executeScript("arguments[0].click();", addmac);
				}}
			 
			
@Test(priority=6)
			public void viewcartapple() {
			//  viewcart
			  ViewCart_Apple_Page viewmac = new ViewCart_Apple_Page(driver);
			 viewmac.viewcart().click(); System.out.println("viewed");
			 viewmac.viewcartone().click();
			} 

		} 

	 
	 

