package demoportal_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class EquipmentPage {
	private WebDriver driver;
	
	public EquipmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Equipment Entry (Portal)']")
	public WebElement equipment_header;
	
	@FindBy(xpath="//h1[contains(text(),'Total Project Incentive')]")
	public WebElement total_project_incentive_header;
	
	@FindBy(xpath="//h1[contains(text(),'Consultation')]")
	public WebElement consulation_header;
	
	@FindBy(xpath="(//button[text()='Add Equipment'])[1]")
	public WebElement AddEquipment_btn;
	
	@FindBy(xpath="(//button[text()='Add Equipment'])[2]")
	public WebElement AddEquipment_btn2;
	
	@FindBy(xpath="//button[text()='Domestic Hot Water']")
	public WebElement DomesticHotWater_btn;
	
	@FindBy(xpath="//button[text()='DHW Flow Reduction']")
	public WebElement DHWFlowReduction_btn;
	
	@FindBy(xpath="//button[text()='Electric Transport Refrigeration Unit']")
	public WebElement ElectricTransport_btn;
	
	@FindBy(xpath="//input[@id='equipment_quantity']")
	public WebElement NoOfPorts_txt;
	
	@FindBy(xpath="//select[@id='equipment_equipment_type_sel']")
	public WebElement EquipmentType_drop;
	
	@FindBy(xpath="//input[@id='equipment_manufacturer']")
	public WebElement Brand_txt;
	
	@FindBy(xpath="//input[@id='equipment_model_number']")
	public WebElement ModelNumber_txt;
	
	@FindBy(xpath="//input[@id='equipment_equipment_cost']")
	public WebElement EquipmentCost_txt;
	
	@FindBy(xpath="//input[@id='equipment_installed_cost']")
	public WebElement InstallationCost_txt;
	
	@FindBy(xpath="//input[@id='equipment_total_cost']")
	public WebElement TotalCostCalculated_txt;
	
	@FindBy(xpath="//h1[contains(text(),'Application submitted')]")
	public WebElement application_submitted_header;
	
	public void verifyConsulation_Header() {
		Keywords.verifyElement(consulation_header);
	}
	
	public void verifyEquipmentHeader() {
		Keywords.verifyElement(equipment_header);
	}
	
	public void clickAddEquipmentBtn() {
		Keywords.clickElement(AddEquipment_btn);
	}
	
	public void clickDomesticHotWater() {
		Keywords.clickElement(DomesticHotWater_btn);
	}
	
	public void clickDHWFlowReduction() {
		Keywords.clickElement(DHWFlowReduction_btn);
	}
	
	public void clickElectricTransport() {
		Keywords.clickElement(ElectricTransport_btn);
	}
	
	public void enterNoOfPorts(String ports) {
		Keywords.enterData(NoOfPorts_txt, ports);
	}
	
	public void selectEquipmentType(String option) {
		Keywords.selectDropdownOpt(EquipmentType_drop, option);
	}
	
	public void enterBrand(String brand) {
		Keywords.enterData(Brand_txt, brand);
	}
	
	public void enterModelNumber(String modelNumber) {
		Keywords.enterData(ModelNumber_txt, modelNumber);
	}
	public void enterEquipmentCost(String cost) {
		Keywords.enterData(EquipmentCost_txt, cost);
	}
	public void enterInstallationCost(String cost) {
		Keywords.enterData(InstallationCost_txt, cost);
	}
	public void enterTotalCostCalculated(String cost) {
		Keywords.enterData(TotalCostCalculated_txt, cost);
	}
	public void clickAddEquipmentOverlay() {
		Keywords.clickElement(AddEquipment_btn2);
	}
	public void verifyTotalProjectIncentiveheader() {
		Keywords.verifyElement(total_project_incentive_header);
	}
	
	public void verifyApplicationSubmittedheader() {
		Keywords.verifyElement(application_submitted_header);
	}
	

}
