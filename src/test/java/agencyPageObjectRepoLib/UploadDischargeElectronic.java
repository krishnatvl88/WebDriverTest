package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;

public class UploadDischargeElectronic extends WebDriverCommonLib{
	
//	@FindBy(xpath="//li/a[contains(text(),'Upload')]")
	@FindBy(linkText = "Upload")
	private WebElement upldTab;
	
	@FindBy(id="PatientSearchKey")
	private WebElement patSelect;
	
	//@FindBy(xpath="//ul/li/strong[contains(text(),'Mark')]")
	//private WebElement patSelectClick;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	@FindBy(id="Clinician")
	private WebElement clinician;
	
	@FindBy(id="docFile")
	private WebElement browse;
	
	@FindBy(xpath="//input[@value='Upload']")
	private WebElement updBtn;
	
	@FindBy(id="bSendPhysicianButton")
	private WebElement SendPhysicianButton;
	
	public void uploadDischarge(String patName, String physName, String clinicianName, String filePath, String signDate, String effDate){
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("http://","");
		String[] parts = url1.split("/");
		String new_url = "http://qa.doctoralliance.net/"+parts[1]+"/Documents/CreateSignable?docType=DISCHARGE";
		AgencyTest.driver.get(new_url);
		
		upldTab.click();
		patSelect.sendKeys(patName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/strong[contains(text(),'"+patName+"')]")).click();
		
		typPhysc.clear();
		typPhysc.sendKeys(physName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/span/strong[contains(text(),'"+physName+"')]")).click();
		
		new Select(clinician).selectByVisibleText(clinicianName);
		//browse.sendKeys("C:\\Users\\Krishna-Phoneix Comp\\Downloads\\Test.pdf");
		browse.sendKeys(filePath);
		JavascriptExecutor js_one = (JavascriptExecutor)AgencyTest.driver;
		
		js_one.executeScript("document.getElementById('ClinicianSignDate_s').value='" + signDate +"'");
		
		JavascriptExecutor js_two = (JavascriptExecutor)AgencyTest.driver;
		
		js_two.executeScript("document.getElementById('EffectiveDate_s').value='" + effDate +"'");
		
		updBtn.click();
		SendPhysicianButton.click();
	}

}
