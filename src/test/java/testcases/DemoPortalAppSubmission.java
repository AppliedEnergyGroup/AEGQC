package testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import demoportal_pages.ConsultationPage;
import demoportal_pages.CustomerInfoPage;
import demoportal_pages.DocumentUploadPage;
import demoportal_pages.EquipmentPage;
import demoportal_pages.LoginPage;
import demoportal_pages.ProjectInfoPage;
import utils.ExtentManager;
import utils.Keywords;

public class DemoPortalAppSubmission extends ExtentManager{
	LoginPage lp;
	CustomerInfoPage cusInfo;
	ProjectInfoPage projInfo;
	ConsultationPage consult;
	DocumentUploadPage docu;
	EquipmentPage equip;
	
	private static final Logger log=LogManager.getLogger(DemoPortalAppSubmission.class);
	
	@BeforeTest
	public void setUp() {
		sheetName="Data";
		myTestName="verifyAppSubmission";
		startReport();
		initializeDriver();
		//PropertyConfigurator.configure(System.getProperty("user.dir")+"\\log4j.properties");
		
		reportInfo("Application launched in browser");
		log.info("Logs :: Application launched in chrome browser");
		lp=new LoginPage(driver);
		cusInfo=new CustomerInfoPage(driver);
		projInfo=new ProjectInfoPage(driver);
		consult=new ConsultationPage(driver);
		docu=new DocumentUploadPage(driver);
		equip=new EquipmentPage(driver);
	}
	
