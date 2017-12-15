package agencyPageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import agencyGenericLib.WebDriverCommonLib;

public class EnterTimeTrack extends WebDriverCommonLib{
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userImg;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskImg;
	
	
	public void navigateToUSerPage(){
		userImg.click();
		waitForPageToLoad();
	}
	public void navigateToTaskPage(){
		taskImg.click();
		waitForPageToLoad();
	}
	

}
