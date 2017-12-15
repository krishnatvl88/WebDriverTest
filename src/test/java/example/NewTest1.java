package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest1 {		
	    private WebDriver d;		
		@Test				
		public void testEasy() {	
			String sExpecteTitle = "Welcome: Mercury Tours";
			d.get("http://newtours.demoaut.com/mercurywelcome.php");
			d.manage().window().maximize();
			String sAtutalTitle = d.getTitle();
			if(sExpecteTitle.contentEquals(sAtutalTitle))
			{
				System.out.println("Home page is loaded");
				d.findElement(By.partialLinkText("here")).click();
				d.findElement(By.id("email")).sendKeys("abc@hotmail.com");
				d.findElement(By.name("password")).sendKeys("sdfdf");
				d.findElement(By.name("confirmPassword")).sendKeys("sdfdf");
				d.findElement(By.name("register")).click();
				if(d.findElement(By.linkText("SIGN-OFF")).isDisplayed())
					System.out.println("Register is successfull");
				else
					System.out.println("Register is unsuccessfull");
				d.close();
			}
			else
				System.out.println("Home page is not loaded");		
		}	
		@BeforeTest
		public void beforeTest() {	
			 System.setProperty("webdriver.chrome.driver", 
			            "C:\\Users\\Kris M\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 d = new ChromeDriver();
		   // driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			d.quit();			
		}		
}	