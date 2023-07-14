package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import bge_pages.ApplyNowPage;
import bge_pages.ContactUsPage;
import bge_pages.HomePage;
import bge_pages.ManageApplicationsPage;
import demoportal_pages.CustomerInfoPage;
import demoportal_pages.DocumentUploadPage;
import demoportal_pages.LoginPage;
import utils.ExtentManager;

public class BGEPortalAppSubmission extends ExtentManager{

	HomePage hp;
	ApplyNowPage ap;
	LoginPage lp;
	CustomerInfoPage cuspg;
	DocumentUploadPage docpg;
	
	@BeforeTest
	public void setUp() {
		sheetName="Data";
		myTestName="verifyBGEAppFields";
		startReport();
		initializeDriver();
		hp=new HomePage(driver);
		ap=new ApplyNowPage(driver);
		lp=new LoginPage(driver);
		cuspg=new CustomerInfoPage(driver);
		docpg=new DocumentUploadPage(driver);
		reportInfo("BGE Application launched in browser");
	}
	
	@Test
	public void verifyBGEAppSubmission() throws InterruptedException, AWTException, IOException {
		hp.clickApplyNow();
		reportInfo("Apply Now tab is clicked");
		ap.clickBeginApplication();
		reportInfo("Begin Application button is clicked");
		
		lp.enterEmailAddress("rgudi@appliedenergygroup.com");
		reportInfo("Email Address is entered");
		lp.clickContinue();
		reportInfo("Continue button is clicked");
		lp.enterPassword("chase1986R@");
		reportInfo("Password is entered");
		lp.clickSubmit();
		reportInfo("Submit button is clicked");
		
		cuspg.selectExistContact("Test Rahul Rahul test AEG");
		reportInfo("Existing Contact is selected");
		cuspg.enterPremiseID("12221");
		reportInfo("Premise Id is entered");
		cuspg.enterMeterID("454554");
		reportInfo("Meter ID is entered");
		cuspg.enterAccountNum("12223551");
		reportInfo("Account Number is entered");
		cuspg.enterPhone("122222222");
		reportInfo("Phone is entered");
		
		cuspg.clickSameAsHomeInfo();
		reportInfo("Same as Home Info option selected");
		/*
		cuspg.selectBGEContractor("Test Rahul Rahul test AEG");
		reportInfo("Contractor is selected");
		cuspg.enterBGEContractorPremiseID("12221");
		reportInfo("Contractor premise ID is entered");
		cuspg.enterBGEContractorMeterID("454554");
		reportInfo("Contractor Meter ID is entered");
		cuspg.enterBGEContractorActNum("12223551");
		reportInfo("Contractor Account number is entered");
		cuspg.enterBGEContractorPhone("122222222");
		reportInfo("Phone is entered");
		*/
		cuspg.clickContinue();
		reportInfo("Continue button is clicked");
		cuspg.selectApplicationForm("BGE EVsmart Fleet Rate Discount");	
		reportInfo("Application form is selected");
		cuspg.clickContinue();
		reportInfo("Continue button is clicked");
		//cuspg.enterFleetSiteHost("TestHost");
		reportInfo("Fleet Site Host Name entered.");
		//cuspg.enterElectricVehiclesCount("12");
		reportInfo("Electric Vehicles count entered");
		cuspg.clickContinue();
		reportInfo("Continue button is clicked");
		//cuspg.selectUploadFormsCount("1");
		reportInfo("Upload Forms count is selected");
		cuspg.clickContinue();
		reportInfo("Continue button is clicked");
		
		docpg.ChargerPurchaseDocUpload("IESF.xlsx");
		reportInfo("Charger Purchase invoice document uploaded");
		docpg.ChargerInstalDocUpload("IESF.xlsx");
		reportInfo("Charger Installation invoice document uploaded");
	    docpg.ElectricVehicleDocUpload("IESF.xlsx");
		reportInfo("Electric vehicle invoice document uploaded");
		docpg.AddFleetFormDocUpload("IESF.xlsx");
		reportInfo("Additional Fleet form document uploaded");
		docpg.clickCompleteApp();
		reportInfo("Complete Application button is clicked");
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
