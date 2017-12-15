package agencyGenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait
		                                 (20, TimeUnit.SECONDS);
	}
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.
			 presenceOfAllElementsLocatedBy(By.xpath(wbXpath)));		
	}
	
	public void waitForNAmePresent(String wbName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.
				presenceOfAllElementsLocatedBy(By.name(wbName)));		
	}
	
	public boolean verifyText(WebElement wb , String expectText){
		boolean flag = false;
		String actVal = wb.getText();
		if(expectText.equals(actVal)){
			flag = true;
			System.out.println(expectText + ", data is verfied==PASS");
		}else{
			System.out.println(expectText + ", data is not verfied==FAIL");
		}
		return flag;
	}
	
	public void aceptAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		alt.accept();
	}
	
	public void cancelAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		alt.dismiss();
	}
}
