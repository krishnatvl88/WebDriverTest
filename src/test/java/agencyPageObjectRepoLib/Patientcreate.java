package agencyPageObjectRepoLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

import agencyGenericLib.Driver;
import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;
public class Patientcreate extends WebDriverCommonLib {
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/ul/li[5]/a")
	private WebElement othersTab;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/a/span[1]")
	private WebElement tabMinimize;
	
	@FindBy(xpath="//div[@class='sidebar-collapse']/ul[@class='nav metismenu']/li[8]/a")
	private WebElement patTab;
	
	@FindBy(xpath="//div/a[contains(text(),'Create')]")
	private WebElement createBtn;
	
	@FindBy(id="FirstName")
	private WebElement firstNme;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="MiddleInitial")
	private WebElement midNme;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="LastName")
	private WebElement lastNme;
	
	@FindBy(name="ZipCode")
	private WebElement zipCode;
	
	@FindBy(id="Address")
	private WebElement address;
	
	@FindBy(name="Telephone")
	private WebElement telePhn;
	
	@FindBy(id="Suite")
	private WebElement suite;
	
	@FindBy(id="DOB")
	private WebElement dob;
	
	@FindBy(id="sex-male")
	private WebElement male;
	
	@FindBy(id="sex-female")
	private WebElement female;
	
	//@FindBy(id="select2-PracticeList-container")
	//private WebElement physician;
	
	@FindBy(id="select2-PracticeList-container")
	private WebElement physclk;
	
	@FindBy(xpath="html/body/span/span/span[1]/input")
	private WebElement phystype;
	
	@FindBy(xpath="//span[@id='select2-Clinician-container']")
	private WebElement clinclk;
	
	@FindBy(xpath="html/body/span/span/span[1]/input")
	private WebElement clintype;
	
	@FindBy(id="Clinician")
	private WebElement selClinician;
	
	//@FindBy(xpath="//select/option[contains(text(),'Clinicin One, Test')]")
	//private WebElement clinDrpVal;
	
	@FindBy(id="PaySource")
	private WebElement selpaySource;
	
	//private WebElement dropdown;
	
	/*WebElement element=driver.findElement(By.name("PaySource"));
	Select se=new Select(element);
	se.selectByVisibleText("Tricare");*/
	
	//@FindBy(xpath="//select/option[@value='Tricare']")
	//private WebElement pSrcVal;
	
	@FindBy(id="HIClaimNumber")
	private WebElement hiclNum;
	
	@FindBy(id="CertPeriodFrom")
	private WebElement certPrdFrm;
	
	@FindBy(id="CertPeriodTo")
	private WebElement certPrdTo;
	
	@FindBy(id="MedicalRecordNumber")
	private WebElement mrNo;
	
	@FindBy(xpath="//span[@id='select2-chronic-code-1-container']")
	private WebElement diagContainer;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement diagType;
	
	@FindBy(xpath="//select[@id='chronic-eo-1']")
	private WebElement diagDrop;
	
	@FindBy(xpath="//input[@id='chronic-date-1']")
	private WebElement diagDate;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement save;
	
	@FindBy(xpath="//div[@id='message-control-container']/div")
	private WebElement verifyText;
	
	public int patCreate(String firstNmeVal, String cityVal, String midNmeVal, String stateVal, 
			String lastNmeVal, String zipCodeVal, String addressVal, String telePhnVal, String suiteVal, 
			String dobVal, String gender, String phys, String clinician, String paysource, String hiclNumVal, String mrNoVal, String diagCode){
		//Driver.driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//Driver.driver.get("https://qa.doctoralliance.net/1660269/Patients/Index");
		//System.out.println("Entered page");
//		waitForPageToLoad();
//		othersTab.click();
//		//waitForPageToLoad();
//		System.out.println("Befor Minimize");
//		tabMinimize.click();
//		
//		System.out.println("After Minimize");
		//  waitForPageToLoad();
		//System.out.println("Before patients tab click");
		//webElement = driver.findElement(By.xpath("bla-bla-bla"));
		((JavascriptExecutor)Driver.driver).executeScript("arguments[0].scrollIntoView();", patTab);
		
		patTab.click();
		System.out.println("After pat tab click");
		Driver.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//Thread.sleep(6000);
		//waitForPageToLoad();
		createBtn.click();
		System.out.println("After create btn click");
		firstNme.sendKeys(firstNmeVal);
		System.out.println("First Name Entered");
		city.sendKeys(cityVal);
		System.out.println("City Entered");
		midNme.sendKeys(midNmeVal);
		System.out.println("Middle Name Entered");
		state.sendKeys(stateVal);
		System.out.println("State Value Chosen");
		//dropdown.getOptions().get(1).click();
		//Select drpdown = new Select();
		//dropdown.
		
		lastNme.sendKeys(lastNmeVal);
		System.out.println("Last Name Entered");
		zipCode.sendKeys(Keys.HOME + zipCodeVal);
		System.out.println("Zip code entered");
		address.sendKeys(addressVal);
		System.out.println("Address entered");
		telePhn.sendKeys(Keys.HOME +telePhnVal);
		System.out.println("Telephone entered");
		suite.sendKeys(suiteVal);
		System.out.println("Suite val entered");
		JavascriptExecutor js_dob = (JavascriptExecutor)AgencyTest.driver;
		
		js_dob.executeScript("document.getElementById('DOB').value='" + dobVal +"'");
		System.out.println("Dob entered");
		//dob.sendKeys(dobVal);
		if(gender == "male" || gender == "Male"){
			male.click();
		}else if(gender == "female" || gender == "Female"){
			female.click();
		}
		System.out.println("Sex chosen");
		//((JavascriptExecutor)Driver.driver).executeScript("arguments[0].scrollIntoView();", physclk);
		//Driver.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		//executor.executeScript("arguments[0].click();", physclk);
		Dimension d = new Dimension(1382,744);
		Driver.driver.manage().window().setSize(d);
		Driver.driver.findElement(By.id("select2-PracticeList-container")).click();
		//JavascriptExecutor executor = (JavascriptExecutor)Driver.driver;
		//executor.executeScript("arguments[0].click()", element);
		
		//physclk.click();
		System.out.println("Physcian field click");
		phystype.sendKeys(phys);
		System.out.println("Physician keys entered");
		Driver.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+phys+"')]")).click();
		System.out.println("Physician Chosen");
		clinclk.click();
		System.out.println("Clinician field click");
		clintype.sendKeys(clinician);
		System.out.println("Clinician Entered");
		Driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.driver.findElement(By.xpath("//ul/li[contains(text(),'"+clinician+"')]")).click();
		System.out.println("Clinician chosen");
		new Select(selpaySource).selectByVisibleText(paysource);
		System.out.println("Paysource chosen");
		hiclNum.sendKeys(hiclNumVal);
		System.out.println("HICL entered");
		//certPrdFrm.sendKeys(certPrdFrmVal);
		//certPrdTo.sendKeys(certPrdToVal);
		mrNo.sendKeys(mrNoVal);
		System.out.println("MR no entered");
		diagContainer.click();
		System.out.println("Diag field click");
		diagType.sendKeys(diagCode);
		System.out.println("Diag entered");
		Driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+diagCode+"')]")).click();
		System.out.println("Diag chosen");
		diagDrop.sendKeys("E");
		System.out.println("Drop entered");
		diagDate.sendKeys("07/01/2017");
		System.out.println("Diag date entered");
		
		//save.click();
		System.out.println("Save clicked");
		return 1;
	}

	
	public String verifyPatientCreate() throws Exception {
		String text = verifyText.getText().trim();
		System.out.println(text);
		return text;
	}
	
}
