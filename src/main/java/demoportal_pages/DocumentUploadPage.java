package demoportal_pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class DocumentUploadPage {
	private WebDriver driver;

	public  DocumentUploadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'Document Upload')]")
	public WebElement DocumentUpload_lnk;
	
	@FindBy(xpath="//p[contains(text(),'Charger Purchase Invoice')]/parent::div")
	public WebElement ChargerPurchaseDocUpl_lnk;
	
	@FindBy(xpath="//p[contains(text(),'Charger Installation Invoice')]/parent::div")
	public WebElement ChargerInstalDocUpl_lnk;
	
	@FindBy(xpath="//p[contains(text(),'Upload Electric Vehicle')]/parent::div")
	public WebElement ElectricVehicleDocUpl_lnk;
	
	@FindBy(xpath="//p[contains(text(),'Additional Fleet Form')]/parent::div")
	public WebElement AddFleetFormDocUpl_lnk;

	@FindBy(xpath="//input[@id='root_file']")
	public WebElement ChooseFile_btn;

	@FindBy(xpath="//button[contains(text(),'Upload File')]")
	public WebElement UploadFile_btn;
	
	@FindBy(xpath="//button[contains(text(),'Complete Application')]")
	public WebElement CompleteApp_btn;

	public void clickDocumentUpload() {
		Keywords.clickElement(DocumentUpload_lnk);
	}

	public void clickChooseFile() {
		Keywords.jsClick(ChooseFile_btn);
	}

	public void clickUploadFile() {
		Keywords.jsClick(UploadFile_btn);
	}
	public void ChargerPurchaseDocUpload(String fileName) throws AWTException, InterruptedException, IOException {
		Keywords.jsClick(ChargerPurchaseDocUpl_lnk);
		Keywords.moveToElement(ChooseFile_btn);
		Keywords.jsClick(ChooseFile_btn);
		Thread.sleep(2000);
		//Keywords.selectFile(fileName);
		Runtime.getRuntime().exec("C:\\Users\\rgudi\\SeleniumTraining\\Portal\\src\\main\\java\\resources\\UploadFile.exe");
		Thread.sleep(2000);
		Keywords.jsClick(UploadFile_btn);
		Thread.sleep(4000);
	}
	
	public void ChargerInstalDocUpload(String fileName) throws AWTException, InterruptedException, IOException {
		Keywords.jsClick(ChargerInstalDocUpl_lnk);
		Keywords.moveToElement(ChooseFile_btn);
		Keywords.jsClick(ChooseFile_btn);
		Thread.sleep(2000);
		//Keywords.selectFile(fileName);
		Runtime.getRuntime().exec("C:\\Users\\rgudi\\SeleniumTraining\\Portal\\src\\main\\java\\resources\\UploadFile.exe");
		Thread.sleep(2000);
		Keywords.jsClick(UploadFile_btn);
		Thread.sleep(4000);
	}

	public void ElectricVehicleDocUpload(String fileName) throws AWTException, InterruptedException, IOException {
		Keywords.jsClick(ElectricVehicleDocUpl_lnk);
		Keywords.moveToElement(ChooseFile_btn);
		Keywords.jsClick(ChooseFile_btn);
		Thread.sleep(2000);
		//Keywords.selectFile(fileName);
		Runtime.getRuntime().exec("C:\\Users\\rgudi\\SeleniumTraining\\Portal\\src\\main\\java\\resources\\UploadFile.exe");
		Thread.sleep(2000);
		Keywords.jsClick(UploadFile_btn);
		Thread.sleep(4000);
	}

	public void AddFleetFormDocUpload(String fileName) throws AWTException, InterruptedException, IOException {
		Keywords.jsClick(AddFleetFormDocUpl_lnk);
		Keywords.moveToElement(ChooseFile_btn);
		Keywords.jsClick(ChooseFile_btn);
		Thread.sleep(2000);
		//Keywords.selectFile(fileName);
		Runtime.getRuntime().exec("C:\\Users\\rgudi\\SeleniumTraining\\Portal\\src\\main\\java\\resources\\UploadFile.exe");
		Thread.sleep(2000);
		Keywords.jsClick(UploadFile_btn);
		Thread.sleep(4000);
	}
	
	public void clickCompleteApp() {
		Keywords.jsClick(CompleteApp_btn);
	}
}
