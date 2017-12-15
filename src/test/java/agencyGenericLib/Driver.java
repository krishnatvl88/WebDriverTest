package agencyGenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver getBrowser() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Kris M\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", 
	    //        "C:\\Users\\Kris M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("http://qa.doctoralliance.net");
		
		//driver = new FirefoxDriver();
		
		
		if(Constants.browser.equals("ie")){
			   System.setProperty("webdriver.ie.driver", 
					                 "C:\\Users\\Kris M\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
			   driver= new InternetExplorerDriver();
			}else if(Constants.browser.equals("chrome")){
				   System.setProperty("webdriver.chrome.driver", 
						            "C:\\Users\\Kris M\\Downloads\\chromedriver_win32\\chromedriver.exe");
				   driver = new ChromeDriver();			
			}else{
				//C:\Users\Kris M\Downloads\
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Kris M\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver(capabilities); 
				//driver = new FirefoxDriver();
			}
		return driver;
	}

}
