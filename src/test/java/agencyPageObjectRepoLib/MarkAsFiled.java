package agencyPageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;


public class MarkAsFiled extends WebDriverCommonLib {
	
	@FindBy(id="btnMarkAsFiled")
	private WebElement fileButton;
	
	public void fileByDocType(String docType) throws InterruptedException{
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("https://","");
		System.out.println(url1);
		String[] parts = url1.split("/");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
		System.out.println(parts[3]);
		String new_url = "https://qa.doctoralliance.net/"+parts[3]+"/Documents/Signed/?filter=signedunfiled";
		AgencyTest.driver.get(new_url);
		
		int docLength = AgencyTest.driver.findElements(By.xpath("//tr/td/span[contains(text(),'"+docType+"')]/parent::td/preceding-sibling::td[2]/input")).size();
		 System.out.println(docLength);
		 WebDriverWait wait = new WebDriverWait(AgencyTest.driver,300);
		 for (int i = 0; i < docLength; i++) {
		    WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(AgencyTest.driver.findElements(By.xpath("//tr/td/span[contains(text(),'"+docType+"')]/parent::td/preceding-sibling::td[2]/input")).get(i)));
		      if (!ele.isSelected()){
		           ele.click();
		      }
		 }
		 fileButton.click();
	}
	
	public void fileByPatient(String patName) throws InterruptedException{
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("https://","");
		String[] parts = url1.split("/");
		System.out.println(parts[1]);
		String new_url = "https://qa.doctoralliance.net/"+parts[1]+"/Documents/Signed/?filter=signedunfiled";
		AgencyTest.driver.get(new_url);
		
		int patLength = AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+patName+"')]/preceding-sibling::td[3]/input")).size();
		 System.out.println(patLength);
		 WebDriverWait wait = new WebDriverWait(AgencyTest.driver,300);
		 for (int i = 0; i < patLength; i++) {
		    WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+patName+"')]/preceding-sibling::td[3]/input")).get(i)));
		      if (!ele.isSelected()){
		           ele.click();
		      }
		 }
		 
		 fileButton.click();
	}
	
	public void fileByPhysician(String physName) throws InterruptedException{
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("https://","");
		String[] parts = url1.split("/");
		System.out.println(parts[1]);
		String new_url = "https://qa.doctoralliance.net/"+parts[1]+"/Documents/Signed/?filter=signedunfiled";
		AgencyTest.driver.get(new_url);
		
		int phyLength = AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+physName+"')]/preceding-sibling::td[6]/input")).size();
		 System.out.println(phyLength);
		 WebDriverWait wait = new WebDriverWait(AgencyTest.driver,300);
		 for (int i = 0; i < phyLength; i++) {
		    WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+physName+"')]/preceding-sibling::td[6]/input")).get(i)));
		      if (!ele.isSelected()){
		           ele.click();
		      }
		 }
		 fileButton.click();
	}
	
	public void fileByClinician(String clinicianName) throws InterruptedException{
		String url = AgencyTest.driver.getCurrentUrl();
		System.out.println(url);
		String url1 = url.replace("https://","");
		String[] parts = url1.split("/");
		System.out.println(parts[1]);
		String new_url = "https://qa.doctoralliance.net/"+parts[1]+"/Documents/Signed/?filter=signedunfiled";
		AgencyTest.driver.get(new_url);
		
		int clinicianLength = AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+clinicianName+"')]/preceding-sibling::td[4]/input")).size();
		 System.out.println(clinicianLength);
		 WebDriverWait wait = new WebDriverWait(AgencyTest.driver,300);
		 for (int i = 0; i < clinicianLength; i++) {
		    WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(AgencyTest.driver.findElements(By.xpath("//td[contains(text(),'"+clinicianName+"')]/preceding-sibling::td[4]/input")).get(i)));
		      if (!ele.isSelected()){
		           ele.click();
		      }
		 }
		 fileButton.click();
	}

}
