package bge_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.Keywords;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='BGE Logo Image']")
	public WebElement BGELogo_img;
	
	@FindBy(xpath="//img[@alt='evSmart']")
	public WebElement EVSmartLogo_img;
	
	@FindBy(xpath="//span[text()='Home']/parent::a")
	public WebElement Home_tab;
	
	@FindBy(xpath="//span[text()='Manage Applications']/parent::a")
	public WebElement ManageApp_tab;
	
	@FindBy(xpath="//span[text()='Apply Now']/parent::a")
	public WebElement ApplyNow_tab;
	
	@FindBy(xpath="//span[text()='Contact Us']/parent::a")
	public WebElement ContactUs_tab;
	
	@FindBy(xpath="//div[contains(@class,'layout-column')]/div/h4[contains(text(),'Fleet Rate Registration')]")
	public WebElement FleetRateRegister_header;
	
	@FindBy(xpath="//h4[contains(text(),'BGE EV Fleet Rate Registration')]/parent::div")
	public WebElement FleetRateRegister_msg;
	
	@FindBy(xpath="//span[text()='Privacy Statement']/parent::a")
	public WebElement PrivacyStatement_lnk;
	
	@FindBy(xpath="//span[text()='Terms of Use']/parent::a")
	public WebElement Terms_lnk;
	
	@FindBy(xpath="//div[contains(@class,'layout-column')]/div/span[contains(text(),'All Rights Reserved')]")
	public WebElement Copyright_msg;
	
	public void validateHomeFields() throws InterruptedException {
		Thread.sleep(3000);
		Keywords.verifyElement(BGELogo_img);
		Keywords.verifyElement(EVSmartLogo_img);
		Keywords.verifyElement(Home_tab);
		Keywords.verifyElement(ManageApp_tab);
		Keywords.verifyElement(ApplyNow_tab);
		Keywords.verifyElement(FleetRateRegister_header);
		Keywords.verifyElement(FleetRateRegister_msg);
		Keywords.verifyElement(PrivacyStatement_lnk);
		Keywords.verifyElement(Terms_lnk);
		Keywords.verifyElement(Copyright_msg);
		
	}
	
	public void clickManageApps() {
		Keywords.clickElement(ManageApp_tab);
	}
	
	public void clickApplyNow() {
		Keywords.clickElement(ApplyNow_tab);
	}
	
	public void clickContactUs() {
		Keywords.clickElement(ContactUs_tab);
	}
	public void verifyFleetRateRegisterMsg(String text) {
		Keywords.verifyElementText(FleetRateRegister_msg, text);
	}
	
	public void verifyCopyrightMsg(String text) {
		Keywords.verifyElementText(Copyright_msg, text);
	}
	
}
