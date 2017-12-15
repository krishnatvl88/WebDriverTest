package agencyPageObjectRepoLib;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//com.da.agency.genericlib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import agencyGenericLib.WebDriverCommonLib;
import agencyTest.AgencyTest;
import agencyGenericLib.*;
public class Create485Electronic extends WebDriverCommonLib{

	//DocumentInputs doc = new DocumentInputs();
	//doc.patientVerbal
	//@FindBy(xpath="//a[contains(text(),'Verbal Order')]/parent::li/preceding-sibling::li/a")
	@FindBy(xpath="//ul[@class='nav nav-second-level collapse in']/li[1]/a")
	private WebElement tabClk;
	
	@FindBy(xpath="//span[@id='select2-PatientSelect2-container']")
	private WebElement selPatClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement selPatEnt;
	
	@FindBy(xpath="//span[@id='select2-PracticeList-container']")
	private WebElement physcClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement physcEnt;
	
	@FindBy(xpath="//span[@id='select2-Clinician-container']")
	private WebElement clinicianClk;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	private WebElement clinicianType;
	
	//@FindBy(xpath="//select/option[contains(text(),'Clinicin One, Test')]")
	//private WebElement clinDrpVal;
	
	@FindBy(id="HIClaimNumber")
	private WebElement hiclaim;
	
	@FindBy(id="StartofCareDate")
	private WebElement soc;
	
	@FindBy(id="CertPeriodFrom")
	private WebElement certFrom;
	
	@FindBy(id="CertPeriodTo")
	private WebElement certTo;
	
	@FindBy(id="MedicalRecordNumber")
	private WebElement mrn;
	
	@FindBy(id="FirstName")
	private WebElement patFirstName;
	
	@FindBy(id="City")
	private WebElement patCity;
	
	@FindBy(id="MiddleInitial")
	private WebElement patMiddleInitial;
	
	@FindBy(id="State")
	private WebElement patState;
	
	@FindBy(id="LastName")
	private WebElement patLastName;
	
	@FindBy(id="ZipCode")
	private WebElement patZipCode;
	
	@FindBy(id="Address")
	private WebElement patAddress;
	
	@FindBy(id="Telephone")
	private WebElement patTelephone;
	
	@FindBy(id="Suite")
	private WebElement patSuite;
	
	@FindBy(id="DOB")
	private WebElement patDOB;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement patMale;
	
	@FindBy(xpath="//input[@value='Female']")
	private WebElement patFemale;
	
	@FindBy(xpath="Medications")
	private WebElement patMedications;
	
	@FindBy(id="select2-principal-code-1-container")
	private WebElement icdCodePrincipalClick;
	
	@FindBy(xpath="//div[@id='principal-diagnosis-editor']/div/div[1]/span[2]/span/span[1]/input")
	private WebElement icdCodePrincipalEnter;
	
	@FindBy(id="select2-surgical-code-1-container")
	private WebElement surgicalDesClick;
	
	@FindBy(xpath="//div[@id='surgical-diagnosis-editor']/div/div[1]/span[2]/span/span[1]/input")
	private WebElement surgicalCodeEnter;
	
	@FindBy(id="select2-other-code-1-container")
	private WebElement otherDesClick;
	
	@FindBy(xpath="//div[@id='other-diagnosis-editor']/div/div[1]/span[2]/span/span[1]/input")
	private WebElement otherCodeEnter;
	
	@FindBy(id="principal-eo-1")
	private WebElement icdAEPrincipal;
	
	@FindBy(id="principal-date-1")
	private WebElement icdDatePrincipal;
	
	@FindBy(id="surgical-eo-1")
	private WebElement icdAESurgical;
	
	@FindBy(id="surgical-date-1")
	private WebElement icdDateSurgical;
	
	@FindBy(id="other-eo-1")
	private WebElement icdAEOther;
	
	@FindBy(id="other-date-1")
	private WebElement icdDateOther;
	
	@FindBy(id="DMEAndSupplies")
	private WebElement patDME;
	
	@FindBy(id="SafetyMeasures")
	private WebElement patSafetyMeasures;
	
	@FindBy(id="NutritionalRequirements")
	private WebElement patNutritionalRequirements;
	
	@FindBy(id="Allergies")
	private WebElement patAllergies;
	
