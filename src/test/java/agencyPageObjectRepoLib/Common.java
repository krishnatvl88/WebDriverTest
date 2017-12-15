package agencyPageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import agencyGenericLib.WebDriverCommonLib;

public class Common extends WebDriverCommonLib{
	
	@FindBy(xpath="//ul[@class='nav navbar-top-links navbar-right']/li[3]/a")
	private WebElement logoutLnk;
	
	
	public void LogOut(){
		logoutLnk.click();
		waitForPageToLoad();
	}
	

}