	@Test
	public void verifyAppSubmission() throws InterruptedException, AWTException {
		
		int rowCount=excl.getRowCount(sheetName);
		for(int i=1;i<=rowCount;i++) {
			if(myTestName.equals(excl.getCellData(sheetName, i, "TestCaseID"))) {
				String email=excl.getCellData(sheetName, i, "Email Address");
				String password=excl.getCellData(sheetName, i, "Password");
				String existingContact=excl.getCellData(sheetName, i, "Existing Contact");
				String premiseID=excl.getCellData(sheetName, i, "PremiseID");
				String meterID=excl.getCellData(sheetName, i, "MeterID");
				String accountNum=excl.getCellData(sheetName, i, "AccountNum");
				String phone=excl.getCellData(sheetName, i, "Phone");
				//String cell=excl.getCellData(sheetName, i, "Cell");
				String fax=excl.getCellData(sheetName, i, "Fax");
				String taxID=excl.getCellData(sheetName, i, "TaxID");
				//String selectContractor=excl.getCellData(sheetName, i, "SelectContractor");
				//String cnPremiseID=excl.getCellData(sheetName, i, "ContractorPremiseID");
				//String cnMeterID=excl.getCellData(sheetName, i, "ContractorMeterID");
				//String cnAccountNum=excl.getCellData(sheetName, i, "ContractorActNum");
				//String cnPhone=excl.getCellData(sheetName, i, "ContractorPhone");
				//String cnCell=excl.getCellData(sheetName, i, "ContractorCell");
				//String cnFax=excl.getCellData(sheetName, i, "ContractorFax");
				//String cnTaxID=excl.getCellData(sheetName, i, "ContractorTaxID");
				String electricTech=excl.getCellData(sheetName, i, "ElectricTech");
				String exFleet=excl.getCellData(sheetName, i, "ExpansionFleet");
				String techDiesel=excl.getCellData(sheetName, i, "TechDiesel");
				String paymentMethod=excl.getCellData(sheetName, i, "PaymentMethod");
				String electricTechAgain=excl.getCellData(sheetName, i, "ElectricTechAgain");
				String techDieselAgain=excl.getCellData(sheetName, i, "TechDieselAgain");
				String numberofports=excl.getCellData(sheetName, i,"NumberofPorts");
				String equipmenttype=excl.getCellData(sheetName, i, "EquipmentType");
				String brand=excl.getCellData(sheetName, i, "Brand");
				String modelnumber=excl.getCellData(sheetName, i, "ModelNumber");
				String equipmentcost=excl.getCellData(sheetName, i, "EquipmentCost");
				String installationcost=excl.getCellData(sheetName, i, "InstallationCost");
				String totalcostcalculated=excl.getCellData(sheetName, i, "TotalCostCalculated");
		//Clicking on apply now button on the portal
		lp.clickApplyNow();
		reportInfo("Clicked on Apply Now button");
		log.info("Logs :: Apply Now button clicked");
		//Clicking on begin application button
		lp.clickBeginApplication();
		reportInfo("Begin application button is clicked");
		log.info("Logs :: Begin Application button is clicked");
		lp.enterEmailAddress(email);
		reportInfo("Email is entered");
		log.info("Logs :: Email is entered");
		lp.clickContinue();
		reportInfo("Continue button clicked");
		log.info("Logs :: Continue button clicked");
		lp.enterPassword(password);
		reportInfo("Password is entered");
		log.info("Logs :: Password is entered");
		lp.clickSubmit();
		reportInfo("Submit button is clicked");
		log.info("Logs :: Submit button is clicked");
		Thread.sleep(5000);
		//entering the details on contact entry page
		cusInfo.verifycontactentryheader();
		reportInfo("ContactEntryHeader is verified");
		Thread.sleep(2000);
		log.info("Logs ::ContactEntryHeader page is verifed");
		cusInfo.selectExistContact(existingContact);
		reportInfo("Existing contact is selected");
		log.info("Logs :: Existing contact is selected");
		cusInfo.enterPremiseID(premiseID);
		reportInfo("Premise ID is entered");
		log.info("Logs :: Premise ID is entered");
		cusInfo.enterMeterID(meterID);
		reportInfo("Meter ID is entered");
		log.info("Logs :: Meter ID is entered");
		cusInfo.enterAccountNum(accountNum);
		reportInfo("Account Number is entered");
		log.info("Logs :: Account Number is entered");
		cusInfo.enterPhone(phone);
		reportInfo("Phone is entered");
		log.info("Logs :: Phone is entered");
		//cusInfo.enterCell(cell);
		//reportInfo("Cell is entered");
		//log.info("Logs :: Cell is entered");
		//cusInfo.enterFax(fax);
		//reportInfo("Fax is entered");
		log.info("Logs :: Fax is entered");
		cusInfo.enterTaxID(taxID);
		reportInfo("Tax ID is entered");
		log.info("Logs :: Tax ID is entered");
		
		//scroll down to same as home info check box
		scrollToElement(cusInfo.SameAsHomeInfo_chk);
		cusInfo.clickSameAsHomeInfo();
		reportInfo("Same as Home Info selected");
		log.info("Logs :: Same as Home Info selected");
		
		scrollToElement(cusInfo.SearchforaContractor_btn);
		cusInfo.clickSearchforaContractorbtn();
		Thread.sleep(2000);
		reportInfo("SearchforaContractor button is clicked");
		log.info("Logs :: SearchforaContractorbutton is clicked");
		cusInfo.selectContractorDropdownlnk();
		reportInfo("ContractorDropdownlnk is clicked");
		log.info("Logs ::ContractorDropdownlnk is clicked");
		cusInfo.clickContinue();
		reportInfo("Continue button is clicked");
		//project info selecting the dropdown options
		projInfo.selectElectricTech(electricTech);
		reportInfo("Electric technology selected as "+electricTech);
		projInfo.selectExpansionFleet(exFleet);
		reportInfo("Expansion Fleet selected as "+exFleet);
		projInfo.selectTechDiesel(techDiesel);
		reportInfo("Technology Diesel selected as "+techDiesel);
		projInfo.selectPaymentMethod(paymentMethod);
		reportInfo("Payment Method selected as "+paymentMethod);
		//clicking on continue button on project information page
		projInfo.clickContinue();
		reportInfo("Continue button is clicked from project information page");
		//Consultation header text is displayed
		Thread.sleep(5000);
		equip.verifyConsulation_Header();
		reportInfo("Consulation header text is displayed");
		Thread.sleep(3000);
		//clicking on back button from the consultation page
		consult.clickBack();
		reportInfo("Back button is clicked");
		projInfo.selectElectricTech(electricTechAgain);
		reportInfo("Electric technology selected as "+electricTechAgain);
		projInfo.selectTechDiesel(techDieselAgain);
		reportInfo("Technology Diesel selected as "+techDieselAgain);
		String electricTechOption=projInfo.getElectricTech();
		projInfo.clickContinue();
		reportInfo("Continue button is clicked");
		//verifying equipment entry page is displayed
		if(electricTechOption.equalsIgnoreCase("Yes")) {
			equip.verifyEquipmentHeader();
			reportInfo("Equipment page header is verified");
			//clicking on add equipment button
			equip.clickAddEquipmentBtn();
			reportInfo("Add Equipment button is clicked");
			//clicking on domestic hot water button
			equip.clickDomesticHotWater();
			reportInfo("Domestic Hot Water button is clicked");
			//clicking on DHW Flow Reduction button is clicked 
			equip.clickDHWFlowReduction();
			reportInfo("DHW Flow Reduction button is clicked");
			//click on electric transport button
			equip.clickElectricTransport();
			reportInfo("Electric Transport button is clicked");
			//adding number of ports
			equip.enterNoOfPorts(numberofports);
			reportInfo("Number of Ports is entered");
			//selecting equipmenttype
			equip.selectEquipmentType(equipmenttype);
			reportInfo("Equipment Type is selected");
			//brand name is entered
			equip.enterBrand(brand);
			reportInfo("Brand is entered");
			//entering model number
			equip.enterModelNumber(modelnumber);
			reportInfo("Model Number is entered");
			//entering equipment cost
			equip.enterEquipmentCost(equipmentcost);
			reportInfo("Equipment Cost is entered");
			//entering installation cost
			equip.enterInstallationCost(installationcost);
			reportInfo("Installation cost is entered");
			//entering total cost calculated
			equip.enterTotalCostCalculated(totalcostcalculated);
			reportInfo("Total Cost Calculated is entered");
			//clicking on add equipment button
			equip.clickAddEquipmentOverlay();
			reportInfo("Add Equipment Overlay button is clicked");
			Thread.sleep(5000);
		   
		}
		//clicking on continue button on equipment entry page
		projInfo.clickContinue();
		reportInfo("Continue button is clicked from equipment entry page");
		//clicking on continue button on total project incentive page
		Thread.sleep(5000);
		equip.verifyTotalProjectIncentiveheader();
		reportInfo("Total Project Incentive header is verified");
		Thread.sleep(2000);
		projInfo.clickContinue();
		reportInfo("Continue button is clicked from total project incentive page");
		//Adding documents on document upload page and clicking continue
		docu.clickDocumentUpload();
		reportInfo("Document upload button is clicked");
		docu.clickChooseFile();
		reportInfo("Choose File button is clicked");
		Thread.sleep(2000);
		Keywords.selectFile("IESF.xlsx");
		reportInfo("File selected for upload");
		Thread.sleep(2000);
		docu.clickUploadFile();
		reportInfo("Upload File button is clicked");
		Thread.sleep(5000);
		//clicking on complete application button
		Thread.sleep(5000);
		consult.clickCompleteApp();
		reportInfo("Complete Application button is clicked");
		Thread.sleep(6000);
		equip.verifyApplicationSubmittedheader();
		reportInfo("Application submitted message is displayed");
		Thread.sleep(6000);
			}
		}
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Failed with error -> "+result.getThrowable());
			attachScreenshot();
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Passed");
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		stopReport();
	}

}
