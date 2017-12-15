package agencyPageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import agencyGenericLib.Driver;
import agencyGenericLib.WebDriverCommonLib;

public class Login extends WebDriverCommonLib{
	
	@FindBy(id="Username")
	private WebElement userNAmeEdt;
	
	@FindBy(id="Password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'End tour')]")
	private WebElement loginPopup;
	

	public void loginToAPP(String username , String password, String url) {
		Driver.driver.get(url);
		//System.out.println(url);
		Driver.driver.manage().window().maximize();
		userNAmeEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		
		Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Driver.driver.manage().timeouts().pageLoadTimeout(8,TimeUnit.SECONDS);
		//waitForPageToLoad();
		//loginPopup.click();
		
		Driver.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	}

}
