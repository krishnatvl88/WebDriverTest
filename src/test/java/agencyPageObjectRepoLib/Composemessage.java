package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import agencyGenericLib.Driver;
import agencyGenericLib.WebDriverCommonLib;

public class Composemessage extends WebDriverCommonLib {
	
	@FindBy(xpath="//li/a[@data-counter-field='UnreadMessages']")
	private WebElement convTab;
	
	@FindBy(xpath="//ul[@class='nav nav-second-level collapse in']/li[3]/a")
	private WebElement compTab;
	
	@FindBy(xpath="//span[@id='select2-PatientSearchKey-container']")
	private WebElement selPatClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement selPatEnt;
	
	//@FindBy(xpath="//div/h3[contains(text(),'Lina')]")
	//private WebElement selPat;
	
	@FindBy(id="ForUser")
	private WebElement selclinican;
	
	//@FindBy(xpath="")
	//private WebElement clinicianclk;
	
	@FindBy(xpath="//span[@id='select2-RecipientSelect2-container']")
	private WebElement selRecpClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement selRecpEnt;
	
	/*@FindBy(xpath="//div/div[contains(text(),'DoctorOne')]")
	private WebElement selRecp;
	*/
	
	@FindBy(id="Subject")
	private WebElement subject;
	
	@FindBy(id="Body")
	private WebElement message;
	
	@FindBy(name="Send")
	private WebElement send;
	
	@FindBy(xpath="//ul[@id='messageList']/li")
	private WebElement verifyText;
	
	public void comMsg(String patName, String clinician, String recpName, String subj, String msg){
		convTab.click();
		compTab.click();
		selPatClk.click();
		selPatEnt.sendKeys(patName);
		Driver.driver.findElement(By.xpath("//div/h3[contains(text(),'"+patName+"')]")).click();
		//new Select(selclinican).selectByVisibleText('"'+clinician+'"');
		
		WebElement element=Driver.driver.findElement(By.id("ForUser"));
		Select se=new Select(element);
		se.selectByVisibleText(clinician);
		
		selRecpClk.click();
		selRecpEnt.sendKeys(recpName);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+recpName+"')]")).click();
		subject.sendKeys(subj);
		message.sendKeys(msg);
		send.click();
	}
	
	public String verifyMsgStat() throws Exception {
		String text = verifyText.getText();
		return text;
	}
}


