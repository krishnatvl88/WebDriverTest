package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.Driver;
import agencyGenericLib.WebDriverCommonLib;

public class OthersSignableElectronic extends WebDriverCommonLib{
	
	@FindBy(xpath="//ul[@class='nav nav-second-level collapse in']/li[5]/a")
	private WebElement tabClick;
	
	@FindBy(xpath="//div/a[contains(text(),'Other - Signable')]")
	private WebElement childTabClick;
	
	@FindBy(xpath="//span[@id='select2-PatientSelect2-container']")
	private WebElement selPatClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement selPatEnt;
	
	//@FindBy(xpath="//ul/li/strong[contains(text(),'Dean')]")
	//private WebElement patSelectClick;
	
	@FindBy(id="PracticeList")
	private WebElement typPhysc;
	
	@FindBy(xpath="//span[@id='select2-PracticeList-container']")
	private WebElement physcClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement physcEnt;
	
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
	
	public void createSignable(String patName, String physName, String clinicianName, String order, String signDate, String effctDate){
		tabClick.click();
		childTabClick.click();
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
		clSignDate.sendKeys(signDate);
		effectDate.sendKeys(effctDate);
		SendPhysicianButton.click();
	}
}
