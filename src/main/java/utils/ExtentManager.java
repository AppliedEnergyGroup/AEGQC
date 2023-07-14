package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BaseClass;

public class ExtentManager extends Keywords {

	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void startReport() {
	report=new ExtentReports();
	ExtentSparkReporter esr=new ExtentSparkReporter(System.getProperty("user.dir")+"\\AutomationReport.html");
	report.attachReporter(esr);
	test=report.createTest(myTestName);
	}
	
	public static void reportInfo(String infoMsg) {
		test.log(Status.INFO, infoMsg);
	}
	
	public static void stopReport() {
		
		report.flush();
	}
	
	public static void attachScreenshot() throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("src/../Screenshots/"+myTestName+"_"+System.currentTimeMillis()+".png");
		String errFilePath=dest.getAbsolutePath();
		FileUtils.copyFile(srcFile, dest);
		test.addScreenCaptureFromPath(errFilePath);
	}
}
