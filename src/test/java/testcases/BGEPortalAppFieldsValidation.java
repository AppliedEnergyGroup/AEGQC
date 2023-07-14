package testcases;

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
import utils.ExtentManager;

public class BGEPortalAppFieldsValidation extends ExtentManager{
	
	HomePage hp;
	ManageApplicationsPage mp;
	ApplyNowPage ap;
	ContactUsPage cp;
	
	@BeforeTest
	public void setUp() {
		sheetName="Data";
		myTestName="verifyBGEAppFields";
		startReport();
		initializeDriver();
		hp=new HomePage(driver);
		mp=new ManageApplicationsPage(driver);
		ap=new ApplyNowPage(driver);
		cp=new ContactUsPage(driver);
		reportInfo("BGE Application launched in browser");
	}
	
	@Test
	public void verifyBGEAppFields() throws InterruptedException {
	//home page	
		hp.validateHomeFields();
		reportInfo("BGE App - Homepage fields verified");
		hp.verifyFleetRateRegisterMsg("BGE EV Fleet Rate Registration\n\nBGE customers with 5 or more Maryland registered electric vehicles can qualify for a discounted fleet rate of $0.255/kWh, 25% off the current DC Fast Charger rate of $0.34/kWh.");
		reportInfo("Fleet Rate Register Message verified");
		hp.verifyCopyrightMsg("© 2023 Baltimore Gas and Electric. All Rights Reserved.");
		reportInfo("Copyright message verified");
		hp.clickManageApps();
		reportInfo("Manage Applications tab clicked");
		
	//Manage Apps page
		mp.validateManageAppsFields();
		reportInfo("Manage Applications fields verified");
	
	//ApplyNow page
		hp.clickApplyNow();
		reportInfo("Apply Now tab clicked");
		String msg1="Limited to BGE customers with a fleet of 5 or more electric vehicles";
		String msg2="Vehicles must be registered with the Maryland Motor Vehicle Administration (MVA)";
		String msg3="An online application along with supporting documents must be submitted. The required supporting documents include:";
		String msg4="A copy of each vehicle’s registration with the Maryland MVA";	
		ap.validateApplyNowPageFields(msg1, msg2, msg3, msg4);
		reportInfo("Apply Now page fields verified");
		
	//Contact Us Page
		hp.clickContactUs();
		reportInfo("Contact Us tab clicked");
		String msg5="If your question/comment refers to an existing application you have in our system, please use the contact form in your application for any correspondence with the administrator of the program.";
		String msg6="If this is regarding a new application not entered yet, or a general question or comment, please fill out the form below and someone will contact you shortly.";
		cp.validateContactUsPageFields(msg5, msg6);
		
		
		
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