	@FindBy(id="Limitations_Amputations")
	private WebElement chkLimAmputations;
	
	@FindBy(id="Limitations_BowelBladder")
	private WebElement chkLimBowelBladder;
	
	@FindBy(id="Limitations_Contracture")
	private WebElement chkLimContracture;
	
	@FindBy(id="Limitations_Hearing")
	private WebElement chkLimHearing;
	
	@FindBy(id="Limitations_Paralysis")
	private WebElement chkLimParalysis;
	
	@FindBy(id="Limitations_Endurance")
	private WebElement chkLimEndurance;
	
	@FindBy(id="Limitations_Ambulation")
	private WebElement chkLimAmbulation;
	
	@FindBy(id="Limitations_Speech")
	private WebElement chkLimSpeech;
	
	@FindBy(id="Limitations_LegallyBlind")
	private WebElement chkLimLegallyBlind;
	
	@FindBy(id="Limitations_Dyspnea")
	private WebElement chkLimDyspnea;
	
	@FindBy(id="Limitations_Others")
	private WebElement chkLimOthers;
	
	@FindBy(id="Limitations_Text")
	private WebElement chkLimText;
	
	@FindBy(id="Activities_CompleteBedrest")
	private WebElement chkActCompleteBedrest;
	
	@FindBy(id="Activities_BedrestBRP")
	private WebElement chkActBedrestBRP;
	
	@FindBy(id="Activities_UpAsTolerated")
	private WebElement chkActUpAsTolerated;
	
	@FindBy(id="Activities_TransferBedChair")
	private WebElement chkActTransferBedChair;
	
	@FindBy(id="Activities_ExercisesPrescribed")
	private WebElement chkActExercisesPrescribed;
	
	@FindBy(id="Activities_PartialWeightBearing")
	private WebElement chkActPartialWeightBearing;
	
	@FindBy(id="Activities_IndependentAtHome")
	private WebElement chkActIndependentAtHome;
	
	@FindBy(id="Activities_Crutches")
	private WebElement chkActCrutches;
	
	@FindBy(id="Activities_Cane")
	private WebElement chkActCane;
	
	@FindBy(id="Activities_WheelChair")
	private WebElement chkActWheelChair;
	
	@FindBy(id="Activities_Walker")
	private WebElement chkActWalker;
	
	@FindBy(id="Activities_NoRestrictions")
	private WebElement chkActNoRestrictions;
	
	@FindBy(id="Activities_Others")
	private WebElement chkActOthers;
	
	@FindBy(id="Activities_Text")
	private WebElement chkActTxt;
	
	//19 Mental Status
	@FindBy(id="MentalStatus_Oriented")
	private WebElement chkMenOriented;
	
	@FindBy(id="MentalStatus_Forgetful")
	private WebElement chkMenForgetful;
	
	@FindBy(id="MentalStatus_Disoriented")
	private WebElement chkMenDisoriented;
	
	@FindBy(id="MentalStatus_Agitated")
	private WebElement chkMenAgitated;
	
	@FindBy(id="MentalStatus_Comatose")
	private WebElement chkMenComatose;
	
	@FindBy(id="MentalStatus_Depressed")
	private WebElement chkMenDepressed;
	
	@FindBy(id="MentalStatus_Lethargic")
	private WebElement chkMenLethargic;
	
	@FindBy(id="MentalStatus_Others")
	private WebElement chkMenOthers;
	
	@FindBy(id="MentalStatus_Text")
	private WebElement chkMenText;
	
	@FindBy(id="Prognosis_Poor")
	private WebElement chkProgPoor;
	
	@FindBy(id="Prognosis_Guarded")
	private WebElement chkProgGuarded;
	
	@FindBy(id="Prognosis_Fair")
	private WebElement chkProgFair;
	
	@FindBy(id="Prognosis_Good")
	private WebElement chkProgGood;
	
	@FindBy(id="Prognosis_Excellent")
	private WebElement chkProgExcellent;
	
	@FindBy(id="Orders")
	private WebElement chkProgOrders;
	
	@FindBy(id="Goals")
	private WebElement chkGoals;
	
	@FindBy(id="ClinicianSignDate")
	private WebElement chkClinicianSignDate;
	
	@FindBy(id="SendPhysicianButton")
	private WebElement chkSendPhysicianButton;
	
