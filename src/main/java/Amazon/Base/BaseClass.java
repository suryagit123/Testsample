package Amazon.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class BaseClass  {
	protected static WebDriver  driver;
	
	@Test
	public WebDriver initializedriver() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\surya k\\OneDrive\\Pictures\\Saved Pictures//chromedriver.exe");

	  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
}
	
	/*public String getscreenshotpath(String Testcasename,WebDriver driver) throws IOException {
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\reports\\"+Testcasename+".png";
		File file=new File(path);
		FileUtils.copyFile(source,file);
		return path;
		
		*/
		
		
	}

