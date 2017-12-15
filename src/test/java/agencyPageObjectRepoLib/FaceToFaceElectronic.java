package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;

public class FaceToFaceElectronic extends WebDriverCommonLib{

	@FindBy(xpath="//ul/li/a[contains(text(),'FaceToFace')]")
	private WebElement tabClick;
	
	@FindBy(id="PatientSearchKey")
	private WebElement patSelect;
	
	//@FindBy(xpath="//ul/li/strong[contains(text(),'Lydia')]")
	//private WebElement patSelectClick;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	@FindBy(xpath="//td/input[@value='Continue']")
	private WebElement cont;
	
	@FindBy(id="Clinician")
	private WebElement clinician;
	
	//1st Radio Button
	@FindBy(xpath="//td[contains(text(),'Home Health Plan of care certifying physician:')]/input[1]")
	private WebElement radioFirst;
	
	//1st Radio Button
	@FindBy(xpath="//td[contains(text(),'Home Health Plan of care certifying physician:')]/input[2]")
	private WebElement radioSecond;
	
	//@FindBy(id="SOCDate")
	//private WebElement socDate;
	
	@FindBy(id="FaceToFaceDueOn") 
	private WebElement FaceToFaceDueOn;
	
	@FindBy(id="SendPhysicianButton")
	private WebElement SendPhysicianButton;
	
	@FindBy(xpath="//input[@value='Save as Draft']")
	private WebElement saveAsDraft;
	
	public void createFaceToFace(String patName, String physName, String clinicianName, String order, String soc, String f2fDueDate){
		tabClick.click();
		patSelect.sendKeys(patName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/strong[contains(text(),'"+patName+"')]")).click();
		cont.click();
		
		typPhysc.clear();
		typPhysc.sendKeys(physName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/span/strong[contains(text(),'"+physName+"')]")).click();
		
		new Select(clinician).selectByVisibleText(clinicianName);
		//orders.sendKeys(order);
		radioFirst.click();
		JavascriptExecutor js_two = (JavascriptExecutor)AgencyTest.driver;
		
		js_two.executeScript("document.getElementById('SOCDate').value='" + soc +"'");
		JavascriptExecutor js_f2f = (JavascriptExecutor)AgencyTest.driver;
		
		js_f2f.executeScript("document.getElementById('FaceToFaceDueOn').value='" + f2fDueDate +"'");
		//FaceToFaceDueOn.sendKeys(f2fDueDate);
		SendPhysicianButton.click();
		
	}
}
