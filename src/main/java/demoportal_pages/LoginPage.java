package demoportal_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Apply Now')]")
	public WebElement ApplyNow_tab;
	
	@FindBy(xpath="//a[text()='BEGIN APPLICATION']")
	public WebElement BeginApplication_btn;
	
	@FindBy(xpath="//input[@id='root_userName']")
	public WebElement EmailAddress_txt;
	
	@FindBy(xpath="//button[text()='Continue']")
	public WebElement Continue_btn;
	
	@FindBy(xpath="//input[@id='root_password']")
	public WebElement Password_txt;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement Submit_btn;
	
	public void clickApplyNow() {
		Keywords.clickElement(ApplyNow_tab);
	}
	
	public void clickBeginApplication() throws InterruptedException {
		Keywords.scrollToElement(BeginApplication_btn);
		Keywords.clickElement(BeginApplication_btn);
	}
	
	public void enterEmailAddress(String email) {
		Keywords.enterData(EmailAddress_txt, email);
	}
	
	public void clickContinue() {
		Keywords.clickElement(Continue_btn);
	}
	
	public void enterPassword(String password) {
		Keywords.enterData(Password_txt, password);
	}
	
	public void clickSubmit() {
		Keywords.clickElement(Submit_btn);
		
	}
	

}
