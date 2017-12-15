package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;

public class Upload485Electronic extends WebDriverCommonLib{
	@FindBy(xpath="//li/a[contains(text(),'Upload')]")
	private WebElement upldTab;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	//@FindBy(xpath="//ul/li/span/strong[contains(text(),'DoctorOne')]")
	//private WebElement physcClk;
	
	@FindBy(id="Clinician")
	private WebElement clinician;
	
	@FindBy(id="docFile")
	private WebElement browse;
	
	@FindBy(id="VerbalSOCDate")
	private WebElement socDate;
	
	@FindBy(xpath="//div[@class='createDocument']")
	private WebElement parClick;
	
	@FindBy(xpath="//input[@value='Upload']")
	private WebElement updBtn;
	
	
	@FindBy(id="SendPhysicianButton")
	private WebElement SendPhysicianButton;
	
	
	
	public void upload485(String physName, String clinicianName, String filePath, String soc){
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("http://","");
		String[] parts = url1.split("/");
		//System.out.println(parts[0]);
		//System.out.println(parts[1]);
		String new_url = "http://qa.doctoralliance.net/"+parts[1]+"/Documents/Create485";
		//System.out.println(new_url);
		AgencyTest.driver.get(new_url);
		upldTab.click();
		
		typPhysc.sendKeys(physName);
		AgencyTest.driver.findElement(By.xpath("//ul/li/span/strong[contains(text(),'"+physName+"')]")).click();
		
		new Select(clinician).selectByVisibleText(clinicianName);
		browse.sendKeys(filePath);
		
		JavascriptExecutor js = (JavascriptExecutor)AgencyTest.driver;
		
		js.executeScript("document.getElementById('VerbalSOCDate').value='" + soc +"'");
		  
		parClick.click();
		updBtn.click();
		SendPhysicianButton.click();
	}
}
