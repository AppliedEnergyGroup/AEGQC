package demoportal_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class CustomerInfoPage {
	private WebDriver driver;
	
	public CustomerInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Contact Entry')]")
	public WebElement contact_entry_header;
		
	@FindBy(xpath="//select[@id='premise-contact_storedContactNumber']")
	public WebElement ExistingContact_drop;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column1_premiseId']")
	public WebElement PremiseID_txt;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column1_meterId']")
	public WebElement MeterID_txt;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column1_acct_number']")
	public WebElement AccountNum_txt;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column2_phone']")
	public WebElement Phone_txt;
	
	//@FindBy(xpath="//input[@id='premise-contact_section_column2_cell']")
	//public WebElement Cell_txt;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column2_fax']")
	public WebElement Fax_txt;
	
	@FindBy(xpath="//input[@id='premise-contact_section_column2_taxId']")
	public WebElement TaxID_txt;
	
	@FindBy(xpath="//label[contains(text(),'Same as home/business information')]")
	public WebElement SameAsHomeInfo_chk;
	
	//@FindBy(xpath="//select[@id='contractor-contact_storedContactNumber']")
	//public WebElement Contractor_drop;
	
	//@FindBy(xpath="//select[@id='primary-contact_storedContactNumber']")
	//public WebElement BGEContractor_drop;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column1_premiseId']")
	//public WebElement ContractorPremiseID_txt;
	
	//@FindBy(xpath="//input[@id='primary-contact_section_column1_premiseId']")
	//public WebElement BGEContractorPremiseID_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column1_meterId']")
	//public WebElement ContractorMeterID_txt;
	
	//@FindBy(xpath="//input[@id='primary-contact_section_column1_meterId']")
	//public WebElement BGEContractorMeterID_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column1_acct_number']")
	//public WebElement ContractorAccountNum_txt;
	
	//@FindBy(xpath="//input[@id='primary-contact_section_column1_acct_number']")
	//public WebElement BGEContractorAccountNum_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column2_phone']")
	//public WebElement ContractorPhone_txt;
	
	//@FindBy(xpath="//input[@id='primary-contact_section_column2_phone']")
	//public WebElement BGEContractorPhone_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column2_cell']")
	//public WebElement ContractorCell_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column2_fax']")
	//public WebElement ContractorFax_txt;
	
	//@FindBy(xpath="//input[@id='contractor-contact_section_column2_taxId']")
	//public WebElement ContractorTaxId_txt;
	
	@FindBy(xpath="//button[contains(text (),'Search for a Contractor')]")
	public WebElement SearchforaContractor_btn;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/button[1]")
	public WebElement selectContractor_lnk;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement Continue_btn;
	
	@FindBy(xpath="//label[contains(text(),'Please select your application form')]/following-sibling::select")
	public WebElement ApplicationForm_drop;
	
	//@FindBy(xpath="//label[contains(text(),'Fleet Site Host')]/following-sibling::input")
	//public WebElement FleetSiteHost_txt;
	
    //@FindBy(xpath="//label[contains(text(),'Number of Electric Vehicles')]/following-sibling::input")
	//public WebElement ElectricVehicles_txt;
	
	//@FindBy(xpath="//label[contains(text(),'upload at least one Electric Vehicle')]/following-sibling::select")
	//public WebElement UploadFormsCount_drop;
	
	public void selectExistContact(String contact) {
		Keywords.selectDropdownOpt(ExistingContact_drop, contact);
	}
	
	public void enterPremiseID(String premiseID) {
		Keywords.enterData(PremiseID_txt, premiseID);
	}
	
	public void enterMeterID(String meterID) {
		Keywords.enterData(MeterID_txt, meterID);
	}
	
	public void enterAccountNum(String accountNum) {
		Keywords.enterData(AccountNum_txt, accountNum);	
	}
	
	public void enterPhone(String phone) {
		Keywords.enterData(Phone_txt, phone);
	}
	
	
	//public void enterCell(String cell) {
		//Keywords.enterData(Cell_txt, cell);
	//}
	
	public void enterFax(String fax) {
		Keywords.enterData(Fax_txt, fax);
	}
	public void enterTaxID(String taxID) {
		Keywords.enterData(TaxID_txt, taxID);
	}
	
	public void clickSameAsHomeInfo() {
		Keywords.jsClick(SameAsHomeInfo_chk);
	}
	
	//public void selectContractor(String contractor) throws InterruptedException {
		//Keywords.scrollToElement(Contractor_drop);
		//Keywords.selectDropdownOpt(Contractor_drop, contractor);
	//}
	
	//public void selectBGEContractor(String contractor) throws InterruptedException {
		//Keywords.scrollToElement(BGEContractor_drop);
		//Keywords.selectDropdownOpt(BGEContractor_drop, contractor);
	//}
	
	//public void enterContractorPremiseID(String premiseID) {
		//Keywords.enterData(ContractorPremiseID_txt, premiseID);
	//}
	
	//public void enterBGEContractorPremiseID(String premiseID) {
		//Keywords.enterData(BGEContractorPremiseID_txt, premiseID);
	//}
	
	//public void enterContractorMeterID(String meterID) {
		//Keywords.enterData(ContractorMeterID_txt, meterID);
	//}
	
	//public void enterBGEContractorMeterID(String meterID) {
		//Keywords.enterData(BGEContractorMeterID_txt, meterID);
	//}
	
	//public void enterContractorActNum(String accountNum) {
		//Keywords.enterData(ContractorAccountNum_txt, accountNum);
	//}
	
	//public void enterBGEContractorActNum(String accountNum) {
		//Keywords.enterData(BGEContractorAccountNum_txt, accountNum);
	//}
	
	//public void enterContractorPhone(String phone) {
		//Keywords.enterData(ContractorPhone_txt, phone);
	//}
	
	//public void enterBGEContractorPhone(String phone) {
		//Keywords.enterData(BGEContractorPhone_txt, phone);
	//}
	
	//public void enterContractorCell(String cell) {
		//Keywords.enterData(ContractorCell_txt, cell);
	//}
	//public void enterContractorFax(String fax) {
		//Keywords.enterData(ContractorFax_txt, fax);
	//}
	
	//public void enterContractorTaxID(String taxID) {
		//Keywords.enterData(ContractorTaxId_txt, taxID);
	//}
	public void clickSearchforaContractorbtn() {
		Keywords.clickElement(SearchforaContractor_btn);
	}
	
	public void selectContractorDropdownlnk() {
		Keywords.clickElement(selectContractor_lnk);
	}
	
	public void clickContinue() throws InterruptedException {
		Keywords.scrollToElement(Continue_btn);
		Keywords.clickElement(Continue_btn);
	}
	
	public void selectApplicationForm(String appForm) {
		Keywords.selectDropdownOpt(ApplicationForm_drop, appForm);
	}
	
	//public void enterFleetSiteHost(String hostName) {
		//Keywords.enterData(FleetSiteHost_txt, hostName);
	//}
	
	//public void enterElectricVehiclesCount(String count) {
		//Keywords.enterData(ElectricVehicles_txt, count);
	//}
	
	//public void selectUploadFormsCount(String count) {
		//Keywords.selectDropdownOpt(UploadFormsCount_drop, count);
	//}
	public void verifycontactentryheader() {
		Keywords.verifyElement(contact_entry_header);
	}

}
