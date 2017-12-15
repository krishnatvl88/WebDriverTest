package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.Driver;
import agencyGenericLib.WebDriverCommonLib;

/*import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException; */

public class CreateVerbalOrderByElectronic extends WebDriverCommonLib{
	
	@FindBy(xpath="//ul[@class='nav nav-second-level collapse in']/li[2]/a")
	private WebElement tabClick;
	
	@FindBy(xpath="//span[@id='select2-PatientSelect2-container']")
	private WebElement selPatClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement selPatEnt;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	@FindBy(xpath="//span[@id='select2-PracticeList-container']")
	private WebElement physcClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement physcEnt;
	
	//@FindBy(xpath="//ul/li/span/strong[contains(text(),'DoctorOne')]")
	//private WebElement physcClk;
	
	@FindBy(id="Clinician")
	private WebElement clinician;
	
	//@FindBy(id="ForUser")
	//private WebElement selclinican;
	
	@FindBy(xpath="//textarea[@id='Orders']")
	private WebElement orders;
	
	@FindBy(xpath="//input[@id='ClinicianSignDate']")
	private WebElement clSignDate;
	
	@FindBy(xpath="//input[@id='EffectiveDate']")
	private WebElement effectDate;
	
	@FindBy(id="_sendDocument_rdEl")
	private WebElement delvMode;
	
	@FindBy(id="_sendDocument_rdHand")
	private WebElement hndDelv;
	
	@FindBy(id="_sendDocument_rdFax")
	private WebElement faxDelv;
	
	@FindBy(id="SendPhysicianButton")
	private WebElement SendPhysicianButton;
	
	@FindBy(xpath="//input[@value='Save as Draft']")
	private WebElement saveAsDraft;
	
	public void createVerbal(String patName, String physName, String clinicianName, String order, String signDate, String effctDate){
		tabClick.click();
		selPatClk.click();
		selPatEnt.sendKeys(patName);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+patName+"')]")).click();
		
		physcClk.click();
		physcEnt.sendKeys(physName);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+physName+"')]")).click();
		
		WebElement element_one=Driver.driver.findElement(By.id("Clinician"));
		Select sel=new Select(element_one);
		sel.selectByVisibleText(clinicianName);
		
		orders.sendKeys(order);
		//clSignDate.sendKeys(signDate);
		//effectDate.sendKeys(effctDate);
		//delvMode.click();
		SendPhysicianButton.click();	
	}
	
	/*
	public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
		TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
		api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
		}
	*/
}
