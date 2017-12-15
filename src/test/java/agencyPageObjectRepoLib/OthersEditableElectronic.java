package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;

public class OthersEditableElectronic extends WebDriverCommonLib{
	
	@FindBy(xpath="//ul/li/a[contains(text(),'Others')]")
	private WebElement tabClick;

	@FindBy(xpath="//ul/li/a[contains(text(),'Other - Editable')]")
	private WebElement childTabClick;
	
	@FindBy(id="PatientSearchKey")
	private WebElement patSelect;
	
	//@FindBy(xpath="//ul/li/strong[contains(text(),'Harris')]")
	//private WebElement patSelectClick;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	//@FindBy(xpath="//ul/li/span/strong[contains(text(),'DoctorOne')]")
	//private WebElement physcClk;
	
	@FindBy(id="Clinician")
	private WebElement clinician;
	
	@FindBy(id="Orders")
	private WebElement orders;
	
	@FindBy(id="ClinicianSignDate")
	private WebElement clSignDate;
	
	@FindBy(id="EffectiveDate")
	private WebElement effectDate;
	
	@FindBy(id="SendPhysicianButton")
	private WebElement SendPhysicianButton;
	
	@FindBy(xpath="//input[@value='Save as Draft']")
	private WebElement saveAsDraft;
	
	public void createEditable(String patName, String physName, String clinicianName, String order, String signDate, String effctDate){
		tabClick.click();
		childTabClick.click();
		patSelect.sendKeys(patName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/strong[contains(text(),'"+patName+"')]")).click();
		//patSelectClick.click();
		typPhysc.sendKeys(physName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/span/strong[contains(text(),'"+physName+"')]")).click();
		new Select(clinician).selectByVisibleText(clinicianName);
		orders.sendKeys(order);
		clSignDate.sendKeys(signDate);
		effectDate.sendKeys(effctDate);
		SendPhysicianButton.click();
		
	}
}