	@FindBy(id="SaveDraftButton")
	private WebElement chkSaveDraftButton;
	
	
	public void crt485(String patName, String physName, String clinicianName, String socDate, String cFrom, String cTo, String principalCode, String principalDrp, String principalDate, String surgicalCode, String surgicalDrp, String surgicalDate, String othrDiagCode, String otherDrp, String otherDate, 
			String dmeSupplies, String safetyMeasure, String nutriRequ, String allergy, String orderMsg, String goals, String signDate) throws InterruptedException{
		//String url = AgencyTest.driver.getCurrentUrl();
		//System.out.println(url);
		//String url1 = url.replace("http://","");
		//String[] parts = url1.split("/");

		//String new_url = "http://qa.doctoralliance.net/"+parts[1]+"/Documents/Create485";
		
		//AgencyTest.driver.get(new_url);
		
		tabClk.click();
		selPatClk.click();
		selPatEnt.sendKeys(patName);
		//selPatientSearchKey.sendKeys(patName);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+patName+"')]")).click();
		
		//cont.click();
		physcClk.click();
		physcEnt.sendKeys(physName);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'"+physName+"')]")).click();
		
		//new Select(selClinician).selectByVisibleText(clinicianName);
		clinicianClk.click();
		clinicianType.sendKeys(clinicianName);
		Driver.driver.findElement(By.xpath("//ul[@id='select2-Clinician-results']/li[contains(text(),'"+clinicianName+"')]")).click();
		JavascriptExecutor js_two = (JavascriptExecutor)Driver.driver;
		
		js_two.executeScript("document.getElementById('StartofCareDate').value='" + socDate +"'");
		//soc.sendKeys(socDate);
		JavascriptExecutor js_three = (JavascriptExecutor)Driver.driver;
		
		js_three.executeScript("document.getElementById('CertPeriodFrom').value='" + cFrom +"'");
		JavascriptExecutor js_four = (JavascriptExecutor)Driver.driver;
		
		js_four.executeScript("document.getElementById('CertPeriodTo').value='" + cTo +"'");
		//certFrom.sendKeys(cFrom);
		//certTo.sendKeys(cTo);
		icdCodePrincipalClick.click();
		icdCodePrincipalEnter.sendKeys(principalCode);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'" + principalCode +"')]")).click();
		//Driver.driver.findElement(By.xpath("//ul[@id='select2-principal-code-1-results']/li")).click();
		//icdCodePrincipal.sendKeys(principalCode);
		//System.out.println(principalCode);
		
		icdAEPrincipal.sendKeys(principalDrp);
		icdDatePrincipal.sendKeys(principalDate);
		
		surgicalDesClick.click();
		surgicalCodeEnter.sendKeys(surgicalCode);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'" + surgicalCode +"')]")).click();
		//Driver.driver.findElement(By.xpath("//ul[@id='select2-surgical-code-1-results']/li")).click();
		
		icdAESurgical.sendKeys(surgicalDrp);
		icdDateSurgical.sendKeys(surgicalDate);
		
		otherDesClick.click();
		otherCodeEnter.sendKeys(othrDiagCode);
		Driver.driver.findElement(By.xpath("//div[contains(text(),'" + othrDiagCode +"')]")).click();
		//Driver.driver.findElement(By.xpath("//ul[@id='select2-surgical-code-1-results']/li")).click();
		
		icdAEOther.sendKeys(otherDrp);
		icdDateOther.sendKeys(otherDate);
		
		patDME.sendKeys(dmeSupplies);
		patSafetyMeasures.sendKeys(safetyMeasure);
		patNutritionalRequirements.sendKeys(nutriRequ);
		patAllergies.sendKeys(allergy);
		chkLimHearing.click();
		chkLimDyspnea.click();
		chkMenForgetful.click();
		chkMenDepressed.click();
		chkProgOrders.sendKeys(orderMsg);
		chkGoals.sendKeys(goals);
		JavascriptExecutor js_th = (JavascriptExecutor)AgencyTest.driver;
		
		js_th.executeScript("document.getElementById('ClinicianSignDate').value='" + signDate +"'");
		//chkClinicianSignDate.sendKeys(signDate);
		chkSendPhysicianButton.click();
	}
	
	
}
