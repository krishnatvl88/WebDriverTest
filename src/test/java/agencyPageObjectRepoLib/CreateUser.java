package agencyPageObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import agencyGenericLib.WebDriverCommonLib;

public class CreateUser extends WebDriverCommonLib{
	
	@FindBy(name="username")
	private WebElement usernameEdt;
	
	@FindBy(name="firstName")
	private WebElement firstNameEdt;
	
	@FindBy(name="lastName")
	private WebElement lastNameEdt;
	
	@FindBy(name="email")
	private WebElement emailEdt;
	
	@FindBy(name="passwordText")
	private WebElement passwordEdt;
	
	@FindBy(name="passwordTextRetype")
	private WebElement re_passwordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement creaUsetBtn;
	
	public void createNewUser(String userNAme , String fName , String lNAme, String password, String email){
		usernameEdt.sendKeys(userNAme);
		firstNameEdt.sendKeys(fName);
		lastNameEdt.sendKeys(lNAme);
		emailEdt.sendKeys(email);
		passwordEdt.sendKeys(password);
		re_passwordEdt.sendKeys(password);
		creaUsetBtn.click();
		waitForPageToLoad();
	}
	
	
	
	
}
