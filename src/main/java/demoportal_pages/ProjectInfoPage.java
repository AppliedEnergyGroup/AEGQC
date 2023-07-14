package demoportal_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class ProjectInfoPage {

	private WebDriver driver;
	
	public ProjectInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[contains(text(),'Does the new equipment include electric technology')]/following-sibling::select")
	public WebElement ElectricTech_drop;
	
	@FindBy(xpath="//label[contains(text(),'Is this new unit replacing an existing unit or is this an expansion to your fleet')]/following-sibling::select")
	public WebElement ExpansionFleet_drop;
	
	@FindBy(xpath="//label[contains(text(),'new unit is replacing an existing unit, is the current fuel technology Diesel')]/following-sibling::select")
	public WebElement TechDiesel_drop;
	
	@FindBy(xpath="//label[contains(text(),'Preferred method of payment')]/following-sibling::select")
	public WebElement PaymentMethod_drop;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	public WebElement Continue_btn;
	
	public void selectElectricTech(String opt) {
		Keywords.selectDropdownOpt(ElectricTech_drop, opt);
	}
	public String getElectricTech() {
		String value=Keywords.getSelectedOption(ElectricTech_drop);
		return value;
	}
	
	public void selectExpansionFleet(String opt) {
		Keywords.selectDropdownOpt(ExpansionFleet_drop, opt);
	}
	
	public void selectTechDiesel(String opt) {
		Keywords.selectDropdownOpt(TechDiesel_drop, opt);
	}
	
	public void selectPaymentMethod(String opt) {
		Keywords.selectDropdownOpt(PaymentMethod_drop, opt);
	}
	
	public void clickContinue() throws InterruptedException {
		Keywords.scrollToElement(Continue_btn);
		Keywords.clickElement(Continue_btn);
	}
	
}
