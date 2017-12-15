package agencyTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import agencyGenericLib.Constants;
import agencyGenericLib.DocumentInputs;
import agencyGenericLib.Driver;
import agencyGenericLib.ExcelLib;
//import com.da.agency.genericlib.ExcelLib;
import agencyPageObjectRepoLib.Common;
import agencyPageObjectRepoLib.Composemessage;
import agencyPageObjectRepoLib.Create485Electronic;
import agencyPageObjectRepoLib.CreateDischargeOrderElectronic;
import agencyPageObjectRepoLib.CreatePTNoteElectronic;
import agencyPageObjectRepoLib.CreateVerbalOrderByElectronic;
import agencyPageObjectRepoLib.FaceToFaceElectronic;
import agencyPageObjectRepoLib.Login;
import agencyPageObjectRepoLib.OthersEditableElectronic;
import agencyPageObjectRepoLib.OthersSignableElectronic;
import agencyPageObjectRepoLib.Patientcreate;
import agencyPageObjectRepoLib.Upload485Electronic;
import agencyPageObjectRepoLib.UploadDischargeElectronic;
import agencyPageObjectRepoLib.UploadEditableElectronic;
import agencyPageObjectRepoLib.UploadPTNoteElectronic;
import agencyPageObjectRepoLib.UploadSignableElectronic;
import agencyPageObjectRepoLib.UploadVerbalElectronic;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class AgencyTest {
	public static WebDriver driver;
	Login loginPage;
	Common commonPage;
	Patientcreate patCreatePage;
	Composemessage compMsg;
	Create485Electronic create485ElectronicPage;
	CreateVerbalOrderByElectronic createVerbalElectronicPage;
	CreateDischargeOrderElectronic createDischargeElectronicPage;
	FaceToFaceElectronic createFaceToFaceElectronicPage;
	OthersSignableElectronic createSignableElectronicPage;
	OthersEditableElectronic createEditableElectronicPage;
	CreatePTNoteElectronic createPTElectronicPage;
	Upload485Electronic upload485ElectronicPage;
	UploadVerbalElectronic uploadVerbalElectronicPage;
	UploadDischargeElectronic uploadDischargeElectronicPage;
	UploadSignableElectronic uploadSignableElectronicPage;
	UploadEditableElectronic uploadEditableElectronicPage;
	UploadPTNoteElectronic uploadPTNoteElectronicPgae;
	
	ExtentReports report;
	ExtentTest test;
	ExcelLib excelData;

	@BeforeClass
	public void configBeforClass(){
		//launch browser
		report = new ExtentReports("C://Users//Kris M//Desktop//logintest.html");
		test = report.startTest("Verify Welcome Text");
		
		driver = Driver.getBrowser();
		test.log(LogStatus.INFO, "Browser Started...");
		loginPage = PageFactory.initElements(driver, Login.class);
		commonPage = PageFactory.initElements(driver, Common.class);
		patCreatePage = PageFactory.initElements(driver, Patientcreate.class);
		compMsg = PageFactory.initElements(driver, Composemessage.class);
		
		create485ElectronicPage = PageFactory.initElements(driver, Create485Electronic.class);
		createVerbalElectronicPage = PageFactory.initElements(driver, CreateVerbalOrderByElectronic.class);
		createDischargeElectronicPage = PageFactory.initElements(driver, CreateDischargeOrderElectronic.class);
		createFaceToFaceElectronicPage = PageFactory.initElements(driver, FaceToFaceElectronic.class);
		createSignableElectronicPage = PageFactory.initElements(driver, OthersSignableElectronic.class);
		createEditableElectronicPage = PageFactory.initElements(driver, OthersEditableElectronic.class);
		createPTElectronicPage = PageFactory.initElements(driver, CreatePTNoteElectronic.class);
		upload485ElectronicPage = PageFactory.initElements(driver, Upload485Electronic.class);
		uploadVerbalElectronicPage = PageFactory.initElements(driver, UploadVerbalElectronic.class);
		uploadDischargeElectronicPage = PageFactory.initElements(driver, UploadDischargeElectronic.class);
		uploadSignableElectronicPage = PageFactory.initElements(driver, UploadSignableElectronic.class);
		uploadEditableElectronicPage = PageFactory.initElements(driver, UploadEditableElectronic.class);
		uploadPTNoteElectronicPgae = PageFactory.initElements(driver, UploadPTNoteElectronic.class);
		excelData = PageFactory.initElements(driver, ExcelLib.class);
		
	}
	
	/***********************************************LOGIN*************************************************/
	//@BeforeMethod
	
	@BeforeMethod
	public void configBeforeMtd(){
		loginPage.loginToAPP(Constants.userID, 
				Constants.password, Constants.url);
		test.log(LogStatus.INFO, "Login...");
	}
	
	
	@Test
 	public void PatientCreate() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		String patFirstName = excelData.getExcelData("Agency", 1, 2);
		
		String patCity = excelData.getExcelData("Agency", 1, 3);
		
		String patMiddleName = excelData.getExcelData("Agency", 1, 4);
		
		String patState = excelData.getExcelData("Agency", 1, 5);
		
		String patLastName = excelData.getExcelData("Agency", 1, 6);
		
		String patZipcode = excelData.getExcelData("Agency", 1, 7);
		
		String patAdd1 = excelData.getExcelData("Agency", 1, 8);
		
		String patNumber = excelData.getExcelData("Agency", 1, 9);
		
		String patSuite = excelData.getExcelData("Agency", 1, 10);
		
		String patDOB = excelData.getExcelData("Agency", 1, 11);
		
		String patSex = excelData.getExcelData("Agency", 1, 12);
		
		String patPhysician = excelData.getExcelData("Agency", 1, 13);
		
		String patClinician = excelData.getExcelData("Agency", 1, 14);
		
		String patPaySource = excelData.getExcelData("Agency", 1, 15);
		
		String patHilClaim = excelData.getExcelData("Agency", 1, 16);
		
		String patMrNo = excelData.getExcelData("Agency", 1, 17);
		
		String patCode = excelData.getExcelData("Agency", 1, 18);
		
		
		
		//DocumentInputs inp = new DocumentInputs();
		//patCreatePage.patCreate("Maven", "Brimingham", "M", "Alabama", "Lydia", "35209", "24 Sans Street", "9632732422", "Suite 2", "04/09/1971", "Male", "DoctorOne", "becca", "Tricare", "8790", "7690");
		
		int patStat = patCreatePage.patCreate(patFirstName, patCity, patMiddleName, patState, patLastName, patZipcode, patAdd1, patNumber, patSuite, patDOB, patSex, patPhysician, patClinician, patPaySource, patHilClaim, patMrNo, patCode);
		if(patStat==1){
			String verifyText = "The patient data has been saved. (PATIENT_SAVE_SUCCESSFUL)";
			String bodyText = Driver.driver.findElement(By.tagName("body")).getText();
			Assert.assertTrue(bodyText.contains(verifyText));
			test.log(LogStatus.INFO, "Patient Created...");
			System.out.println("Pat Created");
		}else{
			System.out.println("Pat not created");
			test.log(LogStatus.INFO, "Patient Not Created...");
		}
		/*
		try {
			//Assert.assertEquals(patCreatePage.verifyPatientCreate(), "The patient data has been saved. (PATIENT_SAVE_SUCCESSFUL)");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		*/
	}
	
	/*
	@Test
	public void ComposeMessage() throws Exception{
		
		String patName = excelData.getExcelData("Agency", 2, 2);
		//System.out.println(patName);
		String clinicianName = excelData.getExcelData("Agency", 2, 3);
		//System.out.println(clinicianName);
		String physcianName = excelData.getExcelData("Agency", 2, 4);
		//System.out.println(physcianName);
		String messageSubject = excelData.getExcelData("Agency", 2, 5);
		//System.out.println(messageSubject);
		String message = excelData.getExcelData("Agency", 2, 6);
		//System.out.println(message);
		
		compMsg.comMsg(patName, clinicianName, physcianName, messageSubject, message);
		test.log(LogStatus.INFO, "New message sent to physician successfully...");
		//Assert.assertEquals(compMsg.verifyMsgStat(), "The message was sent and stored.");
	}
	
	
	@Test
	public void Crte485() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		String patient485 = excelData.getExcelData("Agency", 3, 2);
		String doctor485 = excelData.getExcelData("Agency", 3, 3);
		String clinician485 = excelData.getExcelData("Agency", 3, 4);
		String cFrom = excelData.getExcelData("Agency", 3, 5);
		String cTo = excelData.getExcelData("Agency", 3, 6);		
		String hilclaimNo = excelData.getExcelData("Agency", 3, 7);
		String socDate = excelData.getExcelData("Agency", 3, 8);
		String principalCode = excelData.getExcelData("Agency", 3, 9);
		String principalDrp = excelData.getExcelData("Agency", 3, 10);
		String principalDate = excelData.getExcelData("Agency", 3, 11);
		String surgicalCode = excelData.getExcelData("Agency", 3, 12);
		String surgicalDrp = excelData.getExcelData("Agency", 3, 13);
		String surgicalDate = excelData.getExcelData("Agency", 3, 14);
		String othrDiagnosisCode = excelData.getExcelData("Agency", 3, 15);
		String otherDrp = excelData.getExcelData("Agency", 3, 16);
		String otherDate = excelData.getExcelData("Agency", 3, 17);
		String dmeSupplies = excelData.getExcelData("Agency", 3, 18);
		String safetyMeasures = excelData.getExcelData("Agency", 3, 19);
		String nutriRequirements = excelData.getExcelData("Agency", 3, 29);
		String allergies = excelData.getExcelData("Agency", 3, 21);
		String orderMessage485 = excelData.getExcelData("Agency", 3, 22);
		String goals = excelData.getExcelData("Agency", 3, 23);
		String signDate485 = excelData.getExcelData("Agency", 3, 24);
		create485Page.crt485(patient485, doctor485, clinician485, socDate, cFrom, cTo, principalCode, principalDrp, principalDate, surgicalCode, surgicalDrp, surgicalDate, othrDiagnosisCode, otherDrp, otherDate, dmeSupplies, safetyMeasures, nutriRequirements, allergies, orderMessage485, goals, signDate485);
		test.log(LogStatus.INFO, "New 485 order created & sent to physician successfully...");
	}
	
	
	@Test
	public void Createverbalorderelectronic() throws Exception{
		String patientVerbalE = excelData.getExcelData("Agency", 4, 2);
		String physicianVerbalE = excelData.getExcelData("Agency", 4, 3);
		String clinicianVerbalE = excelData.getExcelData("Agency", 4, 4);
		String messageVerbalE = excelData.getExcelData("Agency", 4, 5);
		String signDateVerbalE = excelData.getExcelData("Agency", 4, 6);
		String effDateVerbalE = excelData.getExcelData("Agency", 4, 7);
		
		createVerbalElectronicPage.createVerbal(patientVerbalE, physicianVerbalE, clinicianVerbalE, messageVerbalE, signDateVerbalE, effDateVerbalE);
		test.log(LogStatus.INFO, "New Verbal order created & sent to physician by electronic successfully...");
	}
	
	
	@Test
	public void createDischargeOrderElectronic() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String patientDischargeE = excelData.getExcelData("Agency", 5, 2);
		String physicianDischargeE = excelData.getExcelData("Agency", 5, 3);
		String clinicianDischargeE = excelData.getExcelData("Agency", 5, 4);
		String messageDischargeE = excelData.getExcelData("Agency", 5, 5);
		String signDateDischargeE = excelData.getExcelData("Agency", 5, 6);
		String effDateDischargeE = excelData.getExcelData("Agency", 5, 7);
		createDischargeElectronicPage.createDischarge(patientDischargeE, physicianDischargeE, clinicianDischargeE, messageDischargeE, signDateDischargeE, effDateDischargeE);
		test.log(LogStatus.INFO, "New Discharge Order Created and sent to physician by Electronic...");
	}
	
	
	@Test
	public void createFaceToFaceElectronic() throws Exception{
		String patientFaceToFaceE = excelData.getExcelData("Agency", 6, 2);
		String physicianFaceToFaceE = excelData.getExcelData("Agency", 6, 3);
		String clinicianFaceToFaceE = excelData.getExcelData("Agency", 6, 4);
		String messageFaceToFaceE = excelData.getExcelData("Agency", 6, 5);
		String socFaceToFaceE = excelData.getExcelData("Agency", 6, 5);
		String dueFaceToFaceE = excelData.getExcelData("Agency", 6, 5);
		createFaceToFaceElectronicPage.createFaceToFace(patientFaceToFaceE, physicianFaceToFaceE, clinicianFaceToFaceE, messageFaceToFaceE, socFaceToFaceE, dueFaceToFaceE);
		test.log(LogStatus.INFO, "New Face To Face Order Created and sent to physician by Electronic...");
	}
	
	@Test
	public void createOthersSign() throws Exception{
		//createSignablePage.createSignable("Dean", "Clinicin One, Test", "This is test F2F auto message", "06/28/2016", "06/28/2016");
		String patientSignableE = excelData.getExcelData("Agency", 6, 2);
		String physicianSignableE = excelData.getExcelData("Agency", 6, 3);
		String clinicianSignableE = excelData.getExcelData("Agency", 6, 4);
		String messageSignableE = excelData.getExcelData("Agency", 6, 5);
		String signDateSignableE = excelData.getExcelData("Agency", 6, 6);
		String effDateSignableE = excelData.getExcelData("Agency", 6, 7);
		createSignableElectronicPage.createSignable(patientSignableE, physicianSignableE, clinicianSignableE, messageSignableE, signDateSignableE, effDateSignableE);
		test.log(LogStatus.INFO, "New Signable Order Created and sent to physician by Electronic...");
	}
	
	
	@Test
	public void createOthersEdit() throws Exception{
		//createEditablePage.createEditable("Harris", "Clinicin One, Test", "This is test F2F auto message", "06/28/2016", "06/30/2016");
		String patientEditableE = excelData.getExcelData("Agency", 6, 2);
		String physicianEditableE = excelData.getExcelData("Agency", 6, 3);
		String clinicianEditableE = excelData.getExcelData("Agency", 6, 4);
		String messageEditableE = excelData.getExcelData("Agency", 6, 5);
		String signDateEditableE = excelData.getExcelData("Agency", 6, 6);
		String effDateEditableE = excelData.getExcelData("Agency", 6, 7);
		createEditableElectronicPage.createEditable(patientEditableE, physicianEditableE, clinicianEditableE, messageEditableE, signDateEditableE, effDateEditableE);
		test.log(LogStatus.INFO, "New Editable Order Created and sent to physician by Electronic...");
	}
	
	@Test
	public void createPTElectronic() throws Exception{
		String patientPTE = excelData.getExcelData("Agency", 6, 2);
		String physicianPTE = excelData.getExcelData("Agency", 6, 3);
		String clinicianPTE = excelData.getExcelData("Agency", 6, 4);
		String messagePTE = excelData.getExcelData("Agency", 6, 5);
		String signDatePTE = excelData.getExcelData("Agency", 6, 6);
		String effDatePTE = excelData.getExcelData("Agency", 6, 7);
		createPTElectronicPage.createTheraphy(patientPTE, physicianPTE, clinicianPTE, messagePTE, signDatePTE, effDatePTE);
		test.log(LogStatus.INFO, "New PT Order Created and sent to physician by Electronic...");
	}
	
	@Test
	public void upload485Electronic() throws Exception{
		
		String physicianu485E = excelData.getExcelData("Agency", 6, 2);
		String clinicianu485E = excelData.getExcelData("Agency", 6, 3);
		String fpath = excelData.getExcelData("Agency", 6, 4);
		String socu485E = excelData.getExcelData("Agency", 6, 5);
		upload485ElectronicPage.upload485(physicianu485E, clinicianu485E, fpath, socu485E);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	@Test
	public void uploadVerbalElectronic() throws Exception{
		String patientuVerbalE = excelData.getExcelData("Agency", 6, 2);
		String physicianuVerbalE = excelData.getExcelData("Agency", 6, 3);
		String clinicianuVerbalE = excelData.getExcelData("Agency", 6, 4);
		String fpath = excelData.getExcelData("Agency", 6, 5);
		String signDateuVerbalE = excelData.getExcelData("Agency", 6, 6);
		String effcDateuVerbalE = excelData.getExcelData("Agency", 6, 7);
		uploadVerbalElectronicPage.uploadVerbal(patientuVerbalE, physicianuVerbalE, clinicianuVerbalE, fpath, signDateuVerbalE, effcDateuVerbalE);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	@Test
	public void uploadDischargeElectronic() throws Exception{
		
		String patientuDischargeE = excelData.getExcelData("Agency", 6, 2);
		String physicianuDischargeE = excelData.getExcelData("Agency", 6, 3);
		String clinicianuDischargeE = excelData.getExcelData("Agency", 6, 4);
		String fpath = excelData.getExcelData("Agency", 6, 5);
		String signDateuDischargeE = excelData.getExcelData("Agency", 6, 6);
		String effcDateuDischargeE = excelData.getExcelData("Agency", 6, 7);
		uploadDischargeElectronicPage.uploadDischarge(patientuDischargeE, physicianuDischargeE, clinicianuDischargeE, fpath, signDateuDischargeE, effcDateuDischargeE);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	@Test
	public void uploadSignableElectronic() throws Exception{
		String patientuSignableE = excelData.getExcelData("Agency", 6, 2);
		String physicianuSignableE = excelData.getExcelData("Agency", 6, 3);
		String clinicianuSignableE = excelData.getExcelData("Agency", 6, 4);
		String fpath = excelData.getExcelData("Agency", 6, 5);
		String signDateuSignableE = excelData.getExcelData("Agency", 6, 6);
		String effcDateuSignableE = excelData.getExcelData("Agency", 6, 7);
		uploadSignableElectronicPage.uploadSignable(patientuSignableE, physicianuSignableE, clinicianuSignableE, fpath, signDateuSignableE, effcDateuSignableE);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	@Test
	public void uploadEditableElectronic() throws Exception{
		String patientuEditableE = excelData.getExcelData("Agency", 6, 2);
		String physicianuEditableE = excelData.getExcelData("Agency", 6, 3);
		String clinicianuEditableE = excelData.getExcelData("Agency", 6, 4);
		String fpath = excelData.getExcelData("Agency", 6, 5);
		String signDateuEditableE = excelData.getExcelData("Agency", 6, 6);
		String effcDateuEditableE = excelData.getExcelData("Agency", 6, 7);
		uploadEditableElectronicPage.uploadEditable(patientuEditableE, physicianuEditableE, clinicianuEditableE, fpath, signDateuEditableE, effcDateuEditableE);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	@Test
	public void uploadPTNoteElectronic() throws Exception{
		String patientuPTE = excelData.getExcelData("Agency", 6, 2);
		String physicianuPTE = excelData.getExcelData("Agency", 6, 3);
		String clinicianuPTE = excelData.getExcelData("Agency", 6, 4);
		String fpath = excelData.getExcelData("Agency", 6, 5);
		String signDateuPTE = excelData.getExcelData("Agency", 6, 6);
		String effcDateuPTE = excelData.getExcelData("Agency", 6, 7);
		uploadPTNoteElectronicPgae.uploadPhysicaltheraphy(patientuPTE, physicianuPTE, clinicianuPTE, fpath, signDateuPTE, effcDateuPTE);
		test.log(LogStatus.INFO, "New 485 Order uploaded and sent to physician by Electronic...");
	}
	
	

	@Test
	public void echo(){
		System.out.println("Test Message");
	}
	*/
	@AfterMethod
	public void configAfterMtd(){
		commonPage.LogOut();
		test.log(LogStatus.INFO, "Logging out...");
	}
	
	@AfterClass
	public void configAfterClass(){
		driver.quit();
		report.endTest(test);
		report.flush();
	}
	
}
